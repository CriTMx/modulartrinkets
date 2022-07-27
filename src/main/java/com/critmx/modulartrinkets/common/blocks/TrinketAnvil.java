package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.common.deferredregisters.BlockRegister;
import com.critmx.modulartrinkets.common.items.MTCreativeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class TrinketAnvil extends BlockRegister
{

    public static final RegistryObject<Block> TRINKETANVIL = registerBlock

            ("trinketanvil", ()->new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().of(Material.METAL).strength(0.3f).requiresCorrectToolForDrops().dynamicShape()),
                    MTCreativeTab.MT_TAB);


}
