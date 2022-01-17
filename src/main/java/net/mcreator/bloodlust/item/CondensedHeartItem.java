
package net.mcreator.bloodlust.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.bloodlust.procedures.CondensedHeartFoodEatenProcedure;
import net.mcreator.bloodlust.init.BloodlustModTabs;

public class CondensedHeartItem extends Item {
	public CondensedHeartItem() {
		super(new Item.Properties().tab(BloodlustModTabs.TAB_BLOODLUST).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f).alwaysEat().meat().build()));
		setRegistryName("condensed_heart");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 8;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CondensedHeartFoodEatenProcedure.execute(entity);
		return retval;
	}
}
