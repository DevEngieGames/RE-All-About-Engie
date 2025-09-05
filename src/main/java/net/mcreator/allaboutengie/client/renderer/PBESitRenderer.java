package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.PBESitEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyositnewAnimation;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyositnew;

public class PBESitRenderer extends MobRenderer<PBESitEntity, Modelengiedaboyositnew<PBESitEntity>> {
	public PBESitRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelengiedaboyositnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBESitEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/engiedasharko2.png");
	}

	private static final class AnimatedModel extends Modelengiedaboyositnew<PBESitEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PBESitEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PBESitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyositnewAnimation.EngieDaSharkoSitIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PBESitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}