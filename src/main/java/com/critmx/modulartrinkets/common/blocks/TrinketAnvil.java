package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.common.deferredregisters.BlockRegister;
import com.critmx.modulartrinkets.common.items.MTCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public final class TrinketAnvil extends Block
{
    String name;
    Properties properties;
    CreativeModeTab tab;
    public static final TrinketAnvil TRINKETANVIL = new TrinketAnvil();
    public TrinketAnvil()
    {
        super(BlockBehaviour.Properties.of(Material.METAL).strength(0.3f).requiresCorrectToolForDrops().dynamicShape());
        properties = Properties.of(Material.METAL).strength(0.3f).requiresCorrectToolForDrops().dynamicShape();
        name = "trinketanvil";
        tab = MTCreativeTab.MT_TAB;
    }

    public String mt_getName()
    {
        return name;
    }
    public Properties mt_getProperties()
    {
        return properties;
    }
    public CreativeModeTab mt_getTab()
    {
        return tab;
    }
}
