package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CyberbloodKatanaItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 1050, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:cyberblood_katana_repair_items")));

	public CyberbloodKatanaItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 74f, 6f, properties);
	}
}