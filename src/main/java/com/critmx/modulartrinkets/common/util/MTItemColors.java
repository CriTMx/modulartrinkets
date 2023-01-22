package com.critmx.modulartrinkets.common.util;

import com.critmx.modulartrinkets.common.registry.ItemRegister;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class MTItemColors implements ItemColor {
    @Override
    public int getColor(ItemStack pStack, int pTintIndex)
    {
        initMetalColorMap();
        if (pTintIndex == 0) {
            if (metal_color_map.containsKey(pStack.getItem())) return metal_color_map.get(pStack.getItem());
        }
        return -1;
    }

    private static Map<Item,Integer> metal_color_map = new HashMap<>();
    private static void initMetalColorMap()
    {
        metal_color_map.put(ItemRegister.COBALT_INGOT.get(),0x3b70ba);
        metal_color_map.put(ItemRegister.LEAD_INGOT.get(),0x6e6699);
        metal_color_map.put(ItemRegister.TIN_INGOT.get(),0xd0d6b8);
        metal_color_map.put(ItemRegister.SILVER_INGOT.get(),0xffffff);
        metal_color_map.put(ItemRegister.HAEMIUM_INGOT.get(),0x9f2828);
        metal_color_map.put(ItemRegister.BRONZE_INGOT.get(),0xd9a459);
        metal_color_map.put(ItemRegister.BRASS_INGOT.get(),0xeec05d);
        metal_color_map.put(ItemRegister.ELECTRUM_INGOT.get(),0xcecb64);
        metal_color_map.put(ItemRegister.INVAR_INGOT.get(),0xb3b298);
    }
    public static Map<Item, Integer> getMetalColorMap() { initMetalColorMap(); return metal_color_map; }

}
class MetalColorMap {


}
