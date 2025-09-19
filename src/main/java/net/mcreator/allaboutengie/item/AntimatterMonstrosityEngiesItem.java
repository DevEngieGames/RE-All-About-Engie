package net.mcreator.allaboutengie.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.allaboutengie.procedures.MEChestplateProcedure;
import net.mcreator.allaboutengie.procedures.MEBootsProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.Map;

import com.google.common.collect.Iterables;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class AntimatterMonstrosityEngiesItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(750, Map.of(ArmorType.BOOTS, 750, ArmorType.LEGGINGS, 750, ArmorType.CHESTPLATE, 750, ArmorType.HELMET, 750, ArmorType.BODY, 750), 22,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 45f, 1.5f, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engies_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("allaboutengie:antimatter_monstrosity_engies")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_2.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_BOOTS.get());
	}

	private AntimatterMonstrosityEngiesItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends AntimatterMonstrosityEngiesItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends AntimatterMonstrosityEngiesItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				MEChestplateProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends AntimatterMonstrosityEngiesItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends AntimatterMonstrosityEngiesItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				MEBootsProcedure.execute(entity);
			}
		}
	}
}