
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.AngryEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoother;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngryEngieSharkoRenderer extends MobRenderer<AngryEngieSharkoEntity, Modelboyoother<AngryEngieSharkoEntity>> {
	public AngryEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoother<AngryEngieSharkoEntity>(context.bakeLayer(Modelboyoother.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AngryEngieSharkoEntity, Modelboyoother<AngryEngieSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("allaboutengie:textures/entities/angryengieboyo.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryEngieSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/angryengieboyo.png");
	}
}
