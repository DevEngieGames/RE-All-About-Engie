
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.client.model.Modelangry_new;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngryEngieRenderer extends MobRenderer<AngryEngieEntity, Modelangry_new<AngryEngieEntity>> {
	public AngryEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangry_new<AngryEngieEntity>(context.bakeLayer(Modelangry_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AngryEngieEntity, Modelangry_new<AngryEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("allaboutengie:textures/entities/angrynew_g.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/angrynew.png");
	}
}
