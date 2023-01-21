package com.critmx.modulartrinkets.common.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MTTags {

    public static class Items {
        public static final TagKey<Item> COBALT_INGOT = forgeTag("ingots/cobalt");
        public static final TagKey<Item> LEAD_INGOT = forgeTag("ingots/lead");
        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge",name));
        }
    }

}
