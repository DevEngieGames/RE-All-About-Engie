package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class RecipepagenumbergetProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumberText;
	}
}