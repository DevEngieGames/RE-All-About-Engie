package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterTheEndAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 19000, 75f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_the_end_axe_repair_items")));

	public AntimatterTheEndAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 949f, 5f, properties);
	}
}