package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnragedEngieEssenceItem extends Item {
	public EnragedEngieEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}