package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class EngieSharkoRareTamedZoomiesTiredRenderer extends MobRenderer<EngieSharkoRareTamedZoomiesTiredEntity, Modelboyozoomtired<EngieSharkoRareTamedZoomiesTiredEntity>> {
	public EngieSharkoRareTamedZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired<EngieSharkoRareTamedZoomiesTiredEntity>(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareTamedZoomiesTiredEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/rareengiesharkonewtamedzoomtired.png");
	}
}