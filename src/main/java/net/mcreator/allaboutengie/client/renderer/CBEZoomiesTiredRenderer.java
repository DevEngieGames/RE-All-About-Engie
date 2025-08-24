
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.CBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyozoomtiredAnimation;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyotired;

public class CBEZoomiesTiredRenderer extends MobRenderer<CBEZoomiesTiredEntity, Modelengiedaboyotired<CBEZoomiesTiredEntity>> {
	public CBEZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelengiedaboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CBEZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharkozoomtired.png");
	}

	private static final class AnimatedModel extends Modelengiedaboyotired<CBEZoomiesTiredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<CBEZoomiesTiredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(CBEZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyozoomtiredAnimation.EngieDaSharkoZoomTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(CBEZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
