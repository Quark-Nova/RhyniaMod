
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.AirtrawlerEntity;
import net.mcreator.baguettesquids.client.model.ModelAirtrawler;

public class AirtrawlerRenderer extends MobRenderer<AirtrawlerEntity, ModelAirtrawler<AirtrawlerEntity>> {
	public AirtrawlerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAirtrawler(context.bakeLayer(ModelAirtrawler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AirtrawlerEntity entity) {
		return new ResourceLocation("baguettesquids:textures/airtrawler.png");
	}
}
