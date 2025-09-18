package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ChampZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ChampZoomiesEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Comparator;

public class SharkoTamedZoomTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(60 / 2d), e -> true).isEmpty())) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof Player) {
						{
							Entity _ent = entity;
							_ent.teleportTo((entityiterator.getX()), Math.ceil(entityiterator.getY()), (entityiterator.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entityiterator.getX()), Math.ceil(entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(60 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(40 / 2d), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							if (entity instanceof Mob _entity)
								_entity.getNavigation().moveTo((entityiterator.getX()), Math.ceil(entityiterator.getY()), (entityiterator.getZ()), 1);
						}
					}
				}
			}
		}
		entity.getPersistentData().putDouble("sharkoZoomiesTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoZoomiesTimer") >= 150) {
			if (entity instanceof SharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, SharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof SharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, SharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, SharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof AlbinoSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_tamed_sharko_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, AlbinoSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof AlbinoSharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, AlbinoSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Albino Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, AlbinoSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof RareSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, RareSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof RareSharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, RareSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, RareSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EpicSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EpicSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof EpicSharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, EpicSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Epic Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, EpicSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof LegendarySharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, LegendarySharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LegendarySharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, LegendarySharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Legendary Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, LegendarySharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof MythicSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, MythicSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof MythicSharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, MythicSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Mythic Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, MythicSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof ExoticSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ExoticSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof ExoticSharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, ExoticSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Exotic Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, ExoticSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof EngieSharkoTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Engie Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, EngieSharkoTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoTamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoRareTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof EngieSharkoRareTamedZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRareTamedZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, EngieSharkoRareTamedZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoRare2TamedZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoRare2ZoomiesTiredEntity.class, x, y, z, 1)) instanceof EngieSharkoRare2ZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRare2ZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Engie Sharko (Zoomies)")) {
							(findEntityInWorldRange(world, EngieSharkoRare2ZoomiesTiredEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof TobyZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, TobyZoomiesTiredEntity.class, x, y, z, 1)) instanceof TobyZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, TobyZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof MarshalZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, MarshalZoomiesTiredEntity.class, x, y, z, 1)) instanceof MarshalZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, MarshalZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof TigerZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, TigerZoomiesTiredEntity.class, x, y, z, 1)) instanceof TigerZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, TigerZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof LouisZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, LouisZoomiesTiredEntity.class, x, y, z, 1)) instanceof LouisZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, LouisZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof BuddyZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, BuddyZoomiesTiredEntity.class, x, y, z, 1)) instanceof BuddyZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, BuddyZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof ApolloZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ApolloZoomiesTiredEntity.class, x, y, z, 1)) instanceof ApolloZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, ApolloZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof AtlasZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, AtlasZoomiesTiredEntity.class, x, y, z, 1)) instanceof AtlasZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, AtlasZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof CBEZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, CBEZoomiesTiredEntity.class, x, y, z, 1)) instanceof CBEZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, CBEZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof PBEZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, PBEZoomiesTiredEntity.class, x, y, z, 1)) instanceof PBEZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, PBEZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof Bothan2netZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, Bothan2netZoomiesTiredEntity.class, x, y, z, 1)) instanceof Bothan2netZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, Bothan2netZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof FinneganZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:finnegan_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, FinneganZoomiesTiredEntity.class, x, y, z, 1)) instanceof FinneganZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, FinneganZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof ChampZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ChampZoomiesTiredEntity.class, x, y, z, 1)) instanceof ChampZoomiesTiredEntity) {
						if ((findEntityInWorldRange(world, ChampZoomiesTiredEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}