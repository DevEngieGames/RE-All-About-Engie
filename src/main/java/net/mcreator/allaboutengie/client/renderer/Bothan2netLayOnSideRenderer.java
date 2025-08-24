
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.Bothan2netLayOnSideEntity;
import net.mcreator.allaboutengie.client.model.animations.boyolayonsideAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobylayonside;

public class Bothan2netLayOnSideRenderer extends MobRenderer<Bothan2netLayOnSideEntity, Modeltobylayonside<Bothan2netLayOnSideEntity>> {
	public Bothan2netLayOnSideRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobylayonside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netLayOnSideEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2net.png");
	}

	private static final class AnimatedModel extends Modeltobylayonside<Bothan2netLayOnSideEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Bothan2netLayOnSideEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Bothan2netLayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyolayonsideAnimation.LayOnSideIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Bothan2netLayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
