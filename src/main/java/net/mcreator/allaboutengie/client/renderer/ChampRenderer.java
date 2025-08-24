
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.ChampEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyoAnimation;
import net.mcreator.allaboutengie.client.model.Modelchampdaboyo;

public class ChampRenderer extends MobRenderer<ChampEntity, Modelchampdaboyo<ChampEntity>> {
	public ChampRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelchampdaboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChampEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/champ.png");
	}

	private static final class AnimatedModel extends Modelchampdaboyo<ChampEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ChampEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ChampEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyoAnimation.EngieDaSharkoIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ChampEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
