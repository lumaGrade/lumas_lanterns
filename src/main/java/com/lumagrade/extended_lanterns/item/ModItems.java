package com.lumagrade.extended_lanterns.item;

import com.lumagrade.extended_lanterns.ExtendedLanterns;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //public static final Item TEMPLATE_ITEM = registerItem("template_item", new Item(new FabricItemSettings().group(ModItemGroup.TEMPLATE_GROUP)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ExtendedLanterns.MOD_ID, name), item);
    }


    public static void registerModItems(){
        ExtendedLanterns.LOGGER.debug("Registering ModItems for " + ExtendedLanterns.MOD_ID);
    }
}
