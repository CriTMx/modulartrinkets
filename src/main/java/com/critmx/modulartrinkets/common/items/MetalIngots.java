package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class MetalIngots {

    public static class CobaltIngot extends Item
    {
        static final String name = "cobalt_ingot";
        static final CreativeModeTab tab = MTCreativeTab.MT_TAB;
        static final Properties cobalt_ingot_properties = new Properties().tab(tab);
        public CobaltIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }

        public static CreativeModeTab mGetTab()
        {
            return tab;
        }
        public static Properties mGetProperties()
        {
            return cobalt_ingot_properties;
        }
    }

}
