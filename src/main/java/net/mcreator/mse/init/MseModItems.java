
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mse.item.FuelItem;
import net.mcreator.mse.item.DebuggerItem;
import net.mcreator.mse.item.DEBUGGGGGGGGGGGGGGGGItem;
import net.mcreator.mse.MseMod;

public class MseModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, MseMod.MODID);
	public static final DeferredHolder<Item, Item> FUEL_BUCKET = REGISTRY.register("fuel_bucket", () -> new FuelItem());
	public static final DeferredHolder<Item, Item> ALTERNATOR = block(MseModBlocks.ALTERNATOR);
	public static final DeferredHolder<Item, Item> COD_ROD_ASSEMBALY = block(MseModBlocks.COD_ROD_ASSEMBALY);
	public static final DeferredHolder<Item, Item> FUEL_INJECTOR = block(MseModBlocks.FUEL_INJECTOR);
	public static final DeferredHolder<Item, Item> DEBUGGGGGGGGGGGGGGGG = REGISTRY.register("debugggggggggggggggg", () -> new DEBUGGGGGGGGGGGGGGGGItem());
	public static final DeferredHolder<Item, Item> DEBUGGER = REGISTRY.register("debugger", () -> new DebuggerItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
