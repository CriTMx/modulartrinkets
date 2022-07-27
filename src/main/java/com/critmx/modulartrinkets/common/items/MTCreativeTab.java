package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.common.deferredregisters.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MTCreativeTab
{

    public static final CreativeModeTab MT_TAB = new CreativeModeTab("mtcreativetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CrownBase.CROWNBASE.get());
        }
    };

}
