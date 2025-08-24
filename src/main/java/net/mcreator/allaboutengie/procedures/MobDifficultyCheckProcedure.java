package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MobDifficultyCheckProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getEntity().level(), event.getAdvancement());
	}

	public static void execute(LevelAccessor world, Advancement advancement) {
		execute(null, world, advancement);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement) {
		if (advancement == null)
			return;
		DifficultyIncreaseProcedure.execute(world);
		if (world instanceof Level _lvl0 && _lvl0.getServer() != null && _lvl0.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 1) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl1 && _lvl1.getServer() != null && _lvl1.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:large_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 2) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:huge_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 3) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl3 && _lvl3.getServer() != null && _lvl3.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enormous_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 4) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl4 && _lvl4.getServer() != null && _lvl4.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gigantic_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 5) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl5 && _lvl5.getServer() != null && _lvl5.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:massive_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 6) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl6 && _lvl6.getServer() != null && _lvl6.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 7) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl7 && _lvl7.getServer() != null && _lvl7.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_ban_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 8) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl8 && _lvl8.getServer() != null && _lvl8.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:doomsday_ban_scythe_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 9) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl9 && _lvl9.getServer() != null && _lvl9.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:super_doomsday_ban_scythe_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 10) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl10 && _lvl10.getServer() != null && _lvl10.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:the_end_ban_scythe_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 11) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl11 && _lvl11.getServer() != null && _lvl11.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_ban_scythe_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 12) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl12 && _lvl12.getServer() != null && _lvl12.getServer().getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mindscape_ban_scythe_obtain")).equals(advancement)) {
			if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 13) {
				AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount = AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
