package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

public class DoomsDayNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if ((world instanceof ServerLevel _serverLevelGR3 && _serverLevelGR3.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
					return true;
				} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == false) {
					return false;
				}
			} else if ((world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false) {
				if (world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
					return true;
				} else if (!(world.getLevelData().isRaining() && !world.getLevelData().isThundering())) {
					return false;
				}
			}
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			return false;
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
			return false;
		}
		return true;
	}
}