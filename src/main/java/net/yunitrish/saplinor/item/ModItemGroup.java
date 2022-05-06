package net.yunitrish.saplinor.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.yunitrish.saplinor.saplinor;

public class ModItemGroup {
    public static final ItemGroup SAPLINOR = FabricItemGroupBuilder.build(new Identifier(saplinor.MOD_ID,"saplinor"),() -> new ItemStack(ModItems.magic_iron_ingot));
}
