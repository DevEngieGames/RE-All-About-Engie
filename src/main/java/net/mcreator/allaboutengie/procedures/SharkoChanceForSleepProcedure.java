package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.TobyLayOnSideEntity;
import net.mcreator.allaboutengie.entity.TigerLayOnSideEntity;
import net.mcreator.allaboutengie.entity.SharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.RockyLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.PBELayOnSideEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.MarshalLayOnSideEntity;
import net.mcreator.allaboutengie.entity.LouisLayOnSideEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayOnSideEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayOnSideEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.ChampLayOnSideEntity;
import net.mcreator.allaboutengie.entity.CBELayOnSideEntity;
import net.mcreator.allaboutengie.entity.BuddyLayOnSideEntity;
import net.mcreator.allaboutengie.entity.Bothan2netLayOnSideEntity;
import net.mcreator.allaboutengie.entity.AtlasLayOnSideEntity;
import net.mcreator.allaboutengie.entity.ApolloLayOnSideEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class SharkoChanceForSleepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD == true) {
				entity.getPersistentData().putDouble("SharkoLayOnSideCD", (entity.getPersistentData().getDouble("SharkoLayOnSideCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayOnSideCD") >= 240) {
					entity.getPersistentData().putDouble("SharkoLayOnSideCD", 0);
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD == false) {
				if (Math.random() <= 0.00075 && Math.random() > 0.0005) {
					if (entity instanceof SharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TobyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MarshalLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TigerLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LouisLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BuddyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ApolloLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AtlasLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof PBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof Bothan2netLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ChampLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RockyLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rocky_sleep ~ ~ ~");
								}
							}
						});
					}
				} else if (Math.random() <= 0.0005) {
					if (entity instanceof SharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_lay~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TobyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MarshalLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TigerLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LouisLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BuddyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ApolloLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AtlasLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof PBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof Bothan2netLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ChampLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ_lay ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if (world instanceof Level _lvl177 && _lvl177.isDay()) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD == true) {
				entity.getPersistentData().putDouble("SharkoLayOnSideCD", (entity.getPersistentData().getDouble("SharkoLayOnSideCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayOnSideCD") >= 240) {
					entity.getPersistentData().putDouble("SharkoLayOnSideCD", 0);
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD == false) {
				if (Math.random() <= 0.00005) {
					if (entity instanceof SharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TobyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MarshalLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TigerLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LouisLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BuddyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ApolloLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AtlasLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof PBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof Bothan2netLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ChampLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ_sleep ~ ~ ~");
								}
							}
						});
					}
				} else if (Math.random() <= 0.0025 && Math.random() > 0.0005) {
					if (entity instanceof SharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_lay~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TobyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MarshalLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof TigerLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LouisLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BuddyLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ApolloLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AtlasLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof PBELayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof Bothan2netLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ChampLayOnSideEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ_lay ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayOnSideCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
