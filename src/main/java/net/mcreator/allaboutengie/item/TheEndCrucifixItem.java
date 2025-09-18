package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TheEndCrucifixItem extends Item {
	public TheEndCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(125).enchantable(22));
	}
}