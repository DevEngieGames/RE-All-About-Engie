package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EngieCrucifixItem extends Item {
	public EngieCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(150).enchantable(22));
	}
}