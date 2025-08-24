
package net.mcreator.allaboutengie.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.world.inventory.CustomRecipeBookMenu;
import net.mcreator.allaboutengie.procedures.RecipeBookUpOnePageProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookUpMaxPagesProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookUpFivePagesProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookDownOnePageProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookDownFivePagesProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookDownAllPagesProcedure;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomRecipeBookButtonMessage {
	private final int buttonID, x, y, z;

	public CustomRecipeBookButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CustomRecipeBookButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CustomRecipeBookButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CustomRecipeBookButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CustomRecipeBookMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RecipeBookUpOnePageProcedure.execute(entity);
		}
		if (buttonID == 1) {

			RecipeBookDownOnePageProcedure.execute(entity);
		}
		if (buttonID == 2) {

			RecipeBookUpFivePagesProcedure.execute(entity);
		}
		if (buttonID == 3) {

			RecipeBookDownFivePagesProcedure.execute(entity);
		}
		if (buttonID == 4) {

			RecipeBookUpMaxPagesProcedure.execute(entity);
		}
		if (buttonID == 5) {

			RecipeBookDownAllPagesProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AllaboutengieMod.addNetworkMessage(CustomRecipeBookButtonMessage.class, CustomRecipeBookButtonMessage::buffer, CustomRecipeBookButtonMessage::new, CustomRecipeBookButtonMessage::handler);
	}
}
