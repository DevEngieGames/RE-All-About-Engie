
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.animations.boyotiredAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyotired;

public class AlbinoSharkoSleepRenderer extends MobRenderer<AlbinoSharkoSleepEntity, Modelboyotired<AlbinoSharkoSleepEntity>> {
	public AlbinoSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinosharkonewtamedtired.png");
	}

	private static final class AnimatedModel extends Modelboyotired<AlbinoSharkoSleepEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<AlbinoSharkoSleepEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(AlbinoSharkoSleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyotiredAnimation.SharkoTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(AlbinoSharkoSleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
