package net.internetofcrafts.main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallMountedBlock;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class MiniDeviceBlock extends WallMountedBlock {
  private static final VoxelShape MINI_FLOOR = VoxelShapes
      .union(Block.createCuboidShape(5.5, 0.5, 5.5, 10.5, 2.5, 10.5), Block.createCuboidShape(6, 0, 6, 10, 0.5, 10));

  private static final VoxelShape MINI_CEIL = VoxelShapes.union(
      Block.createCuboidShape(5.5, 13.5, 5.5, 10.5, 15.5, 10.5), Block.createCuboidShape(6, 15.5, 6, 10, 16, 10));

  private static final VoxelShape MINI_NORTH = VoxelShapes.union(
      Block.createCuboidShape(5.5, 5.5, 13.5, 10.5, 10.5, 15.5), Block.createCuboidShape(6, 6, 15.5, 10, 10, 16));

  private static final VoxelShape MINI_SOUTH = VoxelShapes
      .union(Block.createCuboidShape(5.5, 5.5, 0.5, 10.5, 10.5, 2.5), Block.createCuboidShape(6, 6, 0, 10, 10, 0.5));

  private static final VoxelShape MINI_WEST = VoxelShapes.union(
      Block.createCuboidShape(13.5, 5.5, 5.5, 15.5, 10.5, 10.5), Block.createCuboidShape(15.5, 6, 6, 16, 10, 10));

  private static final VoxelShape MINI_EAST = VoxelShapes.union(Block.createCuboidShape(0.5, 5.5, 5.5, 2.5, 10.5, 10.5),
      Block.createCuboidShape(0, 6, 6, 0.5, 10, 10));

  public MiniDeviceBlock(Settings settings) {
    super(settings);
    this.setDefaultState((BlockState) ((BlockState) ((BlockState) ((BlockState) this.stateManager.getDefaultState())
        .with(FACING, Direction.NORTH))).with(FACE, WallMountLocation.WALL));
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
      BlockHitResult hit) {
    if (!world.isClient) {
      player.sendMessage(new LiteralText("Hello, world!"), false);
    }

    return ActionResult.SUCCESS;
  }

  @Override
  public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    Direction direction = (Direction) state.get(FACING);

    switch ((WallMountLocation) state.get(FACE)) {
      case CEILING:
        return MINI_CEIL;
      case WALL:
        switch (direction) {
          case NORTH:
            return MINI_NORTH;
          case SOUTH:
            return MINI_SOUTH;
          case WEST:
            return MINI_WEST;
          case EAST:
          default:
            return MINI_EAST;

        }
      case FLOOR:
      default:
        return MINI_FLOOR;

    }
  }

}
