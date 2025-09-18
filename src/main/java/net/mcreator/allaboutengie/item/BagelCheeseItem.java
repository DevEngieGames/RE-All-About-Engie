package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BagelCheeseItem extends Item {
	public BagelCheeseItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.4f).build()));
	}
}