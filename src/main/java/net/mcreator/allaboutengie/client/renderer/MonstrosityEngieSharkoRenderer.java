
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoother;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MonstrosityEngieSharkoRenderer extends MobRenderer<MonstrosityEngieSharkoEntity, Modelboyoother<MonstrosityEngieSharkoEntity>> {
	public MonstrosityEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoother<MonstrosityEngieSharkoEntity>(context.bakeLayer(Modelboyoother.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<MonstrosityEngieSharkoEntity, Modelboyoother<MonstrosityEngieSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("allaboutengie:textures/entities/monstrosityboyo.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MonstrosityEngieSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/monstrosityboyo.png");
	}
}
