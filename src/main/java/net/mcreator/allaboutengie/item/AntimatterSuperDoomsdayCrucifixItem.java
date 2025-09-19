package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterSuperDoomsdayCrucifixItem extends Item {
	public AntimatterSuperDoomsdayCrucifixItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(350).enchantable(22));
	}
}