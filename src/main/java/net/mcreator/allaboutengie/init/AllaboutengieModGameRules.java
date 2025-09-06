/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DETECTIVE_MODE = GameRules.register("detectiveMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TRUE_HARDCORE = GameRules.register("trueHardcore", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SUPER_DOOMS_DAY_TOGGLE = GameRules.register("superDoomsDayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EXTREME_DOOMSDAY_LIGHTNING = GameRules.register("extremeDoomsdayLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DOOMSDAY_TOGGLE = GameRules.register("doomsdayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> TRUE_HARDCORE_LIFE_COUNT = GameRules.register("trueHardcoreLifeCount", GameRules.Category.PLAYER, GameRules.IntegerValue.create(10));
	public static final GameRules.Key<GameRules.BooleanValue> HEAVY_LIGHTNING = GameRules.register("heavyLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EXTREME_LIGHTNING = GameRules.register("extremeLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TRUE_THROWBACK = GameRules.register("trueThrowback", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ENRAGED_ZOMBIES = GameRules.register("enragedZombies", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> ALL_ABOUT_ENGIE_TOGGLE = GameRules.register("allAboutEngieToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
}