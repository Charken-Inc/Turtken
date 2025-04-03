
package net.mcreator.turtken.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CompressedSeagrassBlockBlock extends Block {
	public CompressedSeagrassBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHERITE_BLOCK).strength(50f, 1200f).friction(0.7f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
