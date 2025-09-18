package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.YellowLightningEntity;
import net.mcreator.allaboutengie.entity.NormalEntity;
import net.mcreator.allaboutengie.entity.MOABEntity;
import net.mcreator.allaboutengie.entity.BlueBurstEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class MissileTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof YellowLightningEntity) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team join YellowLightning @e[type=allaboutengie:yellow_lightning]");
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") >= 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a neutral allaboutengie:missile_explosion ");
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
						}
					}
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 1, 1, 1, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=1,dy=1,dz=1] run damage @s 25 allaboutengie:yellow_lightning_explosion");
				entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else if (entity instanceof BlueBurstEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team join BlueBurst @e[type=allaboutengie:blue_burst]");
				}
			}
			entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") >= 3) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a neutral allaboutengie:missile_explosion ");
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
						}
					}
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 5, 5, 5, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=5,dy=5,dz=5] run damage @s 50 allaboutengie:blue_burst_explosion");
				entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else if (entity instanceof NormalEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team join Normal @e[type=allaboutengie:normal]");
				}
			}
			entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") >= 6) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a neutral allaboutengie:missile_explosion ");
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
						}
					}
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 10, 10, 10, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=10,dy=10,dz=10] run damage @s 40 allaboutengie:normal_explosion");
				entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else if (entity instanceof MOABEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") >= 16) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a neutral allaboutengie:missile_explosion ");
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("allaboutengie:missile_explosion")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
						}
					}
				});
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 15, 15, 15, 15, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=minecraft:player,dx=15,dy=15,dz=15] run damage @s 75 allaboutengie:moab_explosion");
				entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", 0);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}