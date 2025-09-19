package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class ThrowbackSharkoContinueWithTaskProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).sharkolayingstate == false) {
			return true;
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).sharkolayingstate == true) {
			return false;
		}
		return false;
	}
}