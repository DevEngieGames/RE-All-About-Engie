/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.allaboutengie.block.entity.MetalTableBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestWarpedBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestSpruceBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestOakBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestJungleBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestDarkOakBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestCrimsonBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestBirchBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestAcaciaBlockEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AllaboutengieModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AllaboutengieMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalTableBlockEntity>> METAL_TABLE = register("metal_table", AllaboutengieModBlocks.METAL_TABLE, MetalTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestBlockEntity>> METAL_CHEST = register("metal_chest", AllaboutengieModBlocks.METAL_CHEST, MetalChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestOakBlockEntity>> METAL_CHEST_OAK = register("metal_chest_oak", AllaboutengieModBlocks.METAL_CHEST_OAK, MetalChestOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestDarkOakBlockEntity>> METAL_CHEST_DARK_OAK = register("metal_chest_dark_oak", AllaboutengieModBlocks.METAL_CHEST_DARK_OAK, MetalChestDarkOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestSpruceBlockEntity>> METAL_CHEST_SPRUCE = register("metal_chest_spruce", AllaboutengieModBlocks.METAL_CHEST_SPRUCE, MetalChestSpruceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestAcaciaBlockEntity>> METAL_CHEST_ACACIA = register("metal_chest_acacia", AllaboutengieModBlocks.METAL_CHEST_ACACIA, MetalChestAcaciaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestBirchBlockEntity>> METAL_CHEST_BIRCH = register("metal_chest_birch", AllaboutengieModBlocks.METAL_CHEST_BIRCH, MetalChestBirchBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestWarpedBlockEntity>> METAL_CHEST_WARPED = register("metal_chest_warped", AllaboutengieModBlocks.METAL_CHEST_WARPED, MetalChestWarpedBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestCrimsonBlockEntity>> METAL_CHEST_CRIMSON = register("metal_chest_crimson", AllaboutengieModBlocks.METAL_CHEST_CRIMSON, MetalChestCrimsonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestJungleBlockEntity>> METAL_CHEST_JUNGLE = register("metal_chest_jungle", AllaboutengieModBlocks.METAL_CHEST_JUNGLE, MetalChestJungleBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_DARK_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_SPRUCE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_ACACIA.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_BIRCH.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_WARPED.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_CRIMSON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_JUNGLE.get(), SidedInvWrapper::new);
	}
}