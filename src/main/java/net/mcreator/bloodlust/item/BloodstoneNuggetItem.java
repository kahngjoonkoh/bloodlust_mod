
package net.mcreator.bloodlust.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bloodlust.init.BloodlustModTabs;

public class BloodstoneNuggetItem extends Item {
	public BloodstoneNuggetItem() {
		super(new Item.Properties().tab(BloodlustModTabs.TAB_BLOODLUST).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("bloodstone_nugget");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
