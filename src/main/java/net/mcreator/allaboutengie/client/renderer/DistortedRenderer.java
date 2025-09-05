package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.DistortedEntity;

public class DistortedRenderer extends HumanoidMobRenderer<DistortedEntity, HumanoidModel<DistortedEntity>> {
	public DistortedRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<DistortedEntity>(context.bakeLayer(ModelLayers.PLAYER)), 2.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(DistortedEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/distortedentity.png");
	}
}