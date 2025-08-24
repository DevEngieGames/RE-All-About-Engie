package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesEntity;
import net.mcreator.allaboutengie.entity.FinneganEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.ChampZoomiesEntity;
import net.mcreator.allaboutengie.entity.ChampEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesEntity;
import net.mcreator.allaboutengie.entity.BuddyEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.entity.Bothan2netEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.entity.AtlasEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesEntity;
import net.mcreator.allaboutengie.entity.ApolloEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SharkoAttacksAnotherEntityProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof SharkTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof AlbinoSharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof RareSharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EpicSharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof LegendarySharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof MythicSharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof ExoticSharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EngieSharkoTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EngieSharkoRareTamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EngieSharkoRare2TamedEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof TobyEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof MarshalEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof TigerEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof LouisEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof BuddyEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof ApolloEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof AtlasEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof CBEEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof PBEEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof Bothan2netEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof FinneganEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof ChampEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof SharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof AlbinoSharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof RareSharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EpicSharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof LegendarySharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof MythicSharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof ExoticSharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EngieSharkoTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EngieSharkoRareTamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof EngieSharkoRare2TamedZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof TobyZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof MarshalZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof TigerZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof LouisZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof BuddyZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof ApolloZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof AtlasZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof CBEZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof PBEZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof Bothan2netZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof FinneganZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
		if (sourceentity instanceof ChampZoomiesEntity) {
			if (entity instanceof Monster) {
				if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 2.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 7.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 10));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 12.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 15));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 17.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 20));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 22.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 25));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 27.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 30));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 32.5));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 45));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 50));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 525));
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), (float) (amount * 690));
					});
				}
			}
		}
	}
}
