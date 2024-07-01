
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mse.MseMod;

public class MseModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MseMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ENGINE = REGISTRY.register("engine", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mse", "engine")));
}
