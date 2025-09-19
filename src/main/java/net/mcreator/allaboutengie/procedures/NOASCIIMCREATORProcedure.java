package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class NOASCIIMCREATORProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity instanceof Player) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.DOOMSDAY_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.DOOMSDAY_BAN_HAMMER.get()) {
				if (entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).playerstunnedmobs == false) {
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.playerstunnedmobs = true;
						_vars.syncPlayerVariables(entity);
					}
					{
						AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
						_vars.playerstunoffcooldown = false;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
									entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
									entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					ThiscreatorbroProcedure.execute(entity);
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.SUPER_DOOMSDAY_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.SUPER_DOOMSDAY_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.THE_END_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIE_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIES_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.MINDSCAPE_ENGIE_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIEGAMES_SWORD.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_SWORD.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_DOOMSDAY_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_DOOMSDAY_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_THE_END_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_THE_END_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_ENGIE_SCYTHE.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ANTIMATTER_ENGIES_BAN_HAMMER.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.COSMIC_ENGIE_GAMES_SWORD.get()) {
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunnedmobs = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					AllaboutengieModVariables.PlayerVariables _vars = entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES);
					_vars.playerstunoffcooldown = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), 400);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY,
								entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerX, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerY, entity.getData(AllaboutengieModVariables.PLAYER_VARIABLES).PlayerZ,
								BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:playerstunmobs")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				ThiscreatorbroProcedure.execute(entity);
			}
		}
	}
}