
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class EngieGamesPickaxeItem extends PickaxeItem {
	public EngieGamesPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 25000;
			}

			public float getSpeed() {
				return 52f;
			}

			public float getAttackDamageBonus() {
				return 498f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
			}
		}, 1, 1.5f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.allaboutengie.engie_games_pickaxe.description_0"));
	}
}
