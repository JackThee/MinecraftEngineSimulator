
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.mse.fluid.FuelFluid;
import net.mcreator.mse.MseMod;

public class MseModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, MseMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> FUEL = REGISTRY.register("fuel", () -> new FuelFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_FUEL = REGISTRY.register("flowing_fuel", () -> new FuelFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FUEL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FUEL.get(), RenderType.translucent());
		}
	}
}
