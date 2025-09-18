package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
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
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SuperDoomsdayDialogueProcedure {
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
			if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
				AllaboutengieModVariables.MapVariables.get(world).timecheckstop = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce == false) {
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:doomsday_eerie")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:doomsday_eerie")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					}
					if (AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock == false) {
						entity.getPersistentData().putDouble("TimeUntilNightSDDAY", (entity.getPersistentData().getDouble("TimeUntilNightSDDAY") + 0.05));
						if (entity.getPersistentData().getDouble("TimeUntilNightSDDAY") >= 42) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.DoomsdayAlive = true;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, world.getServer());
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(false, world.getServer());
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.BlockDeathAliveCOunt = false;
								_vars.syncPlayerVariables(entity);
							}
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.healthreductiondday = true;
								_vars.syncPlayerVariables(entity);
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @p instant_health 1 28 true");
								}
							}
							if (world instanceof Level _lvl8 && _lvl8.isDay()) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "time set midnight");
									}
								}
							}
						}
					}
					if (AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock == false) {
						entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", (entity.getPersistentData().getDouble("SDDAYDialogueCooldownStart") + 0.05));
						if (AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock == false) {
							if (entity.getPersistentData().getDouble("SDDAYDialogueCooldownStart") >= 36.1) {
								AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								{
									AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
									_vars.ShowObjectiveOverlay = true;
									_vars.syncPlayerVariables(entity);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:churchbells2")), SoundSource.AMBIENT, (float) 0.5, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:churchbells2")), SoundSource.AMBIENT, (float) 0.5, 1, false);
									}
								}
								AllaboutengieMod.queueServerWork(200, () -> {
									{
										AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
										_vars.ShowObjectiveOverlay = false;
										_vars.syncPlayerVariables(entity);
									}
								});
								AllaboutengieMod.queueServerWork(102, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"tellraw @a {\"text\":\"We never thought this day would come. But it is finally here.\",\"bold\":true,\"color\":\"yellow\"}");
										}
									}
									AllaboutengieMod.queueServerWork(188, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
																_ent.getDisplayName(), _ent.level().getServer(), _ent),
														"tellraw @a {\"text\":\"The end of humanity has arrived. Earth as we know it... is to come to an end.\",\"bold\":true,\"color\":\"yellow\"}");
											}
										}
										AllaboutengieMod.queueServerWork(200, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
																	_ent.getDisplayName(), _ent.level().getServer(), _ent),
															"tellraw @a {\"text\":\"You must withstand this chaos for a long time in order to survive the end of the world.\",\"bold\":true,\"color\":\"yellow\"}");
												}
											}
											AllaboutengieMod.queueServerWork(200, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																		_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"tellraw @a {\"text\":\"May Mother Nature have mercy on our souls.\",\"bold\":true,\"color\":\"yellow\"}");
													}
												}
												AllaboutengieMod.queueServerWork(200, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																			_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"tellraw @a [\"\",{\"text\":\"SUPER DOOMSDAY\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\" The world will come to an end. No one will survive. \",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"SUPER DOOMSDAY\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"}]");
														}
													}
													AllaboutengieMod.queueServerWork(200, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																		"tellraw @a [\"\",{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"S\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"U\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"P\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"E\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"R\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\" e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"D\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"O\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"O\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"M\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"S\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"D\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"A\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"Y\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"}]");
															}
														}
														AllaboutengieMod.queueServerWork(200, () -> {
															{
																Entity _ent = entity;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																					_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"stopsound @a ambient allaboutengie:doomsday_eerie");
																}
															}
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:doomsday_start")), SoundSource.MUSIC, 1, 1);
																} else {
																	_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:doomsday_start")), SoundSource.MUSIC, 1, 1, false);
																}
															}
															AllaboutengieModVariables.MapVariables.get(world).sdoomsdaymainsongstart = true;
															AllaboutengieModVariables.MapVariables.get(world).syncData(world);
															entity.getPersistentData().putDouble("sdoomsdaymainsongtimer", 0);
															AllaboutengieMod.queueServerWork(290, () -> {
																AllaboutengieModVariables.MapVariables.get(world).sddaystart = true;
																AllaboutengieModVariables.MapVariables.get(world).syncData(world);
																AllaboutengieModVariables.MapVariables.get(world).BYEBYE = true;
																AllaboutengieModVariables.MapVariables.get(world).syncData(world);
																if (world instanceof ServerLevel _serverLevel)
																	_serverLevel.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, world.getServer());
															});
														});
													});
												});
											});
										});
									});
								});
								if (!(entity instanceof ServerPlayer _plr33 && _plr33.level() instanceof ServerLevel
										&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:rise"))).isDone())) {
									if (entity instanceof ServerPlayer _player) {
										AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:rise"));
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
					}
				});
			} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
				AllaboutengieMod.LOGGER.warn("Global rule \"SuperDoomsDayStart\" is enabled when it's not supposed to be enabled, this is a bug!");
			} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == false) {
				if (AllaboutengieModVariables.MapVariables.get(world).waittildoomsday == true) {
					entity.getPersistentData().putDouble("sddaywaittoreset", (entity.getPersistentData().getDouble("sddaywaittoreset") + 0.05));
					if (entity.getPersistentData().getDouble("sddaywaittoreset") >= 0.5) {
						entity.getPersistentData().putDouble("sddaywaittoreset", 0);
						entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
						entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaywait = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).waittildoomsday == false) {
					entity.getPersistentData().putDouble("waittoreset2", (entity.getPersistentData().getDouble("waittoreset2") + 0.05));
					if (entity.getPersistentData().getDouble("waittoreset2") >= 0.5) {
						entity.getPersistentData().putDouble("waittoreset2", 0);
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true && AllaboutengieModVariables.MapVariables.get(world).sddaywait == false) {
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true && AllaboutengieModVariables.MapVariables.get(world).sddaywait == true) {
							AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else {
							AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					}
				}
			}
		}
	}
}