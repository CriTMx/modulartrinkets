package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.common.deferredregisters.ItemRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class CrownBase extends ItemRegister
{

    public static final RegistryObject<Item>
            CROWNBASE = ITEMS.register("crownbase", ()->new Item(new Item.Properties().tab(MTCreativeTab.MT_TAB).stacksTo(1)));

}
