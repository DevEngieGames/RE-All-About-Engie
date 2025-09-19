package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.init.AllaboutengieModBlocks;

public class DeepslateUnobtainiumOreOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == false
				&& (world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE)) == true
				&& (world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK)) == false) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = AllaboutengieModBlocks.DEEPSLATE_ENGIE_ORE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES)) == false
				&& (world instanceof ServerLevel _serverLevelGR5 && _serverLevelGR5.getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE)) == false
				&& (world instanceof ServerLevel _serverLevelGR6 && _serverLevelGR6.getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK)) == true) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = AllaboutengieModBlocks.OLD_DEEPSLATE_ENGIE_ORE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}