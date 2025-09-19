package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterBiblicallyAccurateEngieHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15000, 63f, 0, 20,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_hoe_repair_items")));

	public AntimatterBiblicallyAccurateEngieHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 724f, 3.4f, properties);
	}
}