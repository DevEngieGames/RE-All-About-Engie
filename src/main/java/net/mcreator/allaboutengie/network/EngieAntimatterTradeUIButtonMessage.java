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

import net.mcreator.allaboutengie.procedures.EngieGamesSwapFromAntimatterProcedure;
import net.mcreator.allaboutengie.procedures.AntimatterEngieTradeUIButtonClickedProcedure;
import net.mcreator.allaboutengie.AllaboutengieMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record EngieAntimatterTradeUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<EngieAntimatterTradeUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(AllaboutengieMod.MODID, "engie_antimatter_trade_ui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, EngieAntimatterTradeUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, EngieAntimatterTradeUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new EngieAntimatterTradeUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<EngieAntimatterTradeUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final EngieAntimatterTradeUIButtonMessage message, final IPayloadContext context) {
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

			AntimatterEngieTradeUIButtonClickedProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			EngieGamesSwapFromAntimatterProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AllaboutengieMod.addNetworkMessage(EngieAntimatterTradeUIButtonMessage.TYPE, EngieAntimatterTradeUIButtonMessage.STREAM_CODEC, EngieAntimatterTradeUIButtonMessage::handleData);
	}
}