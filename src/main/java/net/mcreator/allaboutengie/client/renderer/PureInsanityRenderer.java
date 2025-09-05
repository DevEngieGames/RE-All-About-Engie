package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.PureInsanityEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PureInsanityRenderer extends MobRenderer<PureInsanityEntity, ModelEngieGames<PureInsanityEntity>> {
	public PureInsanityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames<PureInsanityEntity>(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PureInsanityEntity, ModelEngieGames<PureInsanityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("allaboutengie:textures/entities/pureinsanity_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PureInsanityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PureInsanityEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/pureinsanity.png");
	}
}