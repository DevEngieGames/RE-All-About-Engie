package net.mcreator.allaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.CoreShaders;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.procedures.DifficultyOverlayDisplayOverlayIngameProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty9ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty8ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty7ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty6ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty690ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty5ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty525000ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty4ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty3ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty30ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty2ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty29ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty28ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty27ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty26ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty25ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty250000ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty24ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty23ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty22ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty21ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty20ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty1ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty19ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty18ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty17ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty16ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty15ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty14ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty13SlainDragonReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty13ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty13NoSlainDragonReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty12ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty11ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty10ReturnTrueCheckProcedure;
import net.mcreator.allaboutengie.procedures.Difficulty0ReturnTrueCheckProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class DifficultyOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
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
		RenderSystem.setShader(CoreShaders.POSITION_TEX);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (DifficultyOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			if (Difficulty0ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty0new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty1ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty1new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty2ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty2new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty3ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty3new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty4ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty4new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty5ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty5new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty6ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty6new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty7ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty7new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty8ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty8new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty9ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty9new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty10ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty10new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty11ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty11new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty12ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty12new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty13ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/difficulty13new.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty14ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty1.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty15ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty2.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty16ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty3.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty17ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty4.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty18ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty5.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty19ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty6.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty20ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty7.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty21ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty8.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty22ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty9.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty23ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty10.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty24ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty11.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty25ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty12.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty26ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty13.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty27ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty14.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty28ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/antimatterdifficulty15.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty690ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/wormholenewdifficon.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty29ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/challenge1.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty30ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/challenge2.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty250000ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/distorted.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty525000ReturnTrueCheckProcedure.execute(world)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/engie.png"), w - 126, 0, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty13SlainDragonReturnTrueCheckProcedure.execute(world, entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/slayeddragondiff2.png"), w - 126, h - 104, 0, 0, 126, 104, 126, 104);
			}
			if (Difficulty13NoSlainDragonReturnTrueCheckProcedure.execute(world, entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/noslayeddragondiff2.png"), w - 126, h - 104, 0, 0, 126, 104, 126, 104);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}