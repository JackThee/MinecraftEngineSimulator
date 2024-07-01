
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mse.block.FuelInjectorBlock;
import net.mcreator.mse.block.FuelBlock;
import net.mcreator.mse.block.CodRodAssembalyBlock;
import net.mcreator.mse.block.AlternatorBlock;
import net.mcreator.mse.MseMod;

public class MseModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, MseMod.MODID);
	public static final DeferredHolder<Block, Block> FUEL = REGISTRY.register("fuel", () -> new FuelBlock());
	public static final DeferredHolder<Block, Block> ALTERNATOR = REGISTRY.register("alternator", () -> new AlternatorBlock());
	public static final DeferredHolder<Block, Block> COD_ROD_ASSEMBALY = REGISTRY.register("cod_rod_assembaly", () -> new CodRodAssembalyBlock());
	public static final DeferredHolder<Block, Block> FUEL_INJECTOR = REGISTRY.register("fuel_injector", () -> new FuelInjectorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
