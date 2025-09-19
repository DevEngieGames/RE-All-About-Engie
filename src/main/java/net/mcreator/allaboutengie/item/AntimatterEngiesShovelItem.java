package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterEngiesShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 20000, 78f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_engies_shovel_repair_items")));

	public AntimatterEngiesShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 974f, 5.4f, properties);
	}
}