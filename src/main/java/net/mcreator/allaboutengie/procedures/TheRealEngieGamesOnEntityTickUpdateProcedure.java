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

public class TheRealEngieGamesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
			if (!(world instanceof Level _lvl1 && _lvl1.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesSpawnLock == false) {
					if (Math.random() <= 0.125) {
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AllaboutengieModEntities.COSMIC_ENGIE_GAMES.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setXRot(entity.getXRot());
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesSpawnLock = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info(("Random 0,1 = " + Math.random()));
					} else {
						AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesSpawnLock = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info(("Random 0,1 = " + Math.random()));
					}
				}
			} else if (world instanceof Level _lvl11 && _lvl11.isDay()) {
				AllaboutengieModVariables.MapVariables.get(world).CosmicEngieGamesSpawnLock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}