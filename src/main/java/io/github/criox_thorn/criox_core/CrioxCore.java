package io.github.criox_thorn.criox_core;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrioxCore implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Criox Core");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("{} Initialized!", mod.metadata().name());
		CrioxCoreItems.register(mod);
	}

}
