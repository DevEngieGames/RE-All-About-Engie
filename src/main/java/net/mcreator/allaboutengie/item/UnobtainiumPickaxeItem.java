package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class UnobtainiumPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5080, 12f, 0, 30, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:unobtainium_pickaxe_repair_items")));

	public UnobtainiumPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -2.8f, properties);
	}
}