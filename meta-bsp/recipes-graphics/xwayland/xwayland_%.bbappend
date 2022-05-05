FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

OPENGL_PKGCONFIGS:remove:imxgpu = "glx"

RRECOMMENDS:${PN} += "xkbcomp"
