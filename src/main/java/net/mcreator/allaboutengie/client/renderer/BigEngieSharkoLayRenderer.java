
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.BigEngieSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.animations.boyositAnimation;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigEngieSharkoLayRenderer extends MobRenderer<BigEngieSharkoLayEntity, Modelbigboyosit<BigEngieSharkoLayEntity>> {
	public BigEngieSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigengiesharkonewtamed.png");
	}

	private static final class AnimatedModel extends Modelbigboyosit<BigEngieSharkoLayEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BigEngieSharkoLayEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BigEngieSharkoLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyositAnimation.SharkoLayIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BigEngieSharkoLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
