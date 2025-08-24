
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.ApolloLayOnSideEntity;
import net.mcreator.allaboutengie.client.model.animations.boyolayonsideAnimation;
import net.mcreator.allaboutengie.client.model.Modeltobylayonside;

public class ApolloLayOnSideRenderer extends MobRenderer<ApolloLayOnSideEntity, Modeltobylayonside<ApolloLayOnSideEntity>> {
	public ApolloLayOnSideRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltobylayonside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ApolloLayOnSideEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/apollo.png");
	}

	private static final class AnimatedModel extends Modeltobylayonside<ApolloLayOnSideEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ApolloLayOnSideEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ApolloLayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyolayonsideAnimation.LayOnSideIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ApolloLayOnSideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
