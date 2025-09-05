package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.allaboutengie.world.inventory.CustomRecipeBookMenu;
import net.mcreator.allaboutengie.procedures.RecipepagenumbergetProcedure;
import net.mcreator.allaboutengie.network.CustomRecipeBookButtonMessage;
import net.mcreator.allaboutengie.init.AllaboutengieModScreens;
import net.mcreator.allaboutengie.AllaboutengieMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CustomRecipeBookScreen extends AbstractContainerScreen<CustomRecipeBookMenu> implements AllaboutengieModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;

	public CustomRecipeBookScreen(CustomRecipeBookMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("allaboutengie:textures/screens/custom_recipe_book.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("allaboutengie:textures/screens/custom_recipe_book_pageoverlay.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(ResourceLocation.parse("allaboutengie:textures/screens/recipebook.png"), this.leftPos + 90, this.topPos + 27, 0, 0, 32, 32, 32, 32);
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
		guiGraphics.drawString(this.font, RecipepagenumbergetProcedure.execute(entity), 8, 73, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(0, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 81, 25, 20).build();
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty1"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(1, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 61, 25, 20).build();
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty2"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(2, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 101, 25, 20).build();
		this.addRenderableWidget(button_empty2);
		button_empty3 = Button.builder(Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty3"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(3, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 41, 25, 20).build();
		this.addRenderableWidget(button_empty3);
		button_empty4 = Button.builder(Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty4"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(4, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 121, 25, 20).build();
		this.addRenderableWidget(button_empty4);
		button_empty5 = Button.builder(Component.translatable("gui.allaboutengie.custom_recipe_book.button_empty5"), e -> {
			int x = CustomRecipeBookScreen.this.x;
			int y = CustomRecipeBookScreen.this.y;
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new CustomRecipeBookButtonMessage(5, x, y, z));
				CustomRecipeBookButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 21, 25, 20).build();
		this.addRenderableWidget(button_empty5);
	}
}