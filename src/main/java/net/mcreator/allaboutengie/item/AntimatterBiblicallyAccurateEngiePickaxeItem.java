package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterBiblicallyAccurateEngiePickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15000, 63f, 0, 20,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_pickaxe_repair_items")));

	public AntimatterBiblicallyAccurateEngiePickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 724f, 3.4f, properties);
	}
}