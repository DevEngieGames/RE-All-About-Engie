package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondInsanityPlushItem extends Item {
	public DiamondInsanityPlushItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}