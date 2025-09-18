package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class OutragedEngieToolObtainProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == AllaboutengieModItems.OUTRAGED_ENGIE_SWORD.get()) {
			if ((entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.OUTRAGED_ENGIE_PICKAXE.get()) {
			if ((entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
					&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.OUTRAGED_ENGIE_AXE.get()) {
			if ((entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
					&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.OUTRAGED_ENGIE_SHOVEL.get()) {
			if ((entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel
					&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.OUTRAGED_ENGIE_HOE.get()) {
			if ((entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
					&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.OUTRAGED_ENGIE_PAXEL.get()) {
			if ((entity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
					&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (itemstack.getItem() == AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_SWORD.get()) {
			if ((entity instanceof ServerPlayer _plr26 && _plr26.level() instanceof ServerLevel
					&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_PICKAXE.get()) {
			if ((entity instanceof ServerPlayer _plr30 && _plr30.level() instanceof ServerLevel
					&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_AXE.get()) {
			if ((entity instanceof ServerPlayer _plr34 && _plr34.level() instanceof ServerLevel
					&& _plr34.getAdvancements().getOrStartProgress(_plr34.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_SHOVEL.get()) {
			if ((entity instanceof ServerPlayer _plr38 && _plr38.level() instanceof ServerLevel
					&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_HOE.get()) {
			if ((entity instanceof ServerPlayer _plr42 && _plr42.level() instanceof ServerLevel
					&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (itemstack.getItem() == AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_PAXEL.get()) {
			if ((entity instanceof ServerPlayer _plr46 && _plr46.level() instanceof ServerLevel
					&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_tools_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}
}