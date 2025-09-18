package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CommonPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:common_pickaxe_repair_items")));

	public CommonPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -2.8f, properties);
	}
}