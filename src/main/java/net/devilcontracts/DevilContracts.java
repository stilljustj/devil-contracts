package net.devilcontracts;

import net.devilcontracts.block.ModBlocks;
import net.devilcontracts.item.ModItemGroups;
import net.devilcontracts.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DevilContracts implements ModInitializer {
	public static final String MOD_ID = "devil-contracts";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

	}
}
