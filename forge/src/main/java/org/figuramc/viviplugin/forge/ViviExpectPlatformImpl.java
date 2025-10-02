package org.figuramc.viviplugin.forge;

import org.figuramc.viviplugin.ViviExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ViviExpectPlatformImpl {
    /**
     * This is our actual method to {@link ViviExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
