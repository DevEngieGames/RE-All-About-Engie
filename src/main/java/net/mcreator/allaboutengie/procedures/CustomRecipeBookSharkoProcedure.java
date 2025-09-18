package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class CustomRecipeBookSharkoProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 83) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") == 0) {
				{
					final String _tagName = "RecipeBookTimer";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") > 0) {
				{
					final String _tagName = "RecipeBookTimer";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") < 7) {
				{
					final String _tagName = "RecipeBookGroupID";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 7) {
				{
					final String _tagName = "RecipeBookGroupID";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 84) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") == 0) {
				{
					final String _tagName = "RecipeBookTimer2";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") > 0) {
				{
					final String _tagName = "RecipeBookTimer2";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer2";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") < 7) {
				{
					final String _tagName = "RecipeBookGroupID2";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 7) {
				{
					final String _tagName = "RecipeBookGroupID2";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 85) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") == 0) {
				{
					final String _tagName = "RecipeBookTimer3";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") > 0) {
				{
					final String _tagName = "RecipeBookTimer3";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer3";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") < 7) {
				{
					final String _tagName = "RecipeBookGroupID3";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 7) {
				{
					final String _tagName = "RecipeBookGroupID3";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 86) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") == 0) {
				{
					final String _tagName = "RecipeBookTimer4";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") > 0) {
				{
					final String _tagName = "RecipeBookTimer4";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer4";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") < 7) {
				{
					final String _tagName = "RecipeBookGroupID4";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 7) {
				{
					final String _tagName = "RecipeBookGroupID4";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 87) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.BLUE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 88) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 89) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 90) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.RARE_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 91) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.EPIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 92) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 93) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).pageNumber == 94) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.NETHERITE_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		}
	}
}