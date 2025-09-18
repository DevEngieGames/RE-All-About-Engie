package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.entity.TheEndHostileEntity;
import net.mcreator.allaboutengie.entity.SuperDoomsDayHostileEntity;
import net.mcreator.allaboutengie.entity.OutragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.OutragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.OutragedEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.MadEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.DoomsDayHostileEntity;
import net.mcreator.allaboutengie.entity.DistortedEntity;
import net.mcreator.allaboutengie.entity.AngryEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.AngryEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;

public class EntityNameDisplayUpdateTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MadEngieEntity) {
			entity.setCustomName(Component.literal(("Mad Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof MadEngieColdSeasonEntity) {
			entity.setCustomName(Component.literal(("Mad Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof AngryEngieEntity) {
			entity.setCustomName(Component.literal(("Angry Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof AngryEngieStyle2Entity) {
			entity.setCustomName(Component.literal(("Angry Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof AngryEngieSharkoEntity) {
			entity.setCustomName(Component.literal(("Angry Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof AngryEngieColdSeasonEntity) {
			entity.setCustomName(Component.literal(("Angry Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof EnragedEngieEntity) {
			entity.setCustomName(Component.literal(("Enraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof EnragedEngieStyle2Entity) {
			entity.setCustomName(Component.literal(("Enraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof EnragedEngieStyle3Entity) {
			entity.setCustomName(Component.literal(("Enraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof EnragedEngieSharkoEntity) {
			entity.setCustomName(Component.literal(("Enraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof EnragedEngieColdSeasonEntity) {
			entity.setCustomName(Component.literal(("Enraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof AngryCreatorEntity) {
			entity.setCustomName(Component.literal(("Outraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof OutragedEngieStyle2Entity) {
			entity.setCustomName(Component.literal(("Outraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof OutragedEngieSharkoEntity) {
			entity.setCustomName(Component.literal(("Outraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof OutragedEngieColdSeasonEntity) {
			entity.setCustomName(Component.literal(("Outraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof MonstrosityEngieEntity) {
			entity.setCustomName(Component.literal(("Monstrosity Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof MonstrosityEngieSharkoEntity) {
			entity.setCustomName(Component.literal(("Monstrosity Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof MonstrosityEngieColdSeasonEntity) {
			entity.setCustomName(Component.literal(("Monstrosity Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof DoomsDayHostileEntity) {
			entity.setCustomName(Component.literal(("Doomsday (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof SuperDoomsDayHostileEntity) {
			entity.setCustomName(Component.literal(("Super Doomsday (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof TheEndHostileEntity) {
			entity.setCustomName(Component.literal(("The End (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof DistortedEntity) {
			entity.setCustomName(Component.literal(("\u00A7kD\u00A7rD\u00A7kI\u00A7rI\u00A7kS\u00A7rS\u00A7kT\u00A7rT\u00A7kO\u00A7rO\u00A7kR\u00A7rR\u00A7kT\u00A7rT\u00A7kE\u00A7rE\u00A7kD\u00A7rD\u00A7kD\u00A7r" + " - ["
					+ (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		}
	}
}