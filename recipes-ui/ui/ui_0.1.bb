DESCRIPTION = "html5 Demo"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRCREV="${AUTOREV}"
SRC_URI += "git://github.com/sanandin/ui.git"

SRC_URI[md5sum] = "f94749513b85f5acaa07df497751adae"
SRC_URI[sha256sum] = "4bc5ac507a81f716d572091136cc4797f894e3601d65f5d43060d5e143f50032"

S = "${WORKDIR}/git"
inherit autotools

do_install() {
	     install -d ${D}${bindir}/ui
             install -d ${D}${bindir}/ui/css
             install -d ${D}${bindir}/ui/js
             install -m 0755 ${S}/css/animate.css ${D}${bindir}/ui/css
             install -m 0755 ${S}/css/custom.css ${D}${bindir}/ui/css
             install -m 0755 ${S}/css/reset.css ${D}${bindir}/ui/css
             install -m 0755 ${S}/css/styles.css ${D}${bindir}/ui/css
             install -m 0755 ${S}/js/video.js ${D}${bindir}/ui/js
	     install -m 0755 ${S}/index.html ${D}${bindir}/ui
}
