package net.mcreator.allaboutengie.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.allaboutengie.world.inventory.EngieGamesAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.network.EngieGamesAntimatterTradeUIButtonMessage;
import net.mcreator.allaboutengie.init.AllaboutengieModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class EngieGamesAntimatterTradeUIScreen extends AbstractContainerScreen<EngieGamesAntimatterTradeUIMenu> implements AllaboutengieModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_trade;
	Button button_swap;

	public EngieGamesAntimatterTradeUIScreen(EngieGamesAntimatterTradeUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 140;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("allaboutengie:textures/screens/engie_games_antimatter_trade_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.allaboutengie.engie_games_antimatter_trade_ui.label_trade_ui_state_antimatter"), 5, -11, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_trade = Button.builder(Component.translatable("gui.allaboutengie.engie_games_antimatter_trade_ui.button_trade"), e -> {
			int x = EngieGamesAntimatterTradeUIScreen.this.x;
			int y = EngieGamesAntimatterTradeUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new EngieGamesAntimatterTradeUIButtonMessage(0, x, y, z));
				EngieGamesAntimatterTradeUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 29, 51, 20).build();
		this.addRenderableWidget(button_trade);
		button_swap = Button.builder(Component.translatable("gui.allaboutengie.engie_games_antimatter_trade_ui.button_swap"), e -> {
			int x = EngieGamesAntimatterTradeUIScreen.this.x;
			int y = EngieGamesAntimatterTradeUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new EngieGamesAntimatterTradeUIButtonMessage(1, x, y, z));
				EngieGamesAntimatterTradeUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 6, 51, 20).build();
		this.addRenderableWidget(button_swap);
	}
}