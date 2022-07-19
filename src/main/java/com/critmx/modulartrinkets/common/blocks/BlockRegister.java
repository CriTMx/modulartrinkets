package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.ModularTrinkets;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModularTrinkets.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}
