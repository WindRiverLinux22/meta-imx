SUMMARY = "A GStreamer NNstreamer pipelines real-time profiling plugin"
HOMEPAGE = "https://github.com/nnstreamer/nnshark"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=e1caa368743492879002ad032445fa97 \
                    file://COPYING.LESSER;md5=66c40c88533cd228b5b85936709801c8"
DEPENDS = "\
        gstreamer1.0 \
        gstreamer1.0-plugins-base \
        gstreamer1.0-plugins-bad \
        libgpuperfcnt \
        perf \
"

NNSHARK_SRC ?= "git://source.codeaurora.org/external/imx/nnshark.git;protocol=https"
SRCBRANCH ?= "2021.10.imx"

SRCREV = "c815749eac865bfb7175c61ed13093e6837aea6f"

SRC_URI = "${NNSHARK_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit pkgconfig autotools-brokensep

EXTRA_OECONF = " \
        --disable-graphviz \
        --disable-gtk-doc \
"

do_configure:prepend() {
    sh autogen.sh --noconfigure
}

FILES:${PN} += "\
       ${libdir}/gstreamer-1.0/libgstsharktracers.so  \
       ${libdir}/gstreamer-1.0/libgstsharktracers.la \
"
