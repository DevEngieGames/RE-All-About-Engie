package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.allaboutengie.procedures.CheesePuffsUnopenOpenLidProcedure;

public class CheesePuffsUnopenedItem extends Item {
	public CheesePuffsUnopenedItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		CheesePuffsUnopenOpenLidProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CheesePuffsUnopenOpenLidProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}