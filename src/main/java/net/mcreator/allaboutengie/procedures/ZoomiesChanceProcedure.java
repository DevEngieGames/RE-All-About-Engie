package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesEntity;
import net.mcreator.allaboutengie.entity.FinneganEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesEntity;
import net.mcreator.allaboutengie.entity.BuddyEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.entity.Bothan2netEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.entity.AtlasEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesEntity;
import net.mcreator.allaboutengie.entity.ApolloEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class ZoomiesChanceProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.000005) {
			if (entity instanceof SharkTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, SharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof SharkoTamedZoomiesEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Sharko")) {
							if ((findEntityInWorldRange(world, SharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							(findEntityInWorldRange(world, SharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof AlbinoSharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, AlbinoSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof AlbinoSharkoTamedZoomiesEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Albino Sharko")) {
							if ((findEntityInWorldRange(world, AlbinoSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							(findEntityInWorldRange(world, AlbinoSharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof RareSharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, RareSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof RareSharkoTamedZoomiesEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Sharko")) {
							if ((findEntityInWorldRange(world, RareSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							(findEntityInWorldRange(world, RareSharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof EpicSharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EpicSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof EpicSharkoTamedZoomiesEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Epic Sharko")) {
							if ((findEntityInWorldRange(world, EpicSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							(findEntityInWorldRange(world, EpicSharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof LegendarySharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, LegendarySharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LegendarySharkoTamedZoomiesEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Legendary Sharko")) {
							if ((findEntityInWorldRange(world, LegendarySharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							(findEntityInWorldRange(world, LegendarySharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof MythicSharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, MythicSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof MythicSharkoTamedZoomiesEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Mythic Sharko")) {
							if ((findEntityInWorldRange(world, MythicSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							(findEntityInWorldRange(world, MythicSharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof ExoticSharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ExoticSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof ExoticSharkoTamedZoomiesEntity) {
						if ((findEntityInWorldRange(world, ExoticSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Exotic Sharko")) {
							(findEntityInWorldRange(world, ExoticSharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof EngieSharkoTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoTamedZoomiesEntity.class, x, y, z, 1)) instanceof EngieSharkoTamedZoomiesEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRareTamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Engie Sharko")) {
							(findEntityInWorldRange(world, EngieSharkoTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof EngieSharkoRareTamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoRareTamedZoomiesEntity.class, x, y, z, 1)) instanceof EngieSharkoRareTamedZoomiesEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRare2TamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko")) {
							(findEntityInWorldRange(world, EngieSharkoRareTamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof EngieSharkoRare2TamedEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_tamed_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, EngieSharkoRare2TamedZoomiesEntity.class, x, y, z, 1)) instanceof EngieSharkoRare2TamedZoomiesEntity) {
						if ((findEntityInWorldRange(world, EngieSharkoRare2TamedZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Tiger Sharko")) {
							(findEntityInWorldRange(world, EngieSharkoRare2TamedZoomiesEntity.class, x, y, z, 1)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			}
			if (entity instanceof TobyEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, TobyZoomiesEntity.class, x, y, z, 1)) instanceof TobyZoomiesEntity) {
						if ((findEntityInWorldRange(world, TobyZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof MarshalEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, MarshalZoomiesEntity.class, x, y, z, 1)) instanceof MarshalZoomiesEntity) {
						if ((findEntityInWorldRange(world, MarshalZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof TigerEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, TigerZoomiesEntity.class, x, y, z, 1)) instanceof TigerZoomiesEntity) {
						if ((findEntityInWorldRange(world, TigerZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof LouisEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, LouisZoomiesEntity.class, x, y, z, 1)) instanceof LouisZoomiesEntity) {
						if ((findEntityInWorldRange(world, LouisZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof BuddyEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, BuddyZoomiesEntity.class, x, y, z, 1)) instanceof BuddyZoomiesEntity) {
						if ((findEntityInWorldRange(world, BuddyZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof ApolloEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, ApolloZoomiesEntity.class, x, y, z, 1)) instanceof ApolloZoomiesEntity) {
						if ((findEntityInWorldRange(world, ApolloZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof AtlasEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, AtlasZoomiesEntity.class, x, y, z, 1)) instanceof AtlasZoomiesEntity) {
						if ((findEntityInWorldRange(world, AtlasZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof CBEEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, CBEZoomiesEntity.class, x, y, z, 1)) instanceof CBEZoomiesEntity) {
						if ((findEntityInWorldRange(world, CBEZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof PBEEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, PBEZoomiesEntity.class, x, y, z, 1)) instanceof PBEZoomiesEntity) {
						if ((findEntityInWorldRange(world, PBEZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof Bothan2netEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, Bothan2netZoomiesEntity.class, x, y, z, 1)) instanceof Bothan2netZoomiesEntity) {
						if ((findEntityInWorldRange(world, Bothan2netZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					}
				});
			}
			if (entity instanceof FinneganEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:finnegan_zoomies ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((findEntityInWorldRange(world, FinneganZoomiesEntity.class, x, y, z, 1)) instanceof FinneganZoomiesEntity) {
						if ((findEntityInWorldRange(world, FinneganZoomiesEntity.class, x, y, z, 1)) instanceof LivingEntity _entity)
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