package com.critmx.modulartrinkets.common.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static com.critmx.modulartrinkets.common.blockentities.BlockEntityRegister.TRINKETANVIL_BE;

public class TrinketAnvilEntity extends BlockEntity {

    public TrinketAnvilEntity(BlockPos pos, BlockState state)
    {
        super(TRINKETANVIL_BE.get(),pos,state);
    }

}
