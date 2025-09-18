package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrucifixPixelItem extends Item {
	public CrucifixPixelItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(50));
	}
}