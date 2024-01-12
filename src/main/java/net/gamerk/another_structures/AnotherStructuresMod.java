package net.gamerk.another_structures;

import net.fabricmc.api.ModInitializer;

import net.gamerk.another_structures.registries.ItemGroupRegistry;
import net.gamerk.another_structures.registries.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnotherStructuresMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "another_structures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemRegistry.registerModItems();
		ItemGroupRegistry.registerItemGroups();

		LOGGER.info("Launching mod!");
	}
}