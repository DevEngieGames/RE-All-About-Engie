package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.SharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AprilFoolsSharkoChanceForLayProcedure {
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
				if (Math.random() < 0.0005) {
					if (entity instanceof SharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2SleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if (world instanceof Level _lvl44 && _lvl44.isDay()) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
				entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
					AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
				if (Math.random() >= 0.25) {
					if (entity instanceof SharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2SleepAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay_april_fools ~ ~ ~");
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