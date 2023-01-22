package com.critmx.modulartrinkets.common.events;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.registry.ItemRegister;
import com.critmx.modulartrinkets.common.util.MTItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=ModularTrinkets.MOD_ID,value=Dist.CLIENT,bus=Mod.EventBusSubscriber.Bus.MOD)
public class MTEvents {
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register(new MTItemColors(),
                ItemRegister.COBALT_INGOT.get(),ItemRegister.LEAD_INGOT.get(),ItemRegister.TIN_INGOT.get(),
                ItemRegister.SILVER_INGOT.get(),ItemRegister.PLATINUM_INGOT.get(),ItemRegister.HAEMIUM_INGOT.get(),
                ItemRegister.BRONZE_INGOT.get(),ItemRegister.BRASS_INGOT.get(),ItemRegister.ELECTRUM_INGOT.get(),
                ItemRegister.INVAR_INGOT.get()
        );
    }
}
