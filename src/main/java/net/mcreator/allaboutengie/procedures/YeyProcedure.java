package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class YeyProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE)) == true
				&& (world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == false
				&& (world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK)) == false) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:deepslate_unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:old_engie_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:old_deepslate_engie_ore");
				}
			}
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == false) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:antimatter_engie_ore");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:antimatter_deepslate_engie_ore");
					}
				}
			}
		} else if ((world instanceof ServerLevel _serverLevelGR9 && _serverLevelGR9.getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE)) == true
				&& (world instanceof ServerLevel _serverLevelGR10 && _serverLevelGR10.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == true
				&& (world instanceof ServerLevel _serverLevelGR11 && _serverLevelGR11.getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK)) == false) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:old_engie_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:old_deepslate_engie_ore");
				}
			}
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == false) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:antimatter_engie_ore");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:antimatter_deepslate_engie_ore");
					}
				}
			}
		} else if ((world instanceof ServerLevel _serverLevelGR16 && _serverLevelGR16.getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE)) == false
				&& (world instanceof ServerLevel _serverLevelGR17 && _serverLevelGR17.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == false
				&& (world instanceof ServerLevel _serverLevelGR18 && _serverLevelGR18.getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK)) == true) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:old_engie_ore replace allaboutengie:unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:old_deepslate_engie_ore replace allaboutengie:deepslate_unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:old_engie_ore replace allaboutengie:engie_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:old_deepslate_engie_ore replace allaboutengie:deepslate_engie_ore");
				}
			}
		}
	}
}