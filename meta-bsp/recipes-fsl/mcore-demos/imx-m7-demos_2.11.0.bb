# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[imx8mnddr3l.md5sum] = "26a697229e3e5abe381ea0255ea98b7d"
SRC_URI[imx8mnddr3l.sha256sum] = "7b140b534188c5b781add939511bad040139bb0809edb1f86bcdfdbc2608682d"

SRC_URI[imx8mn.md5sum] = "12d4c02883199e0dce0a288f17ad4688"
SRC_URI[imx8mn.sha256sum] = "56ef25a9f85f175bed2ad79466c5784156120aba2497ebaa8ad6c9300c6d355c"

SRC_URI[imx8mp.md5sum] = "292fd293706d30645f9c32c9ed001cd5"
SRC_URI[imx8mp.sha256sum] = "37b50643dc4040738517a506b7f51855ca391cdf33dcd574c0144b83214bbbc7"

COMPATIBLE_MACHINE = "(mx8mnul|mx8mn|mx8mp|mx8mpul)"