package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MindscapeCrucifixItem extends Item {
	public MindscapeCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(200));
	}
}