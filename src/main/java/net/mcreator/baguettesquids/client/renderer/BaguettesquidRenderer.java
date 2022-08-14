
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.BaguettesquidEntity;
import net.mcreator.baguettesquids.client.model.ModelBaguettesquid;

public class BaguettesquidRenderer extends MobRenderer<BaguettesquidEntity, ModelBaguettesquid<BaguettesquidEntity>> {
	public BaguettesquidRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBaguettesquid(context.bakeLayer(ModelBaguettesquid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BaguettesquidEntity entity) {
		return new ResourceLocation("baguettesquids:textures/squid.png");
	}
}
