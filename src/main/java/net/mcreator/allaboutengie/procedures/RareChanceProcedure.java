package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RareChanceProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) != 0
				&& !((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0)) {
			if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR9 && _serverLevelGR9.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR13 && _serverLevelGR13.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR19 && _serverLevelGR19.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR23 && _serverLevelGR23.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR29 && _serverLevelGR29.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR33 && _serverLevelGR33.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			for (int index0 = 0; index0 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))); index0++) {
				if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if ((world instanceof ServerLevel _serverLevelGR46 && _serverLevelGR46.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR50 && _serverLevelGR50.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
						&& !world.getLevelData().isThundering()) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if ((world instanceof ServerLevel _serverLevelGR56 && _serverLevelGR56.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR60 && _serverLevelGR60.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if ((world instanceof ServerLevel _serverLevelGR66 && _serverLevelGR66.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR70 && _serverLevelGR70.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		} else if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) != 0)
				&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0) {
			if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR85 && _serverLevelGR85.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR89 && _serverLevelGR89.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR95 && _serverLevelGR95.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR99 && _serverLevelGR99.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR105 && _serverLevelGR105.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR109 && _serverLevelGR109.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			for (int index1 = 0; index1 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)); index1++) {
				if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if ((world instanceof ServerLevel _serverLevelGR122 && _serverLevelGR122.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR126 && _serverLevelGR126.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
						&& !world.getLevelData().isThundering()) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if ((world instanceof ServerLevel _serverLevelGR132 && _serverLevelGR132.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR136 && _serverLevelGR136.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
						&& world.getLevelData().isThundering()) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if ((world instanceof ServerLevel _serverLevelGR142 && _serverLevelGR142.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR146 && _serverLevelGR146.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
						&& world.getLevelData().isThundering()) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) != 0
				&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0) {
			if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR161 && _serverLevelGR161.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR165 && _serverLevelGR165.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR171 && _serverLevelGR171.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR175 && _serverLevelGR175.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR181 && _serverLevelGR181.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR185 && _serverLevelGR185.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			for (int index2 = 0; index2 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)); index2++) {
				for (int index3 = 0; index3 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))); index3++) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if ((world instanceof ServerLevel _serverLevelGR200 && _serverLevelGR200.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((world instanceof ServerLevel _serverLevelGR204 && _serverLevelGR204.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
							&& !world.getLevelData().isThundering()) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if ((world instanceof ServerLevel _serverLevelGR210 && _serverLevelGR210.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((world instanceof ServerLevel _serverLevelGR214 && _serverLevelGR214.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
							&& world.getLevelData().isThundering()) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if ((world instanceof ServerLevel _serverLevelGR220 && _serverLevelGR220.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((world instanceof ServerLevel _serverLevelGR224 && _serverLevelGR224.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining()
							&& world.getLevelData().isThundering()) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= 0.05) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		} else {
			if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR235 && _serverLevelGR235.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR239 && _serverLevelGR239.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR245 && _serverLevelGR245.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR249 && _serverLevelGR249.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR255 && _serverLevelGR255.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR259 && _serverLevelGR259.getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE)) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
		if (entity instanceof Player) {
			if ((entity.getDisplayName().getString()).equals("Dev")) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}