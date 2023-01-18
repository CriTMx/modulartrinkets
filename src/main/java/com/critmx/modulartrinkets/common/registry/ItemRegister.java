package com.critmx.modulartrinkets.common.registry;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import com.critmx.modulartrinkets.common.items.CrownBase;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularTrinkets.MOD_ID);

    public static final RegistryObject<Item> CROWNBASE = ITEMS.register(
            CrownBase.mGetName(),
            ()->new CrownBase(CrownBase.mGetProperties())
    );

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
