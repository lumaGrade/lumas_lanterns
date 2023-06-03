package com.lumagrade.lumas_lanterns.block;

import com.lumagrade.lumas_lanterns.LumasLanterns;
//import com.lumagrade.lumas_lanterns.block.custom.PaperLanternBlock;
//import com.lumagrade.lumas_lanterns.block.custom.WallPaperLanternBlock;
import com.lumagrade.lumas_lanterns.block.custom.WallVanillaLanternBlock;
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

    public static final Block WALL_VANILLA_LANTERN = registerBlock("wall_vanilla_lantern", new WallVanillaLanternBlock(FabricBlockSettings.of(Material.METAL).luminance(15).strength(3.5f, 3.5f).nonOpaque().sounds(BlockSoundGroup.LANTERN).requiresTool().nonOpaque()), ItemGroup.DECORATIONS);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LumasLanterns.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(LumasLanterns.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlocks() {
        LumasLanterns.LOGGER.debug("Registering ModBlocks for " + LumasLanterns.MOD_ID);
    }
}
