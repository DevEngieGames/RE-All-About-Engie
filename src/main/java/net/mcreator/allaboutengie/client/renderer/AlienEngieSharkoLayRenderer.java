
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.allaboutengie.procedures.AlienEngieSharkoTamedDisplayConditionProcedure;
import net.mcreator.allaboutengie.entity.AlienEngieSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.animations.engiedaboyositAnimation;
import net.mcreator.allaboutengie.client.model.Modelalienengiesharkolay;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AlienEngieSharkoLayRenderer extends MobRenderer<AlienEngieSharkoLayEntity, Modelalienengiesharkolay<AlienEngieSharkoLayEntity>> {
	public AlienEngieSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelalienengiesharkolay.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AlienEngieSharkoLayEntity, Modelalienengiesharkolay<AlienEngieSharkoLayEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("allaboutengie:textures/entities/alienengiesharko_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AlienEngieSharkoLayEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AlienEngieSharkoTamedDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AlienEngieSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/alienengiesharko.png");
	}

	private static final class AnimatedModel extends Modelalienengiesharkolay<AlienEngieSharkoLayEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<AlienEngieSharkoLayEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(AlienEngieSharkoLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, engiedaboyositAnimation.SharkoLayIdle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(AlienEngieSharkoLayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
