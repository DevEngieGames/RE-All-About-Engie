package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OhNoProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).OHNO == false) {
				if (Math.random() >= 0.25) {
					AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() >= 0.5 && Math.random() < 0.25) {
					AllaboutengieModVariables.MapVariables.get(world).Risk = 2;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() >= 0.75 && Math.random() < 0.5) {
					AllaboutengieModVariables.MapVariables.get(world).Risk = 3;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() >= 1 && Math.random() < 0.75) {
					AllaboutengieModVariables.MapVariables.get(world).Risk = 4;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}