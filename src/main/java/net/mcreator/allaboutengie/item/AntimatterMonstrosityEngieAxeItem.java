package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AntimatterMonstrosityEngieAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 16000, 66f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_axe_repair_items")));

	public AntimatterMonstrosityEngieAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 799f, 3.8f, properties);
	}
}