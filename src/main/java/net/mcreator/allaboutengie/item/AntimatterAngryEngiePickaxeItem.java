package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterAngryEngiePickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12000, 54f, 0, 17, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_angry_engie_pickaxe_repair_items")));

	public AntimatterAngryEngiePickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 574f, 2.2f, properties);
	}
}