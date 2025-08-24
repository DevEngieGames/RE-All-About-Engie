
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlienEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelalienengiesharko;

public class AlienEngieSharkoRenderer extends MobRenderer<AlienEngieSharkoEntity, Modelalienengiesharko<AlienEngieSharkoEntity>> {
	public AlienEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalienengiesharko<AlienEngieSharkoEntity>(context.bakeLayer(Modelalienengiesharko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlienEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/alienengiesharko.png");
	}
}
