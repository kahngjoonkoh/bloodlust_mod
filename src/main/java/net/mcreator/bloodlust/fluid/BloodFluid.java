
package net.mcreator.bloodlust.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.bloodlust.init.BloodlustModItems;
import net.mcreator.bloodlust.init.BloodlustModFluids;
import net.mcreator.bloodlust.init.BloodlustModBlocks;

public abstract class BloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BloodlustModFluids.BLOOD,
			() -> BloodlustModFluids.FLOWING_BLOOD,
			FluidAttributes.builder(new ResourceLocation("bloodlust:blocks/blood"), new ResourceLocation("bloodlust:blocks/blood"))

	).explosionResistance(100f).canMultiply()

			.slopeFindDistance(3).bucket(() -> BloodlustModItems.BLOOD_BUCKET).block(() -> (LiquidBlock) BloodlustModBlocks.BLOOD);

	private BloodFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends BloodFluid {
		public Source() {
			super();
			setRegistryName("blood");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_blood");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
