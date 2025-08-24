package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DifficultyIncreaseProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == false) {
				if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 1) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 2) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 3) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 4) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 5) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 6) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 7) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 8) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 9) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 10) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 11) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 12) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount == world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 13) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 13;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}
