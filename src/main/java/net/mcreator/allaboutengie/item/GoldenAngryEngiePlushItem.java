package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldenAngryEngiePlushItem extends Item {
	public GoldenAngryEngiePlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}