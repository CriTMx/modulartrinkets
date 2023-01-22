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
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register(
            MetalIngots.TinIngot.mGetName(),
            ()-> new MetalIngots.TinIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register(
            MetalIngots.SilverIngot.mGetName(),
            ()-> new MetalIngots.SilverIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register(
            MetalIngots.PlatinumIngot.mGetName(),
            ()-> new MetalIngots.PlatinumIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register(
            MetalIngots.BronzeIngot.mGetName(),
            ()-> new MetalIngots.BronzeIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register(
            MetalIngots.BrassIngot.mGetName(),
            ()-> new MetalIngots.BrassIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register(
            MetalIngots.InvarIngot.mGetName(),
            ()-> new MetalIngots.InvarIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register(
            MetalIngots.ElectrumIngot.mGetName(),
            ()-> new MetalIngots.ElectrumIngot(MetalIngots.mGetProperties())
    );
    public static final RegistryObject<Item> HAEMIUM_INGOT = ITEMS.register(
            MetalIngots.HaemiumIngot.mGetName(),
            ()-> new MetalIngots.HaemiumIngot(MetalIngots.mGetProperties())
    );

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
