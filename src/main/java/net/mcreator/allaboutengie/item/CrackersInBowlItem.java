package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.allaboutengie.procedures.CrackersInBowlOnPlayerStoppedUsingProcedure;

public class CrackersInBowlItem extends Item {
	public CrackersInBowlItem(Item.Properties properties) {
		super(properties.durability(21).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()).usingConvertsTo(Items.BOWL));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		CrackersInBowlOnPlayerStoppedUsingProcedure.execute(world, entity, itemstack);
		return retval;
	}
}