
package net.mcreator.bloodlust.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.bloodlust.procedures.BloodlustAppleFoodEatenProcedure;
import net.mcreator.bloodlust.init.BloodlustModTabs;

public class BloodlustAppleItem extends Item {
	public BloodlustAppleItem() {
		super(new Item.Properties().tab(BloodlustModTabs.TAB_BLOODLUST).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("bloodlust_apple");
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BloodlustAppleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
