
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.FerntailEntity;
import net.mcreator.baguettesquids.client.model.Modelcustom_model;

public class FerntailRenderer extends MobRenderer<FerntailEntity, Modelcustom_model<FerntailEntity>> {
	public FerntailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FerntailEntity entity) {
		return new ResourceLocation("baguettesquids:textures/ferntail.png");
	}
}
