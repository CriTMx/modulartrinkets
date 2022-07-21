package com.critmx.modulartrinkets.common.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class CrownBase extends ItemRegister {

    public static final RegistryObject<Item>
            CROWNBASE = ITEMS.register("crownbase", ()->new Item(new Item.Properties().tab(MTCreativeTab.MT_TAB)));

}
