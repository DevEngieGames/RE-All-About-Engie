
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.BuddyLayEntity;
import net.mcreator.allaboutengie.client.model.animations.boyositAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobysit;

public class BuddyLayRenderer extends MobRenderer<BuddyLayEntity, Modeltobysit<BuddyLayEntity>> {
	public BuddyLayRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobysit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BuddyLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/buddy.png");
	}

	private static final class AnimatedModel extends Modeltobysit<BuddyLayEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BuddyLayEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BuddyLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyositAnimation.SharkoLayIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BuddyLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
