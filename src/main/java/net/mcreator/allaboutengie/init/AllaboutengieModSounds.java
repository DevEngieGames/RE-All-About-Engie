/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, AllaboutengieMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BYEBYETHERE = REGISTRY.register("byebyethere", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "byebyethere")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DOOMSDAY_EERIE = REGISTRY.register("doomsday_eerie", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "doomsday_eerie")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DOOMSDAY_START = REGISTRY.register("doomsday_start", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "doomsday_start")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HOTLINEMIAMI2_RUN = REGISTRY.register("hotlinemiami2-run", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "hotlinemiami2-run")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THEEND_EERIE = REGISTRY.register("theend_eerie", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "theend_eerie")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CUSTOMLIGHTNING = REGISTRY.register("customlightning", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "customlightning")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CUSTOMLIGHTNING2 = REGISTRY.register("customlightning2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "customlightning2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RIFTOPENS = REGISTRY.register("riftopens", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "riftopens")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CHURCHBELLS = REGISTRY.register("churchbells", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "churchbells")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CHURCHBELLS2 = REGISTRY.register("churchbells2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "churchbells2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLAYERSTUNMOBS = REGISTRY.register("playerstunmobs", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "playerstunmobs")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLAYERSTUNABILOFFCOOLDOWN = REGISTRY.register("playerstunabiloffcooldown",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "playerstunabiloffcooldown")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MISSILE_EXPLOSION = REGISTRY.register("missile_explosion", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("allaboutengie", "missile_explosion")));
}