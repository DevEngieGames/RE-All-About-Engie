
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.MythicSharkoSitEntity;
import net.mcreator.allaboutengie.client.model.animations.boyositnewAnimation;
import net.mcreator.allaboutengie.client.model.Modelboyositnew;

public class MythicSharkoSitRenderer extends MobRenderer<MythicSharkoSitEntity, Modelboyositnew<MythicSharkoSitEntity>> {
	public MythicSharkoSitRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelboyositnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoSitEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/mythicsharkonewtamed.png");
	}

	private static final class AnimatedModel extends Modelboyositnew<MythicSharkoSitEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MythicSharkoSitEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MythicSharkoSitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyositnewAnimation.SharkoSitIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MythicSharkoSitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
