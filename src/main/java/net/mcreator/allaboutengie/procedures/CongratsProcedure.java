package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CongratsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) {
				if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
						&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_gem_obtained"))).isDone()) {
					if (entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"))).isDone()) {
						if (entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
								&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"))).isDone()) {
							if (entity instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
									&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) {
								if (entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
										&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"))).isDone()) {
									if (entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
											&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_essence_obtained"))).isDone()) {
										if (entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
												&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_essence_obtained"))).isDone()) {
											if (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
													&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mini_ban_obtain"))).isDone()) {
												if (entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
														&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:ban_obtain"))).isDone()) {
													if (entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
															&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"))).isDone()) {
														if (entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel
																&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:large_ban_obtain"))).isDone()) {
															if (entity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel
																	&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:huge_ban_obtain"))).isDone()) {
																if (entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel
																		&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enormous_ban_obtain"))).isDone()) {
																	if (entity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel
																			&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gigantic_ban_obtain"))).isDone()) {
																		if (entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
																				&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:massive_ban_obtain"))).isDone()) {
																			if (entity instanceof ServerPlayer _plr17 && _plr17.level() instanceof ServerLevel && _plr17.getAdvancements()
																					.getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_ban_obtain"))).isDone()) {
																				if (entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel && _plr18.getAdvancements()
																						.getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_ban_obtain"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel && _plr19.getAdvancements()
																							.getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_essence_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr20 && _plr20.level() instanceof ServerLevel && _plr20.getAdvancements()
																								.getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) {
																							if (entity instanceof ServerPlayer _plr21 && _plr21.level() instanceof ServerLevel && _plr21.getAdvancements()
																									.getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"))).isDone()) {
																								if (entity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
																										&& _plr22.getAdvancements()
																												.getOrStartProgress(
																														_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_essence_obtained")))
																												.isDone()) {
																									if (entity instanceof ServerPlayer _plr23 && _plr23.level() instanceof ServerLevel
																											&& _plr23.getAdvancements()
																													.getOrStartProgress(
																															_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_essence_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr24 && _plr24.level() instanceof ServerLevel
																												&& _plr24.getAdvancements()
																														.getOrStartProgress(
																																_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr25 && _plr25.level() instanceof ServerLevel && _plr25.getAdvancements().getOrStartProgress(
																													_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained")))
																													.isDone()) {
																												if (entity instanceof ServerPlayer _plr26 && _plr26.level() instanceof ServerLevel
																														&& _plr26.getAdvancements().getOrStartProgress(
																																_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_tools_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
																															&& _plr27.getAdvancements().getOrStartProgress(
																																	_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_ban_obtain")))
																																	.isDone()) {
																														if (entity instanceof ServerPlayer _plr28 && _plr28.level() instanceof ServerLevel && _plr28.getAdvancements().getOrStartProgress(
																																_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_tools_obtained")))
																																.isDone()) {
																															if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true) {
																																if (entity instanceof ServerPlayer _plr30 && _plr30.level() instanceof ServerLevel
																																		&& _plr30.getAdvancements()
																																				.getOrStartProgress(
																																						_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:conqueror")))
																																				.isDone()) {
																																	if (entity instanceof ServerPlayer _plr31 && _plr31.level() instanceof ServerLevel
																																			&& _plr31.getAdvancements()
																																					.getOrStartProgress(
																																							_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:rise")))
																																					.isDone()) {
																																		if (entity instanceof ServerPlayer _plr32
																																				&& _plr32
																																						.level() instanceof ServerLevel
																																				&& _plr32.getAdvancements().getOrStartProgress(_plr32.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("allaboutengie:sdday_conqueror"))).isDone()) {
																																			if (!(entity instanceof ServerPlayer _plr33 && _plr33.level() instanceof ServerLevel
																																					&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements()
																																							.getAdvancement(new ResourceLocation("allaboutengie:all_done"))).isDone())) {
																																				if (entity instanceof ServerPlayer _player) {
																																					Advancement _adv = _player.server.getAdvancements()
																																							.getAdvancement(new ResourceLocation("allaboutengie:all_done"));
																																					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
																																					if (!_ap.isDone()) {
																																						for (String criteria : _ap.getRemainingCriteria())
																																							_player.getAdvancements().award(_adv, criteria);
																																					}
																																				}
																																			}
																																			if (entity instanceof ServerPlayer _plr35 && _plr35.level() instanceof ServerLevel
																																					&& _plr35.getAdvancements()
																																							.getOrStartProgress(_plr35.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed")))
																																							.isDone()) {
																																				if (!(entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
																																						&& _plr36.getAdvancements()
																																								.getOrStartProgress(_plr36.server.getAdvancements()
																																										.getAdvancement(new ResourceLocation("allaboutengie:all_fully_done")))
																																								.isDone())) {
																																					if (entity instanceof ServerPlayer _player) {
																																						Advancement _adv = _player.server.getAdvancements()
																																								.getAdvancement(new ResourceLocation("allaboutengie:all_fully_done"));
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
																															} else if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true
																																	&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true) {
																																if (entity instanceof ServerPlayer _plr39
																																		&& _plr39
																																				.level() instanceof ServerLevel
																																		&& _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements()
																																				.getAdvancement(new ResourceLocation("allaboutengie:mini_ban_challenge_obtain"))).isDone()) {
																																	if (entity instanceof ServerPlayer _plr40
																																			&& _plr40
																																					.level() instanceof ServerLevel
																																			&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("allaboutengie:ban_challenge_obtain"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr41 && _plr41.level() instanceof ServerLevel
																																				&& _plr41.getAdvancements()
																																						.getOrStartProgress(_plr41.server.getAdvancements()
																																								.getAdvancement(new ResourceLocation("allaboutengie:big_ban_challenge_obtain")))
																																						.isDone()) {
																																			if (entity instanceof ServerPlayer _plr42 && _plr42.level() instanceof ServerLevel
																																					&& _plr42.getAdvancements()
																																							.getOrStartProgress(_plr42.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:large_ban_challenge_obtain")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr43 && _plr43.level() instanceof ServerLevel
																																						&& _plr43.getAdvancements()
																																								.getOrStartProgress(_plr43.server.getAdvancements()
																																										.getAdvancement(new ResourceLocation("allaboutengie:huge_ban_challenge_obtain")))
																																								.isDone()) {
																																					if (entity instanceof ServerPlayer _plr44 && _plr44.level() instanceof ServerLevel
																																							&& _plr44.getAdvancements()
																																									.getOrStartProgress(_plr44.server.getAdvancements().getAdvancement(
																																											new ResourceLocation("allaboutengie:enormous_ban_challenge_obtain")))
																																									.isDone()) {
																																						if (entity instanceof ServerPlayer _plr45 && _plr45.level() instanceof ServerLevel
																																								&& _plr45.getAdvancements()
																																										.getOrStartProgress(_plr45.server.getAdvancements().getAdvancement(
																																												new ResourceLocation("allaboutengie:gigantic_ban_challenge_obtain")))
																																										.isDone()) {
																																							if (entity instanceof ServerPlayer _plr46 && _plr46.level() instanceof ServerLevel
																																									&& _plr46.getAdvancements()
																																											.getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(
																																													new ResourceLocation("allaboutengie:massive_ban_challenge_obtain")))
																																											.isDone()) {
																																								if (entity instanceof ServerPlayer _plr47 && _plr47.level() instanceof ServerLevel
																																										&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements()
																																												.getAdvancement(new ResourceLocation(
																																														"allaboutengie:biblically_accurate_ban_challenge_obtain")))
																																												.isDone()) {
																																									if (entity instanceof ServerPlayer _plr48 && _plr48.level() instanceof ServerLevel
																																											&& _plr48.getAdvancements()
																																													.getOrStartProgress(_plr48.server.getAdvancements()
																																															.getAdvancement(new ResourceLocation(
																																																	"allaboutengie:monstrosity_ban_challenge_obtain")))
																																													.isDone()) {
																																										if (entity instanceof ServerPlayer _plr49 && _plr49.level() instanceof ServerLevel
																																												&& _plr49.getAdvancements()
																																														.getOrStartProgress(_plr49.server.getAdvancements()
																																																.getAdvancement(new ResourceLocation(
																																																		"allaboutengie:challenge_destroyed")))
																																														.isDone()
																																												|| entity instanceof ServerPlayer _plr50
																																														&& _plr50.level() instanceof ServerLevel
																																														&& _plr50.getAdvancements()
																																																.getOrStartProgress(_plr50.server.getAdvancements()
																																																		.getAdvancement(new ResourceLocation(
																																																				"allaboutengie:challenge_destroyed_2")))
																																																.isDone()) {
																																											if (entity instanceof ServerPlayer _plr51
																																													&& _plr51.level() instanceof ServerLevel
																																													&& _plr51.getAdvancements().getOrStartProgress(
																																															_plr51.server.getAdvancements().getAdvancement(
																																																	new ResourceLocation("allaboutengie:conqueror")))
																																															.isDone()) {
																																												if (entity instanceof ServerPlayer _plr52
																																														&& _plr52.level() instanceof ServerLevel
																																														&& _plr52.getAdvancements().getOrStartProgress(
																																																_plr52.server.getAdvancements().getAdvancement(
																																																		new ResourceLocation("allaboutengie:rise")))
																																																.isDone()) {
																																													if (entity instanceof ServerPlayer _plr53
																																															&& _plr53.level() instanceof ServerLevel
																																															&& _plr53.getAdvancements()
																																																	.getOrStartProgress(_plr53.server.getAdvancements()
																																																			.getAdvancement(new ResourceLocation(
																																																					"allaboutengie:sdday_conqueror")))
																																																	.isDone()) {
																																														if (!(entity instanceof ServerPlayer _plr54
																																																&& _plr54.level() instanceof ServerLevel
																																																&& _plr54.getAdvancements()
																																																		.getOrStartProgress(_plr54.server
																																																				.getAdvancements()
																																																				.getAdvancement(new ResourceLocation(
																																																						"allaboutengie:all_done")))
																																																		.isDone())) {
																																															if (entity instanceof ServerPlayer _player) {
																																																Advancement _adv = _player.server.getAdvancements()
																																																		.getAdvancement(new ResourceLocation(
																																																				"allaboutengie:all_done"));
																																																AdvancementProgress _ap = _player.getAdvancements()
																																																		.getOrStartProgress(_adv);
																																																if (!_ap.isDone()) {
																																																	for (String criteria : _ap.getRemainingCriteria())
																																																		_player.getAdvancements().award(_adv, criteria);
																																																}
																																															}
																																														}
																																														if (entity instanceof ServerPlayer _plr56
																																																&& _plr56.level() instanceof ServerLevel
																																																&& _plr56.getAdvancements()
																																																		.getOrStartProgress(_plr56.server
																																																				.getAdvancements()
																																																				.getAdvancement(new ResourceLocation(
																																																						"allaboutengie:secret_advancements_completed")))
																																																		.isDone()) {
																																															if (!(entity instanceof ServerPlayer _plr57
																																																	&& _plr57.level() instanceof ServerLevel
																																																	&& _plr57.getAdvancements()
																																																			.getOrStartProgress(_plr57.server
																																																					.getAdvancements()
																																																					.getAdvancement(new ResourceLocation(
																																																							"allaboutengie:all_fully_done")))
																																																			.isDone())) {
																																																if (entity instanceof ServerPlayer _player) {
																																																	Advancement _adv = _player.server.getAdvancements()
																																																			.getAdvancement(new ResourceLocation(
																																																					"allaboutengie:all_fully_done"));
																																																	AdvancementProgress _ap = _player.getAdvancements()
																																																			.getOrStartProgress(_adv);
																																																	if (!_ap.isDone()) {
																																																		for (String criteria : _ap.getRemainingCriteria())
																																																			_player.getAdvancements().award(_adv,
																																																					criteria);
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															} else if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true
																																	&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true) {
																																if (entity instanceof ServerPlayer _plr60
																																		&& _plr60
																																				.level() instanceof ServerLevel
																																		&& _plr60.getAdvancements().getOrStartProgress(_plr60.server.getAdvancements()
																																				.getAdvancement(new ResourceLocation("allaboutengie:mini_ban_challenge_obtain"))).isDone()) {
																																	if (entity instanceof ServerPlayer _plr61
																																			&& _plr61
																																					.level() instanceof ServerLevel
																																			&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("allaboutengie:ban_challenge_obtain"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr62 && _plr62.level() instanceof ServerLevel
																																				&& _plr62.getAdvancements()
																																						.getOrStartProgress(_plr62.server.getAdvancements()
																																								.getAdvancement(new ResourceLocation("allaboutengie:big_ban_challenge_obtain")))
																																						.isDone()) {
																																			if (entity instanceof ServerPlayer _plr63 && _plr63.level() instanceof ServerLevel
																																					&& _plr63.getAdvancements()
																																							.getOrStartProgress(_plr63.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:large_ban_challenge_obtain")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr64 && _plr64.level() instanceof ServerLevel
																																						&& _plr64.getAdvancements()
																																								.getOrStartProgress(_plr64.server.getAdvancements()
																																										.getAdvancement(new ResourceLocation("allaboutengie:huge_ban_challenge_obtain")))
																																								.isDone()) {
																																					if (entity instanceof ServerPlayer _plr65 && _plr65.level() instanceof ServerLevel
																																							&& _plr65.getAdvancements()
																																									.getOrStartProgress(_plr65.server.getAdvancements().getAdvancement(
																																											new ResourceLocation("allaboutengie:enormous_ban_challenge_obtain")))
																																									.isDone()) {
																																						if (entity instanceof ServerPlayer _plr66 && _plr66.level() instanceof ServerLevel
																																								&& _plr66.getAdvancements()
																																										.getOrStartProgress(_plr66.server.getAdvancements().getAdvancement(
																																												new ResourceLocation("allaboutengie:gigantic_ban_challenge_obtain")))
																																										.isDone()) {
																																							if (entity instanceof ServerPlayer _plr67 && _plr67.level() instanceof ServerLevel
																																									&& _plr67.getAdvancements()
																																											.getOrStartProgress(_plr67.server.getAdvancements().getAdvancement(
																																													new ResourceLocation("allaboutengie:massive_ban_challenge_obtain")))
																																											.isDone()) {
																																								if (entity instanceof ServerPlayer _plr68 && _plr68.level() instanceof ServerLevel
																																										&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements()
																																												.getAdvancement(new ResourceLocation(
																																														"allaboutengie:biblically_accurate_ban_challenge_obtain")))
																																												.isDone()) {
																																									if (entity instanceof ServerPlayer _plr69 && _plr69.level() instanceof ServerLevel
																																											&& _plr69.getAdvancements()
																																													.getOrStartProgress(_plr69.server.getAdvancements()
																																															.getAdvancement(new ResourceLocation(
																																																	"allaboutengie:monstrosity_ban_challenge_obtain")))
																																													.isDone()) {
																																										if (entity instanceof ServerPlayer _plr70 && _plr70.level() instanceof ServerLevel
																																												&& _plr70.getAdvancements()
																																														.getOrStartProgress(_plr70.server.getAdvancements()
																																																.getAdvancement(new ResourceLocation(
																																																		"allaboutengie:challenge_destroyed")))
																																														.isDone()
																																												|| entity instanceof ServerPlayer _plr71
																																														&& _plr71.level() instanceof ServerLevel
																																														&& _plr71.getAdvancements()
																																																.getOrStartProgress(_plr71.server.getAdvancements()
																																																		.getAdvancement(new ResourceLocation(
																																																				"allaboutengie:challenge_destroyed_2")))
																																																.isDone()) {
																																											if (entity instanceof ServerPlayer _plr72
																																													&& _plr72.level() instanceof ServerLevel
																																													&& _plr72.getAdvancements().getOrStartProgress(
																																															_plr72.server.getAdvancements().getAdvancement(
																																																	new ResourceLocation("allaboutengie:found_engie")))
																																															.isDone()) {
																																												if (!(entity instanceof ServerPlayer _plr73
																																														&& _plr73.level() instanceof ServerLevel
																																														&& _plr73.getAdvancements().getOrStartProgress(
																																																_plr73.server.getAdvancements().getAdvancement(
																																																		new ResourceLocation("allaboutengie:all_done")))
																																																.isDone())) {
																																													if (entity instanceof ServerPlayer _player) {
																																														Advancement _adv = _player.server.getAdvancements()
																																																.getAdvancement(
																																																		new ResourceLocation("allaboutengie:all_done"));
																																														AdvancementProgress _ap = _player.getAdvancements()
																																																.getOrStartProgress(_adv);
																																														if (!_ap.isDone()) {
																																															for (String criteria : _ap.getRemainingCriteria())
																																																_player.getAdvancements().award(_adv, criteria);
																																														}
																																													}
																																												}
																																												if (entity instanceof ServerPlayer _plr75
																																														&& _plr75.level() instanceof ServerLevel
																																														&& _plr75.getAdvancements().getOrStartProgress(_plr75.server
																																																.getAdvancements()
																																																.getAdvancement(new ResourceLocation(
																																																		"allaboutengie:secret_advancements_completed")))
																																																.isDone()) {
																																													if (!(entity instanceof ServerPlayer _plr76
																																															&& _plr76.level() instanceof ServerLevel
																																															&& _plr76.getAdvancements()
																																																	.getOrStartProgress(_plr76.server.getAdvancements()
																																																			.getAdvancement(new ResourceLocation(
																																																					"allaboutengie:all_fully_done")))
																																																	.isDone())) {
																																														if (entity instanceof ServerPlayer _player) {
																																															Advancement _adv = _player.server.getAdvancements()
																																																	.getAdvancement(new ResourceLocation(
																																																			"allaboutengie:all_fully_done"));
																																															AdvancementProgress _ap = _player.getAdvancements()
																																																	.getOrStartProgress(_adv);
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true
																																	&& AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true
																																	&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true) {
																																if (entity instanceof ServerPlayer _plr80
																																		&& _plr80
																																				.level() instanceof ServerLevel
																																		&& _plr80.getAdvancements().getOrStartProgress(_plr80.server.getAdvancements()
																																				.getAdvancement(new ResourceLocation("allaboutengie:mini_ban_challenge_obtain"))).isDone()) {
																																	if (entity instanceof ServerPlayer _plr81
																																			&& _plr81
																																					.level() instanceof ServerLevel
																																			&& _plr81.getAdvancements().getOrStartProgress(_plr81.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("allaboutengie:ban_challenge_obtain"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr82 && _plr82.level() instanceof ServerLevel
																																				&& _plr82.getAdvancements()
																																						.getOrStartProgress(_plr82.server.getAdvancements()
																																								.getAdvancement(new ResourceLocation("allaboutengie:big_ban_challenge_obtain")))
																																						.isDone()) {
																																			if (entity instanceof ServerPlayer _plr83 && _plr83.level() instanceof ServerLevel
																																					&& _plr83.getAdvancements()
																																							.getOrStartProgress(_plr83.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:large_ban_challenge_obtain")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr84 && _plr84.level() instanceof ServerLevel
																																						&& _plr84.getAdvancements()
																																								.getOrStartProgress(_plr84.server.getAdvancements()
																																										.getAdvancement(new ResourceLocation("allaboutengie:huge_ban_challenge_obtain")))
																																								.isDone()) {
																																					if (entity instanceof ServerPlayer _plr85 && _plr85.level() instanceof ServerLevel
																																							&& _plr85.getAdvancements()
																																									.getOrStartProgress(_plr85.server.getAdvancements().getAdvancement(
																																											new ResourceLocation("allaboutengie:enormous_ban_challenge_obtain")))
																																									.isDone()) {
																																						if (entity instanceof ServerPlayer _plr86 && _plr86.level() instanceof ServerLevel
																																								&& _plr86.getAdvancements()
																																										.getOrStartProgress(_plr86.server.getAdvancements().getAdvancement(
																																												new ResourceLocation("allaboutengie:gigantic_ban_challenge_obtain")))
																																										.isDone()) {
																																							if (entity instanceof ServerPlayer _plr87 && _plr87.level() instanceof ServerLevel
																																									&& _plr87.getAdvancements()
																																											.getOrStartProgress(_plr87.server.getAdvancements().getAdvancement(
																																													new ResourceLocation("allaboutengie:massive_ban_challenge_obtain")))
																																											.isDone()) {
																																								if (entity instanceof ServerPlayer _plr88 && _plr88.level() instanceof ServerLevel
																																										&& _plr88.getAdvancements().getOrStartProgress(_plr88.server.getAdvancements()
																																												.getAdvancement(new ResourceLocation(
																																														"allaboutengie:biblically_accurate_ban_challenge_obtain")))
																																												.isDone()) {
																																									if (entity instanceof ServerPlayer _plr89 && _plr89.level() instanceof ServerLevel
																																											&& _plr89.getAdvancements()
																																													.getOrStartProgress(_plr89.server.getAdvancements()
																																															.getAdvancement(new ResourceLocation(
																																																	"allaboutengie:monstrosity_ban_challenge_obtain")))
																																													.isDone()) {
																																										if (entity instanceof ServerPlayer _plr90 && _plr90.level() instanceof ServerLevel
																																												&& _plr90.getAdvancements()
																																														.getOrStartProgress(_plr90.server.getAdvancements()
																																																.getAdvancement(new ResourceLocation(
																																																		"allaboutengie:challenge_destroyed")))
																																														.isDone()
																																												|| entity instanceof ServerPlayer _plr91
																																														&& _plr91.level() instanceof ServerLevel
																																														&& _plr91.getAdvancements()
																																																.getOrStartProgress(_plr91.server.getAdvancements()
																																																		.getAdvancement(new ResourceLocation(
																																																				"allaboutengie:challenge_destroyed_2")))
																																																.isDone()) {
																																											if (entity instanceof ServerPlayer _plr92
																																													&& _plr92.level() instanceof ServerLevel
																																													&& _plr92.getAdvancements().getOrStartProgress(
																																															_plr92.server.getAdvancements().getAdvancement(
																																																	new ResourceLocation("allaboutengie:conqueror")))
																																															.isDone()) {
																																												if (entity instanceof ServerPlayer _plr93
																																														&& _plr93.level() instanceof ServerLevel
																																														&& _plr93.getAdvancements().getOrStartProgress(
																																																_plr93.server.getAdvancements().getAdvancement(
																																																		new ResourceLocation("allaboutengie:rise")))
																																																.isDone()) {
																																													if (entity instanceof ServerPlayer _plr94
																																															&& _plr94.level() instanceof ServerLevel
																																															&& _plr94.getAdvancements()
																																																	.getOrStartProgress(_plr94.server.getAdvancements()
																																																			.getAdvancement(new ResourceLocation(
																																																					"allaboutengie:sdday_conqueror")))
																																																	.isDone()) {
																																														if (entity instanceof ServerPlayer _plr95
																																																&& _plr95.level() instanceof ServerLevel
																																																&& _plr95.getAdvancements()
																																																		.getOrStartProgress(_plr95.server
																																																				.getAdvancements()
																																																				.getAdvancement(new ResourceLocation(
																																																						"allaboutengie:found_engie")))
																																																		.isDone()) {
																																															if (!(entity instanceof ServerPlayer _plr96
																																																	&& _plr96.level() instanceof ServerLevel
																																																	&& _plr96.getAdvancements()
																																																			.getOrStartProgress(_plr96.server
																																																					.getAdvancements()
																																																					.getAdvancement(new ResourceLocation(
																																																							"allaboutengie:all_done")))
																																																			.isDone())) {
																																																if (entity instanceof ServerPlayer _player) {
																																																	Advancement _adv = _player.server.getAdvancements()
																																																			.getAdvancement(new ResourceLocation(
																																																					"allaboutengie:all_done"));
																																																	AdvancementProgress _ap = _player.getAdvancements()
																																																			.getOrStartProgress(_adv);
																																																	if (!_ap.isDone()) {
																																																		for (String criteria : _ap.getRemainingCriteria())
																																																			_player.getAdvancements().award(_adv,
																																																					criteria);
																																																	}
																																																}
																																															}
																																															if (entity instanceof ServerPlayer _plr98
																																																	&& _plr98.level() instanceof ServerLevel
																																																	&& _plr98.getAdvancements()
																																																			.getOrStartProgress(_plr98.server
																																																					.getAdvancements()
																																																					.getAdvancement(new ResourceLocation(
																																																							"allaboutengie:secret_advancements_completed")))
																																																			.isDone()) {
																																																if (!(entity instanceof ServerPlayer _plr99
																																																		&& _plr99.level() instanceof ServerLevel
																																																		&& _plr99.getAdvancements()
																																																				.getOrStartProgress(_plr99.server
																																																						.getAdvancements().getAdvancement(
																																																								new ResourceLocation(
																																																										"allaboutengie:all_fully_done")))
																																																				.isDone())) {
																																																	if (entity instanceof ServerPlayer _player) {
																																																		Advancement _adv = _player.server
																																																				.getAdvancements()
																																																				.getAdvancement(new ResourceLocation(
																																																						"allaboutengie:all_fully_done"));
																																																		AdvancementProgress _ap = _player
																																																				.getAdvancements()
																																																				.getOrStartProgress(_adv);
																																																		if (!_ap.isDone()) {
																																																			for (String criteria : _ap
																																																					.getRemainingCriteria())
																																																				_player.getAdvancements().award(_adv,
																																																						criteria);
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true) {
																																if (entity instanceof ServerPlayer _plr102 && _plr102.level() instanceof ServerLevel
																																		&& _plr102.getAdvancements().getOrStartProgress(
																																				_plr102.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:found_engie")))
																																				.isDone()) {
																																	if (!(entity instanceof ServerPlayer _plr103 && _plr103.level() instanceof ServerLevel
																																			&& _plr103.getAdvancements().getOrStartProgress(
																																					_plr103.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:all_done")))
																																					.isDone())) {
																																		if (entity instanceof ServerPlayer _player) {
																																			Advancement _adv = _player.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("allaboutengie:all_done"));
																																			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
																																			if (!_ap.isDone()) {
																																				for (String criteria : _ap.getRemainingCriteria())
																																					_player.getAdvancements().award(_adv, criteria);
																																			}
																																		}
																																	}
																																	if (entity instanceof ServerPlayer _plr105 && _plr105.level() instanceof ServerLevel
																																			&& _plr105.getAdvancements()
																																					.getOrStartProgress(_plr105.server.getAdvancements()
																																							.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed")))
																																					.isDone()) {
																																		if (!(entity instanceof ServerPlayer _plr106
																																				&& _plr106
																																						.level() instanceof ServerLevel
																																				&& _plr106.getAdvancements().getOrStartProgress(_plr106.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("allaboutengie:all_fully_done"))).isDone())) {
																																			if (entity instanceof ServerPlayer _player) {
																																				Advancement _adv = _player.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("allaboutengie:all_fully_done"));
																																				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
																																				if (!_ap.isDone()) {
																																					for (String criteria : _ap.getRemainingCriteria())
																																						_player.getAdvancements().award(_adv, criteria);
																																				}
																																			}
																																		}
																																	}
																																}
																															} else {
																																if (!(entity instanceof ServerPlayer _plr108 && _plr108.level() instanceof ServerLevel
																																		&& _plr108.getAdvancements()
																																				.getOrStartProgress(
																																						_plr108.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:all_done")))
																																				.isDone())) {
																																	if (entity instanceof ServerPlayer _player) {
																																		Advancement _adv = _player.server.getAdvancements()
																																				.getAdvancement(new ResourceLocation("allaboutengie:all_done"));
																																		AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
																																		if (!_ap.isDone()) {
																																			for (String criteria : _ap.getRemainingCriteria())
																																				_player.getAdvancements().award(_adv, criteria);
																																		}
																																	}
																																}
																																if (entity instanceof ServerPlayer _plr110
																																		&& _plr110
																																				.level() instanceof ServerLevel
																																		&& _plr110.getAdvancements().getOrStartProgress(_plr110.server.getAdvancements()
																																				.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed"))).isDone()) {
																																	if (!(entity instanceof ServerPlayer _plr111 && _plr111.level() instanceof ServerLevel
																																			&& _plr111.getAdvancements().getOrStartProgress(
																																					_plr111.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:all_fully_done")))
																																					.isDone())) {
																																		if (entity instanceof ServerPlayer _player) {
																																			Advancement _adv = _player.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("allaboutengie:all_fully_done"));
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
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof ServerPlayer _plr113 && _plr113.level() instanceof ServerLevel
				&& _plr113.getAdvancements().getOrStartProgress(_plr113.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mad_engie_plush_obtained"))).isDone()) {
			if (entity instanceof ServerPlayer _plr114 && _plr114.level() instanceof ServerLevel
					&& _plr114.getAdvancements().getOrStartProgress(_plr114.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_plush_obtained"))).isDone()) {
				if (entity instanceof ServerPlayer _plr115 && _plr115.level() instanceof ServerLevel
						&& _plr115.getAdvancements().getOrStartProgress(_plr115.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_angry_engie_plush_obtained"))).isDone()) {
					if (entity instanceof ServerPlayer _plr116 && _plr116.level() instanceof ServerLevel
							&& _plr116.getAdvancements().getOrStartProgress(_plr116.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_angry_engie_plush_obtained"))).isDone()) {
						if (entity instanceof ServerPlayer _plr117 && _plr117.level() instanceof ServerLevel
								&& _plr117.getAdvancements().getOrStartProgress(_plr117.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_angry_engie_plush_obtained"))).isDone()) {
							if (entity instanceof ServerPlayer _plr118 && _plr118.level() instanceof ServerLevel
									&& _plr118.getAdvancements().getOrStartProgress(_plr118.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_plush_obtained"))).isDone()) {
								if (entity instanceof ServerPlayer _plr119 && _plr119.level() instanceof ServerLevel
										&& _plr119.getAdvancements().getOrStartProgress(_plr119.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_enraged_engie_plush_obtained"))).isDone()) {
									if (entity instanceof ServerPlayer _plr120 && _plr120.level() instanceof ServerLevel
											&& _plr120.getAdvancements().getOrStartProgress(_plr120.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_enraged_engie_plush_obtained"))).isDone()) {
										if (entity instanceof ServerPlayer _plr121 && _plr121.level() instanceof ServerLevel
												&& _plr121.getAdvancements().getOrStartProgress(_plr121.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_enraged_engie_plush_obtained"))).isDone()) {
											if (entity instanceof ServerPlayer _plr122 && _plr122.level() instanceof ServerLevel
													&& _plr122.getAdvancements().getOrStartProgress(_plr122.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_plush_obtained"))).isDone()) {
												if (entity instanceof ServerPlayer _plr123 && _plr123.level() instanceof ServerLevel
														&& _plr123.getAdvancements().getOrStartProgress(_plr123.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_outraged_engie_plush_obtained"))).isDone()) {
													if (entity instanceof ServerPlayer _plr124 && _plr124.level() instanceof ServerLevel
															&& _plr124.getAdvancements().getOrStartProgress(_plr124.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_outraged_engie_plush_obtained"))).isDone()) {
														if (entity instanceof ServerPlayer _plr125 && _plr125.level() instanceof ServerLevel && _plr125.getAdvancements()
																.getOrStartProgress(_plr125.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_outraged_engie_plush_obtained"))).isDone()) {
															if (entity instanceof ServerPlayer _plr126 && _plr126.level() instanceof ServerLevel
																	&& _plr126.getAdvancements().getOrStartProgress(_plr126.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_plush_obtained"))).isDone()) {
																if (entity instanceof ServerPlayer _plr127 && _plr127.level() instanceof ServerLevel && _plr127.getAdvancements()
																		.getOrStartProgress(_plr127.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_monstrosity_engie_plush_obtained"))).isDone()) {
																	if (entity instanceof ServerPlayer _plr128 && _plr128.level() instanceof ServerLevel && _plr128.getAdvancements()
																			.getOrStartProgress(_plr128.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_monstrosity_engie_plush_obtained"))).isDone()) {
																		if (entity instanceof ServerPlayer _plr129 && _plr129.level() instanceof ServerLevel && _plr129.getAdvancements()
																				.getOrStartProgress(_plr129.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_monstrosity_engie_plush_obtained"))).isDone()) {
																			if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
																				if (entity instanceof ServerPlayer _plr130 && _plr130.level() instanceof ServerLevel && _plr130.getAdvancements()
																						.getOrStartProgress(_plr130.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:insanity_engie_plush_obtained"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr131 && _plr131.level() instanceof ServerLevel && _plr131.getAdvancements()
																							.getOrStartProgress(_plr131.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gold_insanity_engie_plush_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr132 && _plr132.level() instanceof ServerLevel
																								&& _plr132.getAdvancements()
																										.getOrStartProgress(_plr132.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:diamond_insanity_engie_plush_obtained")))
																										.isDone()) {
																							if (entity instanceof ServerPlayer _plr133 && _plr133.level() instanceof ServerLevel
																									&& _plr133.getAdvancements()
																											.getOrStartProgress(
																													_plr133.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:netherite_insanity_engie_plush_obtained")))
																											.isDone()) {
																								if (entity instanceof ServerPlayer _plr134 && _plr134.level() instanceof ServerLevel
																										&& _plr134.getAdvancements()
																												.getOrStartProgress(
																														_plr134.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_insanity_engie_plush_obtained")))
																												.isDone()) {
																									if (entity instanceof ServerPlayer _plr135 && _plr135.level() instanceof ServerLevel
																											&& _plr135.getAdvancements()
																													.getOrStartProgress(
																															_plr135.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:pure_insanity_engie_plush_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr136 && _plr136.level() instanceof ServerLevel
																												&& _plr136.getAdvancements()
																														.getOrStartProgress(_plr136.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:wither_rose_secret_xxl")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr137 && _plr137.level() instanceof ServerLevel
																													&& _plr137.getAdvancements().getOrStartProgress(
																															_plr137.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:all_about_engie_plaque_obtained")))
																															.isDone()) {
																												if (entity instanceof ServerPlayer _plr138 && _plr138.level() instanceof ServerLevel
																														&& _plr138.getAdvancements()
																																.getOrStartProgress(
																																		_plr138.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:items_plaque_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr139 && _plr139.level() instanceof ServerLevel
																															&& _plr139.getAdvancements()
																																	.getOrStartProgress(
																																			_plr139.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mobs_plaque_obtained")))
																																	.isDone()) {
																														if (entity instanceof ServerPlayer _plr140 && _plr140.level() instanceof ServerLevel
																																&& _plr140.getAdvancements().getOrStartProgress(
																																		_plr140.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:sharkos_plaque_obtained")))
																																		.isDone()) {
																															if (entity instanceof ServerPlayer _plr141 && _plr141.level() instanceof ServerLevel
																																	&& _plr141.getAdvancements().getOrStartProgress(_plr141.server.getAdvancements()
																																			.getAdvancement(new ResourceLocation("allaboutengie:dimensions_plaque_obtained"))).isDone()) {
																																if (entity instanceof ServerPlayer _plr142 && _plr142.level() instanceof ServerLevel
																																		&& _plr142.getAdvancements()
																																				.getOrStartProgress(_plr142.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("allaboutengie:enraged_zombies_plaque_obtained")))
																																				.isDone()) {
																																	if (entity instanceof ServerPlayer _plr143
																																			&& _plr143
																																					.level() instanceof ServerLevel
																																			&& _plr143.getAdvancements().getOrStartProgress(_plr143.server.getAdvancements()
																																					.getAdvancement(new ResourceLocation("allaboutengie:extras_plaque_obtained"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr144
																																				&& _plr144
																																						.level() instanceof ServerLevel
																																				&& _plr144.getAdvancements().getOrStartProgress(_plr144.server.getAdvancements()
																																						.getAdvancement(new ResourceLocation("allaboutengie:engie_plaque_obtained"))).isDone()) {
																																			if (entity instanceof ServerPlayer _plr145 && _plr145.level() instanceof ServerLevel
																																					&& _plr145.getAdvancements()
																																							.getOrStartProgress(_plr145.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:engie_plush_obtained")))
																																							.isDone()) {
																																				if (entity instanceof ServerPlayer _plr146 && _plr146.level() instanceof ServerLevel
																																						&& _plr146.getAdvancements()
																																								.getOrStartProgress(_plr146.server.getAdvancements()
																																										.getAdvancement(new ResourceLocation("allaboutengie:dev_engie_plush_obtained")))
																																								.isDone()) {
																																					if (!(entity instanceof ServerPlayer _plr147 && _plr147.level() instanceof ServerLevel
																																							&& _plr147.getAdvancements()
																																									.getOrStartProgress(_plr147.server.getAdvancements().getAdvancement(
																																											new ResourceLocation("allaboutengie:secret_advancements_completed")))
																																									.isDone())) {
																																						if (entity instanceof ServerPlayer _player) {
																																							Advancement _adv = _player.server.getAdvancements()
																																									.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed"));
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
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			} else {
																				if (entity instanceof ServerPlayer _plr149 && _plr149.level() instanceof ServerLevel && _plr149.getAdvancements()
																						.getOrStartProgress(_plr149.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:wither_rose_secret_xxl"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr150 && _plr150.level() instanceof ServerLevel && _plr150.getAdvancements()
																							.getOrStartProgress(_plr150.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:all_about_engie_plaque_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr151 && _plr151.level() instanceof ServerLevel && _plr151.getAdvancements()
																								.getOrStartProgress(_plr151.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:items_plaque_obtained"))).isDone()) {
																							if (entity instanceof ServerPlayer _plr152 && _plr152.level() instanceof ServerLevel && _plr152.getAdvancements()
																									.getOrStartProgress(_plr152.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mobs_plaque_obtained"))).isDone()) {
																								if (entity instanceof ServerPlayer _plr153 && _plr153.level() instanceof ServerLevel && _plr153.getAdvancements()
																										.getOrStartProgress(_plr153.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:sharkos_plaque_obtained"))).isDone()) {
																									if (entity instanceof ServerPlayer _plr154 && _plr154.level() instanceof ServerLevel
																											&& _plr154.getAdvancements()
																													.getOrStartProgress(_plr154.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:dimensions_plaque_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr155 && _plr155.level() instanceof ServerLevel
																												&& _plr155.getAdvancements()
																														.getOrStartProgress(
																																_plr155.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_zombies_plaque_obtained")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr156 && _plr156.level() instanceof ServerLevel
																													&& _plr156.getAdvancements()
																															.getOrStartProgress(
																																	_plr156.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:extras_plaque_obtained")))
																															.isDone()) {
																												if (entity instanceof ServerPlayer _plr157 && _plr157.level() instanceof ServerLevel
																														&& _plr157.getAdvancements()
																																.getOrStartProgress(
																																		_plr157.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_plaque_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr158 && _plr158.level() instanceof ServerLevel
																															&& _plr158.getAdvancements()
																																	.getOrStartProgress(
																																			_plr158.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_plush_obtained")))
																																	.isDone()) {
																														if (entity instanceof ServerPlayer _plr159 && _plr159.level() instanceof ServerLevel
																																&& _plr159.getAdvancements().getOrStartProgress(
																																		_plr159.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:dev_engie_plush_obtained")))
																																		.isDone()) {
																															if (!(entity instanceof ServerPlayer _plr160
																																	&& _plr160
																																			.level() instanceof ServerLevel
																																	&& _plr160.getAdvancements().getOrStartProgress(_plr160.server.getAdvancements()
																																			.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed"))).isDone())) {
																																if (entity instanceof ServerPlayer _player) {
																																	Advancement _adv = _player.server.getAdvancements()
																																			.getAdvancement(new ResourceLocation("allaboutengie:secret_advancements_completed"));
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
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
