
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyozoomAnimation;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyozoom;

public class CBEZoomiesRenderer extends MobRenderer<CBEZoomiesEntity, Modelengiedaboyozoom<CBEZoomiesEntity>> {
	public CBEZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelengiedaboyozoom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CBEZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharkozooms.png");
	}

	private static final class AnimatedModel extends Modelengiedaboyozoom<CBEZoomiesEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<CBEZoomiesEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(CBEZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyozoomAnimation.EngieDaSharkoZoomIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(CBEZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
