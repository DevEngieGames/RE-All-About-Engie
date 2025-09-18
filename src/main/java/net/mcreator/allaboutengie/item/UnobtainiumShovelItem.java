package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class UnobtainiumShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5080, 12f, 0, 30, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:unobtainium_shovel_repair_items")));

	public UnobtainiumShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3.75f, -3f, properties);
	}
}