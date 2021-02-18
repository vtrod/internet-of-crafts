package net.internetofcrafts.main;

import javax.swing.text.html.BlockView;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;

public class MiniDeviceBlock extends Block {
  private static final VoxelShape MINI_FLOOR = VoxelShapes.union(
    Block.createCuboidShape(5.5, 0.5, 5.5, 10.5, 2.5, 10.5), 
    Block.createCuboidShape(  6,   0,   6,   10, 0.5,   10));

  public MiniDeviceBlock(Settings settings) {
    super(settings);
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    if (!world.isClient) {
      player.sendMessage(new LiteralText("Hello, world!"), false);
    }

    return ActionResult.SUCCESS;
  }
  
  @Override
  public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return MINI_FLOOR;
  }
}
