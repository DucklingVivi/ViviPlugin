package org.figuramc.viviplugin;

import org.figuramc.figura.FiguraMod;
import org.figuramc.figura.avatar.AvatarManager;
import org.figuramc.viviplugin.screens.ViviScreen;
import org.figuramc.figura.avatar.Avatar;
import org.figuramc.figura.entries.FiguraAPI;
import org.figuramc.figura.entries.annotations.FiguraAPIPlugin;
import org.figuramc.figura.lua.LuaWhitelist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Example API Plugin
 *  @FiguraAPIPlugin Annotation required for Forge to Locate and Load the Plugin
 *  Entrypoint in fabric.mod.json: figura_api
 *  Fabric requires entrypoints have an empty constructor, Figura will not use it
 */
@FiguraAPIPlugin
@LuaWhitelist
public class ViviPlugin implements FiguraAPI {
    public static final String PLUGIN_ID = "viviplugin";
    public static final Logger LOGGER = LoggerFactory.getLogger(PLUGIN_ID);
    private Avatar avatar;

    public ViviPlugin() {
    }
    public ViviPlugin(Avatar avatar) {
        this.avatar = avatar;
        if(avatar.owner == FiguraMod.getLocalPlayerUUID()){
            ViviEventPlugin.EXAMPLE.clear();
        }
    }

    /**
     * You can do common things on init here
     */
    public static void init() {
        LOGGER.info("Hello multi-loader world!");

    }


    @Override
    public FiguraAPI build(Avatar avatar) {
        return new ViviPlugin(avatar);
    }

    @Override
    public String getName() {
        return PLUGIN_ID;
    }

    /**
     * You must whitelist your classes for your Plugin to work correctly! This cannot be null
     */
    @Override
    public Collection<Class<?>> getWhitelistedClasses() {
        List<Class<?>> classesToRegister = new ArrayList<>();
        for (Class<?> aClass : EXAMPLE_PLUGIN_CLASSES) {
            if (aClass.isAnnotationPresent(LuaWhitelist.class)) {
                classesToRegister.add(aClass);
            }
        }
        return classesToRegister;
    }

    /**
     * This can be empty, but not null
     */
    @Override
    public Collection<Class<?>> getDocsClasses() {
        return List.of();
    }

    public static final Class<?>[] EXAMPLE_PLUGIN_CLASSES = new Class[] {
            ViviPlugin.class,
            ViviScreen.class,
    };

}
