package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EpicShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1016, 8f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:epic_shovel_repair_items")));

	public EpicShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1.75f, -3f, properties);
	}
}