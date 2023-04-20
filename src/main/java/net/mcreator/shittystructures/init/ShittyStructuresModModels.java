
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shittystructures.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.shittystructures.client.model.Modelminosprime;
import net.mcreator.shittystructures.client.model.ModelCoin;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ShittyStructuresModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCoin.LAYER_LOCATION, ModelCoin::createBodyLayer);
		event.registerLayerDefinition(Modelminosprime.LAYER_LOCATION, Modelminosprime::createBodyLayer);
	}
}
