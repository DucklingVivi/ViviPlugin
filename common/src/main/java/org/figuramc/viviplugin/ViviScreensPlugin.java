package org.figuramc.viviplugin;

import net.minecraft.client.gui.screens.Screen;
import org.figuramc.viviplugin.screens.ViviScreen;
import org.figuramc.figura.entries.FiguraScreen;
import org.figuramc.figura.entries.annotations.FiguraScreenPlugin;
import org.figuramc.figura.gui.widgets.PanelSelectorWidget;

/**
 * Example Screen Plugin
 *  Annotation required for Forge to Locate and Load the Plugin
 *  Entrypoint in fabric.mod.json: figura_screen
 */
@FiguraScreenPlugin
public class ViviScreensPlugin implements FiguraScreen {
    @Override
    public Screen getScreen(Screen parentScreen) {
        return new ViviScreen(parentScreen);
    }

    @Override
    public PanelSelectorWidget.PanelIcon getPanelIcon() {
        return FiguraScreen.super.getPanelIcon();
    }
}
