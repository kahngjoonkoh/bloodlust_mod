
package net.mcreator.bloodlust.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.bloodlust.init.BloodlustModFluids;

public class BloodBlock extends LiquidBlock {
	public BloodBlock() {
		super(BloodlustModFluids.BLOOD, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("blood");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 2;
	}
}
