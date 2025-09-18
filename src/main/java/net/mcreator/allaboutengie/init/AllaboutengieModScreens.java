/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.allaboutengie.client.gui.TheEndTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.TheEndAntimatterTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.SuperDoomsDayTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.SuperDoomsDayAntimatterTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.RegularMetalBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.OutragedEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.MonstrosityEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.MetalChestUIScreen;
import net.mcreator.allaboutengie.client.gui.MetalBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.EnragedEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.EngiesOwnEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.EngiesBirthdayBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.EngieTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.EngieGamesTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.EngieGamesAntimatterTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.EngieAntimatterTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.ETCEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.DoomsDayTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.DoomsDayAntimatterTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.CustomRecipeBookScreen;
import net.mcreator.allaboutengie.client.gui.CreativeEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.CosmicEngieGamesTradeUIScreen;
import net.mcreator.allaboutengie.client.gui.BirthdayBundleForYoungestUIScreen;
import net.mcreator.allaboutengie.client.gui.BiblicallyAccurateEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.AngryEngieBundleUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllaboutengieModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AllaboutengieModMenus.METAL_CHEST_UI.get(), MetalChestUIScreen::new);
		event.register(AllaboutengieModMenus.ENGIE_BUNDLE_UI.get(), MetalBundleUIScreen::new);
		event.register(AllaboutengieModMenus.ANGRY_ENGIE_BUNDLE_UI.get(), AngryEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.ENRAGED_ENGIE_BUNDLE_UI.get(), EnragedEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.OUTRAGED_ENGIE_BUNDLE_UI.get(), OutragedEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI.get(), BiblicallyAccurateEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.MONSTROSITY_ENGIE_BUNDLE_UI.get(), MonstrosityEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.ETC_ENGIE_BUNDLE_UI.get(), ETCEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.CREATIVE_ENGIE_BUNDLE_UI.get(), CreativeEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.ENGIES_OWN_ENGIE_BUNDLE_UI.get(), EngiesOwnEngieBundleUIScreen::new);
		event.register(AllaboutengieModMenus.ENGIES_BIRTHDAY_BUNDLE_UI.get(), EngiesBirthdayBundleUIScreen::new);
		event.register(AllaboutengieModMenus.DOOMS_DAY_TRADE_UI.get(), DoomsDayTradeUIScreen::new);
		event.register(AllaboutengieModMenus.SUPER_DOOMS_DAY_TRADE_UI.get(), SuperDoomsDayTradeUIScreen::new);
		event.register(AllaboutengieModMenus.THE_END_TRADE_UI.get(), TheEndTradeUIScreen::new);
		event.register(AllaboutengieModMenus.ENGIE_TRADE_UI.get(), EngieTradeUIScreen::new);
		event.register(AllaboutengieModMenus.BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI.get(), BirthdayBundleForYoungestUIScreen::new);
		event.register(AllaboutengieModMenus.CUSTOM_RECIPE_BOOK.get(), CustomRecipeBookScreen::new);
		event.register(AllaboutengieModMenus.ENGIE_GAMES_TRADE_UI.get(), EngieGamesTradeUIScreen::new);
		event.register(AllaboutengieModMenus.REGULAR_METAL_BUNDLE_UI.get(), RegularMetalBundleUIScreen::new);
		event.register(AllaboutengieModMenus.DOOMS_DAY_ANTIMATTER_TRADE_UI.get(), DoomsDayAntimatterTradeUIScreen::new);
		event.register(AllaboutengieModMenus.SUPER_DOOMS_DAY_ANTIMATTER_TRADE_UI.get(), SuperDoomsDayAntimatterTradeUIScreen::new);
		event.register(AllaboutengieModMenus.THE_END_ANTIMATTER_TRADE_UI.get(), TheEndAntimatterTradeUIScreen::new);
		event.register(AllaboutengieModMenus.ENGIE_ANTIMATTER_TRADE_UI.get(), EngieAntimatterTradeUIScreen::new);
		event.register(AllaboutengieModMenus.ENGIE_GAMES_ANTIMATTER_TRADE_UI.get(), EngieGamesAntimatterTradeUIScreen::new);
		event.register(AllaboutengieModMenus.COSMIC_ENGIE_GAMES_TRADE_UI.get(), CosmicEngieGamesTradeUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}