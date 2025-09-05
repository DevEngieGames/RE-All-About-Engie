package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModEnchantments;

public class EngieGamesTradeUITickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(3).getItem() : ItemStack.EMPTY).enchant(Enchantments.MENDING, 1);
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).enchant(AllaboutengieModEnchantments.ENGIES_BLESSING.get(),
					10);
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) >= 60 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) < 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIEGAMES_SWORD.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) >= 48 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) < 60 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GAMES_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) >= 36 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) < 48 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GAMES_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) >= 24 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) < 36 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GAMES_SHOVEL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) >= 12 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) < 24 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GAMES_HOE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) == 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_REAL_ENGIE_GAMESS_HELMET.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 48 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) < 64 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) == 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_REAL_ENGIE_GAMESS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 32 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) < 48 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) == 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_REAL_ENGIE_GAMESS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) >= 16 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) < 32 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) == 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player player && player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack stack = _menu.getSlots().get(sltid).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 64) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_REAL_ENGIE_GAMESS_BOOTS.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}