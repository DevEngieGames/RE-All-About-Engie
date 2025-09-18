package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class AAEAllCommandsProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "MainType")).equals("Gear") || (StringArgumentType.getString(arguments, "MainType")).equals("gear")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Operator") || (StringArgumentType.getString(arguments, "AltType")).equals("operator")) {
				OperatorItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Starter") || (StringArgumentType.getString(arguments, "AltType")).equals("starter")) {
				StarterItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Developer") || (StringArgumentType.getString(arguments, "AltType")).equals("developer")) {
				DeveloperCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("IdeaGiver") || (StringArgumentType.getString(arguments, "AltType")).equals("ideagiver")) {
				IdeaGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("BetaTester") || (StringArgumentType.getString(arguments, "AltType")).equals("betatester")) {
				IdeaGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Tester") || (StringArgumentType.getString(arguments, "AltType")).equals("tester")) {
				TesterGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ContentCreator") || (StringArgumentType.getString(arguments, "AltType")).equals("contentcreator")) {
				ContentCreatorCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("RecipeBook") || (StringArgumentType.getString(arguments, "AltType")).equals("recipebook")) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @s allaboutengie:all_about_engie_recipe_book");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Bundle") || (StringArgumentType.getString(arguments, "AltType")).equals("bundle")) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @s allaboutengie:regular_engie_bundle");
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Code") || (StringArgumentType.getString(arguments, "MainType")).equals("code")) {
			if ((StringArgumentType.getString(arguments, "MainType")).equals("Redeem") || (StringArgumentType.getString(arguments, "MainType")).equals("redeem")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("ByeByeThere")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr29 && _plr29.level() instanceof ServerLevel
									&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:comically_massive_obtain"));
									if (_adv != null) {
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.coderedeemblock = true;
								_vars.syncPlayerVariables(entity);
							}
						} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr34 && _plr34.level() instanceof ServerLevel
									&& _plr34.getAdvancements().getOrStartProgress(_plr34.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:comically_massive_obtain"));
									if (_adv != null) {
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.coderedeemblock = true;
								_vars.syncPlayerVariables(entity);
							}
						} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("HeWhoGames")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_scythe");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_scythe_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("bigsharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("BigSharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("BIGSHARKO")) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("anallaboutengiechristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("ANALLABOUTENGIECHRISTMAS")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("AnAllAboutEngieChristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("happybirthdayengie")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("HappyBirthdayEngie")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("HAPPYBIRTHDAYENGIE")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("hotlinemiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("HotlineMiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("HOTLINEMIAMI2")) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("happybirthdaysaph")) {
					if ((entity.getDisplayName().getString()).equals("Two_Dragons15")) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_birthday_bundle_for_youngest");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("HappyBirthdaySaph")) {
					if ((entity.getDisplayName().getString()).equals("Two_Dragons15")) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_birthday_bundle_for_youngest");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("HAPPYBIRTHDAYSAPH")) {
					if ((entity.getDisplayName().getString()).equals("Two_Dragons15")) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_birthday_bundle_for_youngest");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:engie_plush");
							}
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Debug") || (StringArgumentType.getString(arguments, "MainType")).equals("debug")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Doomsday") || (StringArgumentType.getString(arguments, "AltType")).equals("doomsday")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("Track") || (StringArgumentType.getString(arguments, "TriType")).equals("track")) {
					if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
						{
							AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
							_vars.DoomsdayTrackToggle = false;
							_vars.syncPlayerVariables(entity);
						}
					} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == false) {
						{
							AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
							_vars.DoomsdayTrackToggle = true;
							_vars.syncPlayerVariables(entity);
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("Summon") || (StringArgumentType.getString(arguments, "TriType")).equals("summon")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("Dev")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if (world.players().size() == 1) {
						if (entity instanceof Player _playerCmd289 && _playerCmd289.hasPermissions(4)) {
							if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
								AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).thestart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
								entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
								entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
								entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"stopsound @a ambient allaboutengie:doomsday_start");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"stopsound @a ambient allaboutengie:doomsday_eerie");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
									AllaboutengieMod.queueServerWork(5, () -> {
										AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level().getServer(), _ent),
												"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else if (world.players().size() > 1) {
						if (entity instanceof Player _playerCmd303 && _playerCmd303.hasPermissions(4)) {
							if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
								AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).thestart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
								entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
								entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
								entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"stopsound @a ambient allaboutengie:doomsday_start");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"stopsound @a ambient allaboutengie:doomsday_eerie");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
									AllaboutengieMod.queueServerWork(5, () -> {
										AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level().getServer(), _ent),
												"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
							}
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("CheckTime") || (StringArgumentType.getString(arguments, "AltType")).equals("checktime")) {
				if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).timeoverlaytoggle == true) {
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.timeoverlaytoggle = false;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).timeoverlaytoggle == false) {
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.timeoverlaytoggle = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Difficulty") || (StringArgumentType.getString(arguments, "AltType")).equals("difficulty")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("Set") || (StringArgumentType.getString(arguments, "TriType")).equals("set")) {
					DifficultyDebugChangeProcedure.execute(world, arguments, entity);
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("Overlay") || (StringArgumentType.getString(arguments, "TriType")).equals("overlay")) {
					if (BoolArgumentType.getBool(arguments, "toggle") == true) {
						{
							AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
							_vars.difficultyoverlaytoggle = true;
							_vars.syncPlayerVariables(entity);
						}
					} else if (BoolArgumentType.getBool(arguments, "toggle") == false) {
						{
							AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
							_vars.difficultyoverlaytoggle = false;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).difficultyoverlaytoggle == true) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.difficultyoverlaytoggle = false;
								_vars.syncPlayerVariables(entity);
							}
						} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).difficultyoverlaytoggle == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.difficultyoverlaytoggle = false;
								_vars.syncPlayerVariables(entity);
							}
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Risk") || (StringArgumentType.getString(arguments, "MainType")).equals("risk")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Check") || (StringArgumentType.getString(arguments, "AltType")).equals("check")) {
				RiskCheckProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "TriType")).equals("Track") || (StringArgumentType.getString(arguments, "TriType")).equals("track")) {
				if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.DoomsdayRiskTrackToggle = false;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == false) {
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.DoomsdayRiskTrackToggle = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Modifier")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("SuperDoomsday") || (StringArgumentType.getString(arguments, "AltType")).equals("superdoomsday")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR337 && _serverLevelGR337.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR340 && _serverLevelGR340.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR344 && _serverLevelGR344.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR347 && _serverLevelGR347.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR351 && _serverLevelGR351.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR354 && _serverLevelGR354.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR358 && _serverLevelGR358.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR361 && _serverLevelGR361.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR365 && _serverLevelGR365.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR368 && _serverLevelGR368.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR372 && _serverLevelGR372.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR375 && _serverLevelGR375.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR379 && _serverLevelGR379.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR382 && _serverLevelGR382.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR386 && _serverLevelGR386.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR389 && _serverLevelGR389.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd393 && _playerCmd393.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR394 && _serverLevelGR394.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR397 && _serverLevelGR397.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd401 && _playerCmd401.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR402 && _serverLevelGR402.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR405 && _serverLevelGR405.getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ExtremeDoomsdayLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("extremedoomsdaylightning")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR412 && _serverLevelGR412.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR415 && _serverLevelGR415.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR419 && _serverLevelGR419.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR422 && _serverLevelGR422.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR426 && _serverLevelGR426.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR429 && _serverLevelGR429.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR433 && _serverLevelGR433.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR436 && _serverLevelGR436.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR440 && _serverLevelGR440.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR443 && _serverLevelGR443.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR447 && _serverLevelGR447.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR450 && _serverLevelGR450.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR454 && _serverLevelGR454.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR457 && _serverLevelGR457.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR461 && _serverLevelGR461.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR464 && _serverLevelGR464.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd468 && _playerCmd468.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR469 && _serverLevelGR469.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR472 && _serverLevelGR472.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd476 && _playerCmd476.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR477 && _serverLevelGR477.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR480 && _serverLevelGR480.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("HeavyLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("heavylightning")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR487 && _serverLevelGR487.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR490 && _serverLevelGR490.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR494 && _serverLevelGR494.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR497 && _serverLevelGR497.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR501 && _serverLevelGR501.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR504 && _serverLevelGR504.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR508 && _serverLevelGR508.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR511 && _serverLevelGR511.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR515 && _serverLevelGR515.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR518 && _serverLevelGR518.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR522 && _serverLevelGR522.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR525 && _serverLevelGR525.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR529 && _serverLevelGR529.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR532 && _serverLevelGR532.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR536 && _serverLevelGR536.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR539 && _serverLevelGR539.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd543 && _playerCmd543.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR544 && _serverLevelGR544.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR547 && _serverLevelGR547.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd551 && _playerCmd551.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR552 && _serverLevelGR552.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR555 && _serverLevelGR555.getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ExtremeLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("extremelightning")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR562 && _serverLevelGR562.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR565 && _serverLevelGR565.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR569 && _serverLevelGR569.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR572 && _serverLevelGR572.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR576 && _serverLevelGR576.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR579 && _serverLevelGR579.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR583 && _serverLevelGR583.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR586 && _serverLevelGR586.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if ((world instanceof ServerLevel _serverLevelGR590 && _serverLevelGR590.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR593 && _serverLevelGR593.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if ((world instanceof ServerLevel _serverLevelGR597 && _serverLevelGR597.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR600 && _serverLevelGR600.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if ((world instanceof ServerLevel _serverLevelGR604 && _serverLevelGR604.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR607 && _serverLevelGR607.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if ((world instanceof ServerLevel _serverLevelGR611 && _serverLevelGR611.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if ((world instanceof ServerLevel _serverLevelGR614 && _serverLevelGR614.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						if (world instanceof ServerLevel _serverLevel)
							_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity instanceof Player _playerCmd618 && _playerCmd618.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR619 && _serverLevelGR619.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR622 && _serverLevelGR622.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity instanceof Player _playerCmd626 && _playerCmd626.hasPermissions(4)) {
						if ((world instanceof ServerLevel _serverLevelGR627 && _serverLevelGR627.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
						} else if ((world instanceof ServerLevel _serverLevelGR630 && _serverLevelGR630.getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING)) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			}
		}
	}
}