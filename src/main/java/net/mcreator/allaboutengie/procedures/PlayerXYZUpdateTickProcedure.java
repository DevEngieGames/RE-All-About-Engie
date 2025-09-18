package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerXYZUpdateTickProcedure {
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
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.PlayerX = entity.getX();
			_vars.syncPlayerVariables(entity);
		}
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.HHGLookX = entity.getX();
			_vars.syncPlayerVariables(entity);
		}
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.PlayerY = entity.getY();
			_vars.syncPlayerVariables(entity);
		}
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.HHGLookY = entity.getY() + 1.5;
			_vars.syncPlayerVariables(entity);
		}
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.PlayerZ = entity.getZ();
			_vars.syncPlayerVariables(entity);
		}
		{
			AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
			_vars.HHGLookZ = entity.getZ();
			_vars.syncPlayerVariables(entity);
		}
	}
}