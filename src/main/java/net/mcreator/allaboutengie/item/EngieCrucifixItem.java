package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EngieCrucifixItem extends Item {
	public EngieCrucifixItem() {
		super(new Item.Properties().durability(150).rarity(Rarity.EPIC));
	}
}