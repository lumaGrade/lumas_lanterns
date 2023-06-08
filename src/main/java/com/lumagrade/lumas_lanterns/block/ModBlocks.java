package com.lumagrade.lumas_lanterns.block;

import com.lumagrade.lumas_lanterns.LumasLanterns;
//import com.lumagrade.lumas_lanterns.block.custom.PaperLanternBlock;
//import com.lumagrade.lumas_lanterns.block.custom.WallPaperLanternBlock;
import com.lumagrade.lumas_lanterns.block.custom.WallVanillaLanternBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block WALL_VANILLA_LANTERN = registerBlock("wall_vanilla_lantern", new WallVanillaLanternBlock(FabricBlockSettings.create().pistonBehavior(PistonBehavior.DESTROY).luminance(15).strength(3.5f, 3.5f).nonOpaque().sounds(BlockSoundGroup.LANTERN).requiresTool().nonOpaque()), ItemGroups.FUNCTIONAL);

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(LumasLanterns.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.add(WALL_VANILLA_LANTERN));
        return Registry.register(Registries.ITEM, new Identifier(LumasLanterns.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        LumasLanterns.LOGGER.debug("Registering ModBlocks for " + LumasLanterns.MOD_ID);
    }
}
