require include/wpeframework-ocdm-playready.inc

PV = "2.5+git${SRCPV}"
RECIPE_BRANCH ?= "PR2.5"
SRC_URI = "\
    git://git@github.com/rdkcentral/OCDM-Playready.git;protocol=https;branch=${RECIPE_BRANCH} \
    file://0001-OCDM-Playready-adjust-header-order-to-fix-build-issue.patch \
"
SRCREV ?= "9c530ee979d67aeb07c710f6c51026ae37807936"

DEFAULT_PREFERENCE = "-1"

