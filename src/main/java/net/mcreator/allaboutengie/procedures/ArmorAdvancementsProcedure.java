package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ArmorAdvancementsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
					&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
					&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
					&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
					&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel
					&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
					&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
					&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:engie_armor_made"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr21 && _plr21.level() instanceof ServerLevel
					&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr23 && _plr23.level() instanceof ServerLevel
					&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr26 && _plr26.level() instanceof ServerLevel
					&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr28 && _plr28.level() instanceof ServerLevel
					&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr31 && _plr31.level() instanceof ServerLevel
					&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr33 && _plr33.level() instanceof ServerLevel
					&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
					&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr38 && _plr38.level() instanceof ServerLevel
					&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:angry_engie_armor_made"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr41 && _plr41.level() instanceof ServerLevel
					&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr43 && _plr43.level() instanceof ServerLevel
					&& _plr43.getAdvancements().getOrStartProgress(_plr43.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr46 && _plr46.level() instanceof ServerLevel
					&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr48 && _plr48.level() instanceof ServerLevel
					&& _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr51 && _plr51.level() instanceof ServerLevel
					&& _plr51.getAdvancements().getOrStartProgress(_plr51.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr53 && _plr53.level() instanceof ServerLevel
					&& _plr53.getAdvancements().getOrStartProgress(_plr53.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr56 && _plr56.level() instanceof ServerLevel
					&& _plr56.getAdvancements().getOrStartProgress(_plr56.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr58 && _plr58.level() instanceof ServerLevel
					&& _plr58.getAdvancements().getOrStartProgress(_plr58.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:enraged_engie_armor_made"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr61 && _plr61.level() instanceof ServerLevel
					&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr63 && _plr63.level() instanceof ServerLevel
					&& _plr63.getAdvancements().getOrStartProgress(_plr63.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr66 && _plr66.level() instanceof ServerLevel
					&& _plr66.getAdvancements().getOrStartProgress(_plr66.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr68 && _plr68.level() instanceof ServerLevel
					&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr71 && _plr71.level() instanceof ServerLevel
					&& _plr71.getAdvancements().getOrStartProgress(_plr71.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr73 && _plr73.level() instanceof ServerLevel
					&& _plr73.getAdvancements().getOrStartProgress(_plr73.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr76 && _plr76.level() instanceof ServerLevel
					&& _plr76.getAdvancements().getOrStartProgress(_plr76.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr78 && _plr78.level() instanceof ServerLevel
					&& _plr78.getAdvancements().getOrStartProgress(_plr78.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:outraged_engie_armor_obtained"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr81 && _plr81.level() instanceof ServerLevel
					&& _plr81.getAdvancements().getOrStartProgress(_plr81.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr83 && _plr83.level() instanceof ServerLevel
					&& _plr83.getAdvancements().getOrStartProgress(_plr83.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr86 && _plr86.level() instanceof ServerLevel
					&& _plr86.getAdvancements().getOrStartProgress(_plr86.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr88 && _plr88.level() instanceof ServerLevel
					&& _plr88.getAdvancements().getOrStartProgress(_plr88.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr91 && _plr91.level() instanceof ServerLevel
					&& _plr91.getAdvancements().getOrStartProgress(_plr91.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr93 && _plr93.level() instanceof ServerLevel
					&& _plr93.getAdvancements().getOrStartProgress(_plr93.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr96 && _plr96.level() instanceof ServerLevel
					&& _plr96.getAdvancements().getOrStartProgress(_plr96.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr98 && _plr98.level() instanceof ServerLevel
					&& _plr98.getAdvancements().getOrStartProgress(_plr98.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_engie_armor_obtained"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr101 && _plr101.level() instanceof ServerLevel
					&& _plr101.getAdvancements().getOrStartProgress(_plr101.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr103 && _plr103.level() instanceof ServerLevel
					&& _plr103.getAdvancements().getOrStartProgress(_plr103.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr106 && _plr106.level() instanceof ServerLevel
					&& _plr106.getAdvancements().getOrStartProgress(_plr106.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr108 && _plr108.level() instanceof ServerLevel
					&& _plr108.getAdvancements().getOrStartProgress(_plr108.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr111 && _plr111.level() instanceof ServerLevel
					&& _plr111.getAdvancements().getOrStartProgress(_plr111.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr113 && _plr113.level() instanceof ServerLevel
					&& _plr113.getAdvancements().getOrStartProgress(_plr113.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr116 && _plr116.level() instanceof ServerLevel
					&& _plr116.getAdvancements().getOrStartProgress(_plr116.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr118 && _plr118.level() instanceof ServerLevel
					&& _plr118.getAdvancements().getOrStartProgress(_plr118.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_engie_armor_obtained"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr121 && _plr121.level() instanceof ServerLevel
					&& _plr121.getAdvancements().getOrStartProgress(_plr121.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr123 && _plr123.level() instanceof ServerLevel
					&& _plr123.getAdvancements().getOrStartProgress(_plr123.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr126 && _plr126.level() instanceof ServerLevel
					&& _plr126.getAdvancements().getOrStartProgress(_plr126.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr128 && _plr128.level() instanceof ServerLevel
					&& _plr128.getAdvancements().getOrStartProgress(_plr128.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr131 && _plr131.level() instanceof ServerLevel
					&& _plr131.getAdvancements().getOrStartProgress(_plr131.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr133 && _plr133.level() instanceof ServerLevel
					&& _plr133.getAdvancements().getOrStartProgress(_plr133.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr136 && _plr136.level() instanceof ServerLevel
					&& _plr136.getAdvancements().getOrStartProgress(_plr136.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr138 && _plr138.level() instanceof ServerLevel
					&& _plr138.getAdvancements().getOrStartProgress(_plr138.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_armor_made"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr141 && _plr141.level() instanceof ServerLevel
					&& _plr141.getAdvancements().getOrStartProgress(_plr141.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr143 && _plr143.level() instanceof ServerLevel
					&& _plr143.getAdvancements().getOrStartProgress(_plr143.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr146 && _plr146.level() instanceof ServerLevel
					&& _plr146.getAdvancements().getOrStartProgress(_plr146.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr148 && _plr148.level() instanceof ServerLevel
					&& _plr148.getAdvancements().getOrStartProgress(_plr148.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr151 && _plr151.level() instanceof ServerLevel
					&& _plr151.getAdvancements().getOrStartProgress(_plr151.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr153 && _plr153.level() instanceof ServerLevel
					&& _plr153.getAdvancements().getOrStartProgress(_plr153.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr156 && _plr156.level() instanceof ServerLevel
					&& _plr156.getAdvancements().getOrStartProgress(_plr156.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr158 && _plr158.level() instanceof ServerLevel
					&& _plr158.getAdvancements().getOrStartProgress(_plr158.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_angry_engie_armor_made"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr161 && _plr161.level() instanceof ServerLevel
					&& _plr161.getAdvancements().getOrStartProgress(_plr161.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr163 && _plr163.level() instanceof ServerLevel
					&& _plr163.getAdvancements().getOrStartProgress(_plr163.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr166 && _plr166.level() instanceof ServerLevel
					&& _plr166.getAdvancements().getOrStartProgress(_plr166.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr168 && _plr168.level() instanceof ServerLevel
					&& _plr168.getAdvancements().getOrStartProgress(_plr168.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr171 && _plr171.level() instanceof ServerLevel
					&& _plr171.getAdvancements().getOrStartProgress(_plr171.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr173 && _plr173.level() instanceof ServerLevel
					&& _plr173.getAdvancements().getOrStartProgress(_plr173.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr176 && _plr176.level() instanceof ServerLevel
					&& _plr176.getAdvancements().getOrStartProgress(_plr176.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr178 && _plr178.level() instanceof ServerLevel
					&& _plr178.getAdvancements().getOrStartProgress(_plr178.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enraged_engie_armor_made"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr181 && _plr181.level() instanceof ServerLevel
					&& _plr181.getAdvancements().getOrStartProgress(_plr181.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr183 && _plr183.level() instanceof ServerLevel
					&& _plr183.getAdvancements().getOrStartProgress(_plr183.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
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
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr186 && _plr186.level() instanceof ServerLevel
					&& _plr186.getAdvancements().getOrStartProgress(_plr186.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr188 && _plr188.level() instanceof ServerLevel
					&& _plr188.getAdvancements().getOrStartProgress(_plr188.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
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
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr191 && _plr191.level() instanceof ServerLevel
					&& _plr191.getAdvancements().getOrStartProgress(_plr191.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr193 && _plr193.level() instanceof ServerLevel
					&& _plr193.getAdvancements().getOrStartProgress(_plr193.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
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
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr196 && _plr196.level() instanceof ServerLevel
					&& _plr196.getAdvancements().getOrStartProgress(_plr196.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr198 && _plr198.level() instanceof ServerLevel
					&& _plr198.getAdvancements().getOrStartProgress(_plr198.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr201 && _plr201.level() instanceof ServerLevel
					&& _plr201.getAdvancements().getOrStartProgress(_plr201.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr203 && _plr203.level() instanceof ServerLevel
					&& _plr203.getAdvancements().getOrStartProgress(_plr203.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr206 && _plr206.level() instanceof ServerLevel
					&& _plr206.getAdvancements().getOrStartProgress(_plr206.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr208 && _plr208.level() instanceof ServerLevel
					&& _plr208.getAdvancements().getOrStartProgress(_plr208.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr211 && _plr211.level() instanceof ServerLevel
					&& _plr211.getAdvancements().getOrStartProgress(_plr211.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr213 && _plr213.level() instanceof ServerLevel
					&& _plr213.getAdvancements().getOrStartProgress(_plr213.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr216 && _plr216.level() instanceof ServerLevel
					&& _plr216.getAdvancements().getOrStartProgress(_plr216.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr218 && _plr218.level() instanceof ServerLevel
					&& _plr218.getAdvancements().getOrStartProgress(_plr218.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
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
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_HELMET.get()))) {
			if ((entity instanceof ServerPlayer _plr221 && _plr221.level() instanceof ServerLevel
					&& _plr221.getAdvancements().getOrStartProgress(_plr221.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr223 && _plr223.level() instanceof ServerLevel
					&& _plr223.getAdvancements().getOrStartProgress(_plr223.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()))) {
			if ((entity instanceof ServerPlayer _plr226 && _plr226.level() instanceof ServerLevel
					&& _plr226.getAdvancements().getOrStartProgress(_plr226.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr228 && _plr228.level() instanceof ServerLevel
					&& _plr228.getAdvancements().getOrStartProgress(_plr228.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_LEGGINGS.get()))) {
			if ((entity instanceof ServerPlayer _plr231 && _plr231.level() instanceof ServerLevel
					&& _plr231.getAdvancements().getOrStartProgress(_plr231.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr233 && _plr233.level() instanceof ServerLevel
					&& _plr233.getAdvancements().getOrStartProgress(_plr233.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_BOOTS.get()))) {
			if ((entity instanceof ServerPlayer _plr236 && _plr236.level() instanceof ServerLevel
					&& _plr236.getAdvancements().getOrStartProgress(_plr236.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr238 && _plr238.level() instanceof ServerLevel
					&& _plr238.getAdvancements().getOrStartProgress(_plr238.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
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

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}