
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baguettesquids.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.baguettesquids.item.BreadsquidItemItem;
import net.mcreator.baguettesquids.item.BaguettesquidItemItem;
import net.mcreator.baguettesquids.BaguettesquidsMod;

public class BaguettesquidsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BaguettesquidsMod.MODID);
	public static final RegistryObject<Item> BAGUETTESQUID = REGISTRY.register("baguettesquid_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.BAGUETTESQUID, -202859, -861838,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BAGUETTESQUID_ITEM = REGISTRY.register("baguettesquid_item", () -> new BaguettesquidItemItem());
	public static final RegistryObject<Item> BREADSQUID_ITEM = REGISTRY.register("breadsquid_item", () -> new BreadsquidItemItem());
	public static final RegistryObject<Item> BOOMERANG_HOPPER = REGISTRY.register("boomerang_hopper_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.BOOMERANG_HOPPER, -4112320, -7720141,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHIMAERA_FLY = REGISTRY.register("chimaera_fly_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.CHIMAERA_FLY, -5640449, -10034945,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RAMMER = REGISTRY.register("rammer_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.RAMMER, -3890563, -4814485, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FERNTAIL = REGISTRY.register("ferntail_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.FERNTAIL, -6056306, -12502220,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PANZERDACH = REGISTRY.register("panzerdach_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.PANZERDACH, -9414320, -993331,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> AIRTRAWLER = REGISTRY.register("airtrawler_spawn_egg",
			() -> new ForgeSpawnEggItem(BaguettesquidsModEntities.AIRTRAWLER, -1049601, -3148291,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
