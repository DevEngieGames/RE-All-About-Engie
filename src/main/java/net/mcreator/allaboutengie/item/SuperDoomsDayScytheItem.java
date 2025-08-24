
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.procedures.SuperDoomsdayObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class SuperDoomsDayScytheItem extends SwordItem {
	public SuperDoomsDayScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 24000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5996f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
			}
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.allaboutengie.super_doomsday_scythe.description_0"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SuperDoomsdayObtainProProcedure.execute(entity);
	}
}
