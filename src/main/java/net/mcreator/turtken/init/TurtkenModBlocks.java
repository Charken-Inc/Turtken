
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.turtken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.turtken.block.CompressedSeagrassBlockBlock;
import net.mcreator.turtken.TurtkenMod;

public class TurtkenModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TurtkenMod.MODID);
	public static final DeferredBlock<Block> COMPRESSED_SEAGRASS_BLOCK = REGISTRY.register("compressed_seagrass_block", CompressedSeagrassBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
