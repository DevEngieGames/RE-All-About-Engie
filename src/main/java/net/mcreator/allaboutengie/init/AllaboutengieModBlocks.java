/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.allaboutengie.block.UnobtainiumOreBlock;
import net.mcreator.allaboutengie.block.ThanksForPlayingBlock;
import net.mcreator.allaboutengie.block.TextboxyeahBlock;
import net.mcreator.allaboutengie.block.OutragedEngieBlockBlock;
import net.mcreator.allaboutengie.block.OldEngieOreBlock;
import net.mcreator.allaboutengie.block.OldDeepslateEngieOreBlock;
import net.mcreator.allaboutengie.block.MonstrosityEngieBlockBlock;
import net.mcreator.allaboutengie.block.MetalTableBlock;
import net.mcreator.allaboutengie.block.MetalChestWarpedBlock;
import net.mcreator.allaboutengie.block.MetalChestSpruceBlock;
import net.mcreator.allaboutengie.block.MetalChestOakBlock;
import net.mcreator.allaboutengie.block.MetalChestJungleBlock;
import net.mcreator.allaboutengie.block.MetalChestDarkOakBlock;
import net.mcreator.allaboutengie.block.MetalChestCrimsonBlock;
import net.mcreator.allaboutengie.block.MetalChestBlock;
import net.mcreator.allaboutengie.block.MetalChestBirchBlock;
import net.mcreator.allaboutengie.block.MetalChestAcaciaBlock;
import net.mcreator.allaboutengie.block.EnragedEngieBlockBlock;
import net.mcreator.allaboutengie.block.EngieOreBlock;
import net.mcreator.allaboutengie.block.EngieBlockBlock;
import net.mcreator.allaboutengie.block.DeepslateUnobtainiumOreBlock;
import net.mcreator.allaboutengie.block.DeepslateEngieOreBlock;
import net.mcreator.allaboutengie.block.CyberbloodBlockBlock;
import net.mcreator.allaboutengie.block.CyberOreBlock;
import net.mcreator.allaboutengie.block.CyberBlockBlock;
import net.mcreator.allaboutengie.block.ChallengeModeTrophySoloBlock;
import net.mcreator.allaboutengie.block.ChallengeModeTrophyMultiplayerBlock;
import net.mcreator.allaboutengie.block.BloodOreBlock;
import net.mcreator.allaboutengie.block.BloodBlockBlock;
import net.mcreator.allaboutengie.block.BiblicallyAccurateBlockBlock;
import net.mcreator.allaboutengie.block.AnyTypeOfWoodHelpBlock;
import net.mcreator.allaboutengie.block.AntimatterOutragedEngieBlockBlock;
import net.mcreator.allaboutengie.block.AntimatterMonstrosityEngieBlockBlock;
import net.mcreator.allaboutengie.block.AntimatterEnragedEngieBlockBlock;
import net.mcreator.allaboutengie.block.AntimatterEngieOreBlock;
import net.mcreator.allaboutengie.block.AntimatterEngieBlockBlock;
import net.mcreator.allaboutengie.block.AntimatterDeepslateEngieOreBlock;
import net.mcreator.allaboutengie.block.AntimatterBiblicallyAccurateBlockBlock;
import net.mcreator.allaboutengie.block.AntimatterAngryEngieBlockBlock;
import net.mcreator.allaboutengie.block.AngryEngieBlockBlock;
import net.mcreator.allaboutengie.block.AngelHattedPresentBlock;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.function.Function;

public class AllaboutengieModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AllaboutengieMod.MODID);
	public static final DeferredBlock<Block> ENGIE_BLOCK = register("engie_block", EngieBlockBlock::new);
	public static final DeferredBlock<Block> ANGRY_ENGIE_BLOCK = register("angry_engie_block", AngryEngieBlockBlock::new);
	public static final DeferredBlock<Block> ENRAGED_ENGIE_BLOCK = register("enraged_engie_block", EnragedEngieBlockBlock::new);
	public static final DeferredBlock<Block> ENGIE_ORE = register("engie_ore", EngieOreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_ENGIE_ORE = register("deepslate_engie_ore", DeepslateEngieOreBlock::new);
	public static final DeferredBlock<Block> METAL_TABLE = register("metal_table", MetalTableBlock::new);
	public static final DeferredBlock<Block> OLD_ENGIE_ORE = register("old_engie_ore", OldEngieOreBlock::new);
	public static final DeferredBlock<Block> OLD_DEEPSLATE_ENGIE_ORE = register("old_deepslate_engie_ore", OldDeepslateEngieOreBlock::new);
	public static final DeferredBlock<Block> THANKS_FOR_PLAYING = register("thanks_for_playing", ThanksForPlayingBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST = register("metal_chest", MetalChestBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_OAK = register("metal_chest_oak", MetalChestOakBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_DARK_OAK = register("metal_chest_dark_oak", MetalChestDarkOakBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_SPRUCE = register("metal_chest_spruce", MetalChestSpruceBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_ACACIA = register("metal_chest_acacia", MetalChestAcaciaBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_BIRCH = register("metal_chest_birch", MetalChestBirchBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_WARPED = register("metal_chest_warped", MetalChestWarpedBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_CRIMSON = register("metal_chest_crimson", MetalChestCrimsonBlock::new);
	public static final DeferredBlock<Block> METAL_CHEST_JUNGLE = register("metal_chest_jungle", MetalChestJungleBlock::new);
	public static final DeferredBlock<Block> OUTRAGED_ENGIE_BLOCK = register("outraged_engie_block", OutragedEngieBlockBlock::new);
	public static final DeferredBlock<Block> ANGEL_HATTED_PRESENT = register("angel_hatted_present", AngelHattedPresentBlock::new);
	public static final DeferredBlock<Block> CYBER_ORE = register("cyber_ore", CyberOreBlock::new);
	public static final DeferredBlock<Block> BLOOD_ORE = register("blood_ore", BloodOreBlock::new);
	public static final DeferredBlock<Block> UNOBTAINIUM_ORE = register("unobtainium_ore", UnobtainiumOreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_UNOBTAINIUM_ORE = register("deepslate_unobtainium_ore", DeepslateUnobtainiumOreBlock::new);
	public static final DeferredBlock<Block> CYBER_BLOCK = register("cyber_block", CyberBlockBlock::new);
	public static final DeferredBlock<Block> BLOOD_BLOCK = register("blood_block", BloodBlockBlock::new);
	public static final DeferredBlock<Block> CYBERBLOOD_BLOCK = register("cyberblood_block", CyberbloodBlockBlock::new);
	public static final DeferredBlock<Block> TEXTBOXYEAH = register("textboxyeah", TextboxyeahBlock::new);
	public static final DeferredBlock<Block> BIBLICALLY_ACCURATE_BLOCK = register("biblically_accurate_block", BiblicallyAccurateBlockBlock::new);
	public static final DeferredBlock<Block> MONSTROSITY_ENGIE_BLOCK = register("monstrosity_engie_block", MonstrosityEngieBlockBlock::new);
	public static final DeferredBlock<Block> CHALLENGE_MODE_TROPHY_SOLO = register("challenge_mode_trophy_solo", ChallengeModeTrophySoloBlock::new);
	public static final DeferredBlock<Block> CHALLENGE_MODE_TROPHY_MULTIPLAYER = register("challenge_mode_trophy_multiplayer", ChallengeModeTrophyMultiplayerBlock::new);
	public static final DeferredBlock<Block> ANY_TYPE_OF_WOOD_HELP = register("any_type_of_wood_help", AnyTypeOfWoodHelpBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_ENGIE_BLOCK = register("antimatter_engie_block", AntimatterEngieBlockBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_ANGRY_ENGIE_BLOCK = register("antimatter_angry_engie_block", AntimatterAngryEngieBlockBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_ENRAGED_ENGIE_BLOCK = register("antimatter_enraged_engie_block", AntimatterEnragedEngieBlockBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_OUTRAGED_ENGIE_BLOCK = register("antimatter_outraged_engie_block", AntimatterOutragedEngieBlockBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK = register("antimatter_biblically_accurate_block", AntimatterBiblicallyAccurateBlockBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_MONSTROSITY_ENGIE_BLOCK = register("antimatter_monstrosity_engie_block", AntimatterMonstrosityEngieBlockBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_ENGIE_ORE = register("antimatter_engie_ore", AntimatterEngieOreBlock::new);
	public static final DeferredBlock<Block> ANTIMATTER_DEEPSLATE_ENGIE_ORE = register("antimatter_deepslate_engie_ore", AntimatterDeepslateEngieOreBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}