# Provides configuration for the SystemDConnector Plugin
WPE_SYSTEMDCONNECTOR_AUTOSTART ??= "true"

# -----------------------------------------------------------------------------------------------------------
PACKAGECONFIG[systemdconnector] = "\
    -DPLUGIN_SYSTEMDCONNECTOR=ON \
    -DPLUGIN_SYSTEMDCONNECTOR_AUTOSTART="${WPE_SYSTEMDCONNECTOR_AUTOSTART}" \
    ,-DPLUGIN_SYSTEMDCONNECTOR=OFF, \
"
# -----------------------------------------------------------------------------------------------------------