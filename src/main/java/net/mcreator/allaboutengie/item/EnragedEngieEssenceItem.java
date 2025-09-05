package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnragedEngieEssenceItem extends Item {
	public EnragedEngieEssenceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}