SUMMARY = "WPEFramework interfaces"
DESCRIPTION = "Thunder interfaces component"
HOMEPAGE = "https://github.com/rdkcentral/ThunderInterfaces"
SECTION = "wpe"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1dffbfd5c2eb52e0302eb6296cc3711"

require include/wpeframework-common.inc
DEPENDS_append = " wpeframework-tools-native wpeframework"

PR = "r0"
RECIPE_BRANCH ?= "master"
SRC_URI = "git://github.com/rdkcentral/ThunderInterfaces.git;protocol=git;branch=${RECIPE_BRANCH}"
SRCREV ?= "1b2cbb8dfa823d29fba254932531c33743f7d358"

inherit python3native

EXTRA_OECMAKE += "\
    -DBUILD_SHARED_LIBS=ON \
    -DBUILD_REFERENCE=${SRCREV} \
    -DPYTHON_EXECUTABLE=${PYTHON} \
"

do_install_append() {
    if ${@bb.utils.contains("DISTRO_FEATURES", "opencdm", "true", "false", d)}
    then
        install -m 0644 ${D}${includedir}/WPEFramework/interfaces/IDRM.h ${D}${includedir}/cdmi.h
    fi
}

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/* ${datadir}/WPEFramework/* ${PKG_CONFIG_DIR}/*.pc"
FILES_${PN}-dev += "${libdir}/cmake/*"
FILES_${PN} += "${includedir}/cdmi.h"

INSANE_SKIP_${PN} += "dev-so"
INSANE_SKIP_${PN}-dbg += "dev-so"

