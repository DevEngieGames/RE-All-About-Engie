package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class TheEndTradeButtonClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_CRUCIFIX.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_CRUCIFIX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_SCYTHE
				.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_BAN_HAMMER
						.get()) {
			if ((entity instanceof Player _entity11 && _entity11.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu11) ? _menu11.getMenuState(1, "scythetrade", false) : false) {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(64);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove(60);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(2).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_SCYTHE.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				});
			} else if ((entity instanceof Player _entity17 && _entity17.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu17) ? _menu17.getMenuState(1, "bantrade", false) : false) {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(64);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove(60);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(2).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_BAN_HAMMER.get()).copy();
						_setstack.setCount(1);
						_menu.getSlots().get(3).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				});
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_ENDS_BOOTS
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(54);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_ENDS_BOOTS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.THE_ENDS_LEGGINGS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(48);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_ENDS_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu37 ? _menu37.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.THE_ENDS_CHESTPLATE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(32);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_ENDS_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_ENDS_HELMET
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(16);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_ENDS_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu51 ? _menu51.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_HOE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(60);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_SHOVEL
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(48);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu65 ? _menu65.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_AXE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(36);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_PICKAXE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(24);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu79 ? _menu79.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_SWORD
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(12);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_SWORD.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(3).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
	}
}