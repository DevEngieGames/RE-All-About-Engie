package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UhhProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).SharkoKilledByPlayersCount >= 25) {
			AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 525000;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
