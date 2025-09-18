/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.TheEndTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.TheEndAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.SuperDoomsDayTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.SuperDoomsDayAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.RegularMetalBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.OutragedEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.MonstrosityEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalChestUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EnragedEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngiesOwnEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngiesBirthdayBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngieTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngieGamesTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngieGamesAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngieAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.ETCEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.DoomsDayTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.DoomsDayAntimatterTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.CustomRecipeBookMenu;
import net.mcreator.allaboutengie.world.inventory.CreativeEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.CosmicEngieGamesTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.BirthdayBundleForYoungestUIMenu;
import net.mcreator.allaboutengie.world.inventory.BiblicallyAccurateEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.AngryEngieBundleUIMenu;
import net.mcreator.allaboutengie.network.MenuStateUpdateMessage;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Map;

public class AllaboutengieModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AllaboutengieMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MetalChestUIMenu>> METAL_CHEST_UI = REGISTRY.register("metal_chest_ui", () -> IMenuTypeExtension.create(MetalChestUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MetalBundleUIMenu>> ENGIE_BUNDLE_UI = REGISTRY.register("engie_bundle_ui", () -> IMenuTypeExtension.create(MetalBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AngryEngieBundleUIMenu>> ANGRY_ENGIE_BUNDLE_UI = REGISTRY.register("angry_engie_bundle_ui", () -> IMenuTypeExtension.create(AngryEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EnragedEngieBundleUIMenu>> ENRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("enraged_engie_bundle_ui", () -> IMenuTypeExtension.create(EnragedEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<OutragedEngieBundleUIMenu>> OUTRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("outraged_engie_bundle_ui", () -> IMenuTypeExtension.create(OutragedEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BiblicallyAccurateEngieBundleUIMenu>> BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI = REGISTRY.register("biblically_accurate_engie_bundle_ui",
			() -> IMenuTypeExtension.create(BiblicallyAccurateEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MonstrosityEngieBundleUIMenu>> MONSTROSITY_ENGIE_BUNDLE_UI = REGISTRY.register("monstrosity_engie_bundle_ui", () -> IMenuTypeExtension.create(MonstrosityEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ETCEngieBundleUIMenu>> ETC_ENGIE_BUNDLE_UI = REGISTRY.register("etc_engie_bundle_ui", () -> IMenuTypeExtension.create(ETCEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CreativeEngieBundleUIMenu>> CREATIVE_ENGIE_BUNDLE_UI = REGISTRY.register("creative_engie_bundle_ui", () -> IMenuTypeExtension.create(CreativeEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngiesOwnEngieBundleUIMenu>> ENGIES_OWN_ENGIE_BUNDLE_UI = REGISTRY.register("engies_own_engie_bundle_ui", () -> IMenuTypeExtension.create(EngiesOwnEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngiesBirthdayBundleUIMenu>> ENGIES_BIRTHDAY_BUNDLE_UI = REGISTRY.register("engies_birthday_bundle_ui", () -> IMenuTypeExtension.create(EngiesBirthdayBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DoomsDayTradeUIMenu>> DOOMS_DAY_TRADE_UI = REGISTRY.register("dooms_day_trade_ui", () -> IMenuTypeExtension.create(DoomsDayTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SuperDoomsDayTradeUIMenu>> SUPER_DOOMS_DAY_TRADE_UI = REGISTRY.register("super_dooms_day_trade_ui", () -> IMenuTypeExtension.create(SuperDoomsDayTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TheEndTradeUIMenu>> THE_END_TRADE_UI = REGISTRY.register("the_end_trade_ui", () -> IMenuTypeExtension.create(TheEndTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngieTradeUIMenu>> ENGIE_TRADE_UI = REGISTRY.register("engie_trade_ui", () -> IMenuTypeExtension.create(EngieTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BirthdayBundleForYoungestUIMenu>> BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI = REGISTRY.register("birthday_bundle_for_youngest_ui",
			() -> IMenuTypeExtension.create(BirthdayBundleForYoungestUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CustomRecipeBookMenu>> CUSTOM_RECIPE_BOOK = REGISTRY.register("custom_recipe_book", () -> IMenuTypeExtension.create(CustomRecipeBookMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngieGamesTradeUIMenu>> ENGIE_GAMES_TRADE_UI = REGISTRY.register("engie_games_trade_ui", () -> IMenuTypeExtension.create(EngieGamesTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RegularMetalBundleUIMenu>> REGULAR_METAL_BUNDLE_UI = REGISTRY.register("regular_metal_bundle_ui", () -> IMenuTypeExtension.create(RegularMetalBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DoomsDayAntimatterTradeUIMenu>> DOOMS_DAY_ANTIMATTER_TRADE_UI = REGISTRY.register("dooms_day_antimatter_trade_ui", () -> IMenuTypeExtension.create(DoomsDayAntimatterTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SuperDoomsDayAntimatterTradeUIMenu>> SUPER_DOOMS_DAY_ANTIMATTER_TRADE_UI = REGISTRY.register("super_dooms_day_antimatter_trade_ui",
			() -> IMenuTypeExtension.create(SuperDoomsDayAntimatterTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TheEndAntimatterTradeUIMenu>> THE_END_ANTIMATTER_TRADE_UI = REGISTRY.register("the_end_antimatter_trade_ui", () -> IMenuTypeExtension.create(TheEndAntimatterTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngieAntimatterTradeUIMenu>> ENGIE_ANTIMATTER_TRADE_UI = REGISTRY.register("engie_antimatter_trade_ui", () -> IMenuTypeExtension.create(EngieAntimatterTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngieGamesAntimatterTradeUIMenu>> ENGIE_GAMES_ANTIMATTER_TRADE_UI = REGISTRY.register("engie_games_antimatter_trade_ui",
			() -> IMenuTypeExtension.create(EngieGamesAntimatterTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CosmicEngieGamesTradeUIMenu>> COSMIC_ENGIE_GAMES_TRADE_UI = REGISTRY.register("cosmic_engie_games_trade_ui", () -> IMenuTypeExtension.create(CosmicEngieGamesTradeUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof AllaboutengieModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}