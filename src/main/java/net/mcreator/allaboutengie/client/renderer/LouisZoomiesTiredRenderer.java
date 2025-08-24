
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.animations.boyozoomtiredAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class LouisZoomiesTiredRenderer extends MobRenderer<LouisZoomiesTiredEntity, Modeltobyzoomtired<LouisZoomiesTiredEntity>> {
	public LouisZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LouisZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/louiszoomtired.png");
	}

	private static final class AnimatedModel extends Modeltobyzoomtired<LouisZoomiesTiredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LouisZoomiesTiredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LouisZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyozoomtiredAnimation.SharkoZoomTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LouisZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
