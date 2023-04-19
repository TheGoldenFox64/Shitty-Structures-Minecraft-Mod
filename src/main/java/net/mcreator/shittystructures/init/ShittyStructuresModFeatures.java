
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.shittystructures.world.features.ores.LandmineFeature;
import net.mcreator.shittystructures.ShittyStructuresMod;

@Mod.EventBusSubscriber
public class ShittyStructuresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ShittyStructuresMod.MODID);
	public static final RegistryObject<Feature<?>> LANDMINE = REGISTRY.register("landmine", LandmineFeature::feature);
}
