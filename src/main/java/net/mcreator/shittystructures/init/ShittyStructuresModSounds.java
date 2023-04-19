
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.shittystructures.ShittyStructuresMod;

public class ShittyStructuresModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ShittyStructuresMod.MODID);
	public static final RegistryObject<SoundEvent> WINSOUND = REGISTRY.register("winsound", () -> new SoundEvent(new ResourceLocation("shitty_structures", "winsound")));
	public static final RegistryObject<SoundEvent> LOSESOUND = REGISTRY.register("losesound", () -> new SoundEvent(new ResourceLocation("shitty_structures", "losesound")));
	public static final RegistryObject<SoundEvent> WEEZERNOISE = REGISTRY.register("weezernoise", () -> new SoundEvent(new ResourceLocation("shitty_structures", "weezernoise")));
}
