package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.TheRealEngieGamesEntity;

public class TheRealEngieGamesRenderer extends HumanoidMobRenderer<TheRealEngieGamesEntity, HumanoidModel<TheRealEngieGamesEntity>> {
	public TheRealEngieGamesRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<TheRealEngieGamesEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(TheRealEngieGamesEntity entity) {
		return ResourceLocation.parse("allaboutengie:textures/entities/78c5d915f6017698e3d78166f211f09508db5a56.png");
	}
}