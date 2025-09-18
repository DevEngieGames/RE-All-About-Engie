package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class EntitySpawnsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 1) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity1.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity0.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 2) {
			if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity5.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity4.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 5);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 3) {
			if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity9.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity8.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 7.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 7.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 4) {
			if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity13.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity12.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 10));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 10);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 5) {
			if (entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity17.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity16.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 12.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 12.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 6) {
			if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity21.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity20.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 15));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 15);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 7) {
			if (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity25.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity24.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 17.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 17.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 8) {
			if (entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity29.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity28.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 20));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 20);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 9) {
			if (entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity33.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity32.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 22.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 22.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 10) {
			if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity37.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity36.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 25));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 25);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 11) {
			if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity41.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity40.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 27.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 27.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 12) {
			if (entity instanceof LivingEntity _livingEntity45 && _livingEntity45.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity45.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity44.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 30));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 30);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 13) {
			if (entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity49.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity48.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 32.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 32.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 14) {
			if (entity instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity53.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity52.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 35));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 35);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 15) {
			if (entity instanceof LivingEntity _livingEntity57 && _livingEntity57.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity57.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity56 && _livingEntity56.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity56.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 37.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 37.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 16) {
			if (entity instanceof LivingEntity _livingEntity61 && _livingEntity61.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity61.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity60.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 40));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 40);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 17) {
			if (entity instanceof LivingEntity _livingEntity65 && _livingEntity65.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity65.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity64.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 42.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 42.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 18) {
			if (entity instanceof LivingEntity _livingEntity69 && _livingEntity69.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity69.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity68 && _livingEntity68.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity68.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 45));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 45);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 19) {
			if (entity instanceof LivingEntity _livingEntity73 && _livingEntity73.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity73.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity72 && _livingEntity72.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity72.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 47.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 47.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 20) {
			if (entity instanceof LivingEntity _livingEntity77 && _livingEntity77.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity77.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity76 && _livingEntity76.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity76.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 50));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 50);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 21) {
			if (entity instanceof LivingEntity _livingEntity81 && _livingEntity81.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity81.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity80 && _livingEntity80.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity80.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 52.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 52.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 22) {
			if (entity instanceof LivingEntity _livingEntity85 && _livingEntity85.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity85.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity84 && _livingEntity84.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity84.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 55));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 55);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 23) {
			if (entity instanceof LivingEntity _livingEntity89 && _livingEntity89.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity89.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity88 && _livingEntity88.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity88.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 57.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 57.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 24) {
			if (entity instanceof LivingEntity _livingEntity93 && _livingEntity93.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity93.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity92 && _livingEntity92.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity92.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 60));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 60);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 25) {
			if (entity instanceof LivingEntity _livingEntity97 && _livingEntity97.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity97.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity96 && _livingEntity96.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity96.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 62.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 62.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 26) {
			if (entity instanceof LivingEntity _livingEntity101 && _livingEntity101.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity101.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity100 && _livingEntity100.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity100.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 65));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 65);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 27) {
			if (entity instanceof LivingEntity _livingEntity105 && _livingEntity105.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity105.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity104 && _livingEntity104.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity104.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 67.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 67.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
			if (entity instanceof LivingEntity _livingEntity109 && _livingEntity109.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity109.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity108 && _livingEntity108.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity108.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 70));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 70);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 29) {
			if (entity instanceof LivingEntity _livingEntity113 && _livingEntity113.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity113.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity112 && _livingEntity112.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity112.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 72.5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 72.5));
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 30) {
			if (entity instanceof LivingEntity _livingEntity117 && _livingEntity117.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity117.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity116 && _livingEntity116.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity116.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 75));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 75);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525) {
			if (entity instanceof LivingEntity _livingEntity121 && _livingEntity121.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity121.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity120 && _livingEntity120.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity120.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 690) {
			if (entity instanceof LivingEntity _livingEntity125 && _livingEntity125.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity125.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity124 && _livingEntity124.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity124.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 690));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 690);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 250000) {
			if (entity instanceof LivingEntity _livingEntity129 && _livingEntity129.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity129.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity128 && _livingEntity128.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity128.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 250000));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 250000);
		} else if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525000) {
			if (entity instanceof LivingEntity _livingEntity133 && _livingEntity133.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity133.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity132 && _livingEntity132.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity132.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525000));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525000);
		}
	}
}