
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class EngiesSwordItem extends SwordItem {
	public EngiesSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 8000;
			}

			public float getSpeed() {
				return 42f;
			}

			public float getAttackDamageBonus() {
				return 396f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
			}
		}, 3, 0.6f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.allaboutengie.engies_sword.description_0"));
	}
}
