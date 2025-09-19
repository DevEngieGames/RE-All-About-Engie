package net.mcreator.allaboutengie.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.procedures.DoomsdayObtainProProcedure;

import java.util.List;

public class AntimatterDoomsdayScytheItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 60000, 4f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_doomsday_scythe_repair_items")));

	public AntimatterDoomsdayScytheItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 14999f, -3f, properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.allaboutengie.antimatter_doomsday_scythe.description_0"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		DoomsdayObtainProProcedure.execute(entity, itemstack);
	}
}