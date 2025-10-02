package org.figuramc.viviplugin.fabric;

import net.fabricmc.api.ModInitializer;
import org.figuramc.viviplugin.ViviPlugin;

/**
 * A mod class is not technically needed for Fabric to load the Plugin, but it's still nice to have.
 */
public class ViviPluginFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ViviPlugin.init();
        ViviPlugin.LOGGER.info("ExamplePluginFabric initialized");
    }
}
