require include/wpeframework-ocdm-playready.inc

PV = "4.0+git${SRCPV}"
RECIPE_BRANCH ?= "master"
SRC_URI = "git://git@github.com/rdkcentral/OCDM-Playready.git;protocol=https;branch=${RECIPE_BRANCH}"
SRCREV ?= "7b14ebbe16717d27737e913c6120f848f6663d30"

TARGET_CFLAGS += "-fpermissive"

RDEPENDS_${PN}_append = " playready"
