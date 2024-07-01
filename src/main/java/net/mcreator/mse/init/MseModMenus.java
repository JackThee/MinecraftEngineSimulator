
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.mse.world.inventory.FuelInjectorGUUUUUUUUUUUUUIIIIIIIIIIIIIIIMenu;
import net.mcreator.mse.MseMod;

public class MseModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, MseMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<FuelInjectorGUUUUUUUUUUUUUIIIIIIIIIIIIIIIMenu>> FUEL_INJECTOR_GUUUUUUUUUUUUUIIIIIIIIIIIIIII = REGISTRY.register("fuel_injector_guuuuuuuuuuuuuiiiiiiiiiiiiiii",
			() -> IMenuTypeExtension.create(FuelInjectorGUUUUUUUUUUUUUIIIIIIIIIIIIIIIMenu::new));
}
