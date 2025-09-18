package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ChallengeModeAdvancementCheckProcedure {
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
		if ((entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:challenge_destroyed"))).isDone()) == true) {
			if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).solotrophyobtained == false) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.solotrophyobtained = true;
					_vars.syncPlayerVariables(entity);
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:challenge_mode_trophy_solo");
						}
					}
				});
			}
		} else if ((entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:challenge_destroyed_2"))).isDone()) == true) {
			if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).multiplayertrophyobtained == false) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.multiplayertrophyobtained = true;
					_vars.syncPlayerVariables(entity);
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:challenge_mode_trophy_multiplayer");
						}
					}
				});
			}
		}
		if ((entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel && _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:all_fully_done"))).isDone()) == true) {
			if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MaxPercentGiveOptionToDoHardestMobDiff == false) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.MaxPercentGiveOptionToDoHardestMobDiff = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}