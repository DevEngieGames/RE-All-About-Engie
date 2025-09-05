package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.NormalEntity;
import net.mcreator.allaboutengie.client.model.Modelmissilebombs;

public class NormalRenderer extends MobRenderer<NormalEntity, Modelmissilebombs<NormalEntity>> {
	public NormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<NormalEntity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(NormalEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/normal.png");
	}
}