package org.figuramc.viviplugin.mixin;


import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import dev.emi.emi.search.EmiSearch;

import net.minecraft.client.Minecraft;
import org.figuramc.figura.avatar.Avatar;
import org.figuramc.figura.avatar.AvatarManager;
import org.figuramc.figura.entries.FiguraAPI;
import org.figuramc.viviplugin.ViviEventPlugin;
import org.luaj.vm2.LuaValue;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EmiSearch.class)
public class EmiSearchMixin {

    @WrapMethod(method = "search", remap = false)
    private static void modifySearch(String query, Operation<Void> original) {
        LuaValue arg = LuaValue.valueOf(query);
        ViviEventPlugin.EXAMPLE.call(arg);
        original.call(query);
    }
}
