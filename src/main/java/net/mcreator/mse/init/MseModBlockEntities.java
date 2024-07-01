
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mse.block.entity.FuelInjectorBlockEntity;
import net.mcreator.mse.block.entity.AlternatorBlockEntity;
import net.mcreator.mse.MseMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MseModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MseMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ALTERNATOR = register("alternator", MseModBlocks.ALTERNATOR, AlternatorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FUEL_INJECTOR = register("fuel_injector", MseModBlocks.FUEL_INJECTOR, FuelInjectorBlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ALTERNATOR.get(), (blockEntity, side) -> ((AlternatorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ALTERNATOR.get(), (blockEntity, side) -> ((AlternatorBlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FUEL_INJECTOR.get(), (blockEntity, side) -> ((FuelInjectorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, FUEL_INJECTOR.get(), (blockEntity, side) -> ((FuelInjectorBlockEntity) blockEntity).getFluidTank());
	}
}
