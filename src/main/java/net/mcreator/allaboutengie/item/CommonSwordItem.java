package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CommonSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:common_sword_repair_items")));

	public CommonSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -2.4f, properties);
	}
}