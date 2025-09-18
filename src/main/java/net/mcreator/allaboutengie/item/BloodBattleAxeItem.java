package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BloodBattleAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 700, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:blood_battle_axe_repair_items")));

	public BloodBattleAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 49f, -3.5f, properties);
	}
}