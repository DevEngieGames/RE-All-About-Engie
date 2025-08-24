package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AprilFoolsSharkoChanceForSleepProcedure {
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
				if (Math.random() > 0.0005) {
					if (entity instanceof SharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
				} else {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if (world instanceof Level _lvl44 && _lvl44.isDay()) {
			if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
				entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
				if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
				if (Math.random() <= 0.0005) {
					if (entity instanceof SharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof AlbinoSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof RareSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EpicSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof LegendarySharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof ExoticSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
								}
							}
						});
					}
					if (entity instanceof EngieSharkoRare2LayAprilFoolsEntity) {
						if (!entity.level().isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep_april_fools ~ ~ ~");
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
