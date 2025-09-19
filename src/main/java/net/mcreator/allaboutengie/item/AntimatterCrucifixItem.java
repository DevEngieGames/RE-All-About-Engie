package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterCrucifixItem extends Item {
	public AntimatterCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(300));
	}
}