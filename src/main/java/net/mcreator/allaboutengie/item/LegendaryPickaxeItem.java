package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class LegendaryPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2032, 9f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:legendary_pickaxe_repair_items")));

	public LegendaryPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5f, -2.8f, properties);
	}
}