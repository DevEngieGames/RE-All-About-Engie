package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BagelCookedItem extends Item {
	public BagelCookedItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.3f).build(), Consumables.defaultFood().consumeSeconds(1.5F).build()));
	}
}