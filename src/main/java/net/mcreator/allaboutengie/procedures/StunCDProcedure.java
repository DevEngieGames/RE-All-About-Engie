package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StunCDProcedure {
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
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).playerstunnedmobs == true) {
			entity.getPersistentData().putDouble("stuncooldown", (entity.getPersistentData().getDouble("stuncooldown") + 0.05));
			if (entity.getPersistentData().getDouble("stuncooldown") >= 20) {
				entity.getPersistentData().putDouble("stuncooldown", 0);
				if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).playerstunoffcooldown == false) {
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.playerstunoffcooldown = true;
						_vars.syncPlayerVariables(entity);
					}
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.playerstunnedmobs = false;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
									entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunabiloffcooldown")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
									entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunabiloffcooldown")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}