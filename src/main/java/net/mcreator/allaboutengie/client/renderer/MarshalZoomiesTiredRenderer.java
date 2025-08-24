
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.animations.boyozoomtiredAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class MarshalZoomiesTiredRenderer extends MobRenderer<MarshalZoomiesTiredEntity, Modeltobyzoomtired<MarshalZoomiesTiredEntity>> {
	public MarshalZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarshalZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/marshalzoomtired.png");
	}

	private static final class AnimatedModel extends Modeltobyzoomtired<MarshalZoomiesTiredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MarshalZoomiesTiredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MarshalZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyozoomtiredAnimation.SharkoZoomTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MarshalZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
