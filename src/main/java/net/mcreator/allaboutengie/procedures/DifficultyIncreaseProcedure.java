package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DifficultyIncreaseProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == false) {
				if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 1) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbigcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 2) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 2;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedlargecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 3) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 3;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedhugecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 4) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 4;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedenormouscount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 5) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedgiganticcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 6) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 6;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmassivecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 7) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 7;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedbiblicallycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 8) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedmonstrositycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 9) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 9;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 10) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 10;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 11) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 11;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedtheendcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 12) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 12;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedengiecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedmindscapecount >= world.players().size()) {
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
				if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterminicount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 14) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 14;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterminicount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterminicount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterregularcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 15) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 15;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbigcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 16) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 16;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterlargecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 17) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 17;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterhugecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 18) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 18;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 19) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 19;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 20) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 20;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermassivecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 21) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 21;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 22) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 22;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 23) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 23;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 24) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 24;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 25) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 25;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattertheendcount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 26) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 26;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiecount >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 27) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 27;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword >= world.players().size()) {
					if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty < 28) {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 28;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						AllaboutengieModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}