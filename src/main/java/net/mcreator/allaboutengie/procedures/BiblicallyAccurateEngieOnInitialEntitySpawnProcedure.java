package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

public class BiblicallyAccurateEngieOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() > 0.25) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}