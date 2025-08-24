
package net.mcreator.allaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.procedures.Difficulty9ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty8ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty7ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty6ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty690ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty5ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty525ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty525000ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty4ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty3ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty2ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty20ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty1ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty15ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty13ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty12ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty11ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty10ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty0ReturnTrueCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DifficultyOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (Difficulty0ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/diff0icon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty1ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/diff1icon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty2ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/diff2icon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty3ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/madengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty4ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/angryengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty5ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/enragedengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty6ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/outragedengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty7ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/biblicallyaccurateengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty8ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/monstrosityengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty9ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/doomsdayengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty10ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/superdoomsdayengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty11ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/theendengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty12ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/engiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty13ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/mindscapeengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty15ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/insanityengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty20ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/pureinsanityengiedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty525ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/engiegamesdifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty690ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/wormholedifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty525000ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(new ResourceLocation("allaboutengie:textures/screens/sufferdifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
