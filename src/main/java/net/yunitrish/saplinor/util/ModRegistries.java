package net.yunitrish.saplinor.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.yunitrish.saplinor.item.ModItems;
import net.yunitrish.saplinor.saplinor;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        saplinor.LOGGER.info("Register Fuels for" + saplinor.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.bamboo_coal,100);
    }
}
