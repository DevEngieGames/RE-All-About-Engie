package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ExoticPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4064, 11f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:exotic_pickaxe_repair_items")));

	public ExoticPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -2.8f, properties);
	}
}