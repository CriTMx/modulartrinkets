package com.critmx.modulartrinkets.common.registry;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import com.critmx.modulartrinkets.common.items.CrownBase;
import com.critmx.modulartrinkets.common.items.MetalIngots;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularTrinkets.MOD_ID);

    public static final RegistryObject<Item> CROWN_BASE = ITEMS.register(
            CrownBase.mGetName(),
            ()->new CrownBase(CrownBase.mGetProperties())
    );

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register(
            MetalIngots.CobaltIngot.mGetName(),
            ()-> new MetalIngots.CobaltIngot(MetalIngots.mGetProperties())
    );

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register(
            MetalIngots.LeadIngot.mGetName(),
            ()-> new MetalIngots.LeadIngot(MetalIngots.mGetProperties())
    );

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
