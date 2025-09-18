package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BagelCheeseCookedItem extends Item {
	public BagelCheeseCookedItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.5f).build()));
	}
}