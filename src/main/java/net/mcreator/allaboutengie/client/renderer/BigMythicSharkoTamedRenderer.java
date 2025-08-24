
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.BigMythicSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.animations.boyoAnimation;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigMythicSharkoTamedRenderer extends MobRenderer<BigMythicSharkoTamedEntity, Modelbigboyo<BigMythicSharkoTamedEntity>> {
	public BigMythicSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigmythicsharkonewtamed.png");
	}

	private static final class AnimatedModel extends Modelbigboyo<BigMythicSharkoTamedEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BigMythicSharkoTamedEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BigMythicSharkoTamedEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyoAnimation.SharkoIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BigMythicSharkoTamedEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
