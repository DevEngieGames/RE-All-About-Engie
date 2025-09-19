package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModMenus;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class DoomsDayAntimatterTradeUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Player _entity0 && _entity0.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(1, "scythetrade", false) : false)
				|| !((entity instanceof Player _entity1 && _entity1.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(1, "bantrade", false) : false)) {
			AllaboutengieModVariables.MapVariables.get(world).checkboxbothnomarked = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			AllaboutengieModVariables.MapVariables.get(world).checkboxbothmarked = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		} else if (((entity instanceof Player _entity2 && _entity2.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(1, "scythetrade", false) : false)
				&& ((entity instanceof Player _entity3 && _entity3.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu3) ? _menu3.getMenuState(1, "bantrade", false) : false)) {
			AllaboutengieModVariables.MapVariables.get(world).checkboxbothnomarked = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			AllaboutengieModVariables.MapVariables.get(world).checkboxbothmarked = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		} else if (!((entity instanceof Player _entity4 && _entity4.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu4) ? _menu4.getMenuState(1, "scythetrade", false) : false)
				&& !((entity instanceof Player _entity5 && _entity5.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu5) ? _menu5.getMenuState(1, "bantrade", false) : false) && getAmountInGUISlot(entity, 0) >= 64
				&& getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 1) < 64) {
			AllaboutengieModVariables.MapVariables.get(world).checkboxbothnomarked = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			AllaboutengieModVariables.MapVariables.get(world).checkboxbothmarked = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 60 && getAmountInGUISlot(entity, 1) < 64) {
			if (((entity instanceof Player _entity15 && _entity15.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu15) ? _menu15.getMenuState(1, "scythetrade", false) : false)
					&& !((entity instanceof Player _entity16 && _entity16.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu16) ? _menu16.getMenuState(1, "bantrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SCYTHE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (((entity instanceof Player _entity18 && _entity18.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu18) ? _menu18.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity19 && _entity19.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu19) ? _menu19.getMenuState(1, "scythetrade", false) : false)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_BAN_HAMMER.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(2).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (!((entity instanceof Player _entity21 && _entity21.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu21) ? _menu21.getMenuState(1, "bantrade", false) : false)
					&& !((entity instanceof Player _entity22 && _entity22.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu22) ? _menu22.getMenuState(1, "scythetrade", false) : false)) {
				if (AllaboutengieModVariables.MapVariables.get(world).itemswap1 == false) {
					entity.getPersistentData().putDouble("itemswap1", (entity.getPersistentData().getDouble("itemswap1") + 0.05));
					if (entity.getPersistentData().getDouble("itemswap1") >= 5) {
						entity.getPersistentData().putDouble("itemswap1", 0);
						entity.getPersistentData().putDouble("itemswap2", 0);
						if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SCYTHE.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(2).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						AllaboutengieModVariables.MapVariables.get(world).itemswap1 = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).itemswap2 = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).itemswap2 == false) {
					entity.getPersistentData().putDouble("itemswap2", (entity.getPersistentData().getDouble("itemswap2") + 0.05));
					if (entity.getPersistentData().getDouble("itemswap2") >= 5) {
						entity.getPersistentData().putDouble("itemswap1", 0);
						entity.getPersistentData().putDouble("itemswap2", 0);
						if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_BAN_HAMMER.get()).copy();
							_setstack.setCount(1);
							_menu.getSlots().get(2).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						AllaboutengieModVariables.MapVariables.get(world).itemswap1 = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).itemswap2 = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 52 && getAmountInGUISlot(entity, 1) < 60) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAYS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 48 && getAmountInGUISlot(entity, 1) < 54) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAYS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 32 && getAmountInGUISlot(entity, 1) < 48) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAYS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 64 && getAmountInGUISlot(entity, 1) >= 16 && getAmountInGUISlot(entity, 1) < 32) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAYS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 60 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 48 && getAmountInGUISlot(entity, 0) < 60 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 36 && getAmountInGUISlot(entity, 0) < 48 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 24 && getAmountInGUISlot(entity, 0) < 36 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (getAmountInGUISlot(entity, 0) >= 12 && getAmountInGUISlot(entity, 0) < 24 && getAmountInGUISlot(entity, 1) == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (((entity instanceof Player _entity70 && _entity70.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu70) ? _menu70.getMenuState(1, "scythetrade", false) : false)
				&& ((entity instanceof Player _entity71 && _entity71.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu71) ? _menu71.getMenuState(1, "bantrade", false) : false)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}