
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.RammerEntity;
import net.mcreator.baguettesquids.client.model.ModelRammer;

public class RammerRenderer extends MobRenderer<RammerEntity, ModelRammer<RammerEntity>> {
	public RammerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRammer(context.bakeLayer(ModelRammer.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(RammerEntity entity) {
		return new ResourceLocation("baguettesquids:textures/newrammer.png");
	}
}
