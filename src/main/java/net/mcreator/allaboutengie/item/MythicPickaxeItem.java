package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MythicPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3048, 10f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:mythic_pickaxe_repair_items")));

	public MythicPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -2.8f, properties);
	}
}