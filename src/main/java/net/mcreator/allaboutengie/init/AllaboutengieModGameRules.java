/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AllaboutengieModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DETECTIVE_MODE;
	public static GameRules.Key<GameRules.BooleanValue> TRUE_HARDCORE;
	public static GameRules.Key<GameRules.BooleanValue> SUPER_DOOMS_DAY_TOGGLE;
	public static GameRules.Key<GameRules.BooleanValue> EXTREME_DOOMSDAY_LIGHTNING;
	public static GameRules.Key<GameRules.BooleanValue> DOOMSDAY_TOGGLE;
	public static GameRules.Key<GameRules.IntegerValue> TRUE_HARDCORE_LIFE_COUNT;
	public static GameRules.Key<GameRules.BooleanValue> HEAVY_LIGHTNING;
	public static GameRules.Key<GameRules.BooleanValue> EXTREME_LIGHTNING;
	public static GameRules.Key<GameRules.BooleanValue> TRUE_THROWBACK;
	public static GameRules.Key<GameRules.BooleanValue> ENRAGED_ZOMBIES;
	public static GameRules.Key<GameRules.BooleanValue> ALL_ABOUT_ENGIE_TOGGLE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DETECTIVE_MODE = GameRules.register("detectiveMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		TRUE_HARDCORE = GameRules.register("trueHardcore", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		SUPER_DOOMS_DAY_TOGGLE = GameRules.register("superDoomsDayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		EXTREME_DOOMSDAY_LIGHTNING = GameRules.register("extremeDoomsdayLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		DOOMSDAY_TOGGLE = GameRules.register("doomsdayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		TRUE_HARDCORE_LIFE_COUNT = GameRules.register("trueHardcoreLifeCount", GameRules.Category.PLAYER, GameRules.IntegerValue.create(10));
		HEAVY_LIGHTNING = GameRules.register("heavyLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		EXTREME_LIGHTNING = GameRules.register("extremeLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		TRUE_THROWBACK = GameRules.register("trueThrowback", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		ENRAGED_ZOMBIES = GameRules.register("enragedZombies", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
		ALL_ABOUT_ENGIE_TOGGLE = GameRules.register("allAboutEngieToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	}
}