package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class RecipeBookPageNumberProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			String _setval = "Page " + new java.text.DecimalFormat("##").format((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber) + " / 100";
			entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.pageNumberText = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		CustomRecipeBookWeaponsProcedure.execute(entity, itemstack);
		CustomRecipeBookArmorProcedure.execute(entity, itemstack);
		CustomRecipeBookToolsProcedure.execute(entity, itemstack);
		CustomRecipeBookSharkoProcedure.execute(entity, itemstack);
		CustomRecipeBookOtherProcedure.execute(entity, itemstack);
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber < 1) {
			{
				double _setval = 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageNumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber > 100) {
			{
				double _setval = 100;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageNumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}