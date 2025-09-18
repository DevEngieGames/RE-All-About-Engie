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
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DetectiveGameruleProcedure {
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
		if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false && (world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE)) == false) {
			if (AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart == false) {
				AllaboutengieMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.detecstart = false;
				_vars.syncPlayerVariables(entity);
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false && (world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE)) == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart == false) {
				AllaboutengieMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).detecstart == false) {
				if (!(entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
						&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world_new_problem"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world_new_problem"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"Hello Detective \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\". We didn't find a journal this time. As for everything else, it seems to be the same. Good luck out there.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "time set 102d");
						}
					}
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.detecstart = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true && (world instanceof ServerLevel _serverLevelGR10 && _serverLevelGR10.getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE)) == false) {
			if (AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart == false) {
				AllaboutengieMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel && _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			{
				AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.detecstart = false;
				_vars.syncPlayerVariables(entity);
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true && (world instanceof ServerLevel _serverLevelGR14 && _serverLevelGR14.getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE)) == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart == false) {
				AllaboutengieMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				AllaboutengieModVariables.MapVariables.get(world).riskcheckedstart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).detecstart == false) {
				if (!(entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
						&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world_new_problem"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:new_world_new_problem"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"Hello Detective \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\". We didn't find a journal this time. As for everything else, it seems to be the same. Good luck out there.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "time set 102d");
						}
					}
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.detecstart = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
	}
}