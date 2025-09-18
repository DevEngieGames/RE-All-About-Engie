package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class UncommonShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:uncommon_shovel_repair_items")));

	public UncommonShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0.75f, -3f, properties);
	}
}