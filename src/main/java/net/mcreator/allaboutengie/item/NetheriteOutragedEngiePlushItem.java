package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteOutragedEngiePlushItem extends Item {
	public NetheriteOutragedEngiePlushItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}