
package net.mcreator.mse.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.mse.procedures.DEBUGGGGGGGGGGGGGGGGRightclickedOnBlockProcedure;

public class DEBUGGGGGGGGGGGGGGGGItem extends Item {
	public DEBUGGGGGGGGGGGGGGGGItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DEBUGGGGGGGGGGGGGGGGRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
