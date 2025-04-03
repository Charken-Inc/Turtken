
package net.mcreator.turtken.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CompressedSeaGrassItem extends Item {
	public CompressedSeaGrassItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
