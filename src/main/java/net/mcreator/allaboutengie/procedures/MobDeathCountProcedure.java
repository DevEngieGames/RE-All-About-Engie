package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;

public class MobDeathCountProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof MadEngieEntity && sourceentity instanceof Player) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.AngryEngieKillCount = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity instanceof AngryEngieEntity && sourceentity instanceof Player) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.AngryEngieKillCount = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity instanceof EnragedEngieEntity && sourceentity instanceof Player) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.EnragedEngieKillCount = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity instanceof AngryCreatorEntity && sourceentity instanceof Player) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.OutragedEngieKillCount = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity instanceof InsanityEntity && sourceentity instanceof Player) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.InsanityKillCount = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}