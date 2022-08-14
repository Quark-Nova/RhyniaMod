
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.PanzerdachEntity;
import net.mcreator.baguettesquids.client.model.ModelPanzerlach;

public class PanzerdachRenderer extends MobRenderer<PanzerdachEntity, ModelPanzerlach<PanzerdachEntity>> {
	public PanzerdachRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPanzerlach(context.bakeLayer(ModelPanzerlach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PanzerdachEntity entity) {
		return new ResourceLocation("baguettesquids:textures/panzerbear2.png");
	}
}
