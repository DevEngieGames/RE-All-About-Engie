package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.allaboutengie.entity.CBELayOnSideEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyolayonsideAnimation;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyolayonside;

public class CBELayOnSideRenderer extends MobRenderer<CBELayOnSideEntity, LivingEntityRenderState, Modelengiedaboyolayonside> {
	private CBELayOnSideEntity entity = null;

	public CBELayOnSideRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelengiedaboyolayonside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CBELayOnSideEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("allaboutengie:textures/entities/engiedasharko.png");
	}

	private static final class AnimatedModel extends Modelengiedaboyolayonside {
		private CBELayOnSideEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(CBELayOnSideEntity entity) {
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