package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class CosmicEngieGamesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _lvl0 && _lvl0.isDay()) {
			if (AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesDespawnLock == false) {
				if (Math.random() <= 0.125) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.THE_REAL_ENGIE_GAMES.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(entity.getYRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setXRot(entity.getXRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesDespawnLock = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.LOGGER.info(("Random 0,1 = " + Math.random()));
				} else {
					AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesDespawnLock = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.LOGGER.info(("Random 0,1 = " + Math.random()));
				}
			}
		} else if (!(world instanceof Level _lvl10 && _lvl10.isDay())) {
			AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesDespawnLock = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}