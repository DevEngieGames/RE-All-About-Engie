package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ThrowbackBanHammerItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 750, 4f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:throwback_ban_hammer_repair_items")));

	public ThrowbackBanHammerItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 149f, -2.75f, properties);
	}
}