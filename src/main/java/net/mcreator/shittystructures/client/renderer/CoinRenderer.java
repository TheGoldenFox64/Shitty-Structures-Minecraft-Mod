
package net.mcreator.shittystructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.shittystructures.entity.CoinEntity;
import net.mcreator.shittystructures.client.model.ModelCoin;

public class CoinRenderer extends MobRenderer<CoinEntity, ModelCoin<CoinEntity>> {
	public CoinRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCoin(context.bakeLayer(ModelCoin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoinEntity entity) {
		return new ResourceLocation("shitty_structures:textures/entities/coinskin.png");
	}
}
