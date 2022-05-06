package net.yunitrish.saplinor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.yunitrish.saplinor.saplinor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {

    public static final Item magic_iron_ingot = registerItem("magic_iron_ingot",new Item(new FabricItemSettings().group(ModItemGroup.SAPLINOR)));
    public static final Item magic_iron_nugget = registerItem("magic_iron_nugget",new Item(new FabricItemSettings().group(ModItemGroup.SAPLINOR)));
    public static final Item raw_magic_iron = registerItem("raw_magic_iron",new Item(new FabricItemSettings().group(ModItemGroup.SAPLINOR)));
    public static final Item magic_detector = registerItem("magic_detector",new magic_detector(new FabricItemSettings().group(ModItemGroup.SAPLINOR).maxDamage(32)));
    public static final Item bamboo_coal = registerItem("bamboo_coal",new Item(new FabricItemSettings().group(ModItemGroup.SAPLINOR)));
    public static final Item apple_pie = registerItem("apple_pie",new Item(new FabricItemSettings().group(ModItemGroup.SAPLINOR).food(ModFoodComponents.ApplePie)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(saplinor.MOD_ID, name),item);
    }

    public static void registerModItems() {
        saplinor.LOGGER.info("Registering mod items for " + saplinor.MOD_ID);
    }

}
