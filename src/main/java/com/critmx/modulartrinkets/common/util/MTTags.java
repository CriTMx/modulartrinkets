package com.critmx.modulartrinkets.common.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MTTags {

    public static class Items {
        public static final TagKey<Item> COBALT_INGOT = forgeTag("ingots/cobalt");
        public static final TagKey<Item> LEAD_INGOT = forgeTag("ingots/lead");
        public static final TagKey<Item> TIN_INGOT = forgeTag("ingots/tin");
        public static final TagKey<Item> SILVER_INGOT = forgeTag("ingots/silver");
        public static final TagKey<Item> PLATINUM_INGOT = forgeTag("ingots/platinum");
        public static final TagKey<Item> BRONZE_INGOT = forgeTag("ingot/bronze");
        public static final TagKey<Item> BRASS_INGOT = forgeTag("ingots/brass");
        public static final TagKey<Item> ELECTRUM_INGOT = forgeTag("ingots/electrum");
        public static final TagKey<Item> INVAR_INGOT = forgeTag("ingots/invar");

        public static final TagKey<Item> HAEMIUM_INGOT = mtTag("ingots/haemium");
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge",name));
        }
        private static TagKey<Item> mtTag(String name) {
            return ItemTags.create(new ResourceLocation("modulartrinkets",name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> COBALT_BLOCK = forgeTag("storage_blocks/cobalt");

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge",name));
        }
        private static TagKey<Block> mtTag(String name) {
            return BlockTags.create(new ResourceLocation("modulartrinkets",name));
        }
    }

}
