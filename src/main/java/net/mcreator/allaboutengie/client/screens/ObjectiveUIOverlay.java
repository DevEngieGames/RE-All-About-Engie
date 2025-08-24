
package net.mcreator.allaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.procedures.TheEndCheckProcedure;
import net.mcreator.allaboutengie.procedures.SuperDoomsDayCheckProcedure;
import net.mcreator.allaboutengie.procedures.ObjectiveOverlayCheckProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayCheckProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ObjectiveUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (ObjectiveOverlayCheckProcedure.execute(entity)) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.allaboutengie.objective_ui.label_u26a0_new_objective_u26a0"), w / 2 + -69, h / 2 + -120, -256, false);
			if (DoomsDayCheckProcedure.execute(world))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.allaboutengie.objective_ui.label_the_end_is_near_survive_the_end"), w / 2 + -116, h / 2 + -111, -1, false);
			if (SuperDoomsDayCheckProcedure.execute(world))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.allaboutengie.objective_ui.label_the_end_is_near_the_full_wrath"), w / 2 + -164, h / 2 + -111, -1, false);
			if (SuperDoomsDayCheckProcedure.execute(world))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.allaboutengie.objective_ui.label_ultimate_disaster_super_doomsda"), w / 2 + -89, h / 2 + -101, -1, false);
			if (TheEndCheckProcedure.execute(world))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.allaboutengie.objective_ui.label_theres_no_disaster_theres_no"), w / 2 + -157, h / 2 + -111, -4978150, false);
		}
	}
}
