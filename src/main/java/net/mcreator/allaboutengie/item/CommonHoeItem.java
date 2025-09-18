package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CommonHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:common_hoe_repair_items")));

	public CommonHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -3f, properties);
	}
}