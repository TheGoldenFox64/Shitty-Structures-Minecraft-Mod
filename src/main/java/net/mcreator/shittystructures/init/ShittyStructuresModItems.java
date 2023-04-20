
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shittystructures.item.WinnerItem;
import net.mcreator.shittystructures.item.RevolverItem;
import net.mcreator.shittystructures.item.MarksmanItem;
import net.mcreator.shittystructures.item.FuckYouItem;
import net.mcreator.shittystructures.item.BulletItem;
import net.mcreator.shittystructures.ShittyStructuresMod;

public class ShittyStructuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShittyStructuresMod.MODID);
	public static final RegistryObject<Item> FUCK_YOU = REGISTRY.register("fuck_you", () -> new FuckYouItem());
	public static final RegistryObject<Item> LANDMINE = block(ShittyStructuresModBlocks.LANDMINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOUBLENETHERITE = block(ShittyStructuresModBlocks.DOUBLENETHERITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TRIPLENETHERITE = block(ShittyStructuresModBlocks.TRIPLENETHERITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUADRUPLENETHERITE = block(ShittyStructuresModBlocks.QUADRUPLENETHERITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WINNER = REGISTRY.register("winner", () -> new WinnerItem());
	public static final RegistryObject<Item> WINNERBLOCK = block(ShittyStructuresModBlocks.WINNERBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WEEZERBLOCK = block(ShittyStructuresModBlocks.WEEZERBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MINOSPRIME_SPAWN_EGG = REGISTRY.register("minosprime_spawn_egg",
			() -> new ForgeSpawnEggItem(ShittyStructuresModEntities.MINOSPRIME, -3342337, -16750951, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MARKSMAN = REGISTRY.register("marksman", () -> new MarksmanItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> COIN_SPAWN_EGG = REGISTRY.register("coin_spawn_egg", () -> new ForgeSpawnEggItem(ShittyStructuresModEntities.COIN, -4685305, -1576176, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> REVOLVER = REGISTRY.register("revolver", () -> new RevolverItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
