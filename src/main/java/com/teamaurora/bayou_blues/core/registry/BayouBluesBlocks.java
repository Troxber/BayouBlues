package com.teamaurora.bayou_blues.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.*;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.*;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import com.teamaurora.bayou_blues.common.block.CypressBranchBlock;
import com.teamaurora.bayou_blues.common.block.CypressKneeBlock;
import com.teamaurora.bayou_blues.common.block.DoubleCypressKneeBlock;
import com.teamaurora.bayou_blues.common.block.HangingCypressLeavesBlock;
import com.teamaurora.bayou_blues.common.block.trees.CypressTree;
import com.teamaurora.bayou_blues.core.BayouBlues;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BayouBlues.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BayouBluesBlocks {
    public static final BlockSubRegistryHelper HELPER = BayouBlues.REGISTRY_HELPER.getBlockSubHelper();

    // cypress
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = HELPER.createBlock("stripped_cypress_log", ()->new StrippedLogBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD = HELPER.createBlock("stripped_cypress_wood", ()->new StrippedWoodBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_LOG= HELPER.createBlock("cypress_log", ()->new AbnormalsLogBlock(STRIPPED_CYPRESS_LOG, Block.Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_WOOD = HELPER.createBlock("cypress_wood", ()->new WoodBlock(STRIPPED_CYPRESS_WOOD, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_LEAVES = HELPER.createBlock("cypress_leaves", ()->new AbnormalsLeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CYPRESS_SAPLING = HELPER.createBlock("cypress_sapling", ()->new AbnormalsSaplingBlock(new CypressTree(), Block.Properties.from(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> POTTED_CYPRESS_SAPLING = HELPER.createBlockNoItem("potted_cypress_sapling", ()->new FlowerPotBlock(CYPRESS_SAPLING.get(), Block.Properties.from(Blocks.POTTED_ALLIUM)));
    public static final RegistryObject<Block> CYPRESS_PLANKS = HELPER.createBlock("cypress_planks", ()->new PlanksBlock(Block.Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_SLAB = HELPER.createBlock("cypress_slab", ()->new WoodSlabBlock(Block.Properties.from(Blocks.OAK_SLAB)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_STAIRS = HELPER.createBlock("cypress_stairs", ()->new WoodStairsBlock(CYPRESS_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_STAIRS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_PRESSURE_PLATE = HELPER.createBlock("cypress_pressure_plate", ()->new WoodPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> CYPRESS_FENCE = HELPER.createBlock("cypress_fence", ()->new WoodFenceBlock(Block.Properties.from(Blocks.OAK_FENCE)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CYPRESS_FENCE_GATE = HELPER.createBlock("cypress_fence_gate", ()->new WoodFenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> CYPRESS_BUTTON = HELPER.createBlock("cypress_button", ()->new AbnormalsWoodButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> CYPRESS_DOOR = HELPER.createBlock("cypress_door", ()->new WoodDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> CYPRESS_TRAPDOOR = HELPER.createBlock("cypress_trapdoor", ()->new WoodTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ItemGroup.REDSTONE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>, RegistryObject<AbnormalsWallSignBlock>> CYPRESS_SIGNS = HELPER.createSignBlock("cypress", MaterialColor.PURPLE_TERRACOTTA);

    public static final RegistryObject<Block> CYPRESS_BOOKSHELF = HELPER.createCompatBlock("quark", "cypress_bookshelf", ()->new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_CYPRESS_PLANKS = HELPER.createCompatBlock("quark", "vertical_cypress_planks", ()->new Block(Block.Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cypress_vertical_slab", ()->new VerticalSlabBlock(Block.Properties.from(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYPRESS_LADDER = HELPER.createCompatBlock("quark", "cypress_ladder", ()->new AbnormalsLadderBlock(Block.Properties.from(Blocks.LADDER).harvestTool(ToolType.AXE)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CYPRESS_LEAF_CARPET = HELPER.createCompatBlock("quark", "cypress_leaf_carpet", ()->new LeafCarpetBlock(Block.Properties.from(CYPRESS_LEAVES.get())), ItemGroup.DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> CYPRESS_CHESTS = HELPER.createCompatChestBlocks("cypress", MaterialColor.PURPLE_TERRACOTTA);

    public static final RegistryObject<Block> CYPRESS_BEEHIVE = HELPER.createCompatBlock("buzzier_bees", "cypress_beehive", ()->new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);

    public static final RegistryObject<Block> HANGING_CYPRESS_LEAVES = HELPER.createBlock("hanging_cypress_leaves", ()->new HangingCypressLeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)), ItemGroup.DECORATIONS);

    public static final RegistryObject<Block> STRIPPED_CYPRESS_KNEE = HELPER.createBlock("stripped_cypress_knee", ()->new CypressKneeBlock(()->Blocks.AIR, false, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CYPRESS_KNEE = HELPER.createBlock("cypress_knee", ()->new CypressKneeBlock(STRIPPED_CYPRESS_KNEE, true, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_LARGE_CYPRESS_KNEE = HELPER.createBlock("stripped_large_cypress_knee", ()->new DoubleCypressKneeBlock(()->Blocks.AIR, false, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> LARGE_CYPRESS_KNEE = HELPER.createBlock("large_cypress_knee", ()->new DoubleCypressKneeBlock(STRIPPED_LARGE_CYPRESS_KNEE, true, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), ItemGroup.DECORATIONS);

    public static final RegistryObject<Block> CYPRESS_BRANCH = HELPER.createBlock("cypress_branch", ()->new CypressBranchBlock(AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().sound(SoundType.BAMBOO_SAPLING)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GOOSEBERRY_SACK = HELPER.createCompatBlock("quark", "gooseberry_sack", ()->new Block(Block.Properties.create(Material.WOOL, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)), ItemGroup.DECORATIONS);
}
