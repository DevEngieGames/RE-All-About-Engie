package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DamagerecieverProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "missiletype") == 1) {
			(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("allaboutengie:yellow_lightning_explosion")))),
					(float) DoubleArgumentType.getDouble(arguments, "number"));
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 2) {
			(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("allaboutengie:blue_burst_explosion")))),
					(float) DoubleArgumentType.getDouble(arguments, "number"));
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 3) {
			(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("allaboutengie:normal_explosion")))),
					(float) DoubleArgumentType.getDouble(arguments, "number"));
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 4) {
			(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("allaboutengie:moab_explosion")))),
					(float) DoubleArgumentType.getDouble(arguments, "number"));
		} else {
			(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) DoubleArgumentType.getDouble(arguments, "number"));
		}
	}

	private static Entity commandParameterEntity(CommandContext<CommandSourceStack> arguments, String parameter) {
		try {
			return EntityArgument.getEntity(arguments, parameter);
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}