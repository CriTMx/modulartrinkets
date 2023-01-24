package com.critmx.modulartrinkets.common.registry;

import com.critmx.modulartrinkets.ModularTrinkets;
import com.critmx.modulartrinkets.common.blocks.MetalBlockAbstract;
import com.critmx.modulartrinkets.common.blocks.MetalBlocks;
import com.critmx.modulartrinkets.common.blocks.TrinketAnvil;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModularTrinkets.MOD_ID);

    public static final RegistryObject<Block> TRINKET_ANVIL = registerBlock(
                    TrinketAnvil.mGetName(),
                    ()-> new TrinketAnvil(TrinketAnvil.mGetProperties()),
                    TrinketAnvil.mGetTab()
            );

    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock(
            MetalBlocks.CobaltBlock.mGetName(),
            ()-> new MetalBlocks.CobaltBlock(MetalBlockAbstract.mGetProperties()),
            MetalBlockAbstract.mGetTab()
    );

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
