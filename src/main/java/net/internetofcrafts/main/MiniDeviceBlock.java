package net.internetofcrafts.main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallMountedBlock;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
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

public class MiniDeviceBlock extends WallMountedBlock { // extends WallMountedBlock so that the Mini can be placed on walls and ceilings
  // sets the hitbox and rotates the model based on how the Mini was placed (floor, ceiling, and wall)
  // floor
  private static final VoxelShape MINI_FLOOR = VoxelShapes
      .union(Block.createCuboidShape(5.5, 0.5, 5.5, 10.5, 2.5, 10.5), Block.createCuboidShape(6, 0, 6, 10, 0.5, 10));
  
  // ceiling
  private static final VoxelShape MINI_CEIL = VoxelShapes.union(
      Block.createCuboidShape(5.5, 13.5, 5.5, 10.5, 15.5, 10.5), Block.createCuboidShape(6, 15.5, 6, 10, 16, 10));

  // walls
  private static final VoxelShape MINI_NORTH = VoxelShapes.union(
      Block.createCuboidShape(5.5, 5.5, 13.5, 10.5, 10.5, 15.5), Block.createCuboidShape(6, 6, 15.5, 10, 10, 16));
  private static final VoxelShape MINI_SOUTH = VoxelShapes
      .union(Block.createCuboidShape(5.5, 5.5, 0.5, 10.5, 10.5, 2.5), Block.createCuboidShape(6, 6, 0, 10, 10, 0.5));
  private static final VoxelShape MINI_WEST = VoxelShapes.union(
      Block.createCuboidShape(13.5, 5.5, 5.5, 15.5, 10.5, 10.5), Block.createCuboidShape(15.5, 6, 6, 16, 10, 10));
  private static final VoxelShape MINI_EAST = VoxelShapes.union(Block.createCuboidShape(0.5, 5.5, 5.5, 2.5, 10.5, 10.5),
      Block.createCuboidShape(0, 6, 6, 0.5, 10, 10));

  // constructor
  public MiniDeviceBlock(Settings settings) {
    super(settings);
    // default placement is on a South-facing wall (ie so the Mini is North-facing mounted on the wall)
    this.setDefaultState((BlockState) this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(FACE,
        WallMountLocation.WALL));
  }

  // on Right Click, currently just prints to the chat "Hello, Block{internetofcrafts:cube_mini_COLOR}" - in time, this should open a GUI
  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
      BlockHitResult hit) {
    if (!world.isClient) {
      final String NAME_STRING = "Hello, " + state.getBlock();
      player.sendMessage(new LiteralText(NAME_STRING), false);
    }

    return ActionResult.SUCCESS;
  }

  // gets the correct hitbox and model placement based on how the Mini was placed
  @Override
  public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    Direction direction = (Direction) state.get(FACING);

    // switch to determine correct hitbox and model placement
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
      default: // defaults to floor hitbox and model placement (though it ought to default to North-facing wall-mounted like the default state in the constructor...)
        return MINI_FLOOR;

    }
  }

  // adds the FACING and FACE properties so the game always knows what way the Mini has been placed (FACING for direction, FACE for wall, ceiling or floor)
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add(FACING, FACE);
  }
}
