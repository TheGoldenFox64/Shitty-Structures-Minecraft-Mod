
package net.mcreator.shittystructures.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.shittystructures.init.ShittyStructuresModBlocks;

import java.util.Set;
import java.util.List;

public class LandmineFeature extends OreFeature {
	public static LandmineFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new LandmineFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("shitty_structures:landmine", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRASS_BLOCK.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIRT_PATH.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.MYCELIUM.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIRT.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PODZOL.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.COARSE_DIRT.defaultBlockState()), ShittyStructuresModBlocks.LANDMINE.get().defaultBlockState())), 1));
		PLACED_FEATURE = PlacementUtils.register("shitty_structures:landmine", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, Level.NETHER, Level.END);

	public LandmineFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
