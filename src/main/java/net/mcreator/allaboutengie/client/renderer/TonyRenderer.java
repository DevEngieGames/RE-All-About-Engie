package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.TonyEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyoAnimation;

public class TonyRenderer extends HumanoidMobRenderer<TonyEntity, HumanoidRenderState, HumanoidModel<HumanoidRenderState>> {
	private TonyEntity entity = null;

	public TonyRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getEquipmentRenderer()));
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(TonyEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(HumanoidRenderState state) {
		return ResourceLocation.parse("allaboutengie:textures/entities/tony.png");
	}

	private static final class AnimatedModel extends HumanoidModel<HumanoidRenderState> {
		private TonyEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(TonyEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(HumanoidRenderState state) {
			super.setupAnim(state);
			this.animate(entity.animationState0, engiedaboyoAnimation.EngieDaSharkoIdle, state.ageInTicks, 1f);
		}
	}
}