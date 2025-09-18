package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class RecipeBookPageNumberProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.pageNumberText = "Page " + new java.text.DecimalFormat("##").format(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber) + " / 100";
			_vars.syncPlayerVariables(entity);
		}
		CustomRecipeBookWeaponsProcedure.execute(entity, itemstack);
		CustomRecipeBookArmorProcedure.execute(entity, itemstack);
		CustomRecipeBookToolsProcedure.execute(entity, itemstack);
		CustomRecipeBookSharkoProcedure.execute(entity, itemstack);
		CustomRecipeBookOtherProcedure.execute(entity, itemstack);
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber < 1) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.pageNumber = 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber > 100) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.pageNumber = 100;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}