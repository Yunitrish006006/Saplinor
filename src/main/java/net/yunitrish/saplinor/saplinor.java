package net.yunitrish.saplinor;

import net.fabricmc.api.ModInitializer;
import net.yunitrish.saplinor.block.ModBlocks;
import net.yunitrish.saplinor.item.ModItems;
import net.yunitrish.saplinor.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class saplinor implements ModInitializer {
	public static final String MOD_ID = "saplinor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("launching " + MOD_ID);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
