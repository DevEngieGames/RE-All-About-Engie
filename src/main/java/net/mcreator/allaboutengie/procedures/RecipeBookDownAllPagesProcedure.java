package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class RecipeBookDownAllPagesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.pageNumber = 1;
			_vars.syncPlayerVariables(entity);
		}
	}
}