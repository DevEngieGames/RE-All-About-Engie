package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.HeWhoGamesEntity;
import net.mcreator.allaboutengie.client.model.ModelHeWhoGames;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HeWhoGamesRenderer extends MobRenderer<HeWhoGamesEntity, ModelHeWhoGames<HeWhoGamesEntity>> {
	public HeWhoGamesRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHeWhoGames<HeWhoGamesEntity>(context.bakeLayer(ModelHeWhoGames.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<HeWhoGamesEntity, ModelHeWhoGames<HeWhoGamesEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("allaboutengie:textures/entities/hewhogames_g.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HeWhoGamesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HeWhoGamesEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/hewhogames.png");
	}
}