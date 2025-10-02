package org.figuramc.viviplugin.fabric;

import org.figuramc.viviplugin.ViviExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ViviExpectPlatformImpl {
    /**
     * This is our actual method to {@link ViviExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
