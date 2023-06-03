package com.lumagrade.lumas_lanterns.block.custom;

import com.lumagrade.lumas_lanterns.block.entity.WallVanillaLanternEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class WallVanillaLanternBlock extends WallCustomLanternBlock{

    public WallVanillaLanternBlock(Settings settings) {
        super(settings);
    }


     @Nullable
     @Override
      public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
         return new WallVanillaLanternEntity(pos, state);
      }
}
