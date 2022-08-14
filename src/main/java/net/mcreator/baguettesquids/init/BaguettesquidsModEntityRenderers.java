
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baguettesquids.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.baguettesquids.client.renderer.RammerRenderer;
import net.mcreator.baguettesquids.client.renderer.PanzerdachRenderer;
import net.mcreator.baguettesquids.client.renderer.FerntailRenderer;
import net.mcreator.baguettesquids.client.renderer.ChimaeraFlyRenderer;
import net.mcreator.baguettesquids.client.renderer.BoomerangHopperRenderer;
import net.mcreator.baguettesquids.client.renderer.BaguettesquidRenderer;
import net.mcreator.baguettesquids.client.renderer.AirtrawlerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BaguettesquidsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BaguettesquidsModEntities.BAGUETTESQUID.get(), BaguettesquidRenderer::new);
		event.registerEntityRenderer(BaguettesquidsModEntities.BOOMERANG_HOPPER.get(), BoomerangHopperRenderer::new);
		event.registerEntityRenderer(BaguettesquidsModEntities.CHIMAERA_FLY.get(), ChimaeraFlyRenderer::new);
		event.registerEntityRenderer(BaguettesquidsModEntities.RAMMER.get(), RammerRenderer::new);
		event.registerEntityRenderer(BaguettesquidsModEntities.FERNTAIL.get(), FerntailRenderer::new);
		event.registerEntityRenderer(BaguettesquidsModEntities.PANZERDACH.get(), PanzerdachRenderer::new);
		event.registerEntityRenderer(BaguettesquidsModEntities.AIRTRAWLER.get(), AirtrawlerRenderer::new);
	}
}
