
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.client.model.Modelenraged_new;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EnragedEngieStyle3Renderer extends MobRenderer<EnragedEngieStyle3Entity, Modelenraged_new<EnragedEngieStyle3Entity>> {
	public EnragedEngieStyle3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_new<EnragedEngieStyle3Entity>(context.bakeLayer(Modelenraged_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<EnragedEngieStyle3Entity, Modelenraged_new<EnragedEngieStyle3Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("allaboutengie:textures/entities/enragednew_g.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EnragedEngieStyle3Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedEngieStyle3Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednew3.png");
	}
}
