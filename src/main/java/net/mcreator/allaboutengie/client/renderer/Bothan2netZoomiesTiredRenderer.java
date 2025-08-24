
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.Bothan2netZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.animations.boyozoomtiredAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class Bothan2netZoomiesTiredRenderer extends MobRenderer<Bothan2netZoomiesTiredEntity, Modeltobyzoomtired<Bothan2netZoomiesTiredEntity>> {
	public Bothan2netZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2netzoomtired.png");
	}

	private static final class AnimatedModel extends Modeltobyzoomtired<Bothan2netZoomiesTiredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Bothan2netZoomiesTiredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Bothan2netZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyozoomtiredAnimation.SharkoZoomTiredIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Bothan2netZoomiesTiredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
