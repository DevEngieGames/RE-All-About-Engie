
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.client.model.animations.boyozoomsAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;

public class EngieSharkoTamedZoomiesRenderer extends MobRenderer<EngieSharkoTamedZoomiesEntity, Modelboyozooms<EngieSharkoTamedZoomiesEntity>> {
	public EngieSharkoTamedZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyozooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoTamedZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiesharkonewtamedzoom.png");
	}

	private static final class AnimatedModel extends Modelboyozooms<EngieSharkoTamedZoomiesEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<EngieSharkoTamedZoomiesEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(EngieSharkoTamedZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyozoomsAnimation.SharkoZoomIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(EngieSharkoTamedZoomiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
