
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class TheEndHoeItem extends HoeItem {
	public TheEndHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 7000;
			}

			public float getSpeed() {
				return 39f;
			}

			public float getAttackDamageBonus() {
				return 324f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
			}
		}, 0, 0.2f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.allaboutengie.the_end_hoe.description_0"));
	}
}
