# Freescale specific patch

# This is the ugly patch to set matchbox-window-manager always to show cursor
do_install:append:mx6ul () {
    if [ -e ${D}/${sysconfdir}/matchbox/session ]; then
        sed -e 's/SHOWCURSOR=\"no\"/SHOWCURSOR=\"yes\"/' -i ${D}/${sysconfdir}/matchbox/session
    fi
}

do_install:append:mx6sll () {
    if [ -e ${D}/${sysconfdir}/matchbox/session ]; then
        sed -e 's/SHOWCURSOR=\"no\"/SHOWCURSOR=\"yes\"/' -i ${D}/${sysconfdir}/matchbox/session
    fi
}

do_install:append:mx7d () {
    if [ -e ${D}/${sysconfdir}/matchbox/session ]; then
        sed -e 's/SHOWCURSOR=\"no\"/SHOWCURSOR=\"yes\"/' -i ${D}/${sysconfdir}/matchbox/session
    fi
}
