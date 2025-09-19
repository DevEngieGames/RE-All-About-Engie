package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DifficultyDebugChangeProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "number") == 0) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd10 && _playerCmd10.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd12 && _playerCmd12.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 0;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 1) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd24 && _playerCmd24.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd26 && _playerCmd26.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 2) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd38 && _playerCmd38.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd40 && _playerCmd40.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 3) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd52 && _playerCmd52.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd54 && _playerCmd54.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 4) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd66 && _playerCmd66.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd68 && _playerCmd68.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 5) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd80 && _playerCmd80.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd82 && _playerCmd82.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 6) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd94 && _playerCmd94.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd96 && _playerCmd96.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 7) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd108 && _playerCmd108.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd110 && _playerCmd110.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 8) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd122 && _playerCmd122.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd124 && _playerCmd124.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 9) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd136 && _playerCmd136.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd138 && _playerCmd138.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 10) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd150 && _playerCmd150.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd152 && _playerCmd152.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 11) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd164 && _playerCmd164.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd166 && _playerCmd166.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 12) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd178 && _playerCmd178.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd180 && _playerCmd180.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 13) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd192 && _playerCmd192.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd194 && _playerCmd194.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 14) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd206 && _playerCmd206.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd208 && _playerCmd208.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 15) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd220 && _playerCmd220.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd222 && _playerCmd222.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 16) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd234 && _playerCmd234.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd236 && _playerCmd236.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 17) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd248 && _playerCmd248.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd250 && _playerCmd250.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 18) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd262 && _playerCmd262.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd264 && _playerCmd264.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 19) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd276 && _playerCmd276.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd278 && _playerCmd278.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 20) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd290 && _playerCmd290.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd292 && _playerCmd292.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 21) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd304 && _playerCmd304.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd306 && _playerCmd306.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 22) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd318 && _playerCmd318.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd320 && _playerCmd320.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 23) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd332 && _playerCmd332.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd334 && _playerCmd334.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 24) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd346 && _playerCmd346.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd348 && _playerCmd348.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 25) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd360 && _playerCmd360.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd362 && _playerCmd362.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 26) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd374 && _playerCmd374.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd376 && _playerCmd376.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 27) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd388 && _playerCmd388.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd390 && _playerCmd390.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 28) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd402 && _playerCmd402.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd404 && _playerCmd404.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 29) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd416 && _playerCmd416.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd418 && _playerCmd418.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 29;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 30) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd430 && _playerCmd430.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd432 && _playerCmd432.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 30;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 525) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd444 && _playerCmd444.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd446 && _playerCmd446.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 690) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd458 && _playerCmd458.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd460 && _playerCmd460.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 690;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 250000) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd472 && _playerCmd472.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd474 && _playerCmd474.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 525000) {
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
				AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (world.players().size() == 1) {
				if (entity instanceof Player _playerCmd486 && _playerCmd486.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (world.players().size() > 1) {
				if (entity instanceof Player _playerCmd488 && _playerCmd488.hasPermissions(4)) {
					AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
					}
				}
			}
		}
	}
}