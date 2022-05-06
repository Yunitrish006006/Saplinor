package net.yunitrish.saplinor.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yunitrish.saplinor.saplinor;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> MAGIC_DETECTOR_DETECTABLE_BLOCKS = createTag("magic_detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY,new Identifier(saplinor.MOD_ID,name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY,new Identifier("c",name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MAGIC_IRON_INGOTS = createCommonTag("magic_iron_ingots");
        public static final TagKey<Item> MAGIC_IRON_NUGGETS = createCommonTag("magic_iron_nuggets");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY,new Identifier(saplinor.MOD_ID,name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY,new Identifier("c",name));
        }
    }
}
