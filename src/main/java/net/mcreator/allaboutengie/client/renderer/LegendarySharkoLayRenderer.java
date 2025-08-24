
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.client.model.animations.boyositAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class LegendarySharkoLayRenderer extends MobRenderer<LegendarySharkoLayEntity, Modelboyosit<LegendarySharkoLayEntity>> {
	public LegendarySharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/legendarysharkonewtamed.png");
	}

	private static final class AnimatedModel extends Modelboyosit<LegendarySharkoLayEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LegendarySharkoLayEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LegendarySharkoLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyositAnimation.SharkoLayIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LegendarySharkoLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
