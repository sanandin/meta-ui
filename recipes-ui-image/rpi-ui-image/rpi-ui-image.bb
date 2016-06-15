# Base this image on core-image-minimal
include recipes-core/images/rpi-basic-image.bb
LICENSE = "MIT"
REQUIRED_DISTRO_FEATURES = "x11"
IMAGE_INSTALL_append = "gtk+3 firefox packagegroup-core-x11-base ui"
