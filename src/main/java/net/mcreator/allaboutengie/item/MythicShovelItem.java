package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MythicShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3048, 10f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:mythic_shovel_repair_items")));

	public MythicShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2.75f, -3f, properties);
	}
}