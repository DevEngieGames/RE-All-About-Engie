
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.PBELayOnSideEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyolayonsideAnimation;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyolayonside;

public class PBELayOnSideRenderer extends MobRenderer<PBELayOnSideEntity, Modelengiedaboyolayonside<PBELayOnSideEntity>> {
	public PBELayOnSideRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelengiedaboyolayonside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBELayOnSideEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko2.png");
	}

	private static final class AnimatedModel extends Modelengiedaboyolayonside<PBELayOnSideEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PBELayOnSideEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PBELayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyolayonsideAnimation.EngieDaSharkoLayOnSideIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PBELayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
