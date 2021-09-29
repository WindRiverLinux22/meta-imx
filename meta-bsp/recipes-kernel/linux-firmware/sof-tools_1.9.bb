# Copyright 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Utilities for debugging and configuration of Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "Console/tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=f674ee93878e0b25c4e95dc6c2d06cdd"

SRCREV = "fa8575d29cc30bf0a949f61bc84c9223e6ad4ad1"
SRC_URI = "git://github.com/thesofproject/sof.git;branch=imx-stable-v1.9;protocol=https"

S="${WORKDIR}/git"

DEPENDS += "alsa-lib"

inherit cmake autotools

do_compile() {
    install -d ${S}/tools/sof-tools
    cd ${S}/tools/sof-tools
    cmake ..
    make sof-logger
    make sof-ctl
}

do_install() {
    install -d ${D}/unit_tests/sof/tools
    cp -r ${S}/tools/sof-tools/logger ${D}/unit_tests/sof/tools/
    cp -r ${S}/tools/sof-tools/ctl ${D}/unit_tests/sof/tools/
    cp -r ${S}/tools/tune  ${D}/unit_tests/sof/tools/
}

FILES_${PN} = "/unit_tests/sof/tools"
