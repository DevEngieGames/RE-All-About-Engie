package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ThunderstormChaosProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getY(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double y, Entity entity) {
		execute(null, world, y, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == false && AllaboutengieModVariables.MapVariables.get(world).sddaystart == false && AllaboutengieModVariables.MapVariables.get(world).thestart == false) {
				if ((world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
					entity.getPersistentData().putDouble("HeavyLightningCD", (entity.getPersistentData().getDouble("HeavyLightningCD") + 0.05));
					if (entity.getPersistentData().getDouble("HeavyLightningCD") >= 5) {
						entity.getPersistentData().putDouble("HeavyLightningCD", 0);
						AllaboutengieMod.queueServerWork(1, () -> {
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.25 && Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.5 && Math.random() < 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							}
						});
					}
				} else if ((world instanceof ServerLevel _serverLevelGR20 && _serverLevelGR20.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true
						&& (world instanceof ServerLevel _serverLevelGR21 && _serverLevelGR21.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
					entity.getPersistentData().putDouble("ExtremeLightningCD", (entity.getPersistentData().getDouble("ExtremeLightningCD") + 0.05));
					if (entity.getPersistentData().getDouble("ExtremeLightningCD") >= 2.5) {
						entity.getPersistentData().putDouble("ExtremeLightningCD", 0);
						AllaboutengieMod.queueServerWork(1, () -> {
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.25 && Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.5 && Math.random() < 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.D_DAY_LIGHTNING_SPAWNER.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96), y,
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							}
						});
					}
				}
			}
		}
	}
}