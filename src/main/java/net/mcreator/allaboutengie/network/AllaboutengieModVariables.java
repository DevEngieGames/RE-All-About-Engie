package net.mcreator.allaboutengie.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.function.Supplier;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AllaboutengieModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, AllaboutengieMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());
	public static boolean decembercodeblock = true;
	public static boolean seasonautumn = false;
	public static boolean seasonspring = false;
	public static boolean seasonsummer = false;
	public static boolean seasonwinter = false;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		AllaboutengieMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
		AllaboutengieMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.BlockDeathAliveCOunt = original.BlockDeathAliveCOunt;
			clone.coderedeemblock = original.coderedeemblock;
			clone.detecstart = original.detecstart;
			clone.GoodLuck = original.GoodLuck;
			clone.healthreductiondday = original.healthreductiondday;
			clone.multiplayertrophyobtained = original.multiplayertrophyobtained;
			clone.playerready = original.playerready;
			clone.SharkoRetryState = original.SharkoRetryState;
			clone.SharkoRideToggle = original.SharkoRideToggle;
			clone.ShowObjectiveOverlay = original.ShowObjectiveOverlay;
			clone.solotrophyobtained = original.solotrophyobtained;
			clone.timeoverlaytoggle = original.timeoverlaytoggle;
			clone.AngryEngieKillCount = original.AngryEngieKillCount;
			clone.browniescount = original.browniescount;
			clone.cheeseballcount = original.cheeseballcount;
			clone.EnragedEngieKillCount = original.EnragedEngieKillCount;
			clone.HHGLookX = original.HHGLookX;
			clone.HHGLookY = original.HHGLookY;
			clone.HHGLookZ = original.HHGLookZ;
			clone.InsanityKillCount = original.InsanityKillCount;
			clone.MadEngieKillCount = original.MadEngieKillCount;
			clone.OutragedEngieKillCount = original.OutragedEngieKillCount;
			clone.PlayerX = original.PlayerX;
			clone.PlayerY = original.PlayerY;
			clone.PlayerZ = original.PlayerZ;
			clone.RiftX = original.RiftX;
			clone.RiftY = original.RiftY;
			clone.RiftZ = original.RiftZ;
			clone.TrueHardcoreLifeCount = original.TrueHardcoreLifeCount;
			clone.MonstrosityEngieKillCount = original.MonstrosityEngieKillCount;
			clone.PureInsanityKillCount = original.PureInsanityKillCount;
			clone.crucifixsavedentity = original.crucifixsavedentity;
			clone.WelcomeBackToggle = original.WelcomeBackToggle;
			clone.MaxPercentGiveOptionToDoHardestMobDiff = original.MaxPercentGiveOptionToDoHardestMobDiff;
			clone.playerstunnedmobs = original.playerstunnedmobs;
			clone.playerstunoffcooldown = original.playerstunoffcooldown;
			clone.gainedmadengieplush = original.gainedmadengieplush;
			clone.gainedangryengieplush1 = original.gainedangryengieplush1;
			clone.gainedangryengieplush2 = original.gainedangryengieplush2;
			clone.gainedangryengieplush3 = original.gainedangryengieplush3;
			clone.gainedangryengieplush4 = original.gainedangryengieplush4;
			clone.gainedenragedengieplush1 = original.gainedenragedengieplush1;
			clone.gainedenragedengieplush2 = original.gainedenragedengieplush2;
			clone.gainedenragedengieplush3 = original.gainedenragedengieplush3;
			clone.gainedenragedengieplush4 = original.gainedenragedengieplush4;
			clone.gainedoutragedengieplush1 = original.gainedoutragedengieplush1;
			clone.gainedoutragedengieplush2 = original.gainedoutragedengieplush2;
			clone.gainedoutragedengieplush3 = original.gainedoutragedengieplush3;
			clone.gainedoutragedengieplush4 = original.gainedoutragedengieplush4;
			clone.gainedmonstrosityengieplush1 = original.gainedmonstrosityengieplush1;
			clone.gainedmonstrosityengieplush2 = original.gainedmonstrosityengieplush2;
			clone.gainedmonstrosityengieplush3 = original.gainedmonstrosityengieplush3;
			clone.gainedmonstrosityengieplush4 = original.gainedmonstrosityengieplush4;
			clone.gainedinsanityengieplush1 = original.gainedinsanityengieplush1;
			clone.gainedinsanityengieplush2 = original.gainedinsanityengieplush2;
			clone.gainedinsanityengieplush3 = original.gainedinsanityengieplush3;
			clone.gainedinsanityengieplush4 = original.gainedinsanityengieplush4;
			clone.gainedinsanityengieplush5 = original.gainedinsanityengieplush5;
			clone.gainedpureinsanityengieplush = original.gainedpureinsanityengieplush;
			clone.DoomsdayTrackToggle = original.DoomsdayTrackToggle;
			clone.DoomsdayRiskTrackToggle = original.DoomsdayRiskTrackToggle;
			clone.sharkolayingstate = original.sharkolayingstate;
			clone.difficultyoverlaytoggle = original.difficultyoverlaytoggle;
			if (!event.isWasDeath()) {
				clone.DoomsdayAlive = original.DoomsdayAlive;
				clone.firstplay = original.firstplay;
				clone.RespawnNormInstantHealth = original.RespawnNormInstantHealth;
				clone.RespawnTrueHardcoreGraceStart = original.RespawnTrueHardcoreGraceStart;
				clone.pageNumber = original.pageNumber;
				clone.pageNumberText = original.pageNumberText;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "allaboutengie_worldvars";
		public boolean yeah = false;

		public static WorldVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			WorldVariables data = new WorldVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			yeah = nbt.getBoolean("yeah");
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putBoolean("yeah", yeah);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof ServerLevel level)
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldVariables::new, WorldVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "allaboutengie_mapvars";
		public boolean Birthday = false;
		public boolean birthdaystart = false;
		public boolean BYEBYE = false;
		public boolean ChallengeToggle = false;
		public boolean checkboxbothmarked = false;
		public boolean checkboxbothnomarked = false;
		public boolean darknesscooldown = false;
		public boolean DayCooldownToggle = false;
		public boolean ddaydialoguetimeblock = false;
		public boolean ddayspikecooldown = false;
		public boolean ddaystart = false;
		public boolean ddaytimenighttimerblock = false;
		public boolean ddaywait = true;
		public boolean DoomsdayDialogueStart = false;
		public boolean DoomsdayEeriePlayOnce = false;
		public boolean doomsdaymainsongstart = false;
		public boolean DoomsDayStart = false;
		public boolean GOODBYE = false;
		public boolean hewhowatches = false;
		public boolean HHGkilledtoggle = false;
		public boolean itemswap1 = false;
		public boolean itemswap2 = false;
		public boolean lightningcooldowndday = false;
		public boolean madlads = false;
		public boolean OHBOY = false;
		public boolean OHNO = false;
		public boolean riftspawnoneentity = false;
		public boolean riskcheckedstart = false;
		public boolean riskcooldown = true;
		public boolean sddaydialoguetimeblock = false;
		public boolean sddayspikecooldown = false;
		public boolean sddaystart = false;
		public boolean sddaytimenighttimerblock = false;
		public boolean SDDAYToggle = false;
		public boolean sddaywait = true;
		public boolean sdoomsdaymainsongstart = false;
		public boolean SharkoLayCD = true;
		public boolean SharkoSleepCD = true;
		public boolean SuperDoomsdayEeriePlayOnce = false;
		public boolean SuperDoomsDayStart = false;
		public boolean theenddialoguetimeblock = false;
		public boolean TheEndEeriePlayOnce = false;
		public boolean theendhalf1complete = false;
		public boolean theendmainsongstart = false;
		public boolean theendspikecooldown = false;
		public boolean TheEndStart = false;
		public boolean theendtimenighttimerblock = false;
		public boolean theendwait = true;
		public boolean thestart = false;
		public boolean timecheckstop = false;
		public boolean waittildoomsday = false;
		public boolean waittilsdoomsday = false;
		public double challengeplayerreadyupcount = 0.0;
		public double DoomsDayAliveCount = 0.0;
		public double DoomsdayDeathCount = 0.0;
		public double DoomsdayRiskFailCount = 0.0;
		public double getdamage = 0;
		public double MobDifficulty = 0;
		public double nightmare = 0.0;
		public double PlayerWorldCount = 0;
		public double Risk = 0.0;
		public double timebeforespecial = 0.0;
		public double SharkoKilledByPlayersCount = 0;
		public double playersaidyestotrymaxdiff = 0;
		public double playerobtainedbigcount = 0;
		public double playerobtainedlargecount = 0;
		public double playerobtainedhugecount = 0;
		public double playerobtainedenormouscount = 0;
		public double playerobtainedgiganticcount = 0;
		public double playerobtainedmassivecount = 0;
		public double playerobtainedbiblicallycount = 0;
		public double playerobtainedmonstrositycount = 0;
		public double playerobtaineddoomsdaycount = 0;
		public double playerobtainedsuperdoomsdaycount = 0;
		public double playerobtainedtheendcount = 0;
		public double playerobtainedengiecount = 0;
		public double playerobtainedmindscapecount = 0;
		public boolean SharkoLayOnSideCD = true;
		public boolean SharkoSitCD = true;
		public boolean antimatterdropcheck = false;
		public double getdamage2 = 0;
		public double playerobtainedantimatterregularcount = 0;
		public double playerobtainedantimatterbigcount = 0;
		public double playerobtainedantimatterlargecount = 0;
		public double playerobtainedantimatterhugecount = 0;
		public double playerobtainedantimatterenormouscount = 0;
		public double playerobtainedantimattergiganticcount = 0;
		public double playerobtainedantimattermassivecount = 0;
		public double playerobtainedantimatterbiblicallycount = 0;
		public double playerobtainedantimattermonstrositycount = 0;
		public double playerobtainedantimatterdoomsdaycount = 0;
		public double playerobtainedantimattersuperdoomsdaycount = 0;
		public double playerobtainedantimattertheendcount = 0;
		public double playerobtainedantimatterengiecount = 0;
		public double playerobtainedengiegamesswordcount = 0;
		public double playerobtainedantimatterengiegamessword = 0;
		public double playerobtainedantimatterminicount = 0;
		public boolean CosmicEngieGamesSpawnLock = true;
		public boolean CosmicEngieGamesDespawnLock = true;

		public static MapVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			MapVariables data = new MapVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			Birthday = nbt.getBoolean("Birthday");
			birthdaystart = nbt.getBoolean("birthdaystart");
			BYEBYE = nbt.getBoolean("BYEBYE");
			ChallengeToggle = nbt.getBoolean("ChallengeToggle");
			checkboxbothmarked = nbt.getBoolean("checkboxbothmarked");
			checkboxbothnomarked = nbt.getBoolean("checkboxbothnomarked");
			darknesscooldown = nbt.getBoolean("darknesscooldown");
			DayCooldownToggle = nbt.getBoolean("DayCooldownToggle");
			ddaydialoguetimeblock = nbt.getBoolean("ddaydialoguetimeblock");
			ddayspikecooldown = nbt.getBoolean("ddayspikecooldown");
			ddaystart = nbt.getBoolean("ddaystart");
			ddaytimenighttimerblock = nbt.getBoolean("ddaytimenighttimerblock");
			ddaywait = nbt.getBoolean("ddaywait");
			DoomsdayDialogueStart = nbt.getBoolean("DoomsdayDialogueStart");
			DoomsdayEeriePlayOnce = nbt.getBoolean("DoomsdayEeriePlayOnce");
			doomsdaymainsongstart = nbt.getBoolean("doomsdaymainsongstart");
			DoomsDayStart = nbt.getBoolean("DoomsDayStart");
			GOODBYE = nbt.getBoolean("GOODBYE");
			hewhowatches = nbt.getBoolean("hewhowatches");
			HHGkilledtoggle = nbt.getBoolean("HHGkilledtoggle");
			itemswap1 = nbt.getBoolean("itemswap1");
			itemswap2 = nbt.getBoolean("itemswap2");
			lightningcooldowndday = nbt.getBoolean("lightningcooldowndday");
			madlads = nbt.getBoolean("madlads");
			OHBOY = nbt.getBoolean("OHBOY");
			OHNO = nbt.getBoolean("OHNO");
			riftspawnoneentity = nbt.getBoolean("riftspawnoneentity");
			riskcheckedstart = nbt.getBoolean("riskcheckedstart");
			riskcooldown = nbt.getBoolean("riskcooldown");
			sddaydialoguetimeblock = nbt.getBoolean("sddaydialoguetimeblock");
			sddayspikecooldown = nbt.getBoolean("sddayspikecooldown");
			sddaystart = nbt.getBoolean("sddaystart");
			sddaytimenighttimerblock = nbt.getBoolean("sddaytimenighttimerblock");
			SDDAYToggle = nbt.getBoolean("SDDAYToggle");
			sddaywait = nbt.getBoolean("sddaywait");
			sdoomsdaymainsongstart = nbt.getBoolean("sdoomsdaymainsongstart");
			SharkoLayCD = nbt.getBoolean("SharkoLayCD");
			SharkoSleepCD = nbt.getBoolean("SharkoSleepCD");
			SuperDoomsdayEeriePlayOnce = nbt.getBoolean("SuperDoomsdayEeriePlayOnce");
			SuperDoomsDayStart = nbt.getBoolean("SuperDoomsDayStart");
			theenddialoguetimeblock = nbt.getBoolean("theenddialoguetimeblock");
			TheEndEeriePlayOnce = nbt.getBoolean("TheEndEeriePlayOnce");
			theendhalf1complete = nbt.getBoolean("theendhalf1complete");
			theendmainsongstart = nbt.getBoolean("theendmainsongstart");
			theendspikecooldown = nbt.getBoolean("theendspikecooldown");
			TheEndStart = nbt.getBoolean("TheEndStart");
			theendtimenighttimerblock = nbt.getBoolean("theendtimenighttimerblock");
			theendwait = nbt.getBoolean("theendwait");
			thestart = nbt.getBoolean("thestart");
			timecheckstop = nbt.getBoolean("timecheckstop");
			waittildoomsday = nbt.getBoolean("waittildoomsday");
			waittilsdoomsday = nbt.getBoolean("waittilsdoomsday");
			challengeplayerreadyupcount = nbt.getDouble("challengeplayerreadyupcount");
			DoomsDayAliveCount = nbt.getDouble("DoomsDayAliveCount");
			DoomsdayDeathCount = nbt.getDouble("DoomsdayDeathCount");
			DoomsdayRiskFailCount = nbt.getDouble("DoomsdayRiskFailCount");
			getdamage = nbt.getDouble("getdamage");
			MobDifficulty = nbt.getDouble("MobDifficulty");
			nightmare = nbt.getDouble("nightmare");
			PlayerWorldCount = nbt.getDouble("PlayerWorldCount");
			Risk = nbt.getDouble("Risk");
			timebeforespecial = nbt.getDouble("timebeforespecial");
			SharkoKilledByPlayersCount = nbt.getDouble("SharkoKilledByPlayersCount");
			playersaidyestotrymaxdiff = nbt.getDouble("playersaidyestotrymaxdiff");
			playerobtainedbigcount = nbt.getDouble("playerobtainedbigcount");
			playerobtainedlargecount = nbt.getDouble("playerobtainedlargecount");
			playerobtainedhugecount = nbt.getDouble("playerobtainedhugecount");
			playerobtainedenormouscount = nbt.getDouble("playerobtainedenormouscount");
			playerobtainedgiganticcount = nbt.getDouble("playerobtainedgiganticcount");
			playerobtainedmassivecount = nbt.getDouble("playerobtainedmassivecount");
			playerobtainedbiblicallycount = nbt.getDouble("playerobtainedbiblicallycount");
			playerobtainedmonstrositycount = nbt.getDouble("playerobtainedmonstrositycount");
			playerobtaineddoomsdaycount = nbt.getDouble("playerobtaineddoomsdaycount");
			playerobtainedsuperdoomsdaycount = nbt.getDouble("playerobtainedsuperdoomsdaycount");
			playerobtainedtheendcount = nbt.getDouble("playerobtainedtheendcount");
			playerobtainedengiecount = nbt.getDouble("playerobtainedengiecount");
			playerobtainedmindscapecount = nbt.getDouble("playerobtainedmindscapecount");
			SharkoLayOnSideCD = nbt.getBoolean("SharkoLayOnSideCD");
			SharkoSitCD = nbt.getBoolean("SharkoSitCD");
			antimatterdropcheck = nbt.getBoolean("antimatterdropcheck");
			getdamage2 = nbt.getDouble("getdamage2");
			playerobtainedantimatterregularcount = nbt.getDouble("playerobtainedantimatterregularcount");
			playerobtainedantimatterbigcount = nbt.getDouble("playerobtainedantimatterbigcount");
			playerobtainedantimatterlargecount = nbt.getDouble("playerobtainedantimatterlargecount");
			playerobtainedantimatterhugecount = nbt.getDouble("playerobtainedantimatterhugecount");
			playerobtainedantimatterenormouscount = nbt.getDouble("playerobtainedantimatterenormouscount");
			playerobtainedantimattergiganticcount = nbt.getDouble("playerobtainedantimattergiganticcount");
			playerobtainedantimattermassivecount = nbt.getDouble("playerobtainedantimattermassivecount");
			playerobtainedantimatterbiblicallycount = nbt.getDouble("playerobtainedantimatterbiblicallycount");
			playerobtainedantimattermonstrositycount = nbt.getDouble("playerobtainedantimattermonstrositycount");
			playerobtainedantimatterdoomsdaycount = nbt.getDouble("playerobtainedantimatterdoomsdaycount");
			playerobtainedantimattersuperdoomsdaycount = nbt.getDouble("playerobtainedantimattersuperdoomsdaycount");
			playerobtainedantimattertheendcount = nbt.getDouble("playerobtainedantimattertheendcount");
			playerobtainedantimatterengiecount = nbt.getDouble("playerobtainedantimatterengiecount");
			playerobtainedengiegamesswordcount = nbt.getDouble("playerobtainedengiegamesswordcount");
			playerobtainedantimatterengiegamessword = nbt.getDouble("playerobtainedantimatterengiegamessword");
			playerobtainedantimatterminicount = nbt.getDouble("playerobtainedantimatterminicount");
			CosmicEngieGamesSpawnLock = nbt.getBoolean("CosmicEngieGamesSpawnLock");
			CosmicEngieGamesDespawnLock = nbt.getBoolean("CosmicEngieGamesDespawnLock");
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putBoolean("Birthday", Birthday);
			nbt.putBoolean("birthdaystart", birthdaystart);
			nbt.putBoolean("BYEBYE", BYEBYE);
			nbt.putBoolean("ChallengeToggle", ChallengeToggle);
			nbt.putBoolean("checkboxbothmarked", checkboxbothmarked);
			nbt.putBoolean("checkboxbothnomarked", checkboxbothnomarked);
			nbt.putBoolean("darknesscooldown", darknesscooldown);
			nbt.putBoolean("DayCooldownToggle", DayCooldownToggle);
			nbt.putBoolean("ddaydialoguetimeblock", ddaydialoguetimeblock);
			nbt.putBoolean("ddayspikecooldown", ddayspikecooldown);
			nbt.putBoolean("ddaystart", ddaystart);
			nbt.putBoolean("ddaytimenighttimerblock", ddaytimenighttimerblock);
			nbt.putBoolean("ddaywait", ddaywait);
			nbt.putBoolean("DoomsdayDialogueStart", DoomsdayDialogueStart);
			nbt.putBoolean("DoomsdayEeriePlayOnce", DoomsdayEeriePlayOnce);
			nbt.putBoolean("doomsdaymainsongstart", doomsdaymainsongstart);
			nbt.putBoolean("DoomsDayStart", DoomsDayStart);
			nbt.putBoolean("GOODBYE", GOODBYE);
			nbt.putBoolean("hewhowatches", hewhowatches);
			nbt.putBoolean("HHGkilledtoggle", HHGkilledtoggle);
			nbt.putBoolean("itemswap1", itemswap1);
			nbt.putBoolean("itemswap2", itemswap2);
			nbt.putBoolean("lightningcooldowndday", lightningcooldowndday);
			nbt.putBoolean("madlads", madlads);
			nbt.putBoolean("OHBOY", OHBOY);
			nbt.putBoolean("OHNO", OHNO);
			nbt.putBoolean("riftspawnoneentity", riftspawnoneentity);
			nbt.putBoolean("riskcheckedstart", riskcheckedstart);
			nbt.putBoolean("riskcooldown", riskcooldown);
			nbt.putBoolean("sddaydialoguetimeblock", sddaydialoguetimeblock);
			nbt.putBoolean("sddayspikecooldown", sddayspikecooldown);
			nbt.putBoolean("sddaystart", sddaystart);
			nbt.putBoolean("sddaytimenighttimerblock", sddaytimenighttimerblock);
			nbt.putBoolean("SDDAYToggle", SDDAYToggle);
			nbt.putBoolean("sddaywait", sddaywait);
			nbt.putBoolean("sdoomsdaymainsongstart", sdoomsdaymainsongstart);
			nbt.putBoolean("SharkoLayCD", SharkoLayCD);
			nbt.putBoolean("SharkoSleepCD", SharkoSleepCD);
			nbt.putBoolean("SuperDoomsdayEeriePlayOnce", SuperDoomsdayEeriePlayOnce);
			nbt.putBoolean("SuperDoomsDayStart", SuperDoomsDayStart);
			nbt.putBoolean("theenddialoguetimeblock", theenddialoguetimeblock);
			nbt.putBoolean("TheEndEeriePlayOnce", TheEndEeriePlayOnce);
			nbt.putBoolean("theendhalf1complete", theendhalf1complete);
			nbt.putBoolean("theendmainsongstart", theendmainsongstart);
			nbt.putBoolean("theendspikecooldown", theendspikecooldown);
			nbt.putBoolean("TheEndStart", TheEndStart);
			nbt.putBoolean("theendtimenighttimerblock", theendtimenighttimerblock);
			nbt.putBoolean("theendwait", theendwait);
			nbt.putBoolean("thestart", thestart);
			nbt.putBoolean("timecheckstop", timecheckstop);
			nbt.putBoolean("waittildoomsday", waittildoomsday);
			nbt.putBoolean("waittilsdoomsday", waittilsdoomsday);
			nbt.putDouble("challengeplayerreadyupcount", challengeplayerreadyupcount);
			nbt.putDouble("DoomsDayAliveCount", DoomsDayAliveCount);
			nbt.putDouble("DoomsdayDeathCount", DoomsdayDeathCount);
			nbt.putDouble("DoomsdayRiskFailCount", DoomsdayRiskFailCount);
			nbt.putDouble("getdamage", getdamage);
			nbt.putDouble("MobDifficulty", MobDifficulty);
			nbt.putDouble("nightmare", nightmare);
			nbt.putDouble("PlayerWorldCount", PlayerWorldCount);
			nbt.putDouble("Risk", Risk);
			nbt.putDouble("timebeforespecial", timebeforespecial);
			nbt.putDouble("SharkoKilledByPlayersCount", SharkoKilledByPlayersCount);
			nbt.putDouble("playersaidyestotrymaxdiff", playersaidyestotrymaxdiff);
			nbt.putDouble("playerobtainedbigcount", playerobtainedbigcount);
			nbt.putDouble("playerobtainedlargecount", playerobtainedlargecount);
			nbt.putDouble("playerobtainedhugecount", playerobtainedhugecount);
			nbt.putDouble("playerobtainedenormouscount", playerobtainedenormouscount);
			nbt.putDouble("playerobtainedgiganticcount", playerobtainedgiganticcount);
			nbt.putDouble("playerobtainedmassivecount", playerobtainedmassivecount);
			nbt.putDouble("playerobtainedbiblicallycount", playerobtainedbiblicallycount);
			nbt.putDouble("playerobtainedmonstrositycount", playerobtainedmonstrositycount);
			nbt.putDouble("playerobtaineddoomsdaycount", playerobtaineddoomsdaycount);
			nbt.putDouble("playerobtainedsuperdoomsdaycount", playerobtainedsuperdoomsdaycount);
			nbt.putDouble("playerobtainedtheendcount", playerobtainedtheendcount);
			nbt.putDouble("playerobtainedengiecount", playerobtainedengiecount);
			nbt.putDouble("playerobtainedmindscapecount", playerobtainedmindscapecount);
			nbt.putBoolean("SharkoLayOnSideCD", SharkoLayOnSideCD);
			nbt.putBoolean("SharkoSitCD", SharkoSitCD);
			nbt.putBoolean("antimatterdropcheck", antimatterdropcheck);
			nbt.putDouble("getdamage2", getdamage2);
			nbt.putDouble("playerobtainedantimatterregularcount", playerobtainedantimatterregularcount);
			nbt.putDouble("playerobtainedantimatterbigcount", playerobtainedantimatterbigcount);
			nbt.putDouble("playerobtainedantimatterlargecount", playerobtainedantimatterlargecount);
			nbt.putDouble("playerobtainedantimatterhugecount", playerobtainedantimatterhugecount);
			nbt.putDouble("playerobtainedantimatterenormouscount", playerobtainedantimatterenormouscount);
			nbt.putDouble("playerobtainedantimattergiganticcount", playerobtainedantimattergiganticcount);
			nbt.putDouble("playerobtainedantimattermassivecount", playerobtainedantimattermassivecount);
			nbt.putDouble("playerobtainedantimatterbiblicallycount", playerobtainedantimatterbiblicallycount);
			nbt.putDouble("playerobtainedantimattermonstrositycount", playerobtainedantimattermonstrositycount);
			nbt.putDouble("playerobtainedantimatterdoomsdaycount", playerobtainedantimatterdoomsdaycount);
			nbt.putDouble("playerobtainedantimattersuperdoomsdaycount", playerobtainedantimattersuperdoomsdaycount);
			nbt.putDouble("playerobtainedantimattertheendcount", playerobtainedantimattertheendcount);
			nbt.putDouble("playerobtainedantimatterengiecount", playerobtainedantimatterengiecount);
			nbt.putDouble("playerobtainedengiegamesswordcount", playerobtainedengiegamesswordcount);
			nbt.putDouble("playerobtainedantimatterengiegamessword", playerobtainedantimatterengiegamessword);
			nbt.putDouble("playerobtainedantimatterminicount", playerobtainedantimatterminicount);
			nbt.putBoolean("CosmicEngieGamesSpawnLock", CosmicEngieGamesSpawnLock);
			nbt.putBoolean("CosmicEngieGamesDespawnLock", CosmicEngieGamesDespawnLock);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(new SavedData.Factory<>(MapVariables::new, MapVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(AllaboutengieMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public boolean BlockDeathAliveCOunt = false;
		public boolean coderedeemblock = false;
		public boolean detecstart = false;
		public boolean DoomsdayAlive = false;
		public boolean firstplay = false;
		public boolean GoodLuck = false;
		public boolean healthreductiondday = false;
		public boolean multiplayertrophyobtained = false;
		public boolean playerready = false;
		public boolean RespawnNormInstantHealth = false;
		public boolean RespawnTrueHardcoreGraceStart = false;
		public boolean SharkoRetryState = false;
		public boolean SharkoRideToggle = false;
		public boolean ShowObjectiveOverlay = false;
		public boolean solotrophyobtained = false;
		public boolean timeoverlaytoggle = false;
		public double AngryEngieKillCount = 0.0;
		public double browniescount = 0.0;
		public double cheeseballcount = 0.0;
		public double EnragedEngieKillCount = 0.0;
		public double HHGLookX = 525.0;
		public double HHGLookY = 525.0;
		public double HHGLookZ = 525.0;
		public double InsanityKillCount = 0.0;
		public double MadEngieKillCount = 0.0;
		public double OutragedEngieKillCount = 0.0;
		public double pageNumber = 1.0;
		public double PlayerX = 0.0;
		public double PlayerY = 0.0;
		public double PlayerZ = 0.0;
		public double RiftX = 0;
		public double RiftY = 0;
		public double RiftZ = 0;
		public double TrueHardcoreLifeCount = 10.0;
		public String pageNumberText = "";
		public double MonstrosityEngieKillCount = 0;
		public double PureInsanityKillCount = 0;
		public boolean crucifixsavedentity = false;
		public boolean WelcomeBackToggle = false;
		public boolean MaxPercentGiveOptionToDoHardestMobDiff = false;
		public boolean playerstunnedmobs = false;
		public boolean playerstunoffcooldown = false;
		public boolean gainedmadengieplush = false;
		public boolean gainedangryengieplush1 = false;
		public boolean gainedangryengieplush2 = false;
		public boolean gainedangryengieplush3 = false;
		public boolean gainedangryengieplush4 = false;
		public boolean gainedenragedengieplush1 = false;
		public boolean gainedenragedengieplush2 = false;
		public boolean gainedenragedengieplush3 = false;
		public boolean gainedenragedengieplush4 = false;
		public boolean gainedoutragedengieplush1 = false;
		public boolean gainedoutragedengieplush2 = false;
		public boolean gainedoutragedengieplush3 = false;
		public boolean gainedoutragedengieplush4 = false;
		public boolean gainedmonstrosityengieplush1 = false;
		public boolean gainedmonstrosityengieplush2 = false;
		public boolean gainedmonstrosityengieplush3 = false;
		public boolean gainedmonstrosityengieplush4 = false;
		public boolean gainedinsanityengieplush1 = false;
		public boolean gainedinsanityengieplush2 = false;
		public boolean gainedinsanityengieplush3 = false;
		public boolean gainedinsanityengieplush4 = false;
		public boolean gainedinsanityengieplush5 = false;
		public boolean gainedpureinsanityengieplush = false;
		public boolean DoomsdayTrackToggle = false;
		public boolean DoomsdayRiskTrackToggle = false;
		public boolean sharkolayingstate = false;
		public boolean difficultyoverlaytoggle = true;

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("BlockDeathAliveCOunt", BlockDeathAliveCOunt);
			nbt.putBoolean("coderedeemblock", coderedeemblock);
			nbt.putBoolean("detecstart", detecstart);
			nbt.putBoolean("DoomsdayAlive", DoomsdayAlive);
			nbt.putBoolean("firstplay", firstplay);
			nbt.putBoolean("GoodLuck", GoodLuck);
			nbt.putBoolean("healthreductiondday", healthreductiondday);
			nbt.putBoolean("multiplayertrophyobtained", multiplayertrophyobtained);
			nbt.putBoolean("playerready", playerready);
			nbt.putBoolean("RespawnNormInstantHealth", RespawnNormInstantHealth);
			nbt.putBoolean("RespawnTrueHardcoreGraceStart", RespawnTrueHardcoreGraceStart);
			nbt.putBoolean("SharkoRetryState", SharkoRetryState);
			nbt.putBoolean("SharkoRideToggle", SharkoRideToggle);
			nbt.putBoolean("ShowObjectiveOverlay", ShowObjectiveOverlay);
			nbt.putBoolean("solotrophyobtained", solotrophyobtained);
			nbt.putBoolean("timeoverlaytoggle", timeoverlaytoggle);
			nbt.putDouble("AngryEngieKillCount", AngryEngieKillCount);
			nbt.putDouble("browniescount", browniescount);
			nbt.putDouble("cheeseballcount", cheeseballcount);
			nbt.putDouble("EnragedEngieKillCount", EnragedEngieKillCount);
			nbt.putDouble("HHGLookX", HHGLookX);
			nbt.putDouble("HHGLookY", HHGLookY);
			nbt.putDouble("HHGLookZ", HHGLookZ);
			nbt.putDouble("InsanityKillCount", InsanityKillCount);
			nbt.putDouble("MadEngieKillCount", MadEngieKillCount);
			nbt.putDouble("OutragedEngieKillCount", OutragedEngieKillCount);
			nbt.putDouble("pageNumber", pageNumber);
			nbt.putDouble("PlayerX", PlayerX);
			nbt.putDouble("PlayerY", PlayerY);
			nbt.putDouble("PlayerZ", PlayerZ);
			nbt.putDouble("RiftX", RiftX);
			nbt.putDouble("RiftY", RiftY);
			nbt.putDouble("RiftZ", RiftZ);
			nbt.putDouble("TrueHardcoreLifeCount", TrueHardcoreLifeCount);
			nbt.putString("pageNumberText", pageNumberText);
			nbt.putDouble("MonstrosityEngieKillCount", MonstrosityEngieKillCount);
			nbt.putDouble("PureInsanityKillCount", PureInsanityKillCount);
			nbt.putBoolean("crucifixsavedentity", crucifixsavedentity);
			nbt.putBoolean("WelcomeBackToggle", WelcomeBackToggle);
			nbt.putBoolean("MaxPercentGiveOptionToDoHardestMobDiff", MaxPercentGiveOptionToDoHardestMobDiff);
			nbt.putBoolean("playerstunnedmobs", playerstunnedmobs);
			nbt.putBoolean("playerstunoffcooldown", playerstunoffcooldown);
			nbt.putBoolean("gainedmadengieplush", gainedmadengieplush);
			nbt.putBoolean("gainedangryengieplush1", gainedangryengieplush1);
			nbt.putBoolean("gainedangryengieplush2", gainedangryengieplush2);
			nbt.putBoolean("gainedangryengieplush3", gainedangryengieplush3);
			nbt.putBoolean("gainedangryengieplush4", gainedangryengieplush4);
			nbt.putBoolean("gainedenragedengieplush1", gainedenragedengieplush1);
			nbt.putBoolean("gainedenragedengieplush2", gainedenragedengieplush2);
			nbt.putBoolean("gainedenragedengieplush3", gainedenragedengieplush3);
			nbt.putBoolean("gainedenragedengieplush4", gainedenragedengieplush4);
			nbt.putBoolean("gainedoutragedengieplush1", gainedoutragedengieplush1);
			nbt.putBoolean("gainedoutragedengieplush2", gainedoutragedengieplush2);
			nbt.putBoolean("gainedoutragedengieplush3", gainedoutragedengieplush3);
			nbt.putBoolean("gainedoutragedengieplush4", gainedoutragedengieplush4);
			nbt.putBoolean("gainedmonstrosityengieplush1", gainedmonstrosityengieplush1);
			nbt.putBoolean("gainedmonstrosityengieplush2", gainedmonstrosityengieplush2);
			nbt.putBoolean("gainedmonstrosityengieplush3", gainedmonstrosityengieplush3);
			nbt.putBoolean("gainedmonstrosityengieplush4", gainedmonstrosityengieplush4);
			nbt.putBoolean("gainedinsanityengieplush1", gainedinsanityengieplush1);
			nbt.putBoolean("gainedinsanityengieplush2", gainedinsanityengieplush2);
			nbt.putBoolean("gainedinsanityengieplush3", gainedinsanityengieplush3);
			nbt.putBoolean("gainedinsanityengieplush4", gainedinsanityengieplush4);
			nbt.putBoolean("gainedinsanityengieplush5", gainedinsanityengieplush5);
			nbt.putBoolean("gainedpureinsanityengieplush", gainedpureinsanityengieplush);
			nbt.putBoolean("DoomsdayTrackToggle", DoomsdayTrackToggle);
			nbt.putBoolean("DoomsdayRiskTrackToggle", DoomsdayRiskTrackToggle);
			nbt.putBoolean("sharkolayingstate", sharkolayingstate);
			nbt.putBoolean("difficultyoverlaytoggle", difficultyoverlaytoggle);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			BlockDeathAliveCOunt = nbt.getBoolean("BlockDeathAliveCOunt");
			coderedeemblock = nbt.getBoolean("coderedeemblock");
			detecstart = nbt.getBoolean("detecstart");
			DoomsdayAlive = nbt.getBoolean("DoomsdayAlive");
			firstplay = nbt.getBoolean("firstplay");
			GoodLuck = nbt.getBoolean("GoodLuck");
			healthreductiondday = nbt.getBoolean("healthreductiondday");
			multiplayertrophyobtained = nbt.getBoolean("multiplayertrophyobtained");
			playerready = nbt.getBoolean("playerready");
			RespawnNormInstantHealth = nbt.getBoolean("RespawnNormInstantHealth");
			RespawnTrueHardcoreGraceStart = nbt.getBoolean("RespawnTrueHardcoreGraceStart");
			SharkoRetryState = nbt.getBoolean("SharkoRetryState");
			SharkoRideToggle = nbt.getBoolean("SharkoRideToggle");
			ShowObjectiveOverlay = nbt.getBoolean("ShowObjectiveOverlay");
			solotrophyobtained = nbt.getBoolean("solotrophyobtained");
			timeoverlaytoggle = nbt.getBoolean("timeoverlaytoggle");
			AngryEngieKillCount = nbt.getDouble("AngryEngieKillCount");
			browniescount = nbt.getDouble("browniescount");
			cheeseballcount = nbt.getDouble("cheeseballcount");
			EnragedEngieKillCount = nbt.getDouble("EnragedEngieKillCount");
			HHGLookX = nbt.getDouble("HHGLookX");
			HHGLookY = nbt.getDouble("HHGLookY");
			HHGLookZ = nbt.getDouble("HHGLookZ");
			InsanityKillCount = nbt.getDouble("InsanityKillCount");
			MadEngieKillCount = nbt.getDouble("MadEngieKillCount");
			OutragedEngieKillCount = nbt.getDouble("OutragedEngieKillCount");
			pageNumber = nbt.getDouble("pageNumber");
			PlayerX = nbt.getDouble("PlayerX");
			PlayerY = nbt.getDouble("PlayerY");
			PlayerZ = nbt.getDouble("PlayerZ");
			RiftX = nbt.getDouble("RiftX");
			RiftY = nbt.getDouble("RiftY");
			RiftZ = nbt.getDouble("RiftZ");
			TrueHardcoreLifeCount = nbt.getDouble("TrueHardcoreLifeCount");
			pageNumberText = nbt.getString("pageNumberText");
			MonstrosityEngieKillCount = nbt.getDouble("MonstrosityEngieKillCount");
			PureInsanityKillCount = nbt.getDouble("PureInsanityKillCount");
			crucifixsavedentity = nbt.getBoolean("crucifixsavedentity");
			WelcomeBackToggle = nbt.getBoolean("WelcomeBackToggle");
			MaxPercentGiveOptionToDoHardestMobDiff = nbt.getBoolean("MaxPercentGiveOptionToDoHardestMobDiff");
			playerstunnedmobs = nbt.getBoolean("playerstunnedmobs");
			playerstunoffcooldown = nbt.getBoolean("playerstunoffcooldown");
			gainedmadengieplush = nbt.getBoolean("gainedmadengieplush");
			gainedangryengieplush1 = nbt.getBoolean("gainedangryengieplush1");
			gainedangryengieplush2 = nbt.getBoolean("gainedangryengieplush2");
			gainedangryengieplush3 = nbt.getBoolean("gainedangryengieplush3");
			gainedangryengieplush4 = nbt.getBoolean("gainedangryengieplush4");
			gainedenragedengieplush1 = nbt.getBoolean("gainedenragedengieplush1");
			gainedenragedengieplush2 = nbt.getBoolean("gainedenragedengieplush2");
			gainedenragedengieplush3 = nbt.getBoolean("gainedenragedengieplush3");
			gainedenragedengieplush4 = nbt.getBoolean("gainedenragedengieplush4");
			gainedoutragedengieplush1 = nbt.getBoolean("gainedoutragedengieplush1");
			gainedoutragedengieplush2 = nbt.getBoolean("gainedoutragedengieplush2");
			gainedoutragedengieplush3 = nbt.getBoolean("gainedoutragedengieplush3");
			gainedoutragedengieplush4 = nbt.getBoolean("gainedoutragedengieplush4");
			gainedmonstrosityengieplush1 = nbt.getBoolean("gainedmonstrosityengieplush1");
			gainedmonstrosityengieplush2 = nbt.getBoolean("gainedmonstrosityengieplush2");
			gainedmonstrosityengieplush3 = nbt.getBoolean("gainedmonstrosityengieplush3");
			gainedmonstrosityengieplush4 = nbt.getBoolean("gainedmonstrosityengieplush4");
			gainedinsanityengieplush1 = nbt.getBoolean("gainedinsanityengieplush1");
			gainedinsanityengieplush2 = nbt.getBoolean("gainedinsanityengieplush2");
			gainedinsanityengieplush3 = nbt.getBoolean("gainedinsanityengieplush3");
			gainedinsanityengieplush4 = nbt.getBoolean("gainedinsanityengieplush4");
			gainedinsanityengieplush5 = nbt.getBoolean("gainedinsanityengieplush5");
			gainedpureinsanityengieplush = nbt.getBoolean("gainedpureinsanityengieplush");
			DoomsdayTrackToggle = nbt.getBoolean("DoomsdayTrackToggle");
			DoomsdayRiskTrackToggle = nbt.getBoolean("DoomsdayRiskTrackToggle");
			sharkolayingstate = nbt.getBoolean("sharkolayingstate");
			difficultyoverlaytoggle = nbt.getBoolean("difficultyoverlaytoggle");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(AllaboutengieMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}