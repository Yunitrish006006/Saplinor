package net.yunitrish.saplinor.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yunitrish.saplinor.item.ModItemGroup;
import net.yunitrish.saplinor.saplinor;

public class ModBlocks {

    public static final Block magic_iron_block = registerBlock("magic_iron_block",new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SAPLINOR);
    public static final Block magic_iron_ore = registerBlock("magic_iron_ore",new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),ModItemGroup.SAPLINOR);
    public static final Block deepslate_magic_iron_ore = registerBlock("deepslate_magic_iron_ore",new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()),ModItemGroup.SAPLINOR);
    public static final Block netherrack_magic_iron_ore = registerBlock("netherrack_magic_iron_ore",new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),ModItemGroup.SAPLINOR);
    public static final Block speed_boost_block = registerBlock("speed_boost_block",new SpeedBoostBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()),ModItemGroup.SAPLINOR);
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(saplinor.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(saplinor.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        saplinor.LOGGER.info("Registering ModBlocks for " + saplinor.MOD_ID);
    }
}
