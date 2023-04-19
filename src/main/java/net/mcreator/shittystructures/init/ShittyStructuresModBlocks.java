
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.shittystructures.block.WinnerblockBlock;
import net.mcreator.shittystructures.block.WeezerblockBlock;
import net.mcreator.shittystructures.block.TriplenetheriteBlock;
import net.mcreator.shittystructures.block.QuadruplenetheriteBlock;
import net.mcreator.shittystructures.block.LandmineBlock;
import net.mcreator.shittystructures.block.DoublenetheriteBlock;
import net.mcreator.shittystructures.ShittyStructuresMod;

public class ShittyStructuresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShittyStructuresMod.MODID);
	public static final RegistryObject<Block> LANDMINE = REGISTRY.register("landmine", () -> new LandmineBlock());
	public static final RegistryObject<Block> DOUBLENETHERITE = REGISTRY.register("doublenetherite", () -> new DoublenetheriteBlock());
	public static final RegistryObject<Block> TRIPLENETHERITE = REGISTRY.register("triplenetherite", () -> new TriplenetheriteBlock());
	public static final RegistryObject<Block> QUADRUPLENETHERITE = REGISTRY.register("quadruplenetherite", () -> new QuadruplenetheriteBlock());
	public static final RegistryObject<Block> WINNERBLOCK = REGISTRY.register("winnerblock", () -> new WinnerblockBlock());
	public static final RegistryObject<Block> WEEZERBLOCK = REGISTRY.register("weezerblock", () -> new WeezerblockBlock());
}
