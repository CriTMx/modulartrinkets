package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.common.blocks.voxelshapes.TrinketAnvilVoxelShape;
import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTab;
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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TrinketAnvil extends Block {

    final static String name = "trinketanvil";
    final static CreativeModeTab tab = MTCreativeTab.MT_TAB;
    final static Properties trinket_anvil_properties = Properties.of(Material.HEAVY_METAL).strength(0.7f).dynamicShape().noOcclusion();
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public TrinketAnvil(Properties properties)
    {
        super(properties);
        this.registerDefaultState(
                this.getStateDefinition().any());
    }

    public static String m_getName()
    {
        return name;
    }
    public static Properties m_getProperties()
    {
        return trinket_anvil_properties;
    }
    public static CreativeModeTab m_getTab()
    {
        return tab;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction direction = pState.getValue(FACING);
        return direction.getAxis() == Direction.Axis.X ? TrinketAnvilVoxelShape.m_getShapeX() : TrinketAnvilVoxelShape.m_getShapeZ();
    }

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
}
