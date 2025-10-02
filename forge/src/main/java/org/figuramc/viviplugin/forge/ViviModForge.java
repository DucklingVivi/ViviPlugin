package org.figuramc.viviplugin.forge;

import net.minecraftforge.fml.common.Mod;
import org.figuramc.viviplugin.ViviPlugin;

/**
 * A mod class is needed for Forge to load the Plugin
 */
@Mod(ViviPlugin.PLUGIN_ID)
public class ViviModForge {
    public ViviModForge() {
        ViviPlugin.init();
    }
}
