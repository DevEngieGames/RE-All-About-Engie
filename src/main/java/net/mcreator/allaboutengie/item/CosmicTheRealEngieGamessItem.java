package net.mcreator.allaboutengie.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.Map;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class CosmicTheRealEngieGamessItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(900, Map.of(ArmorType.BOOTS, 900, ArmorType.LEGGINGS, 900, ArmorType.CHESTPLATE, 900, ArmorType.HELMET, 900, ArmorType.BODY, 900), 22,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 75f, 2.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:cosmic_the_real_engie_gamess_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("allaboutengie:cosmic_the_real_engie_gamess")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/cosmicarmorlayer1.png");
			}
		}, AllaboutengieModItems.COSMIC_THE_REAL_ENGIE_GAMESS_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/cosmicarmorlayer1.png");
			}
		}, AllaboutengieModItems.COSMIC_THE_REAL_ENGIE_GAMESS_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/cosmicarmorlayer2.png");
			}
		}, AllaboutengieModItems.COSMIC_THE_REAL_ENGIE_GAMESS_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/cosmicarmorlayer1.png");
			}
		}, AllaboutengieModItems.COSMIC_THE_REAL_ENGIE_GAMESS_BOOTS.get());
	}

	private CosmicTheRealEngieGamessItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends CosmicTheRealEngieGamessItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties.fireResistant());
		}
	}

	public static class Chestplate extends CosmicTheRealEngieGamessItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties.fireResistant());
		}
	}

	public static class Leggings extends CosmicTheRealEngieGamessItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties.fireResistant());
		}
	}

	public static class Boots extends CosmicTheRealEngieGamessItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties.fireResistant());
		}
	}
}