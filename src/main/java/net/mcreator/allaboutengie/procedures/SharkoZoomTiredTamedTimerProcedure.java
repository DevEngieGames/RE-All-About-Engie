package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.FinneganEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.ChampEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.BuddyEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.Bothan2netEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AtlasEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ApolloEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Comparator;

public class SharkoZoomTiredTamedTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("sharkoZoomiesTiredTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") >= 150) {
			if (entity instanceof SharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, SharkTamedEntity.class, x, y, z, 1)) instanceof SharkTamedEntity) {
						if ((findEntityInWorldRange(world, SharkTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, SharkTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof AlbinoSharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, AlbinoSharkoTamedEntity.class, x, y, z, 1)) instanceof AlbinoSharkoTamedEntity) {
						if ((findEntityInWorldRange(world, AlbinoSharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Albino Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, AlbinoSharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof RareSharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, RareSharkoTamedEntity.class, x, y, z, 1)) instanceof RareSharkoTamedEntity) {
						if ((findEntityInWorldRange(world, RareSharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, RareSharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EpicSharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EpicSharkoTamedEntity.class, x, y, z, 1)) instanceof EpicSharkoTamedEntity) {
						if ((findEntityInWorldRange(world, EpicSharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Epic Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, EpicSharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof LegendarySharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, LegendarySharkoTamedEntity.class, x, y, z, 1)) instanceof LegendarySharkoTamedEntity) {
						if ((findEntityInWorldRange(world, LegendarySharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Legendary Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, LegendarySharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof MythicSharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, MythicSharkoTamedEntity.class, x, y, z, 1)) instanceof MythicSharkoTamedEntity) {
						if ((findEntityInWorldRange(world, MythicSharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Mythic Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, MythicSharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof ExoticSharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ExoticSharkoTamedEntity.class, x, y, z, 1)) instanceof ExoticSharkoTamedEntity) {
						if ((findEntityInWorldRange(world, ExoticSharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Exotic Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, ExoticSharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoTamedEntity.class, x, y, z, 1)) instanceof EngieSharkoTamedEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Engie Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, EngieSharkoTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoRareTamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoRareTamedEntity.class, x, y, z, 1)) instanceof EngieSharkoRareTamedEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRareTamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, EngieSharkoRareTamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoRare2TamedZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_tamed ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoRare2TamedEntity.class, x, y, z, 1)) instanceof EngieSharkoRare2TamedEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRare2TamedEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Engie Sharko (Worn Out)")) {
							(findEntityInWorldRange(world, EngieSharkoRare2TamedEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof TobyZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, TobyEntity.class, x, y, z, 1)) instanceof TobyEntity) {
						if ((findEntityInWorldRange(world, TobyEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof MarshalZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, MarshalEntity.class, x, y, z, 1)) instanceof MarshalEntity) {
						if ((findEntityInWorldRange(world, MarshalEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof TigerZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, TigerEntity.class, x, y, z, 1)) instanceof TigerEntity) {
						if ((findEntityInWorldRange(world, TigerEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof LouisZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, LouisEntity.class, x, y, z, 1)) instanceof LouisEntity) {
						if ((findEntityInWorldRange(world, LouisEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof BuddyZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, BuddyEntity.class, x, y, z, 1)) instanceof BuddyEntity) {
						if ((findEntityInWorldRange(world, BuddyEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof ApolloZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ApolloEntity.class, x, y, z, 1)) instanceof ApolloEntity) {
						if ((findEntityInWorldRange(world, ApolloEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof AtlasZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, AtlasEntity.class, x, y, z, 1)) instanceof AtlasEntity) {
						if ((findEntityInWorldRange(world, AtlasEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof CBEZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, CBEEntity.class, x, y, z, 1)) instanceof CBEEntity) {
						if ((findEntityInWorldRange(world, CBEEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof PBEZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, PBEEntity.class, x, y, z, 1)) instanceof PBEEntity) {
						if ((findEntityInWorldRange(world, PBEEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof Bothan2netZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, Bothan2netEntity.class, x, y, z, 1)) instanceof Bothan2netEntity) {
						if ((findEntityInWorldRange(world, Bothan2netEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (entity instanceof FinneganZoomiesTiredEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:finnegan ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, FinneganEntity.class, x, y, z, 1)) instanceof FinneganEntity) {
						if ((findEntityInWorldRange(world, FinneganEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			} else if (true) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ChampEntity.class, x, y, z, 1)) instanceof ChampEntity) {
						if ((findEntityInWorldRange(world, ChampEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
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