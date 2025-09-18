package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DoomsdayChaosProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
				entity.getPersistentData().putDouble("doomsdaymainsongtimer", (entity.getPersistentData().getDouble("doomsdaymainsongtimer") + 0.05));
				if (entity.getPersistentData().getDouble("doomsdaymainsongtimer") >= 140) {
					entity.getPersistentData().putDouble("doomsdaymainsongtimer", 0);
					AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						if (AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart == false) {
							AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:doomsday_start")), SoundSource.MUSIC, (float) 0.5, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:doomsday_start")), SoundSource.MUSIC, (float) 0.5, 1, false);
								}
							}
						}
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "weather thunder");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "time set midnight");
					}
				}
				entity.getPersistentData().putDouble("doomsdaytimer", (entity.getPersistentData().getDouble("doomsdaytimer") + 0.05));
				if (entity.getPersistentData().getDouble("doomsdaytimer") >= 720) {
					entity.getPersistentData().putDouble("doomsdaytimer", 0);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "weather clear");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect clear @a");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @p instant_health 1 28 true");
						}
					}
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.healthreductiondday = false;
						_vars.syncPlayerVariables(entity);
					}
					AllaboutengieModVariables.MapVariables.get(world).waittildoomsday = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _serverLevel)
						_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
					if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
						if (world instanceof ServerLevel _level)
							_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
						AllaboutengieMod.queueServerWork(5, () -> {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						});
					}
					if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
						if (!(entity instanceof ServerPlayer _plr20 && _plr20.level() instanceof ServerLevel
								&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:conqueror"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:conqueror"));
								if (_adv != null) {
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
							}
						}
					}
				}
				if (AllaboutengieModVariables.MapVariables.get(world).darknesscooldown == true) {
					entity.getPersistentData().putDouble("darknessretrycooldown", (entity.getPersistentData().getDouble("darknessretrycooldown") + 0.05));
					if (entity.getPersistentData().getDouble("darknessretrycooldown") >= 5) {
						entity.getPersistentData().putDouble("darknessretrycooldown", 0);
						if (Math.random() <= 0.25) {
							AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @a darkness 18 1 true");
									}
								}
							});
						}
					}
				} else {
					entity.getPersistentData().putDouble("darknessretrycooldown", (entity.getPersistentData().getDouble("darknessretrycooldown") + 0.05));
					if (entity.getPersistentData().getDouble("darknessretrycooldown") >= 5) {
						entity.getPersistentData().putDouble("darknessretrycooldown", 0);
						if (Math.random() <= 0.25) {
							AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect clear @a darkness");
									}
								}
							});
						}
					}
				}
				entity.getPersistentData().putDouble("missilecooldown", (entity.getPersistentData().getDouble("missilecooldown") + 0.05));
				if (entity.getPersistentData().getDouble("missilecooldown") >= 5) {
					entity.getPersistentData().putDouble("missilecooldown", 0);
					if (Math.random() <= 0.25) {
						AllaboutengieMod.queueServerWork(1, () -> {
							if (Math.random() <= 0.25) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.YELLOW_LIGHTNING.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.YELLOW_LIGHTNING.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								}
							} else if (Math.random() <= 0.5 && Math.random() > 0.25) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.BLUE_BURST.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.BLUE_BURST.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								}
							} else if (Math.random() <= 0.75 && Math.random() > 0.5) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.NORMAL.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.NORMAL.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								}
							} else if (Math.random() <= 1 && Math.random() > 0.75) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.MOAB.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = AllaboutengieModEntities.MOAB.get().spawn(_level,
												BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128),
														entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								}
							}
						});
					}
				}
				entity.getPersistentData().putDouble("Nlightningcooldown", (entity.getPersistentData().getDouble("Nlightningcooldown") + 0.05));
				if (entity.getPersistentData().getDouble("Nlightningcooldown") >= 0.5) {
					entity.getPersistentData().putDouble("Nlightningcooldown", 0);
					if (Math.random() <= 0.5) {
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
				entity.getPersistentData().putDouble("riftcooldown", (entity.getPersistentData().getDouble("riftcooldown") + 0.05));
				if (entity.getPersistentData().getDouble("riftcooldown") >= 5) {
					entity.getPersistentData().putDouble("riftcooldown", 0);
					if (Math.random() <= 0.25) {
						AllaboutengieMod.queueServerWork(1, () -> {
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.DDAY_RIFT.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.25 && Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.DDAY_RIFT.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.5 && Math.random() < 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.DDAY_RIFT.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											EntitySpawnReason.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else if (Math.random() >= 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = AllaboutengieModEntities.DDAY_RIFT.get().spawn(_level,
											BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96),
													entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40),
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