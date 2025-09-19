package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterEnragedEngieShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 13000, 57f, 0, 18, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_shovel_repair_items")));

	public AntimatterEnragedEngieShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 624f, 2.6f, properties);
	}
}