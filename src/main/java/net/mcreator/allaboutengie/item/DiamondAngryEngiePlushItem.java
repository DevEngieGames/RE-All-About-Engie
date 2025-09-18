package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondAngryEngiePlushItem extends Item {
	public DiamondAngryEngiePlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}