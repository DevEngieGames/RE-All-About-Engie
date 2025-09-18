package net.mcreator.allaboutengie.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.allaboutengie.world.inventory.EngiesBirthdayBundleUIMenu;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class EngiesBirthdayBundleInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == AllaboutengieModItems.ENGIES_BIRTHDAY_BUNDLE25.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof EngiesBirthdayBundleUIMenu)
				player.closeContainer();
		}
	}

	public EngiesBirthdayBundleInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 105);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != AllaboutengieModItems.ENGIES_BIRTHDAY_BUNDLE25.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}