package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.List;

import static java.util.Collections.singletonList;

public abstract class MetalBlockAbstract extends Block {
    static final CreativeModeTab tab = MTCreativeTab.MT_MATERIALS_TAB;
    static final Properties metal_block_properties = Properties.of(Material.METAL).strength(1.0f).sound(SoundType.METAL).requiresCorrectToolForDrops();
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public MetalBlockAbstract(Properties pProperties) {
        super(pProperties);
    }

    public static CreativeModeTab mGetTab() { return tab; }
    public static Properties mGetProperties() { return metal_block_properties; }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder){
        pBuilder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState()
                .setValue(FACING, pContext.getHorizontalDirection());
    }

    public BlockState rotate(BlockState pState, Rotation pRotation){
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror){
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    public List<ItemStack> getDrops(BlockState pState, LootContext.Builder pBuilder) {

        List<ItemStack> drops = super.getDrops(pState, pBuilder);
        if (!drops.isEmpty())
            return drops;
        return singletonList(new ItemStack(this, 1));
    }

    @Override
    public boolean canHarvestBlock(BlockState pState, BlockGetter pLevel, BlockPos pPos, Player pPlayer) {
        return (pPlayer.getInventory().getSelected().getItem() instanceof TieredItem tieredItem) && (tieredItem.getTier().getLevel() >= 2);
    }
}
