package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EpicPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1016, 8f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:epic_pickaxe_repair_items")));

	public EpicPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -2.8f, properties);
	}
}