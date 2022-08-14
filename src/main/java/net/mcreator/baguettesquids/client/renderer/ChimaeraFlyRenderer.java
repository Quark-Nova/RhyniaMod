
package net.mcreator.baguettesquids.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baguettesquids.entity.ChimaeraFlyEntity;
import net.mcreator.baguettesquids.client.model.ModelChimaerafly;

public class ChimaeraFlyRenderer extends MobRenderer<ChimaeraFlyEntity, ModelChimaerafly<ChimaeraFlyEntity>> {
	public ChimaeraFlyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelChimaerafly(context.bakeLayer(ModelChimaerafly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChimaeraFlyEntity entity) {
		return new ResourceLocation("baguettesquids:textures/chimaerafly2.png");
	}
}
