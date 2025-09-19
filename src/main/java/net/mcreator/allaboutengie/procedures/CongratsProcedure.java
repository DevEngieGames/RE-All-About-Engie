package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CongratsProcedure {
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
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"))).isDone()) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"))).isDone()) {
				if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_gem_obtained"))).isDone()) {
					if (entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
							&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_tool_obtained"))).isDone()) {
						if (entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
								&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_tool_obtained"))).isDone()) {
							if (entity instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
									&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"))).isDone()) {
								if (entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
										&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_tool_obtained"))).isDone()) {
									if (entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
											&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_essence_obtained"))).isDone()) {
										if (entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
												&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_essence_obtained"))).isDone()) {
											if (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
													&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:mini_ban_obtain"))).isDone()) {
												if (entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
														&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:ban_obtain"))).isDone()) {
													if (entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
															&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:big_ban_obtain"))).isDone()) {
														if (entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel
																&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:large_ban_obtain"))).isDone()) {
															if (entity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel
																	&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:huge_ban_obtain"))).isDone()) {
																if (entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel
																		&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enormous_ban_obtain"))).isDone()) {
																	if (entity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel
																			&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:gigantic_ban_obtain"))).isDone()) {
																		if (entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
																				&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:massive_ban_obtain"))).isDone()) {
																			if (entity instanceof ServerPlayer _plr17 && _plr17.level() instanceof ServerLevel && _plr17.getAdvancements()
																					.getOrStartProgress(_plr17.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_ban_obtain"))).isDone()) {
																				if (entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
																						&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_ban_obtain"))).isDone()) {
																					if (entity instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel && _plr19.getAdvancements()
																							.getOrStartProgress(_plr19.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_essence_obtained"))).isDone()) {
																						if (entity instanceof ServerPlayer _plr20 && _plr20.level() instanceof ServerLevel && _plr20.getAdvancements()
																								.getOrStartProgress(_plr20.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"))).isDone()) {
																							if (entity instanceof ServerPlayer _plr21 && _plr21.level() instanceof ServerLevel && _plr21.getAdvancements()
																									.getOrStartProgress(_plr21.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) {
																								if (entity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel && _plr22.getAdvancements()
																										.getOrStartProgress(_plr22.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_essence_obtained"))).isDone()) {
																									if (entity instanceof ServerPlayer _plr23 && _plr23.level() instanceof ServerLevel
																											&& _plr23.getAdvancements()
																													.getOrStartProgress(_plr23.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_essence_obtained")))
																													.isDone()) {
																										if (entity instanceof ServerPlayer _plr24 && _plr24.level() instanceof ServerLevel
																												&& _plr24.getAdvancements()
																														.getOrStartProgress(_plr24.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained")))
																														.isDone()) {
																											if (entity instanceof ServerPlayer _plr25 && _plr25.level() instanceof ServerLevel
																													&& _plr25.getAdvancements()
																															.getOrStartProgress(
																																	_plr25.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained")))
																															.isDone()) {
																												if (entity instanceof ServerPlayer _plr26 && _plr26.level() instanceof ServerLevel
																														&& _plr26.getAdvancements()
																																.getOrStartProgress(
																																		_plr26.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_tools_obtained")))
																																.isDone()) {
																													if (entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
																															&& _plr27.getAdvancements()
																																	.getOrStartProgress(
																																			_plr27.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_ban_obtain")))
																																	.isDone()) {
																														if (entity instanceof ServerPlayer _plr28 && _plr28.level() instanceof ServerLevel
																																&& _plr28.getAdvancements().getOrStartProgress(
																																		_plr28.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_tools_obtained")))
																																		.isDone()) {
																															if (entity instanceof ServerPlayer _plr29 && _plr29.level() instanceof ServerLevel
																																	&& _plr29.getAdvancements().getOrStartProgress(
																																			_plr29.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:doomsday_ban_scythe_obtain")))
																																			.isDone()) {
																																if (entity instanceof ServerPlayer _plr30
																																		&& _plr30
																																				.level() instanceof ServerLevel
																																		&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements()
																																				.get(ResourceLocation.parse("allaboutengie:super_doomsday_ban_scythe_obtain"))).isDone()) {
																																	if (entity instanceof ServerPlayer _plr31 && _plr31.level() instanceof ServerLevel
																																			&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements()
																																					.get(ResourceLocation.parse("allaboutengie:the_end_ban_scythe_obtain"))).isDone()) {
																																		if (entity instanceof ServerPlayer _plr32
																																				&& _plr32
																																						.level() instanceof ServerLevel
																																				&& _plr32.getAdvancements().getOrStartProgress(_plr32.server.getAdvancements()
																																						.get(ResourceLocation.parse("allaboutengie:engies_ban_scythe_obtain"))).isDone()) {
																																			if (entity instanceof ServerPlayer _plr33
																																					&& _plr33
																																							.level() instanceof ServerLevel
																																					&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements()
																																							.get(ResourceLocation.parse("allaboutengie:mindscape_ban_scythe_obtain"))).isDone()) {
																																				if (entity instanceof ServerPlayer _plr34 && _plr34.level() instanceof ServerLevel
																																						&& _plr34.getAdvancements()
																																								.getOrStartProgress(_plr34.server.getAdvancements()
																																										.get(ResourceLocation.parse("allaboutengie:engie_games_sword_obtain")))
																																								.isDone()) {
																																					if (entity instanceof ServerPlayer _plr35 && _plr35.level() instanceof ServerLevel && _plr35
																																							.getAdvancements()
																																							.getOrStartProgress(_plr35.server.getAdvancements()
																																									.get(ResourceLocation.parse("allaboutengie:obtained_full_set_of_real_engie_games")))
																																							.isDone()) {
																																						if (entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
																																								&& _plr36.getAdvancements()
																																										.getOrStartProgress(_plr36.server.getAdvancements().get(
																																												ResourceLocation.parse("allaboutengie:antimatter_engie_gem_obtained")))
																																										.isDone()) {
																																							if (entity instanceof ServerPlayer _plr37 && _plr37.level() instanceof ServerLevel
																																									&& _plr37.getAdvancements()
																																											.getOrStartProgress(_plr37.server.getAdvancements()
																																													.get(ResourceLocation.parse(
																																															"allaboutengie:antimatter_angry_engie_essence_obtained")))
																																											.isDone()) {
																																								if (entity instanceof ServerPlayer _plr38 && _plr38.level() instanceof ServerLevel
																																										&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements()
																																												.get(ResourceLocation.parse(
																																														"allaboutengie:antimatter_enraged_engie_essence_obtained")))
																																												.isDone()) {
																																									if (entity instanceof ServerPlayer _plr39 && _plr39.level() instanceof ServerLevel
																																											&& _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements()
																																													.get(ResourceLocation.parse(
																																															"allaboutengie:antimatter_outraged_engie_essence_obtained")))
																																													.isDone()) {
																																										if (entity instanceof ServerPlayer _plr40 && _plr40.level() instanceof ServerLevel
																																												&& _plr40.getAdvancements().getOrStartProgress(_plr40.server
																																														.getAdvancements()
																																														.get(ResourceLocation.parse(
																																																"allaboutengie:antimatter_biblically_accurate_essence_obtained")))
																																														.isDone()) {
																																											if (entity instanceof ServerPlayer _plr41
																																													&& _plr41.level() instanceof ServerLevel
																																													&& _plr41.getAdvancements().getOrStartProgress(_plr41.server
																																															.getAdvancements()
																																															.get(ResourceLocation.parse(
																																																	"allaboutengie:antimatter_monstrosity_engie_essence_obtained")))
																																															.isDone()) {
																																												if (entity instanceof ServerPlayer _plr42
																																														&& _plr42.level() instanceof ServerLevel
																																														&& _plr42.getAdvancements().getOrStartProgress(_plr42.server
																																																.getAdvancements()
																																																.get(ResourceLocation.parse(
																																																		"allaboutengie:antimatter_engie_tool_obtained")))
																																																.isDone()) {
																																													if (entity instanceof ServerPlayer _plr43
																																															&& _plr43.level() instanceof ServerLevel
																																															&& _plr43.getAdvancements().getOrStartProgress(_plr43.server
																																																	.getAdvancements()
																																																	.get(ResourceLocation.parse(
																																																			"allaboutengie:antimatter_angry_engie_tool_obtained")))
																																																	.isDone()) {
																																														if (entity instanceof ServerPlayer _plr44
																																																&& _plr44.level() instanceof ServerLevel
																																																&& _plr44.getAdvancements()
																																																		.getOrStartProgress(_plr44.server
																																																				.getAdvancements()
																																																				.get(ResourceLocation.parse(
																																																						"allaboutengie:antimatter_enraged_engie_tool_obtained")))
																																																		.isDone()) {
																																															if (entity instanceof ServerPlayer _plr45
																																																	&& _plr45.level() instanceof ServerLevel
																																																	&& _plr45.getAdvancements()
																																																			.getOrStartProgress(_plr45.server
																																																					.getAdvancements()
																																																					.get(ResourceLocation.parse(
																																																							"allaboutengie:antimatter_outraged_tools_obtained")))
																																																			.isDone()) {
																																																if (entity instanceof ServerPlayer _plr46
																																																		&& _plr46.level() instanceof ServerLevel
																																																		&& _plr46.getAdvancements()
																																																				.getOrStartProgress(_plr46.server
																																																						.getAdvancements()
																																																						.get(ResourceLocation.parse(
																																																								"allaboutengie:antimatter_biblically_accurate_tools_obtained")))
																																																				.isDone()) {
																																																	if (entity instanceof ServerPlayer _plr47
																																																			&& _plr47.level() instanceof ServerLevel
																																																			&& _plr47.getAdvancements()
																																																					.getOrStartProgress(_plr47.server
																																																							.getAdvancements()
																																																							.get(ResourceLocation.parse(
																																																									"allaboutengie:antimatter_monstrosity_engie_tools_obtained")))
																																																					.isDone()) {
																																																		if (entity instanceof ServerPlayer _plr48
																																																				&& _plr48.level() instanceof ServerLevel
																																																				&& _plr48.getAdvancements()
																																																						.getOrStartProgress(_plr48.server
																																																								.getAdvancements()
																																																								.get(ResourceLocation
																																																										.parse("allaboutengie:antimatter_engie_armor_made")))
																																																						.isDone()) {
																																																			if (entity instanceof ServerPlayer _plr49
																																																					&& _plr49
																																																							.level() instanceof ServerLevel
																																																					&& _plr49.getAdvancements()
																																																							.getOrStartProgress(
																																																									_plr49.server
																																																											.getAdvancements()
																																																											.get(ResourceLocation
																																																													.parse("allaboutengie:antimatter_angry_engie_armor_made")))
																																																							.isDone()) {
																																																				if (entity instanceof ServerPlayer _plr50
																																																						&& _plr50
																																																								.level() instanceof ServerLevel
																																																						&& _plr50.getAdvancements()
																																																								.getOrStartProgress(
																																																										_plr50.server
																																																												.getAdvancements()
																																																												.get(ResourceLocation
																																																														.parse("allaboutengie:antimatter_enraged_engie_armor_made")))
																																																								.isDone()) {
																																																					if (entity instanceof ServerPlayer _plr51
																																																							&& _plr51
																																																									.level() instanceof ServerLevel
																																																							&& _plr51.getAdvancements()
																																																									.getOrStartProgress(
																																																											_plr51.server
																																																													.getAdvancements()
																																																													.get(ResourceLocation
																																																															.parse("allaboutengie:antimatter_outraged_engie_armor_obtained")))
																																																									.isDone()) {
																																																						if (entity instanceof ServerPlayer _plr52
																																																								&& _plr52
																																																										.level() instanceof ServerLevel
																																																								&& _plr52
																																																										.getAdvancements()
																																																										.getOrStartProgress(
																																																												_plr52.server
																																																														.getAdvancements()
																																																														.get(ResourceLocation
																																																																.parse("allaboutengie:antimatter_biblically_accurate_tools_obtained")))
																																																										.isDone()) {
																																																							if (entity instanceof ServerPlayer _plr53
																																																									&& _plr53
																																																											.level() instanceof ServerLevel
																																																									&& _plr53
																																																											.getAdvancements()
																																																											.getOrStartProgress(
																																																													_plr53.server
																																																															.getAdvancements()
																																																															.get(ResourceLocation
																																																																	.parse("allaboutengie:antimatter_monstrosity_engie_tools_obtained")))
																																																											.isDone()) {
																																																								if (entity instanceof ServerPlayer _plr54
																																																										&& _plr54
																																																												.level() instanceof ServerLevel
																																																										&& _plr54
																																																												.getAdvancements()
																																																												.getOrStartProgress(
																																																														_plr54.server
																																																																.getAdvancements()
																																																																.get(ResourceLocation
																																																																		.parse("allaboutengie:antimatter_mini_ban_obtain")))
																																																												.isDone()) {
																																																									if (entity instanceof ServerPlayer _plr55
																																																											&& _plr55
																																																													.level() instanceof ServerLevel
																																																											&& _plr55
																																																													.getAdvancements()
																																																													.getOrStartProgress(
																																																															_plr55.server
																																																																	.getAdvancements()
																																																																	.get(ResourceLocation
																																																																			.parse("allaboutengie:antimatter_ban_obtain")))
																																																													.isDone()) {
																																																										if (entity instanceof ServerPlayer _plr56
																																																												&& _plr56
																																																														.level() instanceof ServerLevel
																																																												&& _plr56
																																																														.getAdvancements()
																																																														.getOrStartProgress(
																																																																_plr56.server
																																																																		.getAdvancements()
																																																																		.get(ResourceLocation
																																																																				.parse("allaboutengie:antimatter_big_ban_obtain")))
																																																														.isDone()) {
																																																											if (entity instanceof ServerPlayer _plr57
																																																													&& _plr57
																																																															.level() instanceof ServerLevel
																																																													&& _plr57
																																																															.getAdvancements()
																																																															.getOrStartProgress(
																																																																	_plr57.server
																																																																			.getAdvancements()
																																																																			.get(ResourceLocation
																																																																					.parse("allaboutengie:antimatter_large_ban_obtain")))
																																																															.isDone()) {
																																																												if (entity instanceof ServerPlayer _plr58
																																																														&& _plr58
																																																																.level() instanceof ServerLevel
																																																														&& _plr58
																																																																.getAdvancements()
																																																																.getOrStartProgress(
																																																																		_plr58.server
																																																																				.getAdvancements()
																																																																				.get(ResourceLocation
																																																																						.parse("allaboutengie:antimatter_huge_ban_obtain")))
																																																																.isDone()) {
																																																													if (entity instanceof ServerPlayer _plr59
																																																															&& _plr59
																																																																	.level() instanceof ServerLevel
																																																															&& _plr59
																																																																	.getAdvancements()
																																																																	.getOrStartProgress(
																																																																			_plr59.server
																																																																					.getAdvancements()
																																																																					.get(ResourceLocation
																																																																							.parse("allaboutengie:antimatter_enormous_ban_obtain")))
																																																																	.isDone()) {
																																																														if (entity instanceof ServerPlayer _plr60
																																																																&& _plr60
																																																																		.level() instanceof ServerLevel
																																																																&& _plr60
																																																																		.getAdvancements()
																																																																		.getOrStartProgress(
																																																																				_plr60.server
																																																																						.getAdvancements()
																																																																						.get(ResourceLocation
																																																																								.parse("allaboutengie:antimatter_gigantic_ban_obtain")))
																																																																		.isDone()) {
																																																															if (entity instanceof ServerPlayer _plr61
																																																																	&& _plr61
																																																																			.level() instanceof ServerLevel
																																																																	&& _plr61
																																																																			.getAdvancements()
																																																																			.getOrStartProgress(
																																																																					_plr61.server
																																																																							.getAdvancements()
																																																																							.get(ResourceLocation
																																																																									.parse("allaboutengie:antimatter_massive_ban_obtain")))
																																																																			.isDone()) {
																																																																if (entity instanceof ServerPlayer _plr62
																																																																		&& _plr62
																																																																				.level() instanceof ServerLevel
																																																																		&& _plr62
																																																																				.getAdvancements()
																																																																				.getOrStartProgress(
																																																																						_plr62.server
																																																																								.getAdvancements()
																																																																								.get(ResourceLocation
																																																																										.parse("allaboutengie:antimatter_biblically_accurate_ban_obtain")))
																																																																				.isDone()) {
																																																																	if (entity instanceof ServerPlayer _plr63
																																																																			&& _plr63
																																																																					.level() instanceof ServerLevel
																																																																			&& _plr63
																																																																					.getAdvancements()
																																																																					.getOrStartProgress(
																																																																							_plr63.server
																																																																									.getAdvancements()
																																																																									.get(ResourceLocation
																																																																											.parse("allaboutengie:antimatter_monstrosity_ban_obtain")))
																																																																					.isDone()) {
																																																																		if (entity instanceof ServerPlayer _plr64
																																																																				&& _plr64
																																																																						.level() instanceof ServerLevel
																																																																				&& _plr64
																																																																						.getAdvancements()
																																																																						.getOrStartProgress(
																																																																								_plr64.server
																																																																										.getAdvancements()
																																																																										.get(ResourceLocation
																																																																												.parse("allaboutengie:antimatter_doomsday_ban_scythe_obtain")))
																																																																						.isDone()) {
																																																																			if (entity instanceof ServerPlayer _plr65
																																																																					&& _plr65
																																																																							.level() instanceof ServerLevel
																																																																					&& _plr65
																																																																							.getAdvancements()
																																																																							.getOrStartProgress(
																																																																									_plr65.server
																																																																											.getAdvancements()
																																																																											.get(ResourceLocation
																																																																													.parse("allaboutengie:antimatter_super_doomsday_ban_scythe_obtain")))
																																																																							.isDone()) {
																																																																				if (entity instanceof ServerPlayer _plr66
																																																																						&& _plr66
																																																																								.level() instanceof ServerLevel
																																																																						&& _plr66
																																																																								.getAdvancements()
																																																																								.getOrStartProgress(
																																																																										_plr66.server
																																																																												.getAdvancements()
																																																																												.get(ResourceLocation
																																																																														.parse("allaboutengie:antimatter_the_end_ban_scythe_obtain")))
																																																																								.isDone()) {
																																																																					if (entity instanceof ServerPlayer _plr67
																																																																							&& _plr67
																																																																									.level() instanceof ServerLevel
																																																																							&& _plr67
																																																																									.getAdvancements()
																																																																									.getOrStartProgress(
																																																																											_plr67.server
																																																																													.getAdvancements()
																																																																													.get(ResourceLocation
																																																																															.parse("allaboutengie:antimatter_engies_ban_scythe_obtain")))
																																																																									.isDone()) {
																																																																						if (entity instanceof ServerPlayer _plr68
																																																																								&& _plr68
																																																																										.level() instanceof ServerLevel
																																																																								&& _plr68
																																																																										.getAdvancements()
																																																																										.getOrStartProgress(
																																																																												_plr68.server
																																																																														.getAdvancements()
																																																																														.get(ResourceLocation
																																																																																.parse("allaboutengie:antimatter_engie_games_sword_obtain")))
																																																																										.isDone()) {
																																																																							if ((world instanceof ServerLevel _serverLevelGR69
																																																																									&& _serverLevelGR69
																																																																											.getGameRules()
																																																																											.getBoolean(
																																																																													AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true) {
																																																																								if (entity instanceof ServerPlayer _plr70
																																																																										&& _plr70
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr70
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr70.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:conqueror")))
																																																																												.isDone()) {
																																																																									if (entity instanceof ServerPlayer _plr71
																																																																											&& _plr71
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr71
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr71.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:rise")))
																																																																													.isDone()) {
																																																																										if (entity instanceof ServerPlayer _plr72
																																																																												&& _plr72
																																																																														.level() instanceof ServerLevel
																																																																												&& _plr72
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_plr72.server
																																																																																		.getAdvancements()
																																																																																		.get(ResourceLocation
																																																																																				.parse("allaboutengie:sdday_conqueror")))
																																																																														.isDone()) {
																																																																											if (!(entity instanceof ServerPlayer _plr73
																																																																													&& _plr73
																																																																															.level() instanceof ServerLevel
																																																																													&& _plr73
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_plr73.server
																																																																																			.getAdvancements()
																																																																																			.get(ResourceLocation
																																																																																					.parse("allaboutengie:all_done")))
																																																																															.isDone())) {
																																																																												if (entity instanceof ServerPlayer _player) {
																																																																													AdvancementHolder _adv = _player.server
																																																																															.getAdvancements()
																																																																															.get(ResourceLocation
																																																																																	.parse("allaboutengie:all_done"));
																																																																													if (_adv != null) {
																																																																														AdvancementProgress _ap = _player
																																																																																.getAdvancements()
																																																																																.getOrStartProgress(
																																																																																		_adv);
																																																																														if (!_ap.isDone()) {
																																																																															for (String criteria : _ap
																																																																																	.getRemainingCriteria())
																																																																																_player.getAdvancements()
																																																																																		.award(_adv,
																																																																																				criteria);
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																											if (entity instanceof ServerPlayer _plr75
																																																																													&& _plr75
																																																																															.level() instanceof ServerLevel
																																																																													&& _plr75
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_plr75.server
																																																																																			.getAdvancements()
																																																																																			.get(ResourceLocation
																																																																																					.parse("allaboutengie:secret_advancements_completed")))
																																																																															.isDone()) {
																																																																												if (!(entity instanceof ServerPlayer _plr76
																																																																														&& _plr76
																																																																																.level() instanceof ServerLevel
																																																																														&& _plr76
																																																																																.getAdvancements()
																																																																																.getOrStartProgress(
																																																																																		_plr76.server
																																																																																				.getAdvancements()
																																																																																				.get(ResourceLocation
																																																																																						.parse("allaboutengie:all_fully_done")))
																																																																																.isDone())) {
																																																																													if (entity instanceof ServerPlayer _player) {
																																																																														AdvancementHolder _adv = _player.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:all_fully_done"));
																																																																														if (_adv != null) {
																																																																															AdvancementProgress _ap = _player
																																																																																	.getAdvancements()
																																																																																	.getOrStartProgress(
																																																																																			_adv);
																																																																															if (!_ap.isDone()) {
																																																																																for (String criteria : _ap
																																																																																		.getRemainingCriteria())
																																																																																	_player.getAdvancements()
																																																																																			.award(_adv,
																																																																																					criteria);
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							} else if (AllaboutengieModVariables.MapVariables
																																																																									.get(world).ChallengeToggle == true
																																																																									&& (world instanceof ServerLevel _serverLevelGR78
																																																																											&& _serverLevelGR78
																																																																													.getGameRules()
																																																																													.getBoolean(
																																																																															AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true) {
																																																																								if (entity instanceof ServerPlayer _plr79
																																																																										&& _plr79
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr79
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr79.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:mini_ban_challenge_obtain")))
																																																																												.isDone()) {
																																																																									if (entity instanceof ServerPlayer _plr80
																																																																											&& _plr80
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr80
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr80.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:ban_challenge_obtain")))
																																																																													.isDone()) {
																																																																										if (entity instanceof ServerPlayer _plr81
																																																																												&& _plr81
																																																																														.level() instanceof ServerLevel
																																																																												&& _plr81
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_plr81.server
																																																																																		.getAdvancements()
																																																																																		.get(ResourceLocation
																																																																																				.parse("allaboutengie:big_ban_challenge_obtain")))
																																																																														.isDone()) {
																																																																											if (entity instanceof ServerPlayer _plr82
																																																																													&& _plr82
																																																																															.level() instanceof ServerLevel
																																																																													&& _plr82
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_plr82.server
																																																																																			.getAdvancements()
																																																																																			.get(ResourceLocation
																																																																																					.parse("allaboutengie:large_ban_challenge_obtain")))
																																																																															.isDone()) {
																																																																												if (entity instanceof ServerPlayer _plr83
																																																																														&& _plr83
																																																																																.level() instanceof ServerLevel
																																																																														&& _plr83
																																																																																.getAdvancements()
																																																																																.getOrStartProgress(
																																																																																		_plr83.server
																																																																																				.getAdvancements()
																																																																																				.get(ResourceLocation
																																																																																						.parse("allaboutengie:huge_ban_challenge_obtain")))
																																																																																.isDone()) {
																																																																													if (entity instanceof ServerPlayer _plr84
																																																																															&& _plr84
																																																																																	.level() instanceof ServerLevel
																																																																															&& _plr84
																																																																																	.getAdvancements()
																																																																																	.getOrStartProgress(
																																																																																			_plr84.server
																																																																																					.getAdvancements()
																																																																																					.get(ResourceLocation
																																																																																							.parse("allaboutengie:enormous_ban_challenge_obtain")))
																																																																																	.isDone()) {
																																																																														if (entity instanceof ServerPlayer _plr85
																																																																																&& _plr85
																																																																																		.level() instanceof ServerLevel
																																																																																&& _plr85
																																																																																		.getAdvancements()
																																																																																		.getOrStartProgress(
																																																																																				_plr85.server
																																																																																						.getAdvancements()
																																																																																						.get(ResourceLocation
																																																																																								.parse("allaboutengie:gigantic_ban_challenge_obtain")))
																																																																																		.isDone()) {
																																																																															if (entity instanceof ServerPlayer _plr86
																																																																																	&& _plr86
																																																																																			.level() instanceof ServerLevel
																																																																																	&& _plr86
																																																																																			.getAdvancements()
																																																																																			.getOrStartProgress(
																																																																																					_plr86.server
																																																																																							.getAdvancements()
																																																																																							.get(ResourceLocation
																																																																																									.parse("allaboutengie:massive_ban_challenge_obtain")))
																																																																																			.isDone()) {
																																																																																if (entity instanceof ServerPlayer _plr87
																																																																																		&& _plr87
																																																																																				.level() instanceof ServerLevel
																																																																																		&& _plr87
																																																																																				.getAdvancements()
																																																																																				.getOrStartProgress(
																																																																																						_plr87.server
																																																																																								.getAdvancements()
																																																																																								.get(ResourceLocation
																																																																																										.parse("allaboutengie:biblically_accurate_ban_challenge_obtain")))
																																																																																				.isDone()) {
																																																																																	if (entity instanceof ServerPlayer _plr88
																																																																																			&& _plr88
																																																																																					.level() instanceof ServerLevel
																																																																																			&& _plr88
																																																																																					.getAdvancements()
																																																																																					.getOrStartProgress(
																																																																																							_plr88.server
																																																																																									.getAdvancements()
																																																																																									.get(ResourceLocation
																																																																																											.parse("allaboutengie:monstrosity_ban_challenge_obtain")))
																																																																																					.isDone()) {
																																																																																		if (entity instanceof ServerPlayer _plr89
																																																																																				&& _plr89
																																																																																						.level() instanceof ServerLevel
																																																																																				&& _plr89
																																																																																						.getAdvancements()
																																																																																						.getOrStartProgress(
																																																																																								_plr89.server
																																																																																										.getAdvancements()
																																																																																										.get(ResourceLocation
																																																																																												.parse("allaboutengie:challenge_destroyed")))
																																																																																						.isDone()
																																																																																				|| entity instanceof ServerPlayer _plr90
																																																																																						&& _plr90
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr90
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr90.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:challenge_destroyed_2")))
																																																																																								.isDone()) {
																																																																																			if (entity instanceof ServerPlayer _plr91
																																																																																					&& _plr91
																																																																																							.level() instanceof ServerLevel
																																																																																					&& _plr91
																																																																																							.getAdvancements()
																																																																																							.getOrStartProgress(
																																																																																									_plr91.server
																																																																																											.getAdvancements()
																																																																																											.get(ResourceLocation
																																																																																													.parse("allaboutengie:conqueror")))
																																																																																							.isDone()) {
																																																																																				if (entity instanceof ServerPlayer _plr92
																																																																																						&& _plr92
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr92
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr92.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:rise")))
																																																																																								.isDone()) {
																																																																																					if (entity instanceof ServerPlayer _plr93
																																																																																							&& _plr93
																																																																																									.level() instanceof ServerLevel
																																																																																							&& _plr93
																																																																																									.getAdvancements()
																																																																																									.getOrStartProgress(
																																																																																											_plr93.server
																																																																																													.getAdvancements()
																																																																																													.get(ResourceLocation
																																																																																															.parse("allaboutengie:sdday_conqueror")))
																																																																																									.isDone()) {
																																																																																						if (!(entity instanceof ServerPlayer _plr94
																																																																																								&& _plr94
																																																																																										.level() instanceof ServerLevel
																																																																																								&& _plr94
																																																																																										.getAdvancements()
																																																																																										.getOrStartProgress(
																																																																																												_plr94.server
																																																																																														.getAdvancements()
																																																																																														.get(ResourceLocation
																																																																																																.parse("allaboutengie:all_done")))
																																																																																										.isDone())) {
																																																																																							if (entity instanceof ServerPlayer _player) {
																																																																																								AdvancementHolder _adv = _player.server
																																																																																										.getAdvancements()
																																																																																										.get(ResourceLocation
																																																																																												.parse("allaboutengie:all_done"));
																																																																																								if (_adv != null) {
																																																																																									AdvancementProgress _ap = _player
																																																																																											.getAdvancements()
																																																																																											.getOrStartProgress(
																																																																																													_adv);
																																																																																									if (!_ap.isDone()) {
																																																																																										for (String criteria : _ap
																																																																																												.getRemainingCriteria())
																																																																																											_player.getAdvancements()
																																																																																													.award(_adv,
																																																																																															criteria);
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																						if (entity instanceof ServerPlayer _plr96
																																																																																								&& _plr96
																																																																																										.level() instanceof ServerLevel
																																																																																								&& _plr96
																																																																																										.getAdvancements()
																																																																																										.getOrStartProgress(
																																																																																												_plr96.server
																																																																																														.getAdvancements()
																																																																																														.get(ResourceLocation
																																																																																																.parse("allaboutengie:secret_advancements_completed")))
																																																																																										.isDone()) {
																																																																																							if (!(entity instanceof ServerPlayer _plr97
																																																																																									&& _plr97
																																																																																											.level() instanceof ServerLevel
																																																																																									&& _plr97
																																																																																											.getAdvancements()
																																																																																											.getOrStartProgress(
																																																																																													_plr97.server
																																																																																															.getAdvancements()
																																																																																															.get(ResourceLocation
																																																																																																	.parse("allaboutengie:all_fully_done")))
																																																																																											.isDone())) {
																																																																																								if (entity instanceof ServerPlayer _player) {
																																																																																									AdvancementHolder _adv = _player.server
																																																																																											.getAdvancements()
																																																																																											.get(ResourceLocation
																																																																																													.parse("allaboutengie:all_fully_done"));
																																																																																									if (_adv != null) {
																																																																																										AdvancementProgress _ap = _player
																																																																																												.getAdvancements()
																																																																																												.getOrStartProgress(
																																																																																														_adv);
																																																																																										if (!_ap.isDone()) {
																																																																																											for (String criteria : _ap
																																																																																													.getRemainingCriteria())
																																																																																												_player.getAdvancements()
																																																																																														.award(_adv,
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
																																																																							} else if (AllaboutengieModVariables.MapVariables
																																																																									.get(world).ChallengeToggle == true
																																																																									&& (world instanceof ServerLevel _serverLevelGR99
																																																																											&& _serverLevelGR99
																																																																													.getGameRules()
																																																																													.getBoolean(
																																																																															AllaboutengieModGameRules.DETECTIVE_MODE)) == true) {
																																																																								if (entity instanceof ServerPlayer _plr100
																																																																										&& _plr100
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr100
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr100.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:mini_ban_challenge_obtain")))
																																																																												.isDone()) {
																																																																									if (entity instanceof ServerPlayer _plr101
																																																																											&& _plr101
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr101
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr101.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:ban_challenge_obtain")))
																																																																													.isDone()) {
																																																																										if (entity instanceof ServerPlayer _plr102
																																																																												&& _plr102
																																																																														.level() instanceof ServerLevel
																																																																												&& _plr102
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_plr102.server
																																																																																		.getAdvancements()
																																																																																		.get(ResourceLocation
																																																																																				.parse("allaboutengie:big_ban_challenge_obtain")))
																																																																														.isDone()) {
																																																																											if (entity instanceof ServerPlayer _plr103
																																																																													&& _plr103
																																																																															.level() instanceof ServerLevel
																																																																													&& _plr103
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_plr103.server
																																																																																			.getAdvancements()
																																																																																			.get(ResourceLocation
																																																																																					.parse("allaboutengie:large_ban_challenge_obtain")))
																																																																															.isDone()) {
																																																																												if (entity instanceof ServerPlayer _plr104
																																																																														&& _plr104
																																																																																.level() instanceof ServerLevel
																																																																														&& _plr104
																																																																																.getAdvancements()
																																																																																.getOrStartProgress(
																																																																																		_plr104.server
																																																																																				.getAdvancements()
																																																																																				.get(ResourceLocation
																																																																																						.parse("allaboutengie:huge_ban_challenge_obtain")))
																																																																																.isDone()) {
																																																																													if (entity instanceof ServerPlayer _plr105
																																																																															&& _plr105
																																																																																	.level() instanceof ServerLevel
																																																																															&& _plr105
																																																																																	.getAdvancements()
																																																																																	.getOrStartProgress(
																																																																																			_plr105.server
																																																																																					.getAdvancements()
																																																																																					.get(ResourceLocation
																																																																																							.parse("allaboutengie:enormous_ban_challenge_obtain")))
																																																																																	.isDone()) {
																																																																														if (entity instanceof ServerPlayer _plr106
																																																																																&& _plr106
																																																																																		.level() instanceof ServerLevel
																																																																																&& _plr106
																																																																																		.getAdvancements()
																																																																																		.getOrStartProgress(
																																																																																				_plr106.server
																																																																																						.getAdvancements()
																																																																																						.get(ResourceLocation
																																																																																								.parse("allaboutengie:gigantic_ban_challenge_obtain")))
																																																																																		.isDone()) {
																																																																															if (entity instanceof ServerPlayer _plr107
																																																																																	&& _plr107
																																																																																			.level() instanceof ServerLevel
																																																																																	&& _plr107
																																																																																			.getAdvancements()
																																																																																			.getOrStartProgress(
																																																																																					_plr107.server
																																																																																							.getAdvancements()
																																																																																							.get(ResourceLocation
																																																																																									.parse("allaboutengie:massive_ban_challenge_obtain")))
																																																																																			.isDone()) {
																																																																																if (entity instanceof ServerPlayer _plr108
																																																																																		&& _plr108
																																																																																				.level() instanceof ServerLevel
																																																																																		&& _plr108
																																																																																				.getAdvancements()
																																																																																				.getOrStartProgress(
																																																																																						_plr108.server
																																																																																								.getAdvancements()
																																																																																								.get(ResourceLocation
																																																																																										.parse("allaboutengie:biblically_accurate_ban_challenge_obtain")))
																																																																																				.isDone()) {
																																																																																	if (entity instanceof ServerPlayer _plr109
																																																																																			&& _plr109
																																																																																					.level() instanceof ServerLevel
																																																																																			&& _plr109
																																																																																					.getAdvancements()
																																																																																					.getOrStartProgress(
																																																																																							_plr109.server
																																																																																									.getAdvancements()
																																																																																									.get(ResourceLocation
																																																																																											.parse("allaboutengie:monstrosity_ban_challenge_obtain")))
																																																																																					.isDone()) {
																																																																																		if (entity instanceof ServerPlayer _plr110
																																																																																				&& _plr110
																																																																																						.level() instanceof ServerLevel
																																																																																				&& _plr110
																																																																																						.getAdvancements()
																																																																																						.getOrStartProgress(
																																																																																								_plr110.server
																																																																																										.getAdvancements()
																																																																																										.get(ResourceLocation
																																																																																												.parse("allaboutengie:challenge_destroyed")))
																																																																																						.isDone()
																																																																																				|| entity instanceof ServerPlayer _plr111
																																																																																						&& _plr111
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr111
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr111.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:challenge_destroyed_2")))
																																																																																								.isDone()) {
																																																																																			if (entity instanceof ServerPlayer _plr112
																																																																																					&& _plr112
																																																																																							.level() instanceof ServerLevel
																																																																																					&& _plr112
																																																																																							.getAdvancements()
																																																																																							.getOrStartProgress(
																																																																																									_plr112.server
																																																																																											.getAdvancements()
																																																																																											.get(ResourceLocation
																																																																																													.parse("allaboutengie:found_engie")))
																																																																																							.isDone()) {
																																																																																				if (!(entity instanceof ServerPlayer _plr113
																																																																																						&& _plr113
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr113
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr113.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:all_done")))
																																																																																								.isDone())) {
																																																																																					if (entity instanceof ServerPlayer _player) {
																																																																																						AdvancementHolder _adv = _player.server
																																																																																								.getAdvancements()
																																																																																								.get(ResourceLocation
																																																																																										.parse("allaboutengie:all_done"));
																																																																																						if (_adv != null) {
																																																																																							AdvancementProgress _ap = _player
																																																																																									.getAdvancements()
																																																																																									.getOrStartProgress(
																																																																																											_adv);
																																																																																							if (!_ap.isDone()) {
																																																																																								for (String criteria : _ap
																																																																																										.getRemainingCriteria())
																																																																																									_player.getAdvancements()
																																																																																											.award(_adv,
																																																																																													criteria);
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																				if (entity instanceof ServerPlayer _plr115
																																																																																						&& _plr115
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr115
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr115.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:secret_advancements_completed")))
																																																																																								.isDone()) {
																																																																																					if (!(entity instanceof ServerPlayer _plr116
																																																																																							&& _plr116
																																																																																									.level() instanceof ServerLevel
																																																																																							&& _plr116
																																																																																									.getAdvancements()
																																																																																									.getOrStartProgress(
																																																																																											_plr116.server
																																																																																													.getAdvancements()
																																																																																													.get(ResourceLocation
																																																																																															.parse("allaboutengie:all_fully_done")))
																																																																																									.isDone())) {
																																																																																						if (entity instanceof ServerPlayer _player) {
																																																																																							AdvancementHolder _adv = _player.server
																																																																																									.getAdvancements()
																																																																																									.get(ResourceLocation
																																																																																											.parse("allaboutengie:all_fully_done"));
																																																																																							if (_adv != null) {
																																																																																								AdvancementProgress _ap = _player
																																																																																										.getAdvancements()
																																																																																										.getOrStartProgress(
																																																																																												_adv);
																																																																																								if (!_ap.isDone()) {
																																																																																									for (String criteria : _ap
																																																																																											.getRemainingCriteria())
																																																																																										_player.getAdvancements()
																																																																																												.award(_adv,
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
																																																																							} else if ((world instanceof ServerLevel _serverLevelGR118
																																																																									&& _serverLevelGR118
																																																																											.getGameRules()
																																																																											.getBoolean(
																																																																													AllaboutengieModGameRules.DETECTIVE_MODE)) == true
																																																																									&& AllaboutengieModVariables.MapVariables
																																																																											.get(world).ChallengeToggle == true
																																																																									&& (world instanceof ServerLevel _serverLevelGR119
																																																																											&& _serverLevelGR119
																																																																													.getGameRules()
																																																																													.getBoolean(
																																																																															AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true) {
																																																																								if (entity instanceof ServerPlayer _plr120
																																																																										&& _plr120
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr120
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr120.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:mini_ban_challenge_obtain")))
																																																																												.isDone()) {
																																																																									if (entity instanceof ServerPlayer _plr121
																																																																											&& _plr121
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr121
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr121.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:ban_challenge_obtain")))
																																																																													.isDone()) {
																																																																										if (entity instanceof ServerPlayer _plr122
																																																																												&& _plr122
																																																																														.level() instanceof ServerLevel
																																																																												&& _plr122
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_plr122.server
																																																																																		.getAdvancements()
																																																																																		.get(ResourceLocation
																																																																																				.parse("allaboutengie:big_ban_challenge_obtain")))
																																																																														.isDone()) {
																																																																											if (entity instanceof ServerPlayer _plr123
																																																																													&& _plr123
																																																																															.level() instanceof ServerLevel
																																																																													&& _plr123
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_plr123.server
																																																																																			.getAdvancements()
																																																																																			.get(ResourceLocation
																																																																																					.parse("allaboutengie:large_ban_challenge_obtain")))
																																																																															.isDone()) {
																																																																												if (entity instanceof ServerPlayer _plr124
																																																																														&& _plr124
																																																																																.level() instanceof ServerLevel
																																																																														&& _plr124
																																																																																.getAdvancements()
																																																																																.getOrStartProgress(
																																																																																		_plr124.server
																																																																																				.getAdvancements()
																																																																																				.get(ResourceLocation
																																																																																						.parse("allaboutengie:huge_ban_challenge_obtain")))
																																																																																.isDone()) {
																																																																													if (entity instanceof ServerPlayer _plr125
																																																																															&& _plr125
																																																																																	.level() instanceof ServerLevel
																																																																															&& _plr125
																																																																																	.getAdvancements()
																																																																																	.getOrStartProgress(
																																																																																			_plr125.server
																																																																																					.getAdvancements()
																																																																																					.get(ResourceLocation
																																																																																							.parse("allaboutengie:enormous_ban_challenge_obtain")))
																																																																																	.isDone()) {
																																																																														if (entity instanceof ServerPlayer _plr126
																																																																																&& _plr126
																																																																																		.level() instanceof ServerLevel
																																																																																&& _plr126
																																																																																		.getAdvancements()
																																																																																		.getOrStartProgress(
																																																																																				_plr126.server
																																																																																						.getAdvancements()
																																																																																						.get(ResourceLocation
																																																																																								.parse("allaboutengie:gigantic_ban_challenge_obtain")))
																																																																																		.isDone()) {
																																																																															if (entity instanceof ServerPlayer _plr127
																																																																																	&& _plr127
																																																																																			.level() instanceof ServerLevel
																																																																																	&& _plr127
																																																																																			.getAdvancements()
																																																																																			.getOrStartProgress(
																																																																																					_plr127.server
																																																																																							.getAdvancements()
																																																																																							.get(ResourceLocation
																																																																																									.parse("allaboutengie:massive_ban_challenge_obtain")))
																																																																																			.isDone()) {
																																																																																if (entity instanceof ServerPlayer _plr128
																																																																																		&& _plr128
																																																																																				.level() instanceof ServerLevel
																																																																																		&& _plr128
																																																																																				.getAdvancements()
																																																																																				.getOrStartProgress(
																																																																																						_plr128.server
																																																																																								.getAdvancements()
																																																																																								.get(ResourceLocation
																																																																																										.parse("allaboutengie:biblically_accurate_ban_challenge_obtain")))
																																																																																				.isDone()) {
																																																																																	if (entity instanceof ServerPlayer _plr129
																																																																																			&& _plr129
																																																																																					.level() instanceof ServerLevel
																																																																																			&& _plr129
																																																																																					.getAdvancements()
																																																																																					.getOrStartProgress(
																																																																																							_plr129.server
																																																																																									.getAdvancements()
																																																																																									.get(ResourceLocation
																																																																																											.parse("allaboutengie:monstrosity_ban_challenge_obtain")))
																																																																																					.isDone()) {
																																																																																		if (entity instanceof ServerPlayer _plr130
																																																																																				&& _plr130
																																																																																						.level() instanceof ServerLevel
																																																																																				&& _plr130
																																																																																						.getAdvancements()
																																																																																						.getOrStartProgress(
																																																																																								_plr130.server
																																																																																										.getAdvancements()
																																																																																										.get(ResourceLocation
																																																																																												.parse("allaboutengie:challenge_destroyed")))
																																																																																						.isDone()
																																																																																				|| entity instanceof ServerPlayer _plr131
																																																																																						&& _plr131
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr131
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr131.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:challenge_destroyed_2")))
																																																																																								.isDone()) {
																																																																																			if (entity instanceof ServerPlayer _plr132
																																																																																					&& _plr132
																																																																																							.level() instanceof ServerLevel
																																																																																					&& _plr132
																																																																																							.getAdvancements()
																																																																																							.getOrStartProgress(
																																																																																									_plr132.server
																																																																																											.getAdvancements()
																																																																																											.get(ResourceLocation
																																																																																													.parse("allaboutengie:conqueror")))
																																																																																							.isDone()) {
																																																																																				if (entity instanceof ServerPlayer _plr133
																																																																																						&& _plr133
																																																																																								.level() instanceof ServerLevel
																																																																																						&& _plr133
																																																																																								.getAdvancements()
																																																																																								.getOrStartProgress(
																																																																																										_plr133.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:rise")))
																																																																																								.isDone()) {
																																																																																					if (entity instanceof ServerPlayer _plr134
																																																																																							&& _plr134
																																																																																									.level() instanceof ServerLevel
																																																																																							&& _plr134
																																																																																									.getAdvancements()
																																																																																									.getOrStartProgress(
																																																																																											_plr134.server
																																																																																													.getAdvancements()
																																																																																													.get(ResourceLocation
																																																																																															.parse("allaboutengie:sdday_conqueror")))
																																																																																									.isDone()) {
																																																																																						if (entity instanceof ServerPlayer _plr135
																																																																																								&& _plr135
																																																																																										.level() instanceof ServerLevel
																																																																																								&& _plr135
																																																																																										.getAdvancements()
																																																																																										.getOrStartProgress(
																																																																																												_plr135.server
																																																																																														.getAdvancements()
																																																																																														.get(ResourceLocation
																																																																																																.parse("allaboutengie:found_engie")))
																																																																																										.isDone()) {
																																																																																							if (!(entity instanceof ServerPlayer _plr136
																																																																																									&& _plr136
																																																																																											.level() instanceof ServerLevel
																																																																																									&& _plr136
																																																																																											.getAdvancements()
																																																																																											.getOrStartProgress(
																																																																																													_plr136.server
																																																																																															.getAdvancements()
																																																																																															.get(ResourceLocation
																																																																																																	.parse("allaboutengie:all_done")))
																																																																																											.isDone())) {
																																																																																								if (entity instanceof ServerPlayer _player) {
																																																																																									AdvancementHolder _adv = _player.server
																																																																																											.getAdvancements()
																																																																																											.get(ResourceLocation
																																																																																													.parse("allaboutengie:all_done"));
																																																																																									if (_adv != null) {
																																																																																										AdvancementProgress _ap = _player
																																																																																												.getAdvancements()
																																																																																												.getOrStartProgress(
																																																																																														_adv);
																																																																																										if (!_ap.isDone()) {
																																																																																											for (String criteria : _ap
																																																																																													.getRemainingCriteria())
																																																																																												_player.getAdvancements()
																																																																																														.award(_adv,
																																																																																																criteria);
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																							if (entity instanceof ServerPlayer _plr138
																																																																																									&& _plr138
																																																																																											.level() instanceof ServerLevel
																																																																																									&& _plr138
																																																																																											.getAdvancements()
																																																																																											.getOrStartProgress(
																																																																																													_plr138.server
																																																																																															.getAdvancements()
																																																																																															.get(ResourceLocation
																																																																																																	.parse("allaboutengie:secret_advancements_completed")))
																																																																																											.isDone()) {
																																																																																								if (!(entity instanceof ServerPlayer _plr139
																																																																																										&& _plr139
																																																																																												.level() instanceof ServerLevel
																																																																																										&& _plr139
																																																																																												.getAdvancements()
																																																																																												.getOrStartProgress(
																																																																																														_plr139.server
																																																																																																.getAdvancements()
																																																																																																.get(ResourceLocation
																																																																																																		.parse("allaboutengie:all_fully_done")))
																																																																																												.isDone())) {
																																																																																									if (entity instanceof ServerPlayer _player) {
																																																																																										AdvancementHolder _adv = _player.server
																																																																																												.getAdvancements()
																																																																																												.get(ResourceLocation
																																																																																														.parse("allaboutengie:all_fully_done"));
																																																																																										if (_adv != null) {
																																																																																											AdvancementProgress _ap = _player
																																																																																													.getAdvancements()
																																																																																													.getOrStartProgress(
																																																																																															_adv);
																																																																																											if (!_ap.isDone()) {
																																																																																												for (String criteria : _ap
																																																																																														.getRemainingCriteria())
																																																																																													_player.getAdvancements()
																																																																																															.award(_adv,
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
																																																																								}
																																																																							} else if ((world instanceof ServerLevel _serverLevelGR141
																																																																									&& _serverLevelGR141
																																																																											.getGameRules()
																																																																											.getBoolean(
																																																																													AllaboutengieModGameRules.DETECTIVE_MODE)) == true) {
																																																																								if (entity instanceof ServerPlayer _plr142
																																																																										&& _plr142
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr142
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr142.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:found_engie")))
																																																																												.isDone()) {
																																																																									if (!(entity instanceof ServerPlayer _plr143
																																																																											&& _plr143
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr143
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr143.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:all_done")))
																																																																													.isDone())) {
																																																																										if (entity instanceof ServerPlayer _player) {
																																																																											AdvancementHolder _adv = _player.server
																																																																													.getAdvancements()
																																																																													.get(ResourceLocation
																																																																															.parse("allaboutengie:all_done"));
																																																																											if (_adv != null) {
																																																																												AdvancementProgress _ap = _player
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_adv);
																																																																												if (!_ap.isDone()) {
																																																																													for (String criteria : _ap
																																																																															.getRemainingCriteria())
																																																																														_player.getAdvancements()
																																																																																.award(_adv,
																																																																																		criteria);
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																									if (entity instanceof ServerPlayer _plr145
																																																																											&& _plr145
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr145
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr145.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:secret_advancements_completed")))
																																																																													.isDone()) {
																																																																										if (!(entity instanceof ServerPlayer _plr146
																																																																												&& _plr146
																																																																														.level() instanceof ServerLevel
																																																																												&& _plr146
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_plr146.server
																																																																																		.getAdvancements()
																																																																																		.get(ResourceLocation
																																																																																				.parse("allaboutengie:all_fully_done")))
																																																																														.isDone())) {
																																																																											if (entity instanceof ServerPlayer _player) {
																																																																												AdvancementHolder _adv = _player.server
																																																																														.getAdvancements()
																																																																														.get(ResourceLocation
																																																																																.parse("allaboutengie:all_fully_done"));
																																																																												if (_adv != null) {
																																																																													AdvancementProgress _ap = _player
																																																																															.getAdvancements()
																																																																															.getOrStartProgress(
																																																																																	_adv);
																																																																													if (!_ap.isDone()) {
																																																																														for (String criteria : _ap
																																																																																.getRemainingCriteria())
																																																																															_player.getAdvancements()
																																																																																	.award(_adv,
																																																																																			criteria);
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							} else {
																																																																								if (!(entity instanceof ServerPlayer _plr148
																																																																										&& _plr148
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr148
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr148.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:all_done")))
																																																																												.isDone())) {
																																																																									if (entity instanceof ServerPlayer _player) {
																																																																										AdvancementHolder _adv = _player.server
																																																																												.getAdvancements()
																																																																												.get(ResourceLocation
																																																																														.parse("allaboutengie:all_done"));
																																																																										if (_adv != null) {
																																																																											AdvancementProgress _ap = _player
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_adv);
																																																																											if (!_ap.isDone()) {
																																																																												for (String criteria : _ap
																																																																														.getRemainingCriteria())
																																																																													_player.getAdvancements()
																																																																															.award(_adv,
																																																																																	criteria);
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																								if (entity instanceof ServerPlayer _plr150
																																																																										&& _plr150
																																																																												.level() instanceof ServerLevel
																																																																										&& _plr150
																																																																												.getAdvancements()
																																																																												.getOrStartProgress(
																																																																														_plr150.server
																																																																																.getAdvancements()
																																																																																.get(ResourceLocation
																																																																																		.parse("allaboutengie:secret_advancements_completed")))
																																																																												.isDone()) {
																																																																									if (!(entity instanceof ServerPlayer _plr151
																																																																											&& _plr151
																																																																													.level() instanceof ServerLevel
																																																																											&& _plr151
																																																																													.getAdvancements()
																																																																													.getOrStartProgress(
																																																																															_plr151.server
																																																																																	.getAdvancements()
																																																																																	.get(ResourceLocation
																																																																																			.parse("allaboutengie:all_fully_done")))
																																																																													.isDone())) {
																																																																										if (entity instanceof ServerPlayer _player) {
																																																																											AdvancementHolder _adv = _player.server
																																																																													.getAdvancements()
																																																																													.get(ResourceLocation
																																																																															.parse("allaboutengie:all_fully_done"));
																																																																											if (_adv != null) {
																																																																												AdvancementProgress _ap = _player
																																																																														.getAdvancements()
																																																																														.getOrStartProgress(
																																																																																_adv);
																																																																												if (!_ap.isDone()) {
																																																																													for (String criteria : _ap
																																																																															.getRemainingCriteria())
																																																																														_player.getAdvancements()
																																																																																.award(_adv,
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