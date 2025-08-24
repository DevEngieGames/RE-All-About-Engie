
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.BigSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.animations.boyotiredAnimation;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigSharkoSleepRenderer extends MobRenderer<BigSharkoSleepEntity, Modelbigboyotired<BigSharkoSleepEntity>> {
	public BigSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigsharkonewtamedtired.png");
	}

	private static final class AnimatedModel extends Modelbigboyotired<BigSharkoSleepEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BigSharkoSleepEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BigSharkoSleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyotiredAnimation.SharkoTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BigSharkoSleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
