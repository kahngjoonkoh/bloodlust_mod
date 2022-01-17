
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodlust.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.bloodlust.item.WoodscytheItem;
import net.mcreator.bloodlust.item.StonescytheItem;
import net.mcreator.bloodlust.item.NetheritescytheItem;
import net.mcreator.bloodlust.item.IronscytheItem;
import net.mcreator.bloodlust.item.HeartItem;
import net.mcreator.bloodlust.item.GoldscytheItem;
import net.mcreator.bloodlust.item.DiamondscytheItem;
import net.mcreator.bloodlust.item.CondensedHeartItem;
import net.mcreator.bloodlust.item.BloodstoneNuggetItem;
import net.mcreator.bloodlust.item.BloodstoneIngotItem;
import net.mcreator.bloodlust.item.BloodlustscytheItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BloodlustModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item HEART = register(new HeartItem());
	public static final Item DIAMONDSCYTHE = register(new DiamondscytheItem());
	public static final Item GOLDSCYTHE = register(new GoldscytheItem());
	public static final Item WOODSCYTHE = register(new WoodscytheItem());
	public static final Item IRONSCYTHE = register(new IronscytheItem());
	public static final Item NETHERITESCYTHE = register(new NetheritescytheItem());
	public static final Item STONESCYTHE = register(new StonescytheItem());
	public static final Item BLOODLUSTSCYTHE = register(new BloodlustscytheItem());
	public static final Item CONDENSED_HEART = register(new CondensedHeartItem());
	public static final Item BLOODSTONE_NUGGET = register(new BloodstoneNuggetItem());
	public static final Item BLOODSTONE_INGOT = register(new BloodstoneIngotItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
