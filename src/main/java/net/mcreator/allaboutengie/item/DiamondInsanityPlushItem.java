package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondInsanityPlushItem extends Item {
	public DiamondInsanityPlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}