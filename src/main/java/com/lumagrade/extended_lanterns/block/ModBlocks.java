package com.lumagrade.extended_lanterns.block;

import com.lumagrade.extended_lanterns.ExtendedLanterns;
import com.lumagrade.extended_lanterns.block.custom.CustomLanternBlock;
import com.lumagrade.extended_lanterns.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    // public static final Block TEMPLATE_BLOCK = registerBlock("template_block", new Block(FabricBlockSettings.of(Material.METAL).luminance(1).strength(4f)), ModItemGroup.TEMPLATE_GROUP);
    public static final Block CUSTOM_LANTERN = registerBlock("custom_lantern", new CustomLanternBlock(FabricBlockSettings.of(Material.METAL).luminance(15).strength(0.3f, 1.5f).nonOpaque().sounds(BlockSoundGroup.LANTERN).requiresTool()), ItemGroup.DECORATIONS);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ExtendedLanterns.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ExtendedLanterns.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlocks() {
        ExtendedLanterns.LOGGER.debug("Registering ModBlocks for " + ExtendedLanterns.MOD_ID);
    }
}
