package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OHBOYProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if ((world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
					if (world instanceof Level _lvl2 && _lvl2.isDay()) {
						if (AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle == false) {
							if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == true) {
								entity.getPersistentData().putDouble("riskcooldown", (entity.getPersistentData().getDouble("riskcooldown") + 0.05));
								if (entity.getPersistentData().getDouble("riskcooldown") >= 5) {
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									entity.getPersistentData().putDouble("riskcooldown", 0);
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).Risk == 1) {
									if (Math.random() <= 0.0005) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if (Math.random() <= 0.05) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieMod.queueServerWork(1, () -> {
													if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(
																	Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																	false);
													}
												});
											} else if (Math.random() > 0.05) {
												if ((world instanceof ServerLevel _serverLevelGR9 && _serverLevelGR9.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal(
																		("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												} else if ((world instanceof ServerLevel _serverLevelGR12 && _serverLevelGR12.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(
																		Component.literal(
																				("DEBUG: Attempted to spawn Doomsday with risk: " + "Low. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 2;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "Medium.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(
																("DEBUG: Attemping to raise risk to " + "Medium " + "as Doomsday risk fail count is >= to 30." + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 2) {
									if (Math.random() <= 0.007) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if (Math.random() <= 0.05) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieMod.queueServerWork(1, () -> {
													if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(
																	Component.literal(
																			("DEBUG: Attempted to spawn The End with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																	false);
													}
												});
											} else if (Math.random() > 0.05) {
												if ((world instanceof ServerLevel _serverLevelGR23 && _serverLevelGR23.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal(
																		("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												} else if ((world instanceof ServerLevel _serverLevelGR26 && _serverLevelGR26.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(
																		Component.literal(
																				("DEBUG: Attempted to spawn Doomsday with risk: " + "Medium. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 3;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "High.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(
																("DEBUG: Attemping to raise risk to " + "High " + "as Doomsday risk fail count is >= to 30." + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 3) {
									if (Math.random() <= 0.013) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if (Math.random() <= 0.05) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieMod.queueServerWork(1, () -> {
													if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component
																	.literal(("DEBUG: Attempted to spawn The End with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")), false);
													}
												});
											} else if (Math.random() > 0.05) {
												if ((world instanceof ServerLevel _serverLevelGR37 && _serverLevelGR37.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal(
																		("DEBUG: Attempted to spawn Super Doomsday with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												} else if ((world instanceof ServerLevel _serverLevelGR40 && _serverLevelGR40.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(
																		Component.literal(
																				("DEBUG: Attempted to spawn Doomsday with risk: " + "High. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 4;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "Extreme.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attemping to raise risk to " + "Extreme " + "as Doomsday risk fail count is >= to 30." + "("
																+ AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")), false);
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 4) {
									if (Math.random() <= 0.02) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if (Math.random() <= 0.05) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieMod.queueServerWork(1, () -> {
													if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(
																	Component.literal(
																			("DEBUG: Attempted to spawn The End with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																	false);
													}
												});
											} else if (Math.random() > 0.05) {
												if ((world instanceof ServerLevel _serverLevelGR51 && _serverLevelGR51.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal(
																		("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												} else if ((world instanceof ServerLevel _serverLevelGR54 && _serverLevelGR54.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
													if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
														AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
														AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													}
													AllaboutengieMod.queueServerWork(1, () -> {
														if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(
																		Component.literal(
																				("DEBUG: Attempted to spawn Doomsday with risk: " + "Extreme. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																		false);
														}
													});
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "Guaranteed.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attemping to raise risk to " + "Guaranteed " + "as Doomsday risk fail count is >= to 30 next try." + "("
																+ AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")), false);
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 5) {
									AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
										AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									}
									if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
										AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									}
									if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
										AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									}
									AllaboutengieMod.queueServerWork(1, () -> {
										if (Math.random() <= 0.05) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieMod.queueServerWork(1, () -> {
												if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(
																Component.literal(
																		("DEBUG: Attempted to spawn The End with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																false);
												}
											});
										} else if (Math.random() > 0.05) {
											if ((world instanceof ServerLevel _serverLevelGR65 && _serverLevelGR65.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
													AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
													AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												}
												AllaboutengieMod.queueServerWork(1, () -> {
													if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal(
																	("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																	false);
													}
												});
											} else if ((world instanceof ServerLevel _serverLevelGR68 && _serverLevelGR68.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
												if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
													AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
													AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												}
												AllaboutengieMod.queueServerWork(1, () -> {
													if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(
																	Component.literal(
																			("DEBUG: Attempted to spawn Doomsday with risk: " + "Guaranteed. " + "If failed to spawn Doomsday, run \"/AllAboutEngie debug doomsday summon\" twice to fix this issue.")),
																	false);
													}
												});
											}
										}
									});
								}
							}
						}
					} else if (!(world instanceof Level _lvl72 && _lvl72.isDay())) {
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}