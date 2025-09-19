package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class ThrowbackSharkoEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).sharkolayingstate == true) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.sharkolayingstate = false;
				_vars.syncPlayerVariables(entity);
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
			});
		}
	}
}