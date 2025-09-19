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

import net.mcreator.allaboutengie.procedures.CosmicEngieGamesTradeUIButtonClickedProcedure;
import net.mcreator.allaboutengie.AllaboutengieMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record CosmicEngieGamesTradeUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<CosmicEngieGamesTradeUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(AllaboutengieMod.MODID, "cosmic_engie_games_trade_ui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CosmicEngieGamesTradeUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CosmicEngieGamesTradeUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new CosmicEngieGamesTradeUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CosmicEngieGamesTradeUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final CosmicEngieGamesTradeUIButtonMessage message, final IPayloadContext context) {
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

			CosmicEngieGamesTradeUIButtonClickedProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AllaboutengieMod.addNetworkMessage(CosmicEngieGamesTradeUIButtonMessage.TYPE, CosmicEngieGamesTradeUIButtonMessage.STREAM_CODEC, CosmicEngieGamesTradeUIButtonMessage::handleData);
	}
}