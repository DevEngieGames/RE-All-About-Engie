package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrucifixItem extends Item {
	public CrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(50));
	}
}