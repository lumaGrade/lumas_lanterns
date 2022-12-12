package com.lumagrade.extended_lanterns;

import com.lumagrade.extended_lanterns.block.ModBlocks;
import com.lumagrade.extended_lanterns.block.entity.ModBlockEntities;
import com.lumagrade.extended_lanterns.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtendedLanterns implements ModInitializer {
	public static final String MOD_ID = "extended_lanterns";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading " + MOD_ID);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}
