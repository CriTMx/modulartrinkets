package com.critmx.modulartrinkets.common.deferredregisters;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.blocks.TrinketAnvil;
import com.critmx.modulartrinkets.common.deferredregisters.ItemRegister;
import com.critmx.modulartrinkets.common.items.MTCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModularTrinkets.MOD_ID);


    /*public static final RegistryObject<Block> TRINKETANVIL = registerBlock

            ("trinketanvil", ()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.3f).requiresCorrectToolForDrops().dynamicShape()),
                    MTCreativeTab.MT_TAB);*/

    public static final RegistryObject<Block> TRINKETANVIL = registerBlock
            (TrinketAnvil.TRINKETANVIL.mt_getName(),()->new Block(TrinketAnvil.TRINKETANVIL.mt_getProperties()),TrinketAnvil.TRINKETANVIL.mt_getTab());

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab CreativeTab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,CreativeTab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> Block, CreativeModeTab CreativeTab)
    {
        return ItemRegister.ITEMS.register(name, ()-> new BlockItem(Block.get(), new Item.Properties().tab(CreativeTab)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}
