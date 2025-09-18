package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CodeRedeemersHammerItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 6900, 4f, 0, 128000, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:code_redeemers_hammer_repair_items")));

	public CodeRedeemersHammerItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 689f, -3f, properties);
	}
}