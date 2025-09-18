package net.mcreator.allaboutengie.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.allaboutengie.world.inventory.ETCEngieBundleUIMenu;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class TesterEngieBundleInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof ETCEngieBundleUIMenu)
				player.closeContainer();
		}
	}

	public TesterEngieBundleInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 100);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}