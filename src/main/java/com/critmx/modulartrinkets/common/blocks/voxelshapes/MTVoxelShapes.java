package com.critmx.modulartrinkets.common.blocks.voxelshapes;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MTVoxelShapes {


    public static VoxelShape getTrinketAnvilShape(String axis) {
        final VoxelShape HEAD_Z = Block.box(1, 7, 3, 15, 11.5, 13);
        final VoxelShape HEAD_X = Block.box(3, 7, 1, 13, 11.5, 15);

        final VoxelShape NECKTOP_Z = Block.box(2, 6, 4, 14, 7, 12);
        final VoxelShape NECKTOP_X = Block.box(4, 6, 2, 12, 7, 14);

        final VoxelShape NECK_Z = Block.box(2, 1, 4, 14, 2, 12);
        final VoxelShape NECK_X = Block.box(4, 1, 2, 12, 2, 14);

        final VoxelShape NECKBOTTOM_Z = Block.box(1.25, 0, 3.25, 14.75, 1, 12.75);
        final VoxelShape NECKBOTTOM_X = Block.box(3.25, 0, 1.25, 12.75, 1, 14.75);

        final VoxelShape BASE_Z = Block.box(3, 2, 5, 13, 6, 11);
        final VoxelShape BASE_X = Block.box(5, 2, 3, 11, 6, 13);

        final VoxelShape SHAPE_X = Shapes.or(HEAD_X, NECKTOP_X, NECK_X, NECKBOTTOM_X, BASE_X);
        final VoxelShape SHAPE_Z = Shapes.or(HEAD_Z, NECKTOP_Z, NECK_Z, NECKBOTTOM_Z, BASE_Z);

        return axis.compareTo("X") == 0 ? SHAPE_X:SHAPE_Z;
    }
}
