package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteAngryEngiePlushItem extends Item {
	public NetheriteAngryEngiePlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}