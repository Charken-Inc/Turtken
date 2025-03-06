
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.turtken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.turtken.item.TurtkenSwordItem;
import net.mcreator.turtken.item.TurtkenShellItem;
import net.mcreator.turtken.item.TurtkenShellChunkItem;
import net.mcreator.turtken.item.CompressedSeaGrassItem;
import net.mcreator.turtken.TurtkenMod;

public class TurtkenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TurtkenMod.MODID);
	public static final DeferredItem<Item> TURTKEN_SPAWN_EGG = REGISTRY.register("turtken_spawn_egg", () -> new DeferredSpawnEggItem(TurtkenModEntities.TURTKEN, -13369549, -13395712, new Item.Properties()));
	public static final DeferredItem<Item> TURTKEN_SHELL = REGISTRY.register("turtken_shell", TurtkenShellItem::new);
	public static final DeferredItem<Item> TURTKEN_SWORD = REGISTRY.register("turtken_sword", TurtkenSwordItem::new);
	public static final DeferredItem<Item> TURTKEN_SHELL_CHUNK = REGISTRY.register("turtken_shell_chunk", TurtkenShellChunkItem::new);
	public static final DeferredItem<Item> COMPRESSED_SEA_GRASS = REGISTRY.register("compressed_sea_grass", CompressedSeaGrassItem::new);
	public static final DeferredItem<Item> COMPRESSED_SEAGRASS_BLOCK = block(TurtkenModBlocks.COMPRESSED_SEAGRASS_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
