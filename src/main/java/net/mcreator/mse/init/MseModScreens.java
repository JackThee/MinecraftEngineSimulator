
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mse.client.gui.FuelInjectorGUUUUUUUUUUUUUIIIIIIIIIIIIIIIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MseModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MseModMenus.FUEL_INJECTOR_GUUUUUUUUUUUUUIIIIIIIIIIIIIII.get(), FuelInjectorGUUUUUUUUUUUUUIIIIIIIIIIIIIIIScreen::new);
	}
}
