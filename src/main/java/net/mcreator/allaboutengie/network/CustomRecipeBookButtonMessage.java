package net.mcreator.allaboutengie.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.procedures.RecipeBookUpOnePageProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookUpMaxPagesProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookUpFivePagesProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookDownOnePageProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookDownFivePagesProcedure;
import net.mcreator.allaboutengie.procedures.RecipeBookDownAllPagesProcedure;
import net.mcreator.allaboutengie.AllaboutengieMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record CustomRecipeBookButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<CustomRecipeBookButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(AllaboutengieMod.MODID, "custom_recipe_book_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CustomRecipeBookButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CustomRecipeBookButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new CustomRecipeBookButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CustomRecipeBookButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final CustomRecipeBookButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
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
		AllaboutengieMod.addNetworkMessage(CustomRecipeBookButtonMessage.TYPE, CustomRecipeBookButtonMessage.STREAM_CODEC, CustomRecipeBookButtonMessage::handleData);
	}
}