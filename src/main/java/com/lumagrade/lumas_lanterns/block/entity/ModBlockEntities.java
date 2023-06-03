package com.lumagrade.lumas_lanterns.block.entity;

import com.lumagrade.lumas_lanterns.LumasLanterns;
import com.lumagrade.lumas_lanterns.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<WallVanillaLanternEntity> WALL_VANILLA_LANTERN_ENTITY;


    public static void registerBlockEntities(){
        WALL_VANILLA_LANTERN_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(LumasLanterns.MOD_ID, "wall_vanilla_lantern_entity"),
                FabricBlockEntityTypeBuilder.create(WallVanillaLanternEntity::new,
                        ModBlocks.WALL_VANILLA_LANTERN).build(null));
    }
}
