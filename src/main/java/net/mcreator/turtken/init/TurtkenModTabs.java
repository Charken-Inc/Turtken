
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.turtken.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.turtken.TurtkenMod;

public class TurtkenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TurtkenMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TURTKAIN = REGISTRY.register("turtkain",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.turtken.turtkain")).icon(() -> new ItemStack(TurtkenModItems.TURTKEN_SHELL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TurtkenModItems.TURTKEN_SPAWN_EGG.get());
				tabData.accept(TurtkenModItems.TURTKEN_SHELL.get());
				tabData.accept(TurtkenModItems.TURTKEN_SWORD.get());
				tabData.accept(TurtkenModItems.TURTKEN_SHELL_CHUNK.get());
				tabData.accept(TurtkenModItems.COMPRESSED_SEA_GRASS.get());
				tabData.accept(TurtkenModBlocks.COMPRESSED_SEAGRASS_BLOCK.get().asItem());
			}).build());
}
