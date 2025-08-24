
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.client.model.animations.boyozoomsAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;

public class EngieSharkoRareTamedZoomiesRenderer extends MobRenderer<EngieSharkoRareTamedZoomiesEntity, Modelboyozooms<EngieSharkoRareTamedZoomiesEntity>> {
	public EngieSharkoRareTamedZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyozooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareTamedZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharkonewtamedzoom.png");
	}

	private static final class AnimatedModel extends Modelboyozooms<EngieSharkoRareTamedZoomiesEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<EngieSharkoRareTamedZoomiesEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(EngieSharkoRareTamedZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyozoomsAnimation.SharkoZoomIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(EngieSharkoRareTamedZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
