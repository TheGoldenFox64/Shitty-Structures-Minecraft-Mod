
package net.mcreator.shittystructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.shittystructures.entity.MinosprimeEntity;
import net.mcreator.shittystructures.client.model.Modelminosprime;

public class MinosprimeRenderer extends MobRenderer<MinosprimeEntity, Modelminosprime<MinosprimeEntity>> {
	public MinosprimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminosprime(context.bakeLayer(Modelminosprime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinosprimeEntity entity) {
		return new ResourceLocation("shitty_structures:textures/entities/minosskin.png");
	}
}
