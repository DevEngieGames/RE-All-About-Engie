package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Comparator;

public class BigRareEngieSharko2NameCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BigEngieSharkoRare2TamedEntity) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(30 / 2d), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							{
								Entity _ent = entity;
								_ent.teleportTo(entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
										entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
											entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ, _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(30 / 2d), e -> true).isEmpty()) {
				if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(20 / 2d), e -> true).isEmpty())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo(entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
											entityiterator.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ, 1);
							}
						}
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Cosmo")) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof BigEngieSharkoRare2LayEntity) {
			if (!(world instanceof Level _lvl14 && _lvl14.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof BigEngieSharkoRare2LayEntity) {
							if (!entity.level().isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world instanceof Level _lvl22 && _lvl22.isDay()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof BigEngieSharkoRare2LayEntity) {
							if (!entity.level().isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"summon allaboutengie:big_tiger_sharko_sleep ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Cosmo")) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof BigEngieSharkoRare2SleepEntity) {
			if (!(world instanceof Level _lvl34 && _lvl34.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
					entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof BigEngieSharkoRare2SleepEntity) {
							if (!entity.level().isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"summon allaboutengie:big_tiger_sharko_lay ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world instanceof Level _lvl42 && _lvl42.isDay()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
					entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof BigEngieSharkoRare2SleepEntity) {
							if (!entity.level().isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"summon allaboutengie:big_tiger_sharko_lay ~ ~ ~");
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
			if ((entity.getDisplayName().getString()).equals("Cosmo")) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
					}
				}
			}
		}
	}
}