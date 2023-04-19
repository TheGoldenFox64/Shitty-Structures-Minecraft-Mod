
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.shittystructures.block.LandmineBlock;
import net.mcreator.shittystructures.ShittyStructuresMod;

public class ShittyStructuresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShittyStructuresMod.MODID);
	public static final RegistryObject<Block> LANDMINE = REGISTRY.register("landmine", () -> new LandmineBlock());
}
