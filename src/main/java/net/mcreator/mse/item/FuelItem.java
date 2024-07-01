
package net.mcreator.mse.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mse.init.MseModFluids;

public class FuelItem extends BucketItem {
	public FuelItem() {
		super(MseModFluids.FUEL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
