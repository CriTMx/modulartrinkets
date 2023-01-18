package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import com.critmx.modulartrinkets.common.registry.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class CrownBase extends Item {

    static final String name = "crown_base";
    static final CreativeModeTab tab = MTCreativeTab.MT_TAB;
    static final Properties crownbase_properties = new Properties().tab(tab);

    public CrownBase(Properties pProperties) {
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
        return crownbase_properties;
    }

}
