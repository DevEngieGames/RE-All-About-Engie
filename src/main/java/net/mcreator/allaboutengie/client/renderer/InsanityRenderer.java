package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class InsanityRenderer extends MobRenderer<InsanityEntity, ModelEngieGames<InsanityEntity>> {
	public InsanityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames<InsanityEntity>(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<InsanityEntity, ModelEngieGames<InsanityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("allaboutengie:textures/entities/insanity_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, InsanityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(InsanityEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/insanity.png");
	}
}