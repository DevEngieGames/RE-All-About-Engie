package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterMonstrosityEngieHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 16000, 66f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_hoe_repair_items")));

	public AntimatterMonstrosityEngieHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 774f, 3.8f, properties);
	}
}