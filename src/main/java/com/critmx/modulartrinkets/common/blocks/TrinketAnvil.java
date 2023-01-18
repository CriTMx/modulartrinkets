package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

import static com.critmx.modulartrinkets.common.blocks.voxelshapes.MTVoxelShapes.getTrinketAnvilShape;
import static java.util.Collections.singletonList;

public class TrinketAnvil extends Block {

    final static String name = "trinket_anvil";
    final static CreativeModeTab tab = MTCreativeTab.MT_TAB;
    final static Properties trinket_anvil_properties = Properties.of(Material.HEAVY_METAL).strength(0.7f).dynamicShape().noOcclusion();
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public TrinketAnvil(Properties properties)
    {
        super(properties);
        this.registerDefaultState(
                this.getStateDefinition().any());
    }

    public static String mGetName()
    {
        return name;
    }
    public static Properties mGetProperties()
    {
        return trinket_anvil_properties;
    }
    public static CreativeModeTab mGetTab()
    {
        return tab;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction direction = pState.getValue(FACING);
        return direction.getAxis() == Direction.Axis.X ? getTrinketAnvilShape("X") : getTrinketAnvilShape("Z");
    }

    //Blockstates

    public BlockState rotate(BlockState pState, Rotation pRotation){
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror){
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder){
        pBuilder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate = super.getStateForPlacement(pContext);
        Direction direction = pContext.getHorizontalDirection();
        return this.defaultBlockState()
                .setValue(FACING, pContext.getHorizontalDirection());
    }
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return canSupportRigidBlock(pLevel, pPos.below());
    }

    //Drops
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
