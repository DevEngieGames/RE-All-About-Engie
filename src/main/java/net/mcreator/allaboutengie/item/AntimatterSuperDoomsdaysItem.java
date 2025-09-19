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
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.client.model.Modelengiegamesarmorl2;
import net.mcreator.allaboutengie.client.model.Modelengiegamesarmorl1;

import java.util.Map;
import java.util.List;
import java.util.Collections;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class AntimatterSuperDoomsdaysItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(800, Map.of(ArmorType.BOOTS, 800, ArmorType.LEGGINGS, 800, ArmorType.CHESTPLATE, 800, ArmorType.HELMET, 800, ArmorType.BODY, 800), 22,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 55f, 1.7f, TagKey.create(Registries.ITEM, ResourceLocation.parse("allaboutengie:antimatter_super_doomsdays_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("allaboutengie:antimatter_super_doomsdays")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head",
						new ModelPart(Collections.emptyList(),
								Map.of("head", new Modelengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl1.LAYER_LOCATION)).head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
						"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
						"right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattersuperdoomsdayarmorlayer1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAYS_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("body", new Modelengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl1.LAYER_LOCATION)).body, "left_arm",
								new Modelengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl1.LAYER_LOCATION)).left_arm, "right_arm",
								new Modelengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl1.LAYER_LOCATION)).right_arm, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattersuperdoomsdayarmorlayer1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAYS_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modelengiegamesarmorl2(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl2.LAYER_LOCATION)).LeftLeg, "right_leg",
								new Modelengiegamesarmorl2(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl2.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattersuperdoomsdayarmorlayer2.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAYS_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modelengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl1.LAYER_LOCATION)).left_shoe, "right_leg",
								new Modelengiegamesarmorl1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelengiegamesarmorl1.LAYER_LOCATION)).right_shoe, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("allaboutengie:textures/entities/antimattersuperdoomsdayarmorlayer1.png");
			}
		}, AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAYS_BOOTS.get());
	}

	private AntimatterSuperDoomsdaysItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends AntimatterSuperDoomsdaysItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties.fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.allaboutengie.antimatter_super_doomsdays_helmet.description_0"));
		}
	}

	public static class Chestplate extends AntimatterSuperDoomsdaysItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties.fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.allaboutengie.antimatter_super_doomsdays_chestplate.description_0"));
		}
	}

	public static class Leggings extends AntimatterSuperDoomsdaysItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties.fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.allaboutengie.antimatter_super_doomsdays_leggings.description_0"));
		}
	}

	public static class Boots extends AntimatterSuperDoomsdaysItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties.fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.allaboutengie.antimatter_super_doomsdays_boots.description_0"));
		}
	}
}