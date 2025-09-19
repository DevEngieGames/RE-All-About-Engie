package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

public class ThrowbackProtogenNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK)) == true) {
			return true;
		}
		return false;
	}
}