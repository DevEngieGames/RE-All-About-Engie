package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;

public class ChanceForBigSharkoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.25) {
			if (entity instanceof SharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof AlbinoSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_ALBINO_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof RareSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_RARE_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof EpicSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_EPIC_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof LegendarySharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_LEGENDARY_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof MythicSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_MYTHIC_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof ExoticSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_EXOTIC_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_ENGIE_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRareEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_ENGIE_SHARKO_RARE.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRare2Entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AllaboutengieModEntities.BIG_TIGER_SHARKO.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
