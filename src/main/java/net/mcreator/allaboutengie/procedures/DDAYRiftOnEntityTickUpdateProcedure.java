package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class DDAYRiftOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("riftspawntimer", (entity.getPersistentData().getDouble("riftspawntimer") + 0.05));
		if (entity.getPersistentData().getDouble("riftspawntimer") >= 5) {
			if (AllaboutengieModVariables.MapVariables.get(world).riftspawnoneentity == false) {
				AllaboutengieModVariables.MapVariables.get(world).riftspawnoneentity = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (Math.random() <= 0.2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.MAD_ENGIE_OLD_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() > 0.2 && Math.random() <= 0.4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ANGRY_ENGIE_OLD_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() > 0.4 && Math.random() <= 0.6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_ENGIE_OLD_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() > 0.6 && Math.random() <= 0.8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ANGRY_CREATOR_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (Math.random() > 0.8 && Math.random() <= 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.BLOODY_ENGIE_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
			AllaboutengieMod.queueServerWork(200, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
	}
}