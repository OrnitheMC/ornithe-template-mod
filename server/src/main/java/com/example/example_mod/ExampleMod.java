package com.example.example_mod;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import net.ornithemc.osl.entrypoints.api.ModInitializer;

public class ExampleMod implements ModInitializer {

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogManager().getLogger("Example Mod");

	@Override
	public void init() {
		LOGGER.info("initializing example mod!");
	}
}
