package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlienEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelalienengiesharko;

public class AlienEngieSharkoRenderer extends MobRenderer<AlienEngieSharkoEntity, LivingEntityRenderState, Modelalienengiesharko> {
	private AlienEngieSharkoEntity entity = null;

	public AlienEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalienengiesharko(context.bakeLayer(Modelalienengiesharko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AlienEngieSharkoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("allaboutengie:textures/entities/alienengiesharko.png");
	}
}