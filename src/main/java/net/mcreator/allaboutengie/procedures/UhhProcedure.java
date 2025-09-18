package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class UhhProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 10) {
			AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 250000;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 25) {
			AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}