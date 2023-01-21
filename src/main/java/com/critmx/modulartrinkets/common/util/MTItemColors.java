package com.critmx.modulartrinkets.common.util;

import com.critmx.modulartrinkets.common.registry.ItemRegister;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class MTItemColors implements ItemColor {


    @Override
    public int getColor(ItemStack pStack, int pTintIndex)
    {
        if (pTintIndex == 0) {
            if (pStack.is(ItemRegister.COBALT_INGOT.get())) return 0x663388FF;
            if (pStack.is(ItemRegister.LEAD_INGOT.get())) return 0x6e6699;
        }
        return -1;
    }

}
