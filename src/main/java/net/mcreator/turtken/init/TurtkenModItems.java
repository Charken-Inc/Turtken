
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.turtken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.turtken.item.TurtkenSwordItem;
import net.mcreator.turtken.item.TurtkenShellItem;
import net.mcreator.turtken.item.TurtkenShellChunkItem;
import net.mcreator.turtken.item.CompressedSeaGrassItem;
import net.mcreator.turtken.TurtkenMod;

import java.util.function.Function;

public class TurtkenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TurtkenMod.MODID);
	public static final DeferredItem<Item> TURTKEN_SPAWN_EGG = register("turtken_spawn_egg", properties -> new SpawnEggItem(TurtkenModEntities.TURTKEN.get(), properties));
	public static final DeferredItem<Item> TURTKEN_SHELL = register("turtken_shell", TurtkenShellItem::new);
	public static final DeferredItem<Item> TURTKEN_SWORD = register("turtken_sword", TurtkenSwordItem::new);
	public static final DeferredItem<Item> TURTKEN_SHELL_CHUNK = register("turtken_shell_chunk", TurtkenShellChunkItem::new);
	public static final DeferredItem<Item> COMPRESSED_SEA_GRASS = register("compressed_sea_grass", CompressedSeaGrassItem::new);
	public static final DeferredItem<Item> COMPRESSED_SEAGRASS_BLOCK = block(TurtkenModBlocks.COMPRESSED_SEAGRASS_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
