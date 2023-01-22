package com.critmx.modulartrinkets.common.creativetabs;

import com.critmx.modulartrinkets.common.registry.BlockRegister;
import com.critmx.modulartrinkets.common.registry.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MTCreativeTab
{

    public static final CreativeModeTab MT_TAB = new CreativeModeTab("mtcreativetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockRegister.TRINKETANVIL.get());
        }
    };

    public static final CreativeModeTab MT_MATERIALS_TAB = new CreativeModeTab("mtmaterialstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.COBALT_INGOT.get());
        }
    };

}
