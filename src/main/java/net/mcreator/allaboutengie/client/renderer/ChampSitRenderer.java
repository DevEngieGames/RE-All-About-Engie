
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.ChampSitEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyositAnimation;
import net.mcreator.allaboutengie.client.model.Modelchampdaboyositnew;

public class ChampSitRenderer extends MobRenderer<ChampSitEntity, Modelchampdaboyositnew<ChampSitEntity>> {
	public ChampSitRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelchampdaboyositnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChampSitEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/champ.png");
	}

	private static final class AnimatedModel extends Modelchampdaboyositnew<ChampSitEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ChampSitEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ChampSitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyositAnimation.SharkoLayIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ChampSitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
