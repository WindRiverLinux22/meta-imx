FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG[glamor] := "-Dglamor=true,-Dglamor=false,libepoxy virtual/libgbm,libegl-imx"

OPENGL_PKGCONFIGS:remove:imxgpu = "glx"

RRECOMMENDS:${PN} += "xkbcomp"
