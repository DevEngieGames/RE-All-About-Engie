package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AntimatterEngieGamesTradeUIButtonClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_CRUCIFIX.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_CRUCIFIX.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(4).getItem() : ItemStack.EMPTY)
							.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing"))), 10);
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(4).getItem() : ItemStack.EMPTY)
							.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
				});
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu13 ? _menu13.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(60);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_PICKAXE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(52);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(48);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_PICKAXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_AXE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(48);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(36);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_AXE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu37 ? _menu37.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_SHOVEL.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(24);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_SHOVEL.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu45 ? _menu45.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_HOE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(12);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_HOE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu53 ? _menu53.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_HELMET.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_HELMET.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu61 ? _menu61.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_CHESTPLATE.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(48);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu69 ? _menu69.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_LEGGINGS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(32);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu77 ? _menu77.getSlots().get(3).getItem() : ItemStack.EMPTY)
				.getItem() == AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_BOOTS.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(64);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(16);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(0);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_BOOTS.get()).copy();
					_setstack.setCount(1);
					_menu.getSlots().get(4).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
	}
}