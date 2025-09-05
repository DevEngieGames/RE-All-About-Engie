package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModEnchantments;
import net.mcreator.allaboutengie.entity.TheEndHostileEntity;
import net.mcreator.allaboutengie.entity.SuperDoomsDayHostileEntity;
import net.mcreator.allaboutengie.entity.DoomsDayHostileEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EngiesBlessingDamagesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, x, y, z, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		AllaboutengieModVariables.MapVariables.get(world).getdamage = amount;
		AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			AllaboutengieMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CRIT, x, y, z, 25, 5, 5, 5, 1);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null,
									BlockPos.containing((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX,
											(entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY,
											(entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ),
									ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
									((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
									((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ),
									ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				});
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 1) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 2) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 3) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 4) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 5) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 6) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 7) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 8) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 9) {
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
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 10) {
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
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).isEnchanted()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).isEnchanted()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).isEnchanted()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).isEnchanted()) {
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 1) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 2.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 2) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 3) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 7.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 4) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 10;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 5) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 12.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 6) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 15;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 7) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 17.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 8) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 20;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 9) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 22.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 10) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 25;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				AllaboutengieMod.queueServerWork(2, () -> {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 1) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 2.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 2) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 3) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 7.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 4) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 10;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 5) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 12.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 6) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 15;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 7) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 17.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 8) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 20;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 9) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 22.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 10) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 25;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				AllaboutengieMod.queueServerWork(3, () -> {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 1) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 2.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 2) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 3) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 7.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 4) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 10;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 5) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 12.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 6) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 15;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 7) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 17.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 8) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 20;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 9) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 22.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 10) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 25;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				AllaboutengieMod.queueServerWork(4, () -> {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 1) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 2.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 2) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 3) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 7.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 4) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 10;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 5) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 12.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 6) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 15;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 7) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 17.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 8) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 20;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 9) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 22.5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) == 10) {
						AllaboutengieModVariables.MapVariables.get(world).getdamage = AllaboutengieModVariables.MapVariables.get(world).getdamage / 25;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
			AllaboutengieMod.queueServerWork(5, () -> {
				entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
			});
		}
	}
}