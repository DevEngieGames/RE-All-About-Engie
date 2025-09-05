package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.OutragedEngieStyle2Entity;
import net.mcreator.allaboutengie.client.model.Modeloutraged_new;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OutragedEngieStyle2Renderer extends MobRenderer<OutragedEngieStyle2Entity, Modeloutraged_new<OutragedEngieStyle2Entity>> {
	public OutragedEngieStyle2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeloutraged_new<OutragedEngieStyle2Entity>(context.bakeLayer(Modeloutraged_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<OutragedEngieStyle2Entity, Modeloutraged_new<OutragedEngieStyle2Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("allaboutengie:textures/entities/outragednew_g.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, OutragedEngieStyle2Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OutragedEngieStyle2Entity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/outragednew2.png");
	}
}