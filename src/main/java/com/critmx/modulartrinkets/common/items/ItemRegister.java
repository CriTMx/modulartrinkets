package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.ModularTrinkets;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularTrinkets.MOD_ID);


    public static final RegistryObject<Item>
            CROWNBASE = ITEMS.register("crownbase", ()->new Item(new Item.Properties().tab(MTCreativeTab.MT_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }



}
