/*
package com.critmx.modulartrinkets.common.blockentities;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.deferredregisters.BlockRegister;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityRegister {

    public BlockEntityRegister(){}

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ModularTrinkets.MOD_ID);

    public static final RegistryObject<BlockEntityType<TrinketAnvilEntity>> TRINKETANVIL_BE =
            BLOCK_ENTITIES.register(
                    "trinketanvil_be",
                     ()-> BlockEntityType.Builder.of(TrinketAnvilEntity::new,BlockRegister.TRINKETANVIL.get()).build(null)
            );

}
*/