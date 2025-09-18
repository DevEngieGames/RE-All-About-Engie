package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ProtogenEntity;
import net.mcreator.allaboutengie.client.model.Modelprotogen;

public class ProtogenRenderer extends MobRenderer<ProtogenEntity, LivingEntityRenderState, Modelprotogen> {
	private ProtogenEntity entity = null;

	public ProtogenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprotogen(context.bakeLayer(Modelprotogen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ProtogenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("allaboutengie:textures/entities/protogen.png");
	}
}