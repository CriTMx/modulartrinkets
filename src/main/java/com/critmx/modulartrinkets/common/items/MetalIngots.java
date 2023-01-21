package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class MetalIngots {

    static final CreativeModeTab tab = MTCreativeTab.MT_TAB;
    static final Item.Properties metal_ingot_properties = new Item.Properties().tab(tab);

    public static CreativeModeTab mGetTab()
    {
        return tab;
    }
    public static Item.Properties mGetProperties()
    {
        return metal_ingot_properties;
    }

    public static class CobaltIngot extends Item
    {
        static final String name = "cobalt_ingot";

        public CobaltIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class LeadIngot extends Item
    {
        static final String name = "lead_ingot";

        public LeadIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }

}