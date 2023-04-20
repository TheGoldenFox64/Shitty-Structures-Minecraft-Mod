
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.shittystructures.client.renderer.MinosprimeRenderer;
import net.mcreator.shittystructures.client.renderer.CoinRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShittyStructuresModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ShittyStructuresModEntities.MINOSPRIME.get(), MinosprimeRenderer::new);
		event.registerEntityRenderer(ShittyStructuresModEntities.MARKSMAN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ShittyStructuresModEntities.COIN.get(), CoinRenderer::new);
	}
}
