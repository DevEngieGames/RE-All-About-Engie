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

import net.mcreator.allaboutengie.procedures.EngieToolObtainProcedure;

public class AntimatterEngieSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 11000, 51f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_engie_sword_repair_items")));

	public AntimatterEngieSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 549f, 1.8f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EngieToolObtainProcedure.execute(entity, itemstack);
	}
}