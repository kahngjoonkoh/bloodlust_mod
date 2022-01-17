
package net.mcreator.bloodlust.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bloodlust.init.BloodlustModTabs;

public class BloodstoneIngotItem extends Item {
	public BloodstoneIngotItem() {
		super(new Item.Properties().tab(BloodlustModTabs.TAB_BLOODLUST).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("bloodstone_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
