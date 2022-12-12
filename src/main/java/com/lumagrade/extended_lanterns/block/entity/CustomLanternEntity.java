package com.lumagrade.extended_lanterns.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomLanternEntity extends BlockEntity {
    public CustomLanternEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CUSTOM_LANTERN_ENTITY, pos, state);
    }


    public static void tick(World world, BlockPos blockPos, BlockState state, CustomLanternEntity entity) {
    }
}
