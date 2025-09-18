package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.client.model.ModelMadEngie;

public class MadEngieRenderer extends MobRenderer<MadEngieEntity, LivingEntityRenderState, ModelMadEngie> {
	private MadEngieEntity entity = null;

	public MadEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMadEngie(context.bakeLayer(ModelMadEngie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MadEngieEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("allaboutengie:textures/entities/madengienew.png");
	}
}