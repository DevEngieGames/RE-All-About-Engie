package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class OperatorsShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 128000, 128000f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:operators_shovel_repair_items")));

	public OperatorsShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 127999f, -3f, properties.fireResistant());
	}
}