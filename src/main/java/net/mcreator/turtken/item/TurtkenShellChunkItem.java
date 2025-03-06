
package net.mcreator.turtken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TurtkenShellChunkItem extends Item {
	public TurtkenShellChunkItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
