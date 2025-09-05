package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteInsanityPlushItem extends Item {
	public NetheriteInsanityPlushItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}