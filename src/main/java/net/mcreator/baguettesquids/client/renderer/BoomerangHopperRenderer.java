
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.BoomerangHopperEntity;
import net.mcreator.baguettesquids.client.model.ModelHopper;

public class BoomerangHopperRenderer extends MobRenderer<BoomerangHopperEntity, ModelHopper<BoomerangHopperEntity>> {
	public BoomerangHopperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHopper(context.bakeLayer(ModelHopper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoomerangHopperEntity entity) {
		return new ResourceLocation("baguettesquids:textures/hopper2.png");
	}
}
