package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.DDAYRiftEntity;
import net.mcreator.allaboutengie.client.model.Modelddayrift;

public class DDAYRiftRenderer extends MobRenderer<DDAYRiftEntity, Modelddayrift<DDAYRiftEntity>> {
	public DDAYRiftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelddayrift<DDAYRiftEntity>(context.bakeLayer(Modelddayrift.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDAYRiftEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/rifttexture.png");
	}
}