package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class ETCEngieBundleNameChangeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.DEVELOPER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity2 && _entity2.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.DEVELOPER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity7 && _entity7.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu7) ? _menu7.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.IDEAGIVER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity12 && _entity12.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.IDEAGIVER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity17 && _entity17.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu17) ? _menu17.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity22 && _entity22.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu22) ? _menu22.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity27 && _entity27.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu27) ? _menu27.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity32 && _entity32.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu32) ? _menu32.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity37 && _entity37.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu37) ? _menu37.getMenuState(0, "ChangeBundleName", "") : "")));
		} else {
			new ItemStack(AllaboutengieModItems.DEVELOPER_ENGIE_BUNDLE.get()).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity40 && _entity40.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu40) ? _menu40.getMenuState(0, "ChangeBundleName", "") : "")));
			new ItemStack(AllaboutengieModItems.IDEAGIVER_ENGIE_BUNDLE.get()).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity42 && _entity42.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu42) ? _menu42.getMenuState(0, "ChangeBundleName", "") : "")));
			new ItemStack(AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get()).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity44 && _entity44.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu44) ? _menu44.getMenuState(0, "ChangeBundleName", "") : "")));
			new ItemStack(AllaboutengieModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()).set(DataComponents.CUSTOM_NAME,
					Component.literal(((entity instanceof Player _entity46 && _entity46.containerMenu instanceof AllaboutengieModMenus.MenuAccessor _menu46) ? _menu46.getMenuState(0, "ChangeBundleName", "") : "")));
		}
	}
}