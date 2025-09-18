package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class UncommonPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:uncommon_pickaxe_repair_items")));

	public UncommonPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -2.8f, properties);
	}
}