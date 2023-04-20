
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.shittystructures.entity.MinosprimeEntity;
import net.mcreator.shittystructures.entity.MarksmanEntity;
import net.mcreator.shittystructures.entity.CoinEntity;
import net.mcreator.shittystructures.ShittyStructuresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShittyStructuresModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ShittyStructuresMod.MODID);
	public static final RegistryObject<EntityType<MinosprimeEntity>> MINOSPRIME = register("minosprime", EntityType.Builder.<MinosprimeEntity>of(MinosprimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(MinosprimeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MarksmanEntity>> MARKSMAN = register("projectile_marksman",
			EntityType.Builder.<MarksmanEntity>of(MarksmanEntity::new, MobCategory.MISC).setCustomClientFactory(MarksmanEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CoinEntity>> COIN = register("coin",
			EntityType.Builder.<CoinEntity>of(CoinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoinEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MinosprimeEntity.init();
			CoinEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MINOSPRIME.get(), MinosprimeEntity.createAttributes().build());
		event.put(COIN.get(), CoinEntity.createAttributes().build());
	}
}
