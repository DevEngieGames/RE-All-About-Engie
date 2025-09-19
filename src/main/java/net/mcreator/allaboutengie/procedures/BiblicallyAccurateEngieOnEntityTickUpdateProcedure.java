package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class BiblicallyAccurateEngieOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
			if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity0.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 2.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 7.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity3.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 10));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity4.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 12.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
			if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity5.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 15));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
			if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity6.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 17.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
			if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity7.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 20));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
			if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity8.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 22.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
			if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity9.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 25));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
			if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity10.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 27.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
			if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity11.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 30));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
			if (entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity12.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 32.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 14) {
			if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity13.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 35));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
			if (entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity14.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 37.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 16) {
			if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity15.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 40));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 17) {
			if (entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity16.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 42.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 18) {
			if (entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity17.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 45));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 19) {
			if (entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity18.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 47.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
			if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity19.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 50));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 21) {
			if (entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity20.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 52.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 22) {
			if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity21.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 55));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 23) {
			if (entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity22.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 57.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 24) {
			if (entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity23.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 60));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 25) {
			if (entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity24.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 62.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 26) {
			if (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity25.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 65));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 27) {
			if (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity26.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 67.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
			if (entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity27.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 70));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 29) {
			if (entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity28.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 72.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 30) {
			if (entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity29.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 75));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
			if (entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity30.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 525));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
			if (entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity31.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 690));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 250000) {
			if (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity32.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 250000));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525000) {
			if (entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity33.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((75 * 525000));
		}
	}
}