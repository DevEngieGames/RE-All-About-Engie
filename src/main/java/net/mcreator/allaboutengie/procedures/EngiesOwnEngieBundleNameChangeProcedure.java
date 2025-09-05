package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class EngiesOwnEngieBundleNameChangeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIES_OWN_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity2 && _entity2.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIES_OWN_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity7 && _entity7.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu7) ? _menu7.getMenuState(0, "ChangeBundleName", "") : "")));
		} else {
			new ItemStack(AllaboutengieModItems.ENGIES_OWN_ENGIE_BUNDLE.get())
					.setHoverName(Component.literal(((entity instanceof Player _entity10 && _entity10.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "ChangeBundleName", "") : "")));
		}
	}
}