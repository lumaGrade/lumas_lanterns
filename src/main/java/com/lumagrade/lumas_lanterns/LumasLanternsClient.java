package com.lumagrade.lumas_lanterns;

import com.lumagrade.lumas_lanterns.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LumasLanternsClient implements ClientModInitializer {

    public static void registerRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WALL_VANILLA_LANTERN, RenderLayer.getCutout());
    }


    @Override
    public void onInitializeClient() {
        registerRenders();
    }
}
