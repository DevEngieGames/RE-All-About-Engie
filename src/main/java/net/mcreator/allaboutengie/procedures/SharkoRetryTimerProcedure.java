package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SharkoRetryTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).SharkoRetryState == true) {
			entity.getPersistentData().putDouble("SharkoRCTameRetry", (entity.getPersistentData().getDouble("SharkoRCTameRetry") + 0.05));
			if (entity.getPersistentData().getDouble("SharkoRCTameRetry") >= 60) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.SharkoRetryState = false;
					_vars.syncPlayerVariables(entity);
				}
				entity.getPersistentData().putDouble("SharkoRCTameRetry", 0);
			}
		}
	}
}