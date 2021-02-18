package net.internetofcrafts;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.internetofcrafts.main.MiniDeviceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InternetOfCrafts implements ModInitializer {

  public static final MiniDeviceBlock CUBE_MINI_ORANGE = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));















  @Override
  public void onInitialize() {
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_orange"), CUBE_MINI_ORANGE);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_orange"), new BlockItem(CUBE_MINI_ORANGE, new FabricItemSettings().group(ItemGroup.MISC)));
  }
}