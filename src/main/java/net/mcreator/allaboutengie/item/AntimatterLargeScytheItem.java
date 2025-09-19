package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.procedures.LargeBanObtainProProcedure;

public class AntimatterLargeScytheItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 42112, 4f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_large_scythe_repair_items")));

	public AntimatterLargeScytheItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 10527f, -1.5f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		LargeBanObtainProProcedure.execute(world, entity, itemstack);
	}
}