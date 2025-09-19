package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class Difficulty13NoSlainDragonReturnTrueCheckProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12 || AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13)
				&& !(entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("minecraft:end/kill_dragon"))).isDone())) {
			return true;
		}
		return false;
	}
}