package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.TheEndHostileEntity;
import net.mcreator.allaboutengie.entity.SuperDoomsDayHostileEntity;
import net.mcreator.allaboutengie.entity.DoomsDayHostileEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class EngiesBlessingDamagesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		AllaboutengieModVariables.MapVariables.get(world).getdamage = amount;
		AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) != 0) {
			AllaboutengieMod.queueServerWork(1, () -> {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 1) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 2.5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 2) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 3) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 7.5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 4) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 10;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 5) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 12.5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 6) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 15;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 7) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 17.5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 8) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 20;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 9) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 22.5;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("allaboutengie:engies_blessing")))) == 10) {
					AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage * 25;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof Monster) {
						if (entity instanceof Skeleton) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else if (entity instanceof Creeper) {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						} else {
							AllaboutengieMod.queueServerWork(1, () -> {
								entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
							});
						}
					} else if (entity instanceof DoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof SuperDoomsDayHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					} else if (entity instanceof TheEndHostileEntity) {
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						});
					}
				}
			});
		}
	}
}