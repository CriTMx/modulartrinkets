package com.critmx.modulartrinkets.common.blocks;

import com.critmx.modulartrinkets.common.deferredregisters.BlockRegister;
import com.critmx.modulartrinkets.common.items.MTCreativeTab;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

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

    @Override @NotNull
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext colctx)
    {
        Vec3 off = state.getOffset(world,pos);
        switch ((Direction) state.getValue(HorizontalDirectionalBlock.FACING)) {
            default :
                return Shapes.or(box(1, 0, 3, 15, 11, 13), box(0, 0, 0, 16, 16, 16))
                        .move(off.x, off.y, off.z);
            case EAST,WEST :
                return Shapes.or(box(3, 0, 1, 13, 11, 15), box(0, 0, 0, 16, 16, 16))
                        .move(off.x, off.y, off.z);
        }
    }

    @Override @NotNull
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        return (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem) ?
            tieredItem.getTier().getLevel() >= 2 : false;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.TRINKETANVIL.get(), renderType -> renderType == RenderType.translucent());
    }


}
