package net.mcreator.allaboutengie.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

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
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.client.model.Modeltherealengiegamesarmorl2;
import net.mcreator.allaboutengie.client.model.Modeltherealengiegamesarmorl1;

import java.util.Map;
import java.util.Collections;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class AntimatterTheRealEngieGamessItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(875, Map.of(ArmorType.BOOTS, 875, ArmorType.LEGGINGS, 875, ArmorType.CHESTPLATE, 875, ArmorType.HELMET, 875, ArmorType.BODY, 875), 22,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 70f, 2f, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_the_real_engie_gamess_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("allaboutengie:antimatter_the_real_engie_gamess")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("head",
								new ModelPart(Collections.emptyList(),
										Map.of("head", new Modeltherealengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl1.LAYER_LOCATION)).head, "hat",
												new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattertherealengiegamesarmorlayer1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("body", new Modeltherealengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl1.LAYER_LOCATION)).body, "left_arm",
								new Modeltherealengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl1.LAYER_LOCATION)).left_arm, "right_arm",
								new Modeltherealengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl1.LAYER_LOCATION)).right_arm, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattertherealengiegamesarmorlayer1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modeltherealengiegamesarmorl2(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl2.LAYER_LOCATION)).LeftLeg, "right_leg",
								new Modeltherealengiegamesarmorl2(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl2.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattertherealengiegamesarmorlayer2.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modeltherealengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl1.LAYER_LOCATION)).left_shoe, "right_leg",
								new Modeltherealengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltherealengiegamesarmorl1.LAYER_LOCATION)).right_shoe, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattertherealengiegamesarmorlayer1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_THE_REAL_ENGIE_GAMESS_BOOTS.get());
	}

	private AntimatterTheRealEngieGamessItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends AntimatterTheRealEngieGamessItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties.fireResistant());
		}
	}

	public static class Chestplate extends AntimatterTheRealEngieGamessItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties.fireResistant());
		}
	}

	public static class Leggings extends AntimatterTheRealEngieGamessItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties.fireResistant());
		}
	}

	public static class Boots extends AntimatterTheRealEngieGamessItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties.fireResistant());
		}
	}
}