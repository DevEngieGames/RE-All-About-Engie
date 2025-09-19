package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MobskilledwithoutpickaxecheckProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("minecraft:pickaxes"))))) {
			{
				AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
				_vars.AngryEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).playerkilledmobswithoutpickaxeonlycount + 1;
				_vars.syncPlayerVariables(sourceentity);
			}
		}
	}
}