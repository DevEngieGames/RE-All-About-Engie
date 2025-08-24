
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class MindscapeEngiesSwordItem extends SwordItem {
	public MindscapeEngiesSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 48f;
			}

			public float getAttackDamageBonus() {
				return 496f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()), new ItemStack(AllaboutengieModItems.ENRAGED_COIN.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()),
						new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()), new ItemStack(AllaboutengieModItems.THE_END_COIN.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
			}
		}, 3, 1.4f, new Item.Properties());
	}
}
