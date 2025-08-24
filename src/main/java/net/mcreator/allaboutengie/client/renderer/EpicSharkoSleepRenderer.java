
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.EpicSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.animations.boyotiredAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyotired;

public class EpicSharkoSleepRenderer extends MobRenderer<EpicSharkoSleepEntity, Modelboyotired<EpicSharkoSleepEntity>> {
	public EpicSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicsharkonewtamedtired.png");
	}

	private static final class AnimatedModel extends Modelboyotired<EpicSharkoSleepEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<EpicSharkoSleepEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(EpicSharkoSleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyotiredAnimation.SharkoTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(EpicSharkoSleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
