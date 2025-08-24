package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

public class AlienEngieSharkoTamedDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getDisplayName().getString()).equals("Gnarpy")) {
			return true;
		} else if ((entity.getDisplayName().getString()).equals("Gnorp")) {
			return true;
		} else if ((entity.getDisplayName().getString()).equals("Glorp")) {
			return true;
		}
		return false;
	}
}
