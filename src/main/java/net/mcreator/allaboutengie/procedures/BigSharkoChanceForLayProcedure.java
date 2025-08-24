package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.CosmoSleepEntity;
import net.mcreator.allaboutengie.entity.BigSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class BigSharkoChanceForLayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
				entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
					AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
				if (Math.random() <= 0.0005) {
					if (entity instanceof BigSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_albino_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_legendary_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_mythic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_exotic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2SleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_tiger_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if (world instanceof Level _lvl48 && _lvl48.isDay()) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
				entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
					AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
				if (Math.random() >= 0.25) {
					if (entity instanceof BigSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigAlbinoSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_albino_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigRareSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEpicSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigLegendarySharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_legendary_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigMythicSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_mythic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigExoticSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_exotic_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRareSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof BigEngieSharkoRare2SleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_2_lay ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof CosmoSleepEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
