package net.mcreator.allaboutengie.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.procedures.AllAboutEngieXXLWitherRoseSecretItemInInventoryTickProcedure;

import java.util.List;

public class AllAboutEngieXXLWitherRoseSecretItem extends Item {
	public AllAboutEngieXXLWitherRoseSecretItem(Item.Properties properties) {
		super(properties.fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.allaboutengie.all_about_engie_xxl_wither_rose_secret.description_0"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AllAboutEngieXXLWitherRoseSecretItemInInventoryTickProcedure.execute(entity);
	}
}