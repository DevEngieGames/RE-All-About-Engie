
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.ChampZoomiesEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyozoomAnimation;
import net.mcreator.allaboutengie.client.model.Modelchampdaboyozoom;

public class ChampZoomiesRenderer extends MobRenderer<ChampZoomiesEntity, Modelchampdaboyozoom<ChampZoomiesEntity>> {
	public ChampZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelchampdaboyozoom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChampZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/champzoomies.png");
	}

	private static final class AnimatedModel extends Modelchampdaboyozoom<ChampZoomiesEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ChampZoomiesEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ChampZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyozoomAnimation.EngieDaSharkoZoomIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ChampZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
