package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModBlocks;

public class CustomRecipeBookOtherProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 95) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.EGG).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WATER_BUCKET).copy();
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
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.DOUGH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 96) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.MILK_BUCKET).copy();
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
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CHEESE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 97) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.DOUGH_WITH_SAUCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CHEESE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNCOOKED_PIZZA.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 98) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC", (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
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
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 0) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 1) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_OAK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 2) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_SPRUCE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_BIRCH.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_JUNGLE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_ACACIA.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_DARK_OAK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_CRIMSON.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 8) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.METAL_CHEST_WARPED.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") < 8) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 8) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC", 0);
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 99) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC2", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC2", (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC2", 60);
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 0) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 1) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 2) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 3) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 4) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 5) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.MONSTROSITY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 6) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.CYBER_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 7) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BLOOD_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 9) {
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.CYBERBLOOD_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTANIUM.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") < 10) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC2", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC2", 0);
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 100) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 101) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 102) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 103) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 104) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 105) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 106) {
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
				final ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
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
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CRUCIFIX.get()).copy();
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
