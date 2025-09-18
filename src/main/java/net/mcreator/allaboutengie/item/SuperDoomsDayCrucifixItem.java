package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SuperDoomsDayCrucifixItem extends Item {
	public SuperDoomsDayCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(100).enchantable(22));
	}
}