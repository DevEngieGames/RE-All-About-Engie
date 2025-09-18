package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.allaboutengie.entity.ChampLayOnSideEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyolayonsideAnimation;
import net.mcreator.allaboutengie.client.model.Modelchampdaboyolayonside;

public class ChampLayOnSideRenderer extends MobRenderer<ChampLayOnSideEntity, LivingEntityRenderState, Modelchampdaboyolayonside> {
	private ChampLayOnSideEntity entity = null;

	public ChampLayOnSideRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelchampdaboyolayonside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChampLayOnSideEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("allaboutengie:textures/entities/champ.png");
	}

	private static final class AnimatedModel extends Modelchampdaboyolayonside {
		private ChampLayOnSideEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(ChampLayOnSideEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, engiedaboyolayonsideAnimation.EngieDaSharkoLayOnSideIdle, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}