# Additional flags
WPE_FIRMWARECONTROL_AUTOSTART ?= "true"
WPE_FIRMWARECONTROL_SOURCE_LOCATION ?= ""
WPE_FIRMWARECONTROL_DOWNLOAD_LOCATION ?= "/tmp"
WPE_FIRMWARECONTROL_WAITTIME ?= "-1"

# BSP/OEM Specific implementation dependency
WPE_FIRMWARECONTROL_DEPENDS ?= "fwupgrade-lib"

# ----------------------------------------------------------------------------

PACKAGECONFIG[firmwarecontrol]  = " \
    -DPLUGIN_FIRMWARECONTROL=ON \
    -DPLUGIN_FIRMWARECONTROL_AUTOSTART=${WPE_FIRMWARECONTROL_AUTOSTART} \
    -DPLUGIN_FIRMWARECONTROL_SOURCE_LOCATION=${WPE_FIRMWARECONTROL_SOURCE_LOCATION} \
    -DPLUGIN_FIRMWARECONTROL_DOWNLOAD_LOCATION=${WPE_FIRMWARECONTROL_DOWNLOAD_LOCATION} \
    -DPLUGIN_FIRMWARECONTROL_WAITTIME=${WPE_FIRMWARECONTROL_WAITTIME} \
    ,-DPLUGIN_FIRMWARECONTROL=OFF,${WPE_FIRMWARECONTROL_DEPENDS},${WPE_FIRMWARECONTROL_DEPENDS}"

# ----------------------------------------------------------------------------

