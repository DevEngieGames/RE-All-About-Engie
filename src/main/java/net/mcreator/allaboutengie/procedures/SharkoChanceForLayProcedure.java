package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.TobySitEntity;
import net.mcreator.allaboutengie.entity.TigerSitEntity;
import net.mcreator.allaboutengie.entity.SharkoSitEntity;
import net.mcreator.allaboutengie.entity.RockySleepEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSitEntity;
import net.mcreator.allaboutengie.entity.PBESitEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSitEntity;
import net.mcreator.allaboutengie.entity.MarshalSitEntity;
import net.mcreator.allaboutengie.entity.LouisSitEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSitEntity;
import net.mcreator.allaboutengie.entity.FinneganSitEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSitEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSitEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSitEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSitEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SitEntity;
import net.mcreator.allaboutengie.entity.ChampSitEntity;
import net.mcreator.allaboutengie.entity.CBESitEntity;
import net.mcreator.allaboutengie.entity.BuddySitEntity;
import net.mcreator.allaboutengie.entity.Bothan2netSitEntity;
import net.mcreator.allaboutengie.entity.AtlasSitEntity;
import net.mcreator.allaboutengie.entity.ApolloSitEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSitEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class SharkoChanceForLayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).SharkoSitCD == true) {
			entity.getPersistentData().putDouble("SharkoSitCD", (entity.getPersistentData().getDouble("SharkoSitCD") + 0.05));
			if (entity.getPersistentData().getDouble("SharkoSitCD") >= 240) {
				entity.getPersistentData().putDouble("SharkoSitCD", 0);
				AllaboutengieModVariables.MapVariables.get(world).SharkoSitCD = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoSitCD == false) {
			if (Math.random() <= 0.05) {
				if (entity instanceof SharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:epic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2SitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TobySitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:toby_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MarshalSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:marshal_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TigerSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:tiger_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LouisSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:louis_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BuddySitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:buddy_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ApolloSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:apollo_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AtlasSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:atlas_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CBESitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:cbe_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof PBESitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:pbe_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof Bothan2netSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:bothan_2net_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof FinneganSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:finnegan_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ChampSitEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:champ_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RockySleepEntity) {
					if (!entity.level().isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rocky_lay ~ ~ ~");
							}
						}
					});
				}
			} else {
				AllaboutengieModVariables.MapVariables.get(world).SharkoSitCD = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}