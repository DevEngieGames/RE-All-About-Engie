package net.mcreator.allaboutengie.item;

import net.neoforged.neoforge.registries.DeferredHolder;
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.allaboutengie.procedures.BAEChestplateProcedure;
import net.mcreator.allaboutengie.procedures.BAEBootsProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.Map;

import com.google.common.collect.Iterables;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class AntimatterBiblicallyAccurateEngiesItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(725, Map.of(ArmorType.BOOTS, 725, ArmorType.LEGGINGS, 725, ArmorType.CHESTPLATE, 725, ArmorType.HELMET, 725, ArmorType.BODY, 725), 22,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_netherite")), 40f, 1.5f, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engies_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("allaboutengie:antimatter_biblically_accurate_engies")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimatterbiblicallyaccurateengie_layer_1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimatterbiblicallyaccurateengie_layer_1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimatterbiblicallyaccurateengie_layer_2.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/models/armor/antimatterbiblicallyaccurateengie_layer_1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get());
	}

	private AntimatterBiblicallyAccurateEngiesItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends AntimatterBiblicallyAccurateEngiesItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends AntimatterBiblicallyAccurateEngiesItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				BAEChestplateProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends AntimatterBiblicallyAccurateEngiesItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends AntimatterBiblicallyAccurateEngiesItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				BAEBootsProcedure.execute(entity);
			}
		}
	}
}