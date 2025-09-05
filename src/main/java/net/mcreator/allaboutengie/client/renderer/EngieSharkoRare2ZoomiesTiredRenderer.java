package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.animations.boyozoomtiredAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class EngieSharkoRare2ZoomiesTiredRenderer extends MobRenderer<EngieSharkoRare2ZoomiesTiredEntity, Modelboyozoomtired<EngieSharkoRare2ZoomiesTiredEntity>> {
	public EngieSharkoRare2ZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2ZoomiesTiredEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/rareengiesharko2newtamedzoomtired.png");
	}

	private static final class AnimatedModel extends Modelboyozoomtired<EngieSharkoRare2ZoomiesTiredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<EngieSharkoRare2ZoomiesTiredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(EngieSharkoRare2ZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyozoomtiredAnimation.SharkoZoomTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(EngieSharkoRare2ZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}