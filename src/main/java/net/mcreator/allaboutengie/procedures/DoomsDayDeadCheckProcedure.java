package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsDayDeadCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayAlive == false) {
			return "Currently Dead";
		}
		return "dday.overlay.alivestate=false";
	}
}