package net.mcreator.allaboutengie.procedures;

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
import net.mcreator.allaboutengie.entity.OutragedEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.MadEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.AngryEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.AngryEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;

public class AnyEngieDiesAddCountProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (entity instanceof MadEngieEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.MadEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MadEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof MadEngieColdSeasonEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.MadEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MadEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof AngryEngieEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.AngryEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof AngryEngieStyle2Entity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.AngryEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof AngryEngieSharkoEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.AngryEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof AngryEngieColdSeasonEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.AngryEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof EnragedEngieEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof EnragedEngieStyle2Entity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof EnragedEngieStyle3Entity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof EnragedEngieSharkoEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof EnragedEngieColdSeasonEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof AngryCreatorEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.OutragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof OutragedEngieStyle2Entity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.OutragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof OutragedEngieSharkoEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.OutragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof OutragedEngieColdSeasonEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.OutragedEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).OutragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof MonstrosityEngieEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.MonstrosityEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof MonstrosityEngieSharkoEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.MonstrosityEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof MonstrosityEngieColdSeasonEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.MonstrosityEngieKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof InsanityEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.InsanityKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).InsanityKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof PureInsanityEntity) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.PureInsanityKillCount = sourceentity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PureInsanityKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			}
		}
		if (entity instanceof MadEngieEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof MadEngieColdSeasonEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof AngryEngieEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof AngryEngieStyle2Entity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof AngryEngieSharkoEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof AngryEngieColdSeasonEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof EnragedEngieEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof EnragedEngieStyle2Entity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof EnragedEngieStyle3Entity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof EnragedEngieSharkoEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof EnragedEngieColdSeasonEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof AngryCreatorEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof OutragedEngieStyle2Entity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof OutragedEngieSharkoEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof OutragedEngieColdSeasonEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof MonstrosityEngieEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof MonstrosityEngieSharkoEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity instanceof MonstrosityEngieColdSeasonEntity) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= 0.05) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}