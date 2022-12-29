package com.critmx.modulartrinkets.common.registry;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularTrinkets.MOD_ID);

    public static final RegistryObject<Item>
            CROWNBASE = ITEMS.register("crownbase", ()->new Item(new Item.Properties().tab(MTCreativeTab.MT_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
