FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

LIBEGL ?= "libegl"
LIBEGL:imxgpu = "libegl-imx"

PACKAGECONFIG[glamor] = "-Dglamor=true,-Dglamor=false,libepoxy virtual/libgbm,${LIBEGL}"

OPENGL_PKGCONFIGS:remove:imxgpu = "glx"
