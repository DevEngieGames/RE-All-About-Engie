package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DifficultyOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).difficultyoverlaytoggle == true) {
			return true;
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).difficultyoverlaytoggle == false) {
			return false;
		}
		return false;
	}
}