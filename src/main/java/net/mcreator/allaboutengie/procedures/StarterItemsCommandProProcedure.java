package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class StarterItemsCommandProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == true) {
			if (world.getDifficulty() == Difficulty.PEACEFUL) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_HELMET.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_helmet");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(2, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_CHESTPLATE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_chestplate");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(3, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_LEGGINGS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_leggings");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(4, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_BOOTS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_boots");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(5, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_SWORD.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_sword");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(6, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_PICKAXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_pickaxe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(7, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_AXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_axe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(8, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_SHOVEL.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_shovel");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(9, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_HOE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_hoe");
							}
						}
					}
				});
			} else if (world.getDifficulty() == Difficulty.EASY) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_HELMET.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_helmet");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(2, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_CHESTPLATE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_chestplate");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(3, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_LEGGINGS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_leggings");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(4, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_BOOTS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_boots");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(5, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_SWORD.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_sword");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(6, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_PICKAXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_pickaxe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(7, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_AXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_axe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(8, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_SHOVEL.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_shovel");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(9, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.COMMON_HOE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:common_hoe");
							}
						}
					}
				});
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_HELMET.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_helmet");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(2, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_CHESTPLATE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_chestplate");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(3, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_LEGGINGS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_leggings");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(4, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_BOOTS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_boots");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(5, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_SWORD.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_sword");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(6, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_PICKAXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_pickaxe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(7, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_AXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_axe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(8, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_SHOVEL.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_shovel");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(9, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.UNCOMMON_HOE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:uncommon_hoe");
							}
						}
					}
				});
			} else if (world.getDifficulty() == Difficulty.HARD) {
				AllaboutengieMod.queueServerWork(1, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_HELMET.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_helmet");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(2, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_CHESTPLATE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_chestplate");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(3, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_LEGGINGS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_leggings");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(4, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_BOOTS.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_boots");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(5, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_SWORD.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_sword");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(6, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_PICKAXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_pickaxe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(7, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_AXE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_axe");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(8, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_SHOVEL.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_shovel");
							}
						}
					}
				});
				AllaboutengieMod.queueServerWork(9, () -> {
					if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.RARE_HOE.get()))) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:rare_hoe");
							}
						}
					}
				});
			}
		} else if ((world instanceof ServerLevel _serverLevelGR113 && _serverLevelGR113.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == false) {
			AllaboutengieMod.queueServerWork(1, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTER_HELMET.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starter_helmet");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(2, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTER_CHESTPLATE.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starter_chestplate");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(3, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTER_LEGGINGS.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starter_leggings");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(4, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTER_BOOTS.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starter_boots");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(5, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTERS_SWORD.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starters_sword");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(6, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTERS_PICKAXE.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starters_pickaxe");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(7, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTERS_AXE.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starters_axe");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(8, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTERS_SHOVEL.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starters_shovel");
						}
					}
				}
			});
			AllaboutengieMod.queueServerWork(9, () -> {
				if (!hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.STARTERS_HOE.get()))) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p allaboutengie:starters_hoe");
						}
					}
				}
			});
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}