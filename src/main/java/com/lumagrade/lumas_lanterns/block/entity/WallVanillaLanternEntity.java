package com.lumagrade.lumas_lanterns.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class WallVanillaLanternEntity extends BlockEntity {
    public WallVanillaLanternEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WALL_VANILLA_LANTERN_ENTITY, pos, state);
    }
}
