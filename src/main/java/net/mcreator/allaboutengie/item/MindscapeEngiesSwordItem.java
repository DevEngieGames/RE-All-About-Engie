package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MindscapeEngiesSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 48f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:mindscape_engies_sword_repair_items")));

	public MindscapeEngiesSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 499f, 1.4f, properties);
	}
}