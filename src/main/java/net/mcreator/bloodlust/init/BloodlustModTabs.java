
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodlust.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BloodlustModTabs {
	public static CreativeModeTab TAB_BLOODLUST;

	public static void load() {
		TAB_BLOODLUST = new CreativeModeTab("tabbloodlust") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BloodlustModItems.HEART);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
