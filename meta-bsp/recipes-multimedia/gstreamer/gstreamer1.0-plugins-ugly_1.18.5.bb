require recipes-multimedia/gstreamer/gstreamer1.0-plugins-common.inc

DESCRIPTION = "'Ugly GStreamer plugins"
HOMEPAGE = "https://gstreamer.freedesktop.org/"
BUGTRACKER = "https://gitlab.freedesktop.org/gstreamer/gst-plugins-ugly/-/issues"

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068"

LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.0-or-later"
LICENSE_FLAGS = "commercial"

SRC_URI = " \
            https://gstreamer.freedesktop.org/src/gst-plugins-ugly/gst-plugins-ugly-${PV}.tar.xz \
            "
SRC_URI[sha256sum] = "df32803e98f8a9979373fa2ca7e05e62f977b1097576d3a80619d9f5c69f66d9"

S = "${WORKDIR}/gst-plugins-ugly-${PV}"

DEPENDS += "gstreamer1.0-plugins-base"

GST_PLUGIN_SET_HAS_EXAMPLES = "0"

PACKAGECONFIG ??= " \
    ${GSTREAMER_ORC} \
    a52dec mpeg2dec \
"

PACKAGECONFIG[a52dec]   = "-Da52dec=enabled,-Da52dec=disabled,liba52"
PACKAGECONFIG[amrnb]    = "-Damrnb=enabled,-Damrnb=disabled,opencore-amr"
PACKAGECONFIG[amrwb]    = "-Damrwbdec=enabled,-Damrwbdec=disabled,opencore-amr"
PACKAGECONFIG[cdio]     = "-Dcdio=enabled,-Dcdio=disabled,libcdio"
PACKAGECONFIG[dvdread]  = "-Ddvdread=enabled,-Ddvdread=disabled,libdvdread"
PACKAGECONFIG[mpeg2dec] = "-Dmpeg2dec=enabled,-Dmpeg2dec=disabled,mpeg2dec"
PACKAGECONFIG[x264]     = "-Dx264=enabled,-Dx264=disabled,x264"

EXTRA_OEMESON += " \
    -Ddoc=disabled \
    -Dsidplay=disabled \
"

FILES:${PN}-amrnb += "${datadir}/gstreamer-1.0/presets/GstAmrnbEnc.prs"
FILES:${PN}-x264 += "${datadir}/gstreamer-1.0/presets/GstX264Enc.prs"
