package com.lumagrade.extended_lanterns.block.entity;

import com.lumagrade.extended_lanterns.ExtendedLanterns;
import com.lumagrade.extended_lanterns.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<CustomLanternEntity> CUSTOM_LANTERN_ENTITY;


    public static void registerBlockEntities(){
        CUSTOM_LANTERN_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(ExtendedLanterns.MOD_ID, "custom_lantern_entity"),
                FabricBlockEntityTypeBuilder.create(CustomLanternEntity::new,
                        ModBlocks.CUSTOM_LANTERN).build(null));
    }
}
