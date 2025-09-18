package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class RecipeBookDownFivePagesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber > 1) {
			if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber >= 5) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.pageNumber = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber - 5;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}