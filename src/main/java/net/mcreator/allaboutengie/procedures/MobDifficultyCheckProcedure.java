package net.mcreator.allaboutengie.procedures;

import net.neoforged.neoforge.event.entity.player.AdvancementEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MobDifficultyCheckProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent.AdvancementEarnEvent event) {
		execute(event, event.getEntity().level(), event.getAdvancement().value());
	}

	public static void execute(LevelAccessor world, Advancement advancement) {
		execute(null, world, advancement);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement) {
		if (advancement == null)
			return;
		DifficultyIncreaseProcedure.execute(world);
		if (world instanceof Level _lvl0 && _lvl0.getServer() != null && _lvl0.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:big_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 1) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl1 && _lvl1.getServer() != null && _lvl1.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:large_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 2) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:huge_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 3) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl3 && _lvl3.getServer() != null && _lvl3.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:enormous_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 4) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl4 && _lvl4.getServer() != null && _lvl4.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:gigantic_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 5) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl5 && _lvl5.getServer() != null && _lvl5.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:massive_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 6) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl6 && _lvl6.getServer() != null && _lvl6.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:biblically_accurate_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 7) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl7 && _lvl7.getServer() != null && _lvl7.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:monstrosity_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 8) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl8 && _lvl8.getServer() != null && _lvl8.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:doomsday_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 9) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl9 && _lvl9.getServer() != null && _lvl9.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:super_doomsday_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 10) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl10 && _lvl10.getServer() != null && _lvl10.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:the_end_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 11) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl11 && _lvl11.getServer() != null && _lvl11.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:engies_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 12) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl12 && _lvl12.getServer() != null && _lvl12.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:mindscape_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 13) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (world instanceof Level _lvl13 && _lvl13.getServer() != null && _lvl13.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_mini_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 14) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterminicount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterminicount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl14 && _lvl14.getServer() != null && _lvl14.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 15) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterregularcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl15 && _lvl15.getServer() != null && _lvl15.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 16) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbigcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl16 && _lvl16.getServer() != null && _lvl16.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_large_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 17) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterlargecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl17 && _lvl17.getServer() != null && _lvl17.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_huge_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 18) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterhugecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl18 && _lvl18.getServer() != null && _lvl18.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_enormous_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 19) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl19 && _lvl19.getServer() != null && _lvl19.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_gigantic_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 20) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl20 && _lvl20.getServer() != null && _lvl20.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_massive_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 21) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermassivecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl21 && _lvl21.getServer() != null && _lvl21.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 22) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl22 && _lvl22.getServer() != null && _lvl22.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_monstrosity_ban_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 23) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl23 && _lvl23.getServer() != null && _lvl23.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_doomsday_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 24) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl24 && _lvl24.getServer() != null && _lvl24.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_super_doomsday_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 25) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl25 && _lvl25.getServer() != null && _lvl25.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_the_end_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 26) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattertheendcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl26 && _lvl26.getServer() != null && _lvl26.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engies_ban_scythe_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 27) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl27 && _lvl27.getServer() != null && _lvl27.getServer().getAdvancements().get(ResourceLocation.parse("allaboutengie:antimatter_engie_games_sword_obtain")).value().equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 28) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword = AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}