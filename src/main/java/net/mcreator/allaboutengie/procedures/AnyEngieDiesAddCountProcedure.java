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

public class AnyEngieDiesAddCountProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (entity instanceof MadEngieEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MadEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MadEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof AngryEngieEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AngryEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof AngryEngieStyle2Entity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AngryEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof AngryEngieSharkoEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AngryEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof EnragedEngieEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EnragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof EnragedEngieStyle2Entity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EnragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof EnragedEngieStyle3Entity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EnragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof EnragedEngieSharkoEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).EnragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EnragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof AngryCreatorEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OutragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof OutragedEngieStyle2Entity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OutragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof OutragedEngieSharkoEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).OutragedEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OutragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof MonstrosityEngieEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MonstrosityEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof MonstrosityEngieSharkoEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).MonstrosityEngieKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MonstrosityEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof InsanityEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).InsanityKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.InsanityKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof PureInsanityEntity) {
				{
					double _setval = (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PureInsanityKillCount + 1;
					sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PureInsanityKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
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
		}
	}
}