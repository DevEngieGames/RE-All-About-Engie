package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class SharkoKilledByPlayersCountUpProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			AllaboutengieModVariables.MapVariables.get(world).SharkoKilledByPlayersCount = AllaboutengieModVariables.MapVariables.get(world).SharkoKilledByPlayersCount + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
