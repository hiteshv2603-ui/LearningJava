package dev.junk.foods;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class The Junk Foods Addon implements ModInitializer {
	public static final String MOD_ID = "the_junk_foods_addon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing The Junk Foods Addon...");
	}
}
