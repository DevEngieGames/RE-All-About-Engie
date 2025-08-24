
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.RockySleepEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyotiredAnimation;
import net.mcreator.allaboutengie.client.model.Modelrockytired;

public class RockySleepRenderer extends MobRenderer<RockySleepEntity, Modelrockytired<RockySleepEntity>> {
	public RockySleepRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelrockytired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RockySleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rockytired.png");
	}

	private static final class AnimatedModel extends Modelrockytired<RockySleepEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<RockySleepEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(RockySleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyotiredAnimation.EngieDaSharkoTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(RockySleepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
