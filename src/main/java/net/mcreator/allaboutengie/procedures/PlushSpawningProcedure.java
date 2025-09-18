package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

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

@EventBusSubscriber
public class PlushSpawningProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MadEngieKillCount >= 12) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmadengieplush == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmadengieplush = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedangryengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedangryengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedenragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedenragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedoutragedengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedoutragedengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedmonstrosityengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedmonstrosityengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount >= 5 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount < 50) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount >= 50 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount < 100) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount >= 100 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount < 150) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount >= 150 && sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount < 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount >= 200) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush1 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush1 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush2 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush2 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush3 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush3 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush4 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush4 = true;
								_vars.syncPlayerVariables(sourceentity);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(AllaboutengieModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedinsanityengieplush5 == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedinsanityengieplush5 = true;
								_vars.syncPlayerVariables(sourceentity);
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
					if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PureInsanityKillCount >= 5) {
						if (sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).gainedpureinsanityengieplush == false) {
							{
								AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
								_vars.gainedpureinsanityengieplush = true;
								_vars.syncPlayerVariables(sourceentity);
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