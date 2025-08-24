package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class CustomRecipeBookArmorProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 25) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 26) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 27) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 28) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 29) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 30) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 31) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 32) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 33) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 34) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 35) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 36) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 37) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 38) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 39) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 40) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 37) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 38) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 39) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 40) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 37) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 38) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 39) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 40) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 41) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 42) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 43) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 44) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 45) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 46) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 47) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 48) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 49) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_HELMET.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 50) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_CHESTPLATE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 51) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_LEGGINGS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 52) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_BOOTS.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
	}
}
