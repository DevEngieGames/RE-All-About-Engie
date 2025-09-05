package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.CosmoLayEntity;
import net.mcreator.allaboutengie.entity.BigSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class BigSharkoChanceForSleepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
				entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
				if (Math.random() >= 0.25) {
					if (entity instanceof BigSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_albino_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_legendary_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_mythic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_exotic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2LayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if (world instanceof Level _lvl48 && _lvl48.isDay()) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
				entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
				if (Math.random() <= 0.0005) {
					if (entity instanceof BigSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_albino_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_legendary_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_mythic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_exotic_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2LayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoLayEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}