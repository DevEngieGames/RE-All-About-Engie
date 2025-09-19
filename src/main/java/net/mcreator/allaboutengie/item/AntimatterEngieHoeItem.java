package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterEngieHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 11000, 51f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_engie_hoe_repair_items")));

	public AntimatterEngieHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 524f, 1.8f, properties);
	}
}