package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterEngieGamesCrucifixItem extends Item {
	public AntimatterEngieGamesCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(500).enchantable(22));
	}
}