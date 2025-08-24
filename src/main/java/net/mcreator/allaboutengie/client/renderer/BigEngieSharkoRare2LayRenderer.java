
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.client.model.animations.boyositAnimation;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigEngieSharkoRare2LayRenderer extends MobRenderer<BigEngieSharkoRare2LayEntity, Modelbigboyosit<BigEngieSharkoRare2LayEntity>> {
	public BigEngieSharkoRare2LayRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoRare2LayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigrareengiesharko2newtamed.png");
	}

	private static final class AnimatedModel extends Modelbigboyosit<BigEngieSharkoRare2LayEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BigEngieSharkoRare2LayEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BigEngieSharkoRare2LayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, boyositAnimation.SharkoLayIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BigEngieSharkoRare2LayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
