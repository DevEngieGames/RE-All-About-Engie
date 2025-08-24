
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.CosmoEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyoAnimation;
import net.mcreator.allaboutengie.client.model.Modelcosmodabigboyo;

public class CosmoRenderer extends MobRenderer<CosmoEntity, Modelcosmodabigboyo<CosmoEntity>> {
	public CosmoRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcosmodabigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/cosmo.png");
	}

	private static final class AnimatedModel extends Modelcosmodabigboyo<CosmoEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<CosmoEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(CosmoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyoAnimation.EngieDaSharkoIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(CosmoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
