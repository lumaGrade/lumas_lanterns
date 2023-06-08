package com.lumagrade.lumas_lanterns.item;

import com.lumagrade.lumas_lanterns.LumasLanterns;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LumasLanterns.MOD_ID, name), item);
    }


    public static void registerModItems(){
        LumasLanterns.LOGGER.debug("Registering ModItems for " + LumasLanterns.MOD_ID);
    }
}
