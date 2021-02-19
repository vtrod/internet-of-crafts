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

  public static final MiniDeviceBlock CUBE_MINI_BLACK = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_BLUE = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_BROWN = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_CYAN = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_GRAY = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_GREEN = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_LIGHT_BLUE = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_LIGHT_GRAY = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_LIME = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_MAGENTA = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_ORANGE = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_PINK = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_PURPLE = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_RED = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_WHITE = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));
  public static final MiniDeviceBlock CUBE_MINI_YELLOW = new MiniDeviceBlock(Block.Settings.of(Material.WOOL).strength(0.8f, 3f));

  @Override
  public void onInitialize() {
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_black"), CUBE_MINI_BLACK);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_black"), new BlockItem(CUBE_MINI_BLACK, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_blue"), CUBE_MINI_BLUE);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_blue"), new BlockItem(CUBE_MINI_BLUE, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_brown"), CUBE_MINI_BROWN);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_brown"), new BlockItem(CUBE_MINI_BROWN, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_cyan"), CUBE_MINI_CYAN);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_cyan"), new BlockItem(CUBE_MINI_CYAN, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_gray"), CUBE_MINI_GRAY);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_gray"), new BlockItem(CUBE_MINI_GRAY, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_green"), CUBE_MINI_GREEN);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_green"), new BlockItem(CUBE_MINI_GREEN, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_light_blue"), CUBE_MINI_LIGHT_BLUE);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_light_blue"), new BlockItem(CUBE_MINI_LIGHT_BLUE, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_light_gray"), CUBE_MINI_LIGHT_GRAY);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_light_gray"), new BlockItem(CUBE_MINI_LIGHT_GRAY, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_lime"), CUBE_MINI_LIME);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_lime"), new BlockItem(CUBE_MINI_LIME, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_magenta"), CUBE_MINI_MAGENTA);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_magenta"), new BlockItem(CUBE_MINI_MAGENTA, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_orange"), CUBE_MINI_ORANGE);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_orange"), new BlockItem(CUBE_MINI_ORANGE, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_pink"), CUBE_MINI_PINK);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_pink"), new BlockItem(CUBE_MINI_PINK, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_purple"), CUBE_MINI_PURPLE);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_purple"), new BlockItem(CUBE_MINI_PURPLE, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_red"), CUBE_MINI_RED);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_red"), new BlockItem(CUBE_MINI_RED, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_white"), CUBE_MINI_WHITE);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_white"), new BlockItem(CUBE_MINI_WHITE, new FabricItemSettings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("internetofcrafts", "cube_mini_yellow"), CUBE_MINI_YELLOW);
    Registry.register(Registry.ITEM, new Identifier("internetofcrafts", "cube_mini_yellow"), new BlockItem(CUBE_MINI_YELLOW, new FabricItemSettings().group(ItemGroup.MISC)));
  }
}