
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.BuddySitEntity;
import net.mcreator.allaboutengie.client.model.animations.boyositnewAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobysitnew;

public class BuddySitRenderer extends MobRenderer<BuddySitEntity, Modeltobysitnew<BuddySitEntity>> {
	public BuddySitRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobysitnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BuddySitEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/buddy.png");
	}

	private static final class AnimatedModel extends Modeltobysitnew<BuddySitEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BuddySitEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BuddySitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyositnewAnimation.SharkoSitIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BuddySitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
