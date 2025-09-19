package net.mcreator.allaboutengie.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.RegularMetalBundleUIMenu;
import net.mcreator.allaboutengie.procedures.BundleDisplayNameCheckProcedure;
import net.mcreator.allaboutengie.network.RegularMetalBundleUIButtonMessage;
import net.mcreator.allaboutengie.init.AllaboutengieModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class RegularMetalBundleUIScreen extends AbstractContainerScreen<RegularMetalBundleUIMenu> implements AllaboutengieModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox ChangeBundleName;
	Button button_set_name;

	public RegularMetalBundleUIScreen(RegularMetalBundleUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 180;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("ChangeBundleName"))
				ChangeBundleName.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("allaboutengie:textures/screens/regular_metal_bundle_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		ChangeBundleName.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (ChangeBundleName.isFocused())
			return ChangeBundleName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String ChangeBundleNameValue = ChangeBundleName.getValue();
		super.resize(minecraft, width, height);
		ChangeBundleName.setValue(ChangeBundleNameValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, BundleDisplayNameCheckProcedure.execute(entity), 4, 25, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		ChangeBundleName = new EditBox(this.font, this.leftPos + 5, this.topPos + 5, 118, 18, Component.translatable("gui.allaboutengie.regular_metal_bundle_ui.ChangeBundleName"));
		ChangeBundleName.setMaxLength(8192);
		ChangeBundleName.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "ChangeBundleName", content, false);
		});
		ChangeBundleName.setHint(Component.translatable("gui.allaboutengie.regular_metal_bundle_ui.ChangeBundleName"));
		this.addWidget(this.ChangeBundleName);
		button_set_name = Button.builder(Component.translatable("gui.allaboutengie.regular_metal_bundle_ui.button_set_name"), e -> {
			int x = RegularMetalBundleUIScreen.this.x;
			int y = RegularMetalBundleUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new RegularMetalBundleUIButtonMessage(0, x, y, z));
				RegularMetalBundleUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 130, this.topPos + 4, 66, 20).build();
		this.addRenderableWidget(button_set_name);
	}
}