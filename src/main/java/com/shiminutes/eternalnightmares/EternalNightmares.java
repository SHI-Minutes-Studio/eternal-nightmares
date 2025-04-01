package com.shiminutes.eternalnightmares;

import com.shiminutes.eternalnightmares.block.ModBlocks;
import com.shiminutes.eternalnightmares.item.ModItemGroups;
import com.shiminutes.eternalnightmares.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EternalNightmares implements ModInitializer {
	public static final String MOD_ID = "eternalnightmares";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}