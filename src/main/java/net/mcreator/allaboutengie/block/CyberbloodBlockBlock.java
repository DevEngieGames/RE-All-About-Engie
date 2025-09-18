package net.mcreator.allaboutengie.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CyberbloodBlockBlock extends Block {
	public CyberbloodBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}