
package net.mcreator.mse.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.mse.init.MseModItems;
import net.mcreator.mse.init.MseModFluids;
import net.mcreator.mse.init.MseModFluidTypes;
import net.mcreator.mse.init.MseModBlocks;

public abstract class FuelFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MseModFluidTypes.FUEL_TYPE.get(), () -> MseModFluids.FUEL.get(), () -> MseModFluids.FLOWING_FUEL.get()).explosionResistance(100f)
			.bucket(() -> MseModItems.FUEL_BUCKET.get()).block(() -> (LiquidBlock) MseModBlocks.FUEL.get());

	private FuelFluid() {
		super(PROPERTIES);
	}

	public static class Source extends FuelFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FuelFluid {
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
