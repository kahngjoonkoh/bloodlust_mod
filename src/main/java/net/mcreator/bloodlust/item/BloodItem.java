
package net.mcreator.bloodlust.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.bloodlust.init.BloodlustModTabs;
import net.mcreator.bloodlust.init.BloodlustModFluids;

public class BloodItem extends BucketItem {
	public BloodItem() {
		super(() -> BloodlustModFluids.BLOOD,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BloodlustModTabs.TAB_BLOODLUST));
		setRegistryName("blood_bucket");
	}
}
