package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OutragedEngieEssenceItem extends Item {
	public OutragedEngieEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}