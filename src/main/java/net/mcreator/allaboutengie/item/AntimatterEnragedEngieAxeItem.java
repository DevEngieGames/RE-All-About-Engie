package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterEnragedEngieAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 13000, 57f, 0, 18, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_axe_repair_items")));

	public AntimatterEnragedEngieAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 649f, 2.6f, properties);
	}
}