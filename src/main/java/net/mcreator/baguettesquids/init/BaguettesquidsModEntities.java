
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baguettesquids.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.baguettesquids.entity.RammerEntity;
import net.mcreator.baguettesquids.entity.PanzerdachEntity;
import net.mcreator.baguettesquids.entity.FerntailEntity;
import net.mcreator.baguettesquids.entity.ChimaeraFlyEntity;
import net.mcreator.baguettesquids.entity.BoomerangHopperEntity;
import net.mcreator.baguettesquids.entity.BaguettesquidEntity;
import net.mcreator.baguettesquids.entity.AirtrawlerEntity;
import net.mcreator.baguettesquids.BaguettesquidsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BaguettesquidsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BaguettesquidsMod.MODID);
	public static final RegistryObject<EntityType<BaguettesquidEntity>> BAGUETTESQUID = register("baguettesquid",
			EntityType.Builder.<BaguettesquidEntity>of(BaguettesquidEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BaguettesquidEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<BoomerangHopperEntity>> BOOMERANG_HOPPER = register("boomerang_hopper",
			EntityType.Builder.<BoomerangHopperEntity>of(BoomerangHopperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoomerangHopperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChimaeraFlyEntity>> CHIMAERA_FLY = register("chimaera_fly",
			EntityType.Builder.<ChimaeraFlyEntity>of(ChimaeraFlyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChimaeraFlyEntity::new)

					.sized(0.5f, 0.3f));
	public static final RegistryObject<EntityType<RammerEntity>> RAMMER = register("rammer",
			EntityType.Builder.<RammerEntity>of(RammerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RammerEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<FerntailEntity>> FERNTAIL = register("ferntail",
			EntityType.Builder.<FerntailEntity>of(FerntailEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FerntailEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<PanzerdachEntity>> PANZERDACH = register("panzerdach",
			EntityType.Builder.<PanzerdachEntity>of(PanzerdachEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PanzerdachEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<AirtrawlerEntity>> AIRTRAWLER = register("airtrawler",
			EntityType.Builder.<AirtrawlerEntity>of(AirtrawlerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AirtrawlerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BaguettesquidEntity.init();
			BoomerangHopperEntity.init();
			ChimaeraFlyEntity.init();
			RammerEntity.init();
			FerntailEntity.init();
			PanzerdachEntity.init();
			AirtrawlerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BAGUETTESQUID.get(), BaguettesquidEntity.createAttributes().build());
		event.put(BOOMERANG_HOPPER.get(), BoomerangHopperEntity.createAttributes().build());
		event.put(CHIMAERA_FLY.get(), ChimaeraFlyEntity.createAttributes().build());
		event.put(RAMMER.get(), RammerEntity.createAttributes().build());
		event.put(FERNTAIL.get(), FerntailEntity.createAttributes().build());
		event.put(PANZERDACH.get(), PanzerdachEntity.createAttributes().build());
		event.put(AIRTRAWLER.get(), AirtrawlerEntity.createAttributes().build());
	}
}
