package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MonstrosityEngiePlushItem extends Item {
	public MonstrosityEngiePlushItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}