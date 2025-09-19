package net.mcreator.allaboutengie.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.allaboutengie.world.inventory.EngieAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.procedures.DenymarkdisplayconditionProcedure;
import net.mcreator.allaboutengie.procedures.CheckmarkdisplayconditionProcedure;
import net.mcreator.allaboutengie.network.EngieAntimatterTradeUIButtonMessage;
import net.mcreator.allaboutengie.init.AllaboutengieModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class EngieAntimatterTradeUIScreen extends AbstractContainerScreen<EngieAntimatterTradeUIMenu> implements AllaboutengieModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Checkbox scythetrade;
	Checkbox bantrade;
	Button button_trade;
	Button button_swap;

	public EngieAntimatterTradeUIScreen(EngieAntimatterTradeUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 140;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("allaboutengie:textures/screens/engie_antimatter_trade_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 69 && mouseX < leftPos + 93 && mouseY > topPos + 4 && mouseY < topPos + 28) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.tooltip_click_this_to_trade_for_a_scythe"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 96 && mouseX < leftPos + 120 && mouseY > topPos + 4 && mouseY < topPos + 28) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.tooltip_click_this_to_trade_for_a_ban_ha"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (CheckmarkdisplayconditionProcedure.execute(world)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/checkmark.png"), this.leftPos + 154, this.topPos + 8, 0, 0, 16, 16, 16, 16);
		}
		if (DenymarkdisplayconditionProcedure.execute(world)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("allaboutengie:textures/screens/denymark.png"), this.leftPos + 127, this.topPos + 8, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.label_trade_ui_state_antimatter"), 5, -11, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_trade = Button.builder(Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.button_trade"), e -> {
			int x = EngieAntimatterTradeUIScreen.this.x;
			int y = EngieAntimatterTradeUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new EngieAntimatterTradeUIButtonMessage(0, x, y, z));
				EngieAntimatterTradeUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 29, 51, 20).build();
		this.addRenderableWidget(button_trade);
		button_swap = Button.builder(Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.button_swap"), e -> {
			int x = EngieAntimatterTradeUIScreen.this.x;
			int y = EngieAntimatterTradeUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new EngieAntimatterTradeUIButtonMessage(1, x, y, z));
				EngieAntimatterTradeUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 6, 51, 20).build();
		this.addRenderableWidget(button_swap);
		scythetrade = Checkbox.builder(Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.scythetrade"), this.font).pos(this.leftPos + 71, this.topPos + 6).onValueChange((checkbox, value) -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 1, "scythetrade", value, false);
		}).build();
		this.addRenderableWidget(scythetrade);
		bantrade = Checkbox.builder(Component.translatable("gui.allaboutengie.engie_antimatter_trade_ui.bantrade"), this.font).pos(this.leftPos + 98, this.topPos + 6).onValueChange((checkbox, value) -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 1, "bantrade", value, false);
		}).build();
		this.addRenderableWidget(bantrade);
	}
}