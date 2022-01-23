
package net.mcreator.bloodlust.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.bloodlust.procedures.HeartFoodEatenProcedure;
import net.mcreator.bloodlust.init.BloodlustModTabs;

public class HeartItem extends Item {
	public HeartItem() {
		super(new Item.Properties().tab(BloodlustModTabs.TAB_BLOODLUST).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f).alwaysEat().meat().build()));
		setRegistryName("heart");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 16;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HeartFoodEatenProcedure.execute(entity);
		return retval;
	}
}
