package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.entity.PureInsanityEntity;
import net.mcreator.allaboutengie.entity.OutragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.OutragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.AngryEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlushSpawningProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			AllaboutengieMod.queueServerWork(1, () -> {
				if (Math.random() < 0.01905) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENGIE_PLUSH.get()));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.04) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DEV_ENGIE_PLUSH.get()));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
			});
			if (entity instanceof MadEngieEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MadEngieKillCount >= 12) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmadengieplush == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmadengieplush = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof AngryEngieEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof AngryEngieStyle2Entity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof AngryEngieSharkoEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedangryengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedangryengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof EnragedEngieEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof EnragedEngieStyle2Entity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof EnragedEngieStyle3Entity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof EnragedEngieSharkoEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedenragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedenragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof AngryCreatorEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof OutragedEngieStyle2Entity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof OutragedEngieSharkoEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedoutragedengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedoutragedengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof MonstrosityEngieEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof MonstrosityEngieSharkoEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedmonstrosityengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedmonstrosityengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof InsanityEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount >= 5
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount < 50) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount >= 50
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount < 100) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount >= 100
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount < 150) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount >= 150
							&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount < 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount >= 200) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush1 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush1 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush2 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush2 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush3 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush3 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush4 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush4 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedinsanityengieplush5 == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedinsanityengieplush5 = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof PureInsanityEntity) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PureInsanityKillCount >= 5) {
						if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).gainedpureinsanityengieplush == false) {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.gainedpureinsanityengieplush = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.PURE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			}
		}
	}
}
