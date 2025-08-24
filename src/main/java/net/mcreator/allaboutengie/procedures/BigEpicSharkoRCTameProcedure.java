package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.BigEpicSharkoTamedEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Comparator;

public class BigEpicSharkoRCTameProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!world.isClientSide()) {
			if (!world.isClientSide()) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKIE) {
					if (Math.random() >= 0.8) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 15, 1, 1, 1, 1);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AllaboutengieModEntities.BIG_EPIC_SHARKO_TAMED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setXRot(entity.getXRot());
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.COOKIE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							{
								String _setval = sourceentity.getDisplayName().getString();
								((Entity) world.getEntitiesOfClass(BigEpicSharkoTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.sharkoownerdisplayname = _setval;
									capability.syncPlayerVariables(((Entity) world.getEntitiesOfClass(BigEpicSharkoTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)));
								});
							}
						});
					} else {
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.COOKIE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoRetryState == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("You're currently on cooldown for taming any sharko without a cookie."), true);
					} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoRetryState == false) {
						if (Math.random() < 0.05) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HEART, x, y, z, 15, 1, 1, 1, 1);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = AllaboutengieModEntities.BIG_EPIC_SHARKO_TAMED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(entity.getYRot());
									entityToSpawn.setYBodyRot(entity.getYRot());
									entityToSpawn.setYHeadRot(entity.getYRot());
									entityToSpawn.setXRot(entity.getXRot());
								}
							}
							if (!entity.level().isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									String _setval = sourceentity.getDisplayName().getString();
									((Entity) world.getEntitiesOfClass(BigEpicSharkoTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.sharkoownerdisplayname = _setval;
										capability.syncPlayerVariables(((Entity) world.getEntitiesOfClass(BigEpicSharkoTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)));
									});
								}
							});
						} else {
							{
								boolean _setval = true;
								sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SharkoRetryState = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						}
					}
				}
			}
		}
	}
}
