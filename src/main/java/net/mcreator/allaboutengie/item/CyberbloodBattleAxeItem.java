package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CyberbloodBattleAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 1050, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:cyberblood_battle_axe_repair_items")));

	public CyberbloodBattleAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 99f, -3f, properties);
	}
}