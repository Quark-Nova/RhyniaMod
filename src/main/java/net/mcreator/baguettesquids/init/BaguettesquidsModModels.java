
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baguettesquids.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.baguettesquids.client.model.Modelcustom_model;
import net.mcreator.baguettesquids.client.model.ModelRammer;
import net.mcreator.baguettesquids.client.model.ModelPanzerlach;
import net.mcreator.baguettesquids.client.model.ModelHopper;
import net.mcreator.baguettesquids.client.model.ModelChimaerafly;
import net.mcreator.baguettesquids.client.model.ModelBaguettesquid;
import net.mcreator.baguettesquids.client.model.ModelAirtrawler;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BaguettesquidsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRammer.LAYER_LOCATION, ModelRammer::createBodyLayer);
		event.registerLayerDefinition(ModelAirtrawler.LAYER_LOCATION, ModelAirtrawler::createBodyLayer);
		event.registerLayerDefinition(ModelHopper.LAYER_LOCATION, ModelHopper::createBodyLayer);
		event.registerLayerDefinition(ModelPanzerlach.LAYER_LOCATION, ModelPanzerlach::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelBaguettesquid.LAYER_LOCATION, ModelBaguettesquid::createBodyLayer);
		event.registerLayerDefinition(ModelChimaerafly.LAYER_LOCATION, ModelChimaerafly::createBodyLayer);
	}
}
