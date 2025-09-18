package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MindscapeEngiesPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 48f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:mindscape_engies_pickaxe_repair_items")));

	public MindscapeEngiesPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 474f, 1.4f, properties);
	}
}