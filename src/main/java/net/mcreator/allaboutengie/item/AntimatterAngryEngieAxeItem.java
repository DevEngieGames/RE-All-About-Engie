package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterAngryEngieAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12000, 54f, 0, 17, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_angry_engie_axe_repair_items")));

	public AntimatterAngryEngieAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 599f, 2.2f, properties);
	}
}