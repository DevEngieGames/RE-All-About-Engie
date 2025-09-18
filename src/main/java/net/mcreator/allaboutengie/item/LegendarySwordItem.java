package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class LegendarySwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2032, 9f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:legendary_sword_repair_items")));

	public LegendarySwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -2.4f, properties);
	}
}