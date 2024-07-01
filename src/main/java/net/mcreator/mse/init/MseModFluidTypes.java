
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.mse.fluid.types.FuelFluidType;
import net.mcreator.mse.MseMod;

public class MseModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MseMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> FUEL_TYPE = REGISTRY.register("fuel", () -> new FuelFluidType());
}
