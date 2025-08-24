
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.AlbinoSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.client.model.animations.boyolayonsideAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyolayonside;

public class AlbinoSharkoLayOnSideRenderer extends MobRenderer<AlbinoSharkoLayOnSideEntity, Modelboyolayonside<AlbinoSharkoLayOnSideEntity>> {
	public AlbinoSharkoLayOnSideRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyolayonside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoLayOnSideEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinosharkonewtamed.png");
	}

	private static final class AnimatedModel extends Modelboyolayonside<AlbinoSharkoLayOnSideEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<AlbinoSharkoLayOnSideEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(AlbinoSharkoLayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyolayonsideAnimation.LayOnSideIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(AlbinoSharkoLayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
