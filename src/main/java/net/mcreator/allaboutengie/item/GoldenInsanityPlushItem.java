package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldenInsanityPlushItem extends Item {
	public GoldenInsanityPlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}