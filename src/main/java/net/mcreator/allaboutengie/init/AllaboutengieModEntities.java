/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.entity.YellowLightningEntity;
import net.mcreator.allaboutengie.entity.WormholeEngieEntity;
import net.mcreator.allaboutengie.entity.UncommonEngieEntity;
import net.mcreator.allaboutengie.entity.TonySleepEntity;
import net.mcreator.allaboutengie.entity.TonyLayEntity;
import net.mcreator.allaboutengie.entity.TonyEntity;
import net.mcreator.allaboutengie.entity.TobyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TobySleepEntity;
import net.mcreator.allaboutengie.entity.TobySitEntity;
import net.mcreator.allaboutengie.entity.TobyLayOnSideEntity;
import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerSleepEntity;
import net.mcreator.allaboutengie.entity.TigerSitEntity;
import net.mcreator.allaboutengie.entity.TigerLayOnSideEntity;
import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.ThrowbackSharkoEntity;
import net.mcreator.allaboutengie.entity.ThrowbackProtogenEntity;
import net.mcreator.allaboutengie.entity.ThrowbackMadEngieEntity;
import net.mcreator.allaboutengie.entity.ThrowbackEnragedEngieEntity;
import net.mcreator.allaboutengie.entity.ThrowbackEngiEntity;
import net.mcreator.allaboutengie.entity.ThrowbackCreatorEntity;
import net.mcreator.allaboutengie.entity.ThrowbackBloodyEngieEntity;
import net.mcreator.allaboutengie.entity.ThrowbackAngryEngieEntity;
import net.mcreator.allaboutengie.entity.ThrowbackAngryCreatorEntity;
import net.mcreator.allaboutengie.entity.TheRealEngieGamesEntity;
import net.mcreator.allaboutengie.entity.TheEndHostileEntity;
import net.mcreator.allaboutengie.entity.TheEndEntity;
import net.mcreator.allaboutengie.entity.SuperDoomsDayHostileEntity;
import net.mcreator.allaboutengie.entity.SuperDoomsDayEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoSitEntity;
import net.mcreator.allaboutengie.entity.SharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.SharkoLayEntity;
import net.mcreator.allaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.SharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.ScorchedEntity;
import net.mcreator.allaboutengie.entity.RockySleepEntity;
import net.mcreator.allaboutengie.entity.RockyLayEntity;
import net.mcreator.allaboutengie.entity.RockyEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSitEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.RareSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareEngieEntity;
import net.mcreator.allaboutengie.entity.QuizzetEntity;
import net.mcreator.allaboutengie.entity.PureInsanityEntity;
import net.mcreator.allaboutengie.entity.ProtogenEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBESleepEntity;
import net.mcreator.allaboutengie.entity.PBESitEntity;
import net.mcreator.allaboutengie.entity.PBELayOnSideEntity;
import net.mcreator.allaboutengie.entity.PBELayEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.OutragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.OutragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.OutragedEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.NormalEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSitEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicEngieEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.MindscapeEngieEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalSleepEntity;
import net.mcreator.allaboutengie.entity.MarshalSitEntity;
import net.mcreator.allaboutengie.entity.MarshalLayOnSideEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.MadEngieOldRiftedEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.MadEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.MOABEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.entity.LouisSitEntity;
import net.mcreator.allaboutengie.entity.LouisLayOnSideEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSitEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendaryEngieEntity;
import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.entity.HeWhoGamesHostileEntity;
import net.mcreator.allaboutengie.entity.HeWhoGamesEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.FinneganZoomiesEntity;
import net.mcreator.allaboutengie.entity.FinneganSleepEntity;
import net.mcreator.allaboutengie.entity.FinneganSitEntity;
import net.mcreator.allaboutengie.entity.FinneganLayOnSideEntity;
import net.mcreator.allaboutengie.entity.FinneganLayEntity;
import net.mcreator.allaboutengie.entity.FinneganEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSitEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticEngieEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSitEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedTNTEntity;
import net.mcreator.allaboutengie.entity.EnragedTNT9Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT8Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT7Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT6Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT5Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT4Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT3Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT2Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.EnragedSpeed9Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed8Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed7Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed6Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed5Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed4Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed3Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed2Entity;
import net.mcreator.allaboutengie.entity.EnragedNormalEntity;
import net.mcreator.allaboutengie.entity.EnragedNormal9Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal8Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal7Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal6Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal5Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal4Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal3Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieOldRiftedEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSitEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSitEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayOnSideEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SitEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayOnSideEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2AprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieGamesEntity;
import net.mcreator.allaboutengie.entity.EngieGamesDetectiveEntity;
import net.mcreator.allaboutengie.entity.EngiFREntity;
import net.mcreator.allaboutengie.entity.EngiEntity;
import net.mcreator.allaboutengie.entity.DoomsDayHostileEntity;
import net.mcreator.allaboutengie.entity.DoomsDayEntity;
import net.mcreator.allaboutengie.entity.DistortedEntity;
import net.mcreator.allaboutengie.entity.DDayLightningSpawnerEntity;
import net.mcreator.allaboutengie.entity.DDAYRiftEntity;
import net.mcreator.allaboutengie.entity.CreatorEntity;
import net.mcreator.allaboutengie.entity.CosmoSleepEntity;
import net.mcreator.allaboutengie.entity.CosmoLayEntity;
import net.mcreator.allaboutengie.entity.CosmoEntity;
import net.mcreator.allaboutengie.entity.CosmicEngieGamesEntity;
import net.mcreator.allaboutengie.entity.CommonEngieEntity;
import net.mcreator.allaboutengie.entity.ChampZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ChampZoomiesEntity;
import net.mcreator.allaboutengie.entity.ChampSleepEntity;
import net.mcreator.allaboutengie.entity.ChampSitEntity;
import net.mcreator.allaboutengie.entity.ChampLayOnSideEntity;
import net.mcreator.allaboutengie.entity.ChampLayEntity;
import net.mcreator.allaboutengie.entity.ChampEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.CBESleepEntity;
import net.mcreator.allaboutengie.entity.CBESitEntity;
import net.mcreator.allaboutengie.entity.CBELayOnSideEntity;
import net.mcreator.allaboutengie.entity.CBELayEntity;
import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesEntity;
import net.mcreator.allaboutengie.entity.BuddySleepEntity;
import net.mcreator.allaboutengie.entity.BuddySitEntity;
import net.mcreator.allaboutengie.entity.BuddyLayOnSideEntity;
import net.mcreator.allaboutengie.entity.BuddyLayEntity;
import net.mcreator.allaboutengie.entity.BuddyEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.entity.Bothan2netSleepEntity;
import net.mcreator.allaboutengie.entity.Bothan2netSitEntity;
import net.mcreator.allaboutengie.entity.Bothan2netLayOnSideEntity;
import net.mcreator.allaboutengie.entity.Bothan2netLayEntity;
import net.mcreator.allaboutengie.entity.Bothan2netEntity;
import net.mcreator.allaboutengie.entity.BlueBurstEntity;
import net.mcreator.allaboutengie.entity.BloodyEngieRiftedEntity;
import net.mcreator.allaboutengie.entity.BigSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigSharkoEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoEntity;
import net.mcreator.allaboutengie.entity.BiblicallyAccurateEngieEntity;
import net.mcreator.allaboutengie.entity.BiblicallyAccurateEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.entity.AtlasSleepEntity;
import net.mcreator.allaboutengie.entity.AtlasSitEntity;
import net.mcreator.allaboutengie.entity.AtlasLayOnSideEntity;
import net.mcreator.allaboutengie.entity.AtlasLayEntity;
import net.mcreator.allaboutengie.entity.AtlasEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesEntity;
import net.mcreator.allaboutengie.entity.ApolloSleepEntity;
import net.mcreator.allaboutengie.entity.ApolloSitEntity;
import net.mcreator.allaboutengie.entity.ApolloLayOnSideEntity;
import net.mcreator.allaboutengie.entity.ApolloLayEntity;
import net.mcreator.allaboutengie.entity.ApolloEntity;
import net.mcreator.allaboutengie.entity.AngryEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.AngryEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AngryEngieOldRiftedEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieColdSeasonEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorRiftedEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;
import net.mcreator.allaboutengie.entity.AlienEngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.AlienEngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AlienEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSitEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayOnSideEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AllaboutengieModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AllaboutengieMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<EngiEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryCreatorEntity>> OUTRAGED_ENGIE = register("outraged_engie",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiFREntity>> ENGI_FR = register("engi_fr",
			EntityType.Builder.<EngiFREntity>of(EngiFREntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<CreatorEntity>> CREATOR = register("creator",
			EntityType.Builder.<CreatorEntity>of(CreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoEntity>> ALBINO_SHARKO = register("albino_sharko",
			EntityType.Builder.<AlbinoSharkoEntity>of(AlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareEntity>> ENGIE_SHARKO_RARE = register("engie_sharko_rare",
			EntityType.Builder.<EngieSharkoRareEntity>of(EngieSharkoRareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2Entity>> TIGER_SHARKO = register("tiger_sharko",
			EntityType.Builder.<EngieSharkoRare2Entity>of(EngieSharkoRare2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkTamedEntity>> SHARKO_TAMED = register("sharko_tamed",
			EntityType.Builder.<SharkTamedEntity>of(SharkTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoTamedEntity>> ALBINO_SHARKO_TAMED = register("albino_sharko_tamed",
			EntityType.Builder.<AlbinoSharkoTamedEntity>of(AlbinoSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoTamedEntity>> RARE_SHARKO_TAMED = register("rare_sharko_tamed",
			EntityType.Builder.<RareSharkoTamedEntity>of(RareSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoTamedEntity>> LEGENDARY_SHARKO_TAMED = register("legendary_sharko_tamed",
			EntityType.Builder.<LegendarySharkoTamedEntity>of(LegendarySharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoTamedEntity>> MYTHIC_SHARKO_TAMED = register("mythic_sharko_tamed",
			EntityType.Builder.<MythicSharkoTamedEntity>of(MythicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoTamedEntity>> EXOTIC_SHARKO_TAMED = register("exotic_sharko_tamed",
			EntityType.Builder.<ExoticSharkoTamedEntity>of(ExoticSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoTamedEntity>> ENGIE_SHARKO_TAMED = register("engie_sharko_tamed",
			EntityType.Builder.<EngieSharkoTamedEntity>of(EngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareTamedEntity>> ENGIE_SHARKO_RARE_TAMED = register("engie_sharko_rare_tamed",
			EntityType.Builder.<EngieSharkoRareTamedEntity>of(EngieSharkoRareTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2TamedEntity>> TIGER_SHARKO_TAMED = register("tiger_sharko_tamed",
			EntityType.Builder.<EngieSharkoRare2TamedEntity>of(EngieSharkoRare2TamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoLayEntity>> SHARKO_LAY = register("sharko_lay",
			EntityType.Builder.<SharkoLayEntity>of(SharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoLayEntity>> ALBINO_SHARKO_LAY = register("albino_sharko_lay",
			EntityType.Builder.<AlbinoSharkoLayEntity>of(AlbinoSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoLayEntity>> RARE_SHARKO_LAY = register("rare_sharko_lay",
			EntityType.Builder.<RareSharkoLayEntity>of(RareSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoLayEntity>> LEGENDARY_SHARKO_LAY = register("legendary_sharko_lay",
			EntityType.Builder.<LegendarySharkoLayEntity>of(LegendarySharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoLayEntity>> MYTHIC_SHARKO_LAY = register("mythic_sharko_lay",
			EntityType.Builder.<MythicSharkoLayEntity>of(MythicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoLayEntity>> EXOTIC_SHARKO_LAY = register("exotic_sharko_lay",
			EntityType.Builder.<ExoticSharkoLayEntity>of(ExoticSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoLayEntity>> ENGIE_SHARKO_LAY = register("engie_sharko_lay",
			EntityType.Builder.<EngieSharkoLayEntity>of(EngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareLayEntity>> ENGIE_SHARKO_RARE_LAY = register("engie_sharko_rare_lay",
			EntityType.Builder.<EngieSharkoRareLayEntity>of(EngieSharkoRareLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2LayEntity>> TIGER_SHARKO_LAY = register("tiger_sharko_lay",
			EntityType.Builder.<EngieSharkoRare2LayEntity>of(EngieSharkoRare2LayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobyEntity>> TOBY = register("toby",
			EntityType.Builder.<TobyEntity>of(TobyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobyLayEntity>> TOBY_LAY = register("toby_lay",
			EntityType.Builder.<TobyLayEntity>of(TobyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal2Entity>> ENRAGED_NORMAL_2 = register("enraged_normal_2",
			EntityType.Builder.<EnragedNormal2Entity>of(EnragedNormal2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal3Entity>> ENRAGED_NORMAL_3 = register("enraged_normal_3",
			EntityType.Builder.<EnragedNormal3Entity>of(EnragedNormal3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal4Entity>> ENRAGED_NORMAL_4 = register("enraged_normal_4",
			EntityType.Builder.<EnragedNormal4Entity>of(EnragedNormal4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal5Entity>> ENRAGED_NORMAL_5 = register("enraged_normal_5",
			EntityType.Builder.<EnragedNormal5Entity>of(EnragedNormal5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal6Entity>> ENRAGED_NORMAL_6 = register("enraged_normal_6",
			EntityType.Builder.<EnragedNormal6Entity>of(EnragedNormal6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal7Entity>> ENRAGED_NORMAL_7 = register("enraged_normal_7",
			EntityType.Builder.<EnragedNormal7Entity>of(EnragedNormal7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal8Entity>> ENRAGED_NORMAL_8 = register("enraged_normal_8",
			EntityType.Builder.<EnragedNormal8Entity>of(EnragedNormal8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal9Entity>> ENRAGED_NORMAL_9 = register("enraged_normal_9",
			EntityType.Builder.<EnragedNormal9Entity>of(EnragedNormal9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNTEntity>> ENRAGED_TNT = register("enraged_tnt",
			EntityType.Builder.<EnragedTNTEntity>of(EnragedTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT2Entity>> ENRAGED_TNT_2 = register("enraged_tnt_2",
			EntityType.Builder.<EnragedTNT2Entity>of(EnragedTNT2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT3Entity>> ENRAGED_TNT_3 = register("enraged_tnt_3",
			EntityType.Builder.<EnragedTNT3Entity>of(EnragedTNT3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT4Entity>> ENRAGED_TNT_4 = register("enraged_tnt_4",
			EntityType.Builder.<EnragedTNT4Entity>of(EnragedTNT4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT5Entity>> ENRAGED_TNT_5 = register("enraged_tnt_5",
			EntityType.Builder.<EnragedTNT5Entity>of(EnragedTNT5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT6Entity>> ENRAGED_TNT_6 = register("enraged_tnt_6",
			EntityType.Builder.<EnragedTNT6Entity>of(EnragedTNT6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT7Entity>> ENRAGED_TNT_7 = register("enraged_tnt_7",
			EntityType.Builder.<EnragedTNT7Entity>of(EnragedTNT7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT8Entity>> ENRAGED_TNT_8 = register("enraged_tnt_8",
			EntityType.Builder.<EnragedTNT8Entity>of(EnragedTNT8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT9Entity>> ENRAGED_TNT_9 = register("enraged_tnt_9",
			EntityType.Builder.<EnragedTNT9Entity>of(EnragedTNT9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed2Entity>> ENRAGED_SPEED_2 = register("enraged_speed_2",
			EntityType.Builder.<EnragedSpeed2Entity>of(EnragedSpeed2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed3Entity>> ENRAGED_SPEED_3 = register("enraged_speed_3",
			EntityType.Builder.<EnragedSpeed3Entity>of(EnragedSpeed3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed4Entity>> ENRAGED_SPEED_4 = register("enraged_speed_4",
			EntityType.Builder.<EnragedSpeed4Entity>of(EnragedSpeed4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed5Entity>> ENRAGED_SPEED_5 = register("enraged_speed_5",
			EntityType.Builder.<EnragedSpeed5Entity>of(EnragedSpeed5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed6Entity>> ENRAGED_SPEED_6 = register("enraged_speed_6",
			EntityType.Builder.<EnragedSpeed6Entity>of(EnragedSpeed6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed7Entity>> ENRAGED_SPEED_7 = register("enraged_speed_7",
			EntityType.Builder.<EnragedSpeed7Entity>of(EnragedSpeed7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed8Entity>> ENRAGED_SPEED_8 = register("enraged_speed_8",
			EntityType.Builder.<EnragedSpeed8Entity>of(EnragedSpeed8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed9Entity>> ENRAGED_SPEED_9 = register("enraged_speed_9",
			EntityType.Builder.<EnragedSpeed9Entity>of(EnragedSpeed9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalEntity>> MARSHAL = register("marshal",
			EntityType.Builder.<MarshalEntity>of(MarshalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalLayEntity>> MARSHAL_LAY = register("marshal_lay",
			EntityType.Builder.<MarshalLayEntity>of(MarshalLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerEntity>> TIGER = register("tiger",
			EntityType.Builder.<TigerEntity>of(TigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerLayEntity>> TIGER_LAY = register("tiger_lay",
			EntityType.Builder.<TigerLayEntity>of(TigerLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisEntity>> LOUIS = register("louis",
			EntityType.Builder.<LouisEntity>of(LouisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisLayEntity>> LOUIS_LAY = register("louis_lay",
			EntityType.Builder.<LouisLayEntity>of(LouisLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobyZoomiesEntity>> TOBY_ZOOMIES = register("toby_zoomies",
			EntityType.Builder.<TobyZoomiesEntity>of(TobyZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalZoomiesEntity>> MARSHAL_ZOOMIES = register("marshal_zoomies",
			EntityType.Builder.<MarshalZoomiesEntity>of(MarshalZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerZoomiesEntity>> TIGER_ZOOMIES = register("tiger_zoomies",
			EntityType.Builder.<TigerZoomiesEntity>of(TigerZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisZoomiesEntity>> LOUIS_ZOOMIES = register("louis_zoomies",
			EntityType.Builder.<LouisZoomiesEntity>of(LouisZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoTamedZoomiesEntity>> SHARKO_TAMED_ZOOMIES = register("sharko_tamed_zoomies",
			EntityType.Builder.<SharkoTamedZoomiesEntity>of(SharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoTamedZoomiesEntity>> ALBINO_SHARKO_TAMED_ZOOMIES = register("albino_sharko_tamed_zoomies",
			EntityType.Builder.<AlbinoSharkoTamedZoomiesEntity>of(AlbinoSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoTamedZoomiesEntity>> RARE_SHARKO_TAMED_ZOOMIES = register("rare_sharko_tamed_zoomies",
			EntityType.Builder.<RareSharkoTamedZoomiesEntity>of(RareSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoTamedZoomiesEntity>> LEGENDARY_SHARKO_TAMED_ZOOMIES = register("legendary_sharko_tamed_zoomies",
			EntityType.Builder.<LegendarySharkoTamedZoomiesEntity>of(LegendarySharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoTamedZoomiesEntity>> MYTHIC_SHARKO_TAMED_ZOOMIES = register("mythic_sharko_tamed_zoomies",
			EntityType.Builder.<MythicSharkoTamedZoomiesEntity>of(MythicSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoTamedZoomiesEntity>> EXOTIC_SHARKO_TAMED_ZOOMIES = register("exotic_sharko_tamed_zoomies",
			EntityType.Builder.<ExoticSharkoTamedZoomiesEntity>of(ExoticSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoTamedZoomiesEntity>> ENGIE_SHARKO_TAMED_ZOOMIES = register("engie_sharko_tamed_zoomies",
			EntityType.Builder.<EngieSharkoTamedZoomiesEntity>of(EngieSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareTamedZoomiesEntity>> ENGIE_SHARKO_RARE_TAMED_ZOOMIES = register("engie_sharko_rare_tamed_zoomies",
			EntityType.Builder.<EngieSharkoRareTamedZoomiesEntity>of(EngieSharkoRareTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2TamedZoomiesEntity>> TIGER_SHARKO_TAMED_ZOOMIES = register("tiger_sharko_tamed_zoomies",
			EntityType.Builder.<EngieSharkoRare2TamedZoomiesEntity>of(EngieSharkoRare2TamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2ZoomiesTiredEntity>> TIGER_SHARKO_ZOOMIES_TIRED = register("tiger_sharko_zoomies_tired",
			EntityType.Builder.<EngieSharkoRare2ZoomiesTiredEntity>of(EngieSharkoRare2ZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobyZoomiesTiredEntity>> TOBY_ZOOMIES_TIRED = register("toby_zoomies_tired",
			EntityType.Builder.<TobyZoomiesTiredEntity>of(TobyZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalZoomiesTiredEntity>> MARSHAL_ZOOMIES_TIRED = register("marshal_zoomies_tired",
			EntityType.Builder.<MarshalZoomiesTiredEntity>of(MarshalZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerZoomiesTiredEntity>> TIGER_ZOOMIES_TIRED = register("tiger_zoomies_tired",
			EntityType.Builder.<TigerZoomiesTiredEntity>of(TigerZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisZoomiesTiredEntity>> LOUIS_ZOOMIES_TIRED = register("louis_zoomies_tired",
			EntityType.Builder.<LouisZoomiesTiredEntity>of(LouisZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoTamedZoomiesTiredEntity>> SHARKO_TAMED_ZOOMIES_TIRED = register("sharko_tamed_zoomies_tired",
			EntityType.Builder.<SharkoTamedZoomiesTiredEntity>of(SharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoTamedZoomiesTiredEntity>> ALBINO_SHARKO_TAMED_ZOOMIES_TIRED = register("albino_sharko_tamed_zoomies_tired",
			EntityType.Builder.<AlbinoSharkoTamedZoomiesTiredEntity>of(AlbinoSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoTamedZoomiesTiredEntity>> RARE_SHARKO_TAMED_ZOOMIES_TIRED = register("rare_sharko_tamed_zoomies_tired",
			EntityType.Builder.<RareSharkoTamedZoomiesTiredEntity>of(RareSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoTamedZoomiesTiredEntity>> LEGENDARY_SHARKO_TAMED_ZOOMIES_TIRED = register("legendary_sharko_tamed_zoomies_tired",
			EntityType.Builder.<LegendarySharkoTamedZoomiesTiredEntity>of(LegendarySharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoTamedZoomiesTiredEntity>> MYTHIC_SHARKO_TAMED_ZOOMIES_TIRED = register("mythic_sharko_tamed_zoomies_tired",
			EntityType.Builder.<MythicSharkoTamedZoomiesTiredEntity>of(MythicSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoTamedZoomiesTiredEntity>> EXOTIC_SHARKO_TAMED_ZOOMIES_TIRED = register("exotic_sharko_tamed_zoomies_tired",
			EntityType.Builder.<ExoticSharkoTamedZoomiesTiredEntity>of(ExoticSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoTamedZoomiesTiredEntity>> ENGIE_SHARKO_TAMED_ZOOMIES_TIRED = register("engie_sharko_tamed_zoomies_tired",
			EntityType.Builder.<EngieSharkoTamedZoomiesTiredEntity>of(EngieSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareTamedZoomiesTiredEntity>> ENGIE_SHARKO_RARE_TAMED_ZOOMIES_TIRED = register("engie_sharko_rare_tamed_zoomies_tired",
			EntityType.Builder.<EngieSharkoRareTamedZoomiesTiredEntity>of(EngieSharkoRareTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2TamedZoomiesTiredEntity>> TIGER_SHARKO_TAMED_ZOOMIES_TIRED = register("tiger_sharko_tamed_zoomies_tired",
			EntityType.Builder.<EngieSharkoRare2TamedZoomiesTiredEntity>of(EngieSharkoRare2TamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobySleepEntity>> TOBY_SLEEP = register("toby_sleep",
			EntityType.Builder.<TobySleepEntity>of(TobySleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalSleepEntity>> MARSHAL_SLEEP = register("marshal_sleep",
			EntityType.Builder.<MarshalSleepEntity>of(MarshalSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerSleepEntity>> TIGER_SLEEP = register("tiger_sleep",
			EntityType.Builder.<TigerSleepEntity>of(TigerSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisSleepEntity>> LOUIS_SLEEP = register("louis_sleep",
			EntityType.Builder.<LouisSleepEntity>of(LouisSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoSleepEntity>> SHARKO_SLEEP = register("sharko_sleep",
			EntityType.Builder.<SharkoSleepEntity>of(SharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoSleepEntity>> ALBINO_SHARKO_SLEEP = register("albino_sharko_sleep",
			EntityType.Builder.<AlbinoSharkoSleepEntity>of(AlbinoSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoSleepEntity>> RARE_SHARKO_SLEEP = register("rare_sharko_sleep",
			EntityType.Builder.<RareSharkoSleepEntity>of(RareSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoSleepEntity>> LEGENDARY_SHARKO_SLEEP = register("legendary_sharko_sleep",
			EntityType.Builder.<LegendarySharkoSleepEntity>of(LegendarySharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoSleepEntity>> MYTHIC_SHARKO_SLEEP = register("mythic_sharko_sleep",
			EntityType.Builder.<MythicSharkoSleepEntity>of(MythicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoSleepEntity>> EXOTIC_SHARKO_SLEEP = register("exotic_sharko_sleep",
			EntityType.Builder.<ExoticSharkoSleepEntity>of(ExoticSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoSleepEntity>> ENGIE_SHARKO_SLEEP = register("engie_sharko_sleep",
			EntityType.Builder.<EngieSharkoSleepEntity>of(EngieSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareSleepEntity>> ENGIE_SHARKO_RARE_SLEEP = register("engie_sharko_rare_sleep",
			EntityType.Builder.<EngieSharkoRareSleepEntity>of(EngieSharkoRareSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2SleepEntity>> TIGER_SHARKO_SLEEP = register("tiger_sharko_sleep",
			EntityType.Builder.<EngieSharkoRare2SleepEntity>of(EngieSharkoRare2SleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BiblicallyAccurateEngieEntity>> BIBLICALLY_ACCURATE_ENGIE = register("biblically_accurate_engie",
			EntityType.Builder.<BiblicallyAccurateEngieEntity>of(BiblicallyAccurateEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddyEntity>> BUDDY = register("buddy",
			EntityType.Builder.<BuddyEntity>of(BuddyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddyLayEntity>> BUDDY_LAY = register("buddy_lay",
			EntityType.Builder.<BuddyLayEntity>of(BuddyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddyZoomiesEntity>> BUDDY_ZOOMIES = register("buddy_zoomies",
			EntityType.Builder.<BuddyZoomiesEntity>of(BuddyZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddyZoomiesTiredEntity>> BUDDY_ZOOMIES_TIRED = register("buddy_zoomies_tired",
			EntityType.Builder.<BuddyZoomiesTiredEntity>of(BuddyZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddySleepEntity>> BUDDY_SLEEP = register("buddy_sleep",
			EntityType.Builder.<BuddySleepEntity>of(BuddySleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloEntity>> APOLLO = register("apollo",
			EntityType.Builder.<ApolloEntity>of(ApolloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloLayEntity>> APOLLO_LAY = register("apollo_lay",
			EntityType.Builder.<ApolloLayEntity>of(ApolloLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloZoomiesEntity>> APOLLO_ZOOMIES = register("apollo_zoomies",
			EntityType.Builder.<ApolloZoomiesEntity>of(ApolloZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloZoomiesTiredEntity>> APOLLO_ZOOMIES_TIRED = register("apollo_zoomies_tired",
			EntityType.Builder.<ApolloZoomiesTiredEntity>of(ApolloZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloSleepEntity>> APOLLO_SLEEP = register("apollo_sleep",
			EntityType.Builder.<ApolloSleepEntity>of(ApolloSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasEntity>> ATLAS = register("atlas",
			EntityType.Builder.<AtlasEntity>of(AtlasEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasLayEntity>> ATLAS_LAY = register("atlas_lay",
			EntityType.Builder.<AtlasLayEntity>of(AtlasLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasZoomiesEntity>> ATLAS_ZOOMIES = register("atlas_zoomies",
			EntityType.Builder.<AtlasZoomiesEntity>of(AtlasZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasZoomiesTiredEntity>> ATLAS_ZOOMIES_TIRED = register("atlas_zoomies_tired",
			EntityType.Builder.<AtlasZoomiesTiredEntity>of(AtlasZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasSleepEntity>> ATLAS_SLEEP = register("atlas_sleep",
			EntityType.Builder.<AtlasSleepEntity>of(AtlasSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBEEntity>> CBE = register("cbe", EntityType.Builder.<CBEEntity>of(CBEEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBELayEntity>> CBE_LAY = register("cbe_lay",
			EntityType.Builder.<CBELayEntity>of(CBELayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBEZoomiesEntity>> CBE_ZOOMIES = register("cbe_zoomies",
			EntityType.Builder.<CBEZoomiesEntity>of(CBEZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBESleepEntity>> CBE_SLEEP = register("cbe_sleep",
			EntityType.Builder.<CBESleepEntity>of(CBESleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBEZoomiesTiredEntity>> CBE_ZOOMIES_TIRED = register("cbe_zoomies_tired",
			EntityType.Builder.<CBEZoomiesTiredEntity>of(CBEZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBEEntity>> PBE = register("pbe", EntityType.Builder.<PBEEntity>of(PBEEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBELayEntity>> PBE_LAY = register("pbe_lay",
			EntityType.Builder.<PBELayEntity>of(PBELayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBEZoomiesEntity>> PBE_ZOOMIES = register("pbe_zoomies",
			EntityType.Builder.<PBEZoomiesEntity>of(PBEZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBESleepEntity>> PBE_SLEEP = register("pbe_sleep",
			EntityType.Builder.<PBESleepEntity>of(PBESleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBEZoomiesTiredEntity>> PBE_ZOOMIES_TIRED = register("pbe_zoomies_tired",
			EntityType.Builder.<PBEZoomiesTiredEntity>of(PBEZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netEntity>> BOTHAN_2NET = register("bothan_2net",
			EntityType.Builder.<Bothan2netEntity>of(Bothan2netEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netLayEntity>> BOTHAN_2NET_LAY = register("bothan_2net_lay",
			EntityType.Builder.<Bothan2netLayEntity>of(Bothan2netLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netZoomiesEntity>> BOTHAN_2NET_ZOOMIES = register("bothan_2net_zoomies",
			EntityType.Builder.<Bothan2netZoomiesEntity>of(Bothan2netZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netZoomiesTiredEntity>> BOTHAN_2NET_ZOOMIES_TIRED = register("bothan_2net_zoomies_tired",
			EntityType.Builder.<Bothan2netZoomiesTiredEntity>of(Bothan2netZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netSleepEntity>> BOTHAN_2NET_SLEEP = register("bothan_2net_sleep",
			EntityType.Builder.<Bothan2netSleepEntity>of(Bothan2netSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonstrosityEngieEntity>> MONSTROSITY_ENGIE = register("monstrosity_engie",
			EntityType.Builder.<MonstrosityEngieEntity>of(MonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoEntity>> EPIC_SHARKO = register("epic_sharko",
			EntityType.Builder.<EpicSharkoEntity>of(EpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoTamedEntity>> EPIC_SHARKO_TAMED = register("epic_sharko_tamed",
			EntityType.Builder.<EpicSharkoTamedEntity>of(EpicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoLayEntity>> EPIC_SHARKO_LAY = register("epic_sharko_lay",
			EntityType.Builder.<EpicSharkoLayEntity>of(EpicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoTamedZoomiesEntity>> EPIC_SHARKO_TAMED_ZOOMIES = register("epic_sharko_tamed_zoomies",
			EntityType.Builder.<EpicSharkoTamedZoomiesEntity>of(EpicSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoTamedZoomiesTiredEntity>> EPIC_SHARKO_TAMED_ZOOMIES_TIRED = register("epic_sharko_tamed_zoomies_tired",
			EntityType.Builder.<EpicSharkoTamedZoomiesTiredEntity>of(EpicSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoSleepEntity>> EPIC_SHARKO_SLEEP = register("epic_sharko_sleep",
			EntityType.Builder.<EpicSharkoSleepEntity>of(EpicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieSharkoEntity>> ANGRY_ENGIE_SHARKO = register("angry_engie_sharko",
			EntityType.Builder.<AngryEngieSharkoEntity>of(AngryEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieSharkoEntity>> ENRAGED_ENGIE_SHARKO = register("enraged_engie_sharko",
			EntityType.Builder.<EnragedEngieSharkoEntity>of(EnragedEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<OutragedEngieSharkoEntity>> OUTRAGED_ENGIE_SHARKO = register("outraged_engie_sharko",
			EntityType.Builder.<OutragedEngieSharkoEntity>of(OutragedEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonstrosityEngieSharkoEntity>> MONSTROSITY_ENGIE_SHARKO = register("monstrosity_engie_sharko",
			EntityType.Builder.<MonstrosityEngieSharkoEntity>of(MonstrosityEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoAprilFoolsEntity>> SHARKO_APRIL_FOOLS = register("sharko_april_fools",
			EntityType.Builder.<SharkoAprilFoolsEntity>of(SharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoAprilFoolsEntity>> ALBINO_SHARKO_APRIL_FOOLS = register("albino_sharko_april_fools",
			EntityType.Builder.<AlbinoSharkoAprilFoolsEntity>of(AlbinoSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoAprilFoolsEntity>> RARE_SHARKO_APRIL_FOOLS = register("rare_sharko_april_fools",
			EntityType.Builder.<RareSharkoAprilFoolsEntity>of(RareSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoAprilFoolsEntity>> LEGENDARY_SHARKO_APRIL_FOOLS = register("legendary_sharko_april_fools",
			EntityType.Builder.<LegendarySharkoAprilFoolsEntity>of(LegendarySharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoAprilFoolsEntity>> MYTHIC_SHARKO_APRIL_FOOLS = register("mythic_sharko_april_fools",
			EntityType.Builder.<MythicSharkoAprilFoolsEntity>of(MythicSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoAprilFoolsEntity>> EXOTIC_SHARKO_APRIL_FOOLS = register("exotic_sharko_april_fools",
			EntityType.Builder.<ExoticSharkoAprilFoolsEntity>of(ExoticSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoAprilFoolsEntity>> ENGIE_SHARKO_APRIL_FOOLS = register("engie_sharko_april_fools",
			EntityType.Builder.<EngieSharkoAprilFoolsEntity>of(EngieSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareAprilFoolsEntity>> ENGIE_SHARKO_RARE_APRIL_FOOLS = register("engie_sharko_rare_april_fools",
			EntityType.Builder.<EngieSharkoRareAprilFoolsEntity>of(EngieSharkoRareAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2AprilFoolsEntity>> ENGIE_SHARKO_RARE_2_APRIL_FOOLS = register("engie_sharko_rare_2_april_fools",
			EntityType.Builder.<EngieSharkoRare2AprilFoolsEntity>of(EngieSharkoRare2AprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoTamedAprilFoolsEntity>> SHARKO_TAMED_APRIL_FOOLS = register("sharko_tamed_april_fools",
			EntityType.Builder.<SharkoTamedAprilFoolsEntity>of(SharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoTamedAprilFoolsEntity>> ALBINO_SHARKO_TAMED_APRIL_FOOLS = register("albino_sharko_tamed_april_fools",
			EntityType.Builder.<AlbinoSharkoTamedAprilFoolsEntity>of(AlbinoSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoTamedAprilFoolsEntity>> RARE_SHARKO_TAMED_APRIL_FOOLS = register("rare_sharko_tamed_april_fools",
			EntityType.Builder.<RareSharkoTamedAprilFoolsEntity>of(RareSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoTamedAprilFoolsEntity>> LEGENDARY_SHARKO_TAMED_APRIL_FOOLS = register("legendary_sharko_tamed_april_fools",
			EntityType.Builder.<LegendarySharkoTamedAprilFoolsEntity>of(LegendarySharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoTamedAprilFoolsEntity>> MYTHIC_SHARKO_TAMED_APRIL_FOOLS = register("mythic_sharko_tamed_april_fools",
			EntityType.Builder.<MythicSharkoTamedAprilFoolsEntity>of(MythicSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoTamedAprilFoolsEntity>> EXOTIC_SHARKO_TAMED_APRIL_FOOLS = register("exotic_sharko_tamed_april_fools",
			EntityType.Builder.<ExoticSharkoTamedAprilFoolsEntity>of(ExoticSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoTamedAprilFoolsEntity>> ENGIE_SHARKO_TAMED_APRIL_FOOLS = register("engie_sharko_tamed_april_fools",
			EntityType.Builder.<EngieSharkoTamedAprilFoolsEntity>of(EngieSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareTamedAprilFoolsEntity>> ENGIE_SHARKO_RARE_TAMED_APRIL_FOOLS = register("engie_sharko_rare_tamed_april_fools",
			EntityType.Builder.<EngieSharkoRareTamedAprilFoolsEntity>of(EngieSharkoRareTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2TamedAprilFoolsEntity>> ENGIE_SHARKO_RARE_2_TAMED_APRIL_FOOLS = register("engie_sharko_rare_2_tamed_april_fools",
			EntityType.Builder.<EngieSharkoRare2TamedAprilFoolsEntity>of(EngieSharkoRare2TamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoLayAprilFoolsEntity>> SHARKO_LAY_APRIL_FOOLS = register("sharko_lay_april_fools",
			EntityType.Builder.<SharkoLayAprilFoolsEntity>of(SharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoLayAprilFoolsEntity>> ALBINO_SHARKO_LAY_APRIL_FOOLS = register("albino_sharko_lay_april_fools",
			EntityType.Builder.<AlbinoSharkoLayAprilFoolsEntity>of(AlbinoSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoLayAprilFoolsEntity>> RARE_SHARKO_LAY_APRIL_FOOLS = register("rare_sharko_lay_april_fools",
			EntityType.Builder.<RareSharkoLayAprilFoolsEntity>of(RareSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoLayAprilFoolsEntity>> LEGENDARY_SHARKO_LAY_APRIL_FOOLS = register("legendary_sharko_lay_april_fools",
			EntityType.Builder.<LegendarySharkoLayAprilFoolsEntity>of(LegendarySharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoLayAprilFoolsEntity>> MYTHIC_SHARKO_LAY_APRIL_FOOLS = register("mythic_sharko_lay_april_fools",
			EntityType.Builder.<MythicSharkoLayAprilFoolsEntity>of(MythicSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoLayAprilFoolsEntity>> EXOTIC_SHARKO_LAY_APRIL_FOOLS = register("exotic_sharko_lay_april_fools",
			EntityType.Builder.<ExoticSharkoLayAprilFoolsEntity>of(ExoticSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoLayAprilFoolsEntity>> ENGIE_SHARKO_LAY_APRIL_FOOLS = register("engie_sharko_lay_april_fools",
			EntityType.Builder.<EngieSharkoLayAprilFoolsEntity>of(EngieSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareLayAprilFoolsEntity>> ENGIE_SHARKO_RARE_LAY_APRIL_FOOLS = register("engie_sharko_rare_lay_april_fools",
			EntityType.Builder.<EngieSharkoRareLayAprilFoolsEntity>of(EngieSharkoRareLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2LayAprilFoolsEntity>> ENGIE_SHARKO_RARE_2_LAY_APRIL_FOOLS = register("engie_sharko_rare_2_lay_april_fools",
			EntityType.Builder.<EngieSharkoRare2LayAprilFoolsEntity>of(EngieSharkoRare2LayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoSleepAprilFoolsEntity>> SHARKO_SLEEP_APRIL_FOOLS = register("sharko_sleep_april_fools",
			EntityType.Builder.<SharkoSleepAprilFoolsEntity>of(SharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoSleepAprilFoolsEntity>> ALBINO_SHARKO_SLEEP_APRIL_FOOLS = register("albino_sharko_sleep_april_fools",
			EntityType.Builder.<AlbinoSharkoSleepAprilFoolsEntity>of(AlbinoSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoSleepAprilFoolsEntity>> RARE_SHARKO_SLEEP_APRIL_FOOLS = register("rare_sharko_sleep_april_fools",
			EntityType.Builder.<RareSharkoSleepAprilFoolsEntity>of(RareSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoSleepAprilFoolsEntity>> LEGENDARY_SHARKO_SLEEP_APRIL_FOOLS = register("legendary_sharko_sleep_april_fools",
			EntityType.Builder.<LegendarySharkoSleepAprilFoolsEntity>of(LegendarySharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoSleepAprilFoolsEntity>> MYTHIC_SHARKO_SLEEP_APRIL_FOOLS = register("mythic_sharko_sleep_april_fools",
			EntityType.Builder.<MythicSharkoSleepAprilFoolsEntity>of(MythicSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoSleepAprilFoolsEntity>> EXOTIC_SHARKO_SLEEP_APRIL_FOOLS = register("exotic_sharko_sleep_april_fools",
			EntityType.Builder.<ExoticSharkoSleepAprilFoolsEntity>of(ExoticSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoSleepAprilFoolsEntity>> ENGIE_SHARKO_SLEEP_APRIL_FOOLS = register("engie_sharko_sleep_april_fools",
			EntityType.Builder.<EngieSharkoSleepAprilFoolsEntity>of(EngieSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareSleepAprilFoolsEntity>> ENGIE_SHARKO_RARE_SLEEP_APRIL_FOOLS = register("engie_sharko_rare_sleep_april_fools",
			EntityType.Builder.<EngieSharkoRareSleepAprilFoolsEntity>of(EngieSharkoRareSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2SleepAprilFoolsEntity>> ENGIE_SHARKO_RARE_2_SLEEP_APRIL_FOOLS = register("engie_sharko_rare_2_sleep_april_fools",
			EntityType.Builder.<EngieSharkoRare2SleepAprilFoolsEntity>of(EngieSharkoRare2SleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoAprilFoolsEntity>> EPIC_SHARKO_APRIL_FOOLS = register("epic_sharko_april_fools",
			EntityType.Builder.<EpicSharkoAprilFoolsEntity>of(EpicSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoTamedAprilFoolsEntity>> EPIC_SHARKO_TAMED_APRIL_FOOLS = register("epic_sharko_tamed_april_fools",
			EntityType.Builder.<EpicSharkoTamedAprilFoolsEntity>of(EpicSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoLayAprilFoolsEntity>> EPIC_SHARKO_LAY_APRIL_FOOLS = register("epic_sharko_lay_april_fools",
			EntityType.Builder.<EpicSharkoLayAprilFoolsEntity>of(EpicSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoSleepAprilFoolsEntity>> EPIC_SHARKO_SLEEP_APRIL_FOOLS = register("epic_sharko_sleep_april_fools",
			EntityType.Builder.<EpicSharkoSleepAprilFoolsEntity>of(EpicSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeWhoGamesEntity>> HE_WHO_GAMES = register("he_who_games",
			EntityType.Builder.<HeWhoGamesEntity>of(HeWhoGamesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeWhoGamesHostileEntity>> HE_WHO_GAMES_HOSTILE = register("he_who_games_hostile",
			EntityType.Builder.<HeWhoGamesHostileEntity>of(HeWhoGamesHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityEntity>> INSANITY = register("insanity",
			EntityType.Builder.<InsanityEntity>of(InsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigSharkoEntity>> BIG_SHARKO = register("big_sharko",
			EntityType.Builder.<BigSharkoEntity>of(BigSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigAlbinoSharkoEntity>> BIG_ALBINO_SHARKO = register("big_albino_sharko",
			EntityType.Builder.<BigAlbinoSharkoEntity>of(BigAlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigRareSharkoEntity>> BIG_RARE_SHARKO = register("big_rare_sharko",
			EntityType.Builder.<BigRareSharkoEntity>of(BigRareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEpicSharkoEntity>> BIG_EPIC_SHARKO = register("big_epic_sharko",
			EntityType.Builder.<BigEpicSharkoEntity>of(BigEpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigLegendarySharkoEntity>> BIG_LEGENDARY_SHARKO = register("big_legendary_sharko",
			EntityType.Builder.<BigLegendarySharkoEntity>of(BigLegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigMythicSharkoEntity>> BIG_MYTHIC_SHARKO = register("big_mythic_sharko",
			EntityType.Builder.<BigMythicSharkoEntity>of(BigMythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigExoticSharkoEntity>> BIG_EXOTIC_SHARKO = register("big_exotic_sharko",
			EntityType.Builder.<BigExoticSharkoEntity>of(BigExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoEntity>> BIG_ENGIE_SHARKO = register("big_engie_sharko",
			EntityType.Builder.<BigEngieSharkoEntity>of(BigEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRareEntity>> BIG_ENGIE_SHARKO_RARE = register("big_engie_sharko_rare",
			EntityType.Builder.<BigEngieSharkoRareEntity>of(BigEngieSharkoRareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRare2Entity>> BIG_TIGER_SHARKO = register("big_tiger_sharko",
			EntityType.Builder.<BigEngieSharkoRare2Entity>of(BigEngieSharkoRare2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigSharkoTamedEntity>> BIG_SHARKO_TAMED = register("big_sharko_tamed",
			EntityType.Builder.<BigSharkoTamedEntity>of(BigSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigAlbinoSharkoTamedEntity>> BIG_ALBINO_SHARKO_TAMED = register("big_albino_sharko_tamed",
			EntityType.Builder.<BigAlbinoSharkoTamedEntity>of(BigAlbinoSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigRareSharkoTamedEntity>> BIG_RARE_SHARKO_TAMED = register("big_rare_sharko_tamed",
			EntityType.Builder.<BigRareSharkoTamedEntity>of(BigRareSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigLegendarySharkoTamedEntity>> BIG_LEGENDARY_SHARKO_TAMED = register("big_legendary_sharko_tamed",
			EntityType.Builder.<BigLegendarySharkoTamedEntity>of(BigLegendarySharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigMythicSharkoTamedEntity>> BIG_MYTHIC_SHARKO_TAMED = register("big_mythic_sharko_tamed",
			EntityType.Builder.<BigMythicSharkoTamedEntity>of(BigMythicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigExoticSharkoTamedEntity>> BIG_EXOTIC_SHARKO_TAMED = register("big_exotic_sharko_tamed",
			EntityType.Builder.<BigExoticSharkoTamedEntity>of(BigExoticSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoTamedEntity>> BIG_ENGIE_SHARKO_TAMED = register("big_engie_sharko_tamed",
			EntityType.Builder.<BigEngieSharkoTamedEntity>of(BigEngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRareTamedEntity>> BIG_ENGIE_SHARKO_RARE_TAMED = register("big_engie_sharko_rare_tamed",
			EntityType.Builder.<BigEngieSharkoRareTamedEntity>of(BigEngieSharkoRareTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRare2TamedEntity>> BIG_TIGER_SHARKO_TAMED = register("big_tiger_sharko_tamed",
			EntityType.Builder.<BigEngieSharkoRare2TamedEntity>of(BigEngieSharkoRare2TamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigSharkoLayEntity>> BIG_SHARKO_LAY = register("big_sharko_lay",
			EntityType.Builder.<BigSharkoLayEntity>of(BigSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigAlbinoSharkoLayEntity>> BIG_ALBINO_SHARKO_LAY = register("big_albino_sharko_lay",
			EntityType.Builder.<BigAlbinoSharkoLayEntity>of(BigAlbinoSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigRareSharkoLayEntity>> BIG_RARE_SHARKO_LAY = register("big_rare_sharko_lay",
			EntityType.Builder.<BigRareSharkoLayEntity>of(BigRareSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigLegendarySharkoLayEntity>> BIG_LEGENDARY_SHARKO_LAY = register("big_legendary_sharko_lay",
			EntityType.Builder.<BigLegendarySharkoLayEntity>of(BigLegendarySharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigMythicSharkoLayEntity>> BIG_MYTHIC_SHARKO_LAY = register("big_mythic_sharko_lay",
			EntityType.Builder.<BigMythicSharkoLayEntity>of(BigMythicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigExoticSharkoLayEntity>> BIG_EXOTIC_SHARKO_LAY = register("big_exotic_sharko_lay",
			EntityType.Builder.<BigExoticSharkoLayEntity>of(BigExoticSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoLayEntity>> BIG_ENGIE_SHARKO_LAY = register("big_engie_sharko_lay",
			EntityType.Builder.<BigEngieSharkoLayEntity>of(BigEngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRareLayEntity>> BIG_ENGIE_SHARKO_RARE_LAY = register("big_engie_sharko_rare_lay",
			EntityType.Builder.<BigEngieSharkoRareLayEntity>of(BigEngieSharkoRareLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRare2LayEntity>> BIG_TIGER_SHARKO_LAY = register("big_tiger_sharko_lay",
			EntityType.Builder.<BigEngieSharkoRare2LayEntity>of(BigEngieSharkoRare2LayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigSharkoSleepEntity>> BIG_SHARKO_SLEEP = register("big_sharko_sleep",
			EntityType.Builder.<BigSharkoSleepEntity>of(BigSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigAlbinoSharkoSleepEntity>> BIG_ALBINO_SHARKO_SLEEP = register("big_albino_sharko_sleep",
			EntityType.Builder.<BigAlbinoSharkoSleepEntity>of(BigAlbinoSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigRareSharkoSleepEntity>> BIG_RARE_SHARKO_SLEEP = register("big_rare_sharko_sleep",
			EntityType.Builder.<BigRareSharkoSleepEntity>of(BigRareSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigLegendarySharkoSleepEntity>> BIG_LEGENDARY_SHARKO_SLEEP = register("big_legendary_sharko_sleep",
			EntityType.Builder.<BigLegendarySharkoSleepEntity>of(BigLegendarySharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigMythicSharkoSleepEntity>> BIG_MYTHIC_SHARKO_SLEEP = register("big_mythic_sharko_sleep",
			EntityType.Builder.<BigMythicSharkoSleepEntity>of(BigMythicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigExoticSharkoSleepEntity>> BIG_EXOTIC_SHARKO_SLEEP = register("big_exotic_sharko_sleep",
			EntityType.Builder.<BigExoticSharkoSleepEntity>of(BigExoticSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoSleepEntity>> BIG_ENGIE_SHARKO_SLEEP = register("big_engie_sharko_sleep",
			EntityType.Builder.<BigEngieSharkoSleepEntity>of(BigEngieSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRareSleepEntity>> BIG_ENGIE_SHARKO_RARE_SLEEP = register("big_engie_sharko_rare_sleep",
			EntityType.Builder.<BigEngieSharkoRareSleepEntity>of(BigEngieSharkoRareSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEngieSharkoRare2SleepEntity>> BIG_TIGER_SHARKO_SLEEP = register("big_tiger_sharko_sleep",
			EntityType.Builder.<BigEngieSharkoRare2SleepEntity>of(BigEngieSharkoRare2SleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEpicSharkoTamedEntity>> BIG_EPIC_SHARKO_TAMED = register("big_epic_sharko_tamed",
			EntityType.Builder.<BigEpicSharkoTamedEntity>of(BigEpicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEpicSharkoLayEntity>> BIG_EPIC_SHARKO_LAY = register("big_epic_sharko_lay",
			EntityType.Builder.<BigEpicSharkoLayEntity>of(BigEpicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEpicSharkoSleepEntity>> BIG_EPIC_SHARKO_SLEEP = register("big_epic_sharko_sleep",
			EntityType.Builder.<BigEpicSharkoSleepEntity>of(BigEpicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CosmoEntity>> COSMO = register("cosmo",
			EntityType.Builder.<CosmoEntity>of(CosmoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CosmoSleepEntity>> COSMO_SLEEP = register("cosmo_sleep",
			EntityType.Builder.<CosmoSleepEntity>of(CosmoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CosmoLayEntity>> COSMO_LAY = register("cosmo_lay",
			EntityType.Builder.<CosmoLayEntity>of(CosmoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieStyle2Entity>> ANGRY_ENGIE_STYLE_2 = register("angry_engie_style_2",
			EntityType.Builder.<AngryEngieStyle2Entity>of(AngryEngieStyle2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieStyle2Entity>> ENRAGED_ENGIE_STYLE_2 = register("enraged_engie_style_2",
			EntityType.Builder.<EnragedEngieStyle2Entity>of(EnragedEngieStyle2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieStyle3Entity>> ENRAGED_ENGIE_STYLE_3 = register("enraged_engie_style_3",
			EntityType.Builder.<EnragedEngieStyle3Entity>of(EnragedEngieStyle3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<OutragedEngieStyle2Entity>> OUTRAGED_ENGIE_STYLE_2 = register("outraged_engie_style_2",
			EntityType.Builder.<OutragedEngieStyle2Entity>of(OutragedEngieStyle2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<YellowLightningEntity>> YELLOW_LIGHTNING = register("yellow_lightning",
			EntityType.Builder.<YellowLightningEntity>of(YellowLightningEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueBurstEntity>> BLUE_BURST = register("blue_burst",
			EntityType.Builder.<BlueBurstEntity>of(BlueBurstEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<NormalEntity>> NORMAL = register("normal",
			EntityType.Builder.<NormalEntity>of(NormalEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MOABEntity>> MOAB = register("moab",
			EntityType.Builder.<MOABEntity>of(MOABEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PureInsanityEntity>> PURE_INSANITY = register("pure_insanity",
			EntityType.Builder.<PureInsanityEntity>of(PureInsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<DoomsDayEntity>> DOOMS_DAY = register("dooms_day",
			EntityType.Builder.<DoomsDayEntity>of(DoomsDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<SuperDoomsDayEntity>> SUPER_DOOMS_DAY = register("super_dooms_day",
			EntityType.Builder.<SuperDoomsDayEntity>of(SuperDoomsDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<DoomsDayHostileEntity>> DOOMS_DAY_HOSTILE = register("dooms_day_hostile",
			EntityType.Builder.<DoomsDayHostileEntity>of(DoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<SuperDoomsDayHostileEntity>> SUPER_DOOMS_DAY_HOSTILE = register("super_dooms_day_hostile",
			EntityType.Builder.<SuperDoomsDayHostileEntity>of(SuperDoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheEndEntity>> THE_END = register("the_end",
			EntityType.Builder.<TheEndEntity>of(TheEndEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheEndHostileEntity>> THE_END_HOSTILE = register("the_end_hostile",
			EntityType.Builder.<TheEndHostileEntity>of(TheEndHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieGamesDetectiveEntity>> ENGIE_GAMES_DETECTIVE = register("engie_games_detective",
			EntityType.Builder.<EngieGamesDetectiveEntity>of(EngieGamesDetectiveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieGamesEntity>> ENGIE_GAMES = register("engie_games",
			EntityType.Builder.<EngieGamesEntity>of(EngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<DDayLightningSpawnerEntity>> D_DAY_LIGHTNING_SPAWNER = register("d_day_lightning_spawner",
			EntityType.Builder.<DDayLightningSpawnerEntity>of(DDayLightningSpawnerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DDAYRiftEntity>> DDAY_RIFT = register("dday_rift",
			EntityType.Builder.<DDAYRiftEntity>of(DDAYRiftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(4f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieOldRiftedEntity>> ENRAGED_ENGIE_OLD_RIFTED = register("enraged_engie_old_rifted",
			EntityType.Builder.<EnragedEngieOldRiftedEntity>of(EnragedEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<MadEngieOldRiftedEntity>> MAD_ENGIE_OLD_RIFTED = register("mad_engie_old_rifted",
			EntityType.Builder.<MadEngieOldRiftedEntity>of(MadEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieOldRiftedEntity>> ANGRY_ENGIE_OLD_RIFTED = register("angry_engie_old_rifted",
			EntityType.Builder.<AngryEngieOldRiftedEntity>of(AngryEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryCreatorRiftedEntity>> ANGRY_CREATOR_RIFTED = register("angry_creator_rifted",
			EntityType.Builder.<AngryCreatorRiftedEntity>of(AngryCreatorRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<BloodyEngieRiftedEntity>> BLOODY_ENGIE_RIFTED = register("bloody_engie_rifted",
			EntityType.Builder.<BloodyEngieRiftedEntity>of(BloodyEngieRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<MindscapeEngieEntity>> MINDSCAPE_ENGIE = register("mindscape_engie",
			EntityType.Builder.<MindscapeEngieEntity>of(MindscapeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganEntity>> FINNEGAN = register("finnegan",
			EntityType.Builder.<FinneganEntity>of(FinneganEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganLayEntity>> FINNEGAN_LAY = register("finnegan_lay",
			EntityType.Builder.<FinneganLayEntity>of(FinneganLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganSleepEntity>> FINNEGAN_SLEEP = register("finnegan_sleep",
			EntityType.Builder.<FinneganSleepEntity>of(FinneganSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganZoomiesEntity>> FINNEGAN_ZOOMIES = register("finnegan_zoomies",
			EntityType.Builder.<FinneganZoomiesEntity>of(FinneganZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganZoomiesTiredEntity>> FINNEGAN_ZOOMIES_TIRED = register("finnegan_zoomies_tired",
			EntityType.Builder.<FinneganZoomiesTiredEntity>of(FinneganZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampEntity>> CHAMP = register("champ",
			EntityType.Builder.<ChampEntity>of(ChampEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampLayEntity>> CHAMP_LAY = register("champ_lay",
			EntityType.Builder.<ChampLayEntity>of(ChampLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampSleepEntity>> CHAMP_SLEEP = register("champ_sleep",
			EntityType.Builder.<ChampSleepEntity>of(ChampSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampZoomiesEntity>> CHAMP_ZOOMIES = register("champ_zoomies",
			EntityType.Builder.<ChampZoomiesEntity>of(ChampZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampZoomiesTiredEntity>> CHAMP_ZOOMIES_TIRED = register("champ_zoomies_tired",
			EntityType.Builder.<ChampZoomiesTiredEntity>of(ChampZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoSitEntity>> SHARKO_SIT = register("sharko_sit",
			EntityType.Builder.<SharkoSitEntity>of(SharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoSitEntity>> ALBINO_SHARKO_SIT = register("albino_sharko_sit",
			EntityType.Builder.<AlbinoSharkoSitEntity>of(AlbinoSharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoSitEntity>> RARE_SHARKO_SIT = register("rare_sharko_sit",
			EntityType.Builder.<RareSharkoSitEntity>of(RareSharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoSitEntity>> LEGENDARY_SHARKO_SIT = register("legendary_sharko_sit",
			EntityType.Builder.<LegendarySharkoSitEntity>of(LegendarySharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoSitEntity>> MYTHIC_SHARKO_SIT = register("mythic_sharko_sit",
			EntityType.Builder.<MythicSharkoSitEntity>of(MythicSharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoSitEntity>> EXOTIC_SHARKO_SIT = register("exotic_sharko_sit",
			EntityType.Builder.<ExoticSharkoSitEntity>of(ExoticSharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoSitEntity>> ENGIE_SHARKO_SIT = register("engie_sharko_sit",
			EntityType.Builder.<EngieSharkoSitEntity>of(EngieSharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareSitEntity>> ENGIE_SHARKO_RARE_SIT = register("engie_sharko_rare_sit",
			EntityType.Builder.<EngieSharkoRareSitEntity>of(EngieSharkoRareSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2SitEntity>> TIGER_SHARKO_SIT = register("tiger_sharko_sit",
			EntityType.Builder.<EngieSharkoRare2SitEntity>of(EngieSharkoRare2SitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobySitEntity>> TOBY_SIT = register("toby_sit",
			EntityType.Builder.<TobySitEntity>of(TobySitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalSitEntity>> MARSHAL_SIT = register("marshal_sit",
			EntityType.Builder.<MarshalSitEntity>of(MarshalSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerSitEntity>> TIGER_SIT = register("tiger_sit",
			EntityType.Builder.<TigerSitEntity>of(TigerSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisSitEntity>> LOUIS_SIT = register("louis_sit",
			EntityType.Builder.<LouisSitEntity>of(LouisSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddySitEntity>> BUDDY_SIT = register("buddy_sit",
			EntityType.Builder.<BuddySitEntity>of(BuddySitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloSitEntity>> APOLLO_SIT = register("apollo_sit",
			EntityType.Builder.<ApolloSitEntity>of(ApolloSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasSitEntity>> ATLAS_SIT = register("atlas_sit",
			EntityType.Builder.<AtlasSitEntity>of(AtlasSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBESitEntity>> CBE_SIT = register("cbe_sit",
			EntityType.Builder.<CBESitEntity>of(CBESitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBESitEntity>> PBE_SIT = register("pbe_sit",
			EntityType.Builder.<PBESitEntity>of(PBESitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netSitEntity>> BOTHAN_2NET_SIT = register("bothan_2net_sit",
			EntityType.Builder.<Bothan2netSitEntity>of(Bothan2netSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoSitEntity>> EPIC_SHARKO_SIT = register("epic_sharko_sit",
			EntityType.Builder.<EpicSharkoSitEntity>of(EpicSharkoSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganSitEntity>> FINNEGAN_SIT = register("finnegan_sit",
			EntityType.Builder.<FinneganSitEntity>of(FinneganSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampSitEntity>> CHAMP_SIT = register("champ_sit",
			EntityType.Builder.<ChampSitEntity>of(ChampSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoLayOnSideEntity>> SHARKO_LAY_ON_SIDE = register("sharko_lay_on_side",
			EntityType.Builder.<SharkoLayOnSideEntity>of(SharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlbinoSharkoLayOnSideEntity>> ALBINO_SHARKO_LAY_ON_SIDE = register("albino_sharko_lay_on_side",
			EntityType.Builder.<AlbinoSharkoLayOnSideEntity>of(AlbinoSharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoLayOnSideEntity>> RARE_SHARKO_LAY_ON_SIDE = register("rare_sharko_lay_on_side",
			EntityType.Builder.<RareSharkoLayOnSideEntity>of(RareSharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoLayOnSideEntity>> LEGENDARY_SHARKO_LAY_ON_SIDE = register("legendary_sharko_lay_on_side",
			EntityType.Builder.<LegendarySharkoLayOnSideEntity>of(LegendarySharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoLayOnSideEntity>> MYTHIC_SHARKO_LAY_ON_SIDE = register("mythic_sharko_lay_on_side",
			EntityType.Builder.<MythicSharkoLayOnSideEntity>of(MythicSharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoLayOnSideEntity>> EXOTIC_SHARKO_LAY_ON_SIDE = register("exotic_sharko_lay_on_side",
			EntityType.Builder.<ExoticSharkoLayOnSideEntity>of(ExoticSharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoLayOnSideEntity>> ENGIE_SHARKO_LAY_ON_SIDE = register("engie_sharko_lay_on_side",
			EntityType.Builder.<EngieSharkoLayOnSideEntity>of(EngieSharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRareLayOnSideEntity>> ENGIE_SHARKO_RARE_LAY_ON_SIDE = register("engie_sharko_rare_lay_on_side",
			EntityType.Builder.<EngieSharkoRareLayOnSideEntity>of(EngieSharkoRareLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoRare2LayOnSideEntity>> TIGER_SHARKO_LAY_ON_SIDE = register("tiger_sharko_lay_on_side",
			EntityType.Builder.<EngieSharkoRare2LayOnSideEntity>of(EngieSharkoRare2LayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoLayOnSideEntity>> EPIC_SHARKO_LAY_ON_SIDE = register("epic_sharko_lay_on_side",
			EntityType.Builder.<EpicSharkoLayOnSideEntity>of(EpicSharkoLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TobyLayOnSideEntity>> TOBY_LAY_ON_SIDE = register("toby_lay_on_side",
			EntityType.Builder.<TobyLayOnSideEntity>of(TobyLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarshalLayOnSideEntity>> MARSHAL_LAY_ON_SIDE = register("marshal_lay_on_side",
			EntityType.Builder.<MarshalLayOnSideEntity>of(MarshalLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerLayOnSideEntity>> TIGER_LAY_ON_SIDE = register("tiger_lay_on_side",
			EntityType.Builder.<TigerLayOnSideEntity>of(TigerLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LouisLayOnSideEntity>> LOUIS_LAY_ON_SIDE = register("louis_lay_on_side",
			EntityType.Builder.<LouisLayOnSideEntity>of(LouisLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuddyLayOnSideEntity>> BUDDY_LAY_ON_SIDE = register("buddy_lay_on_side",
			EntityType.Builder.<BuddyLayOnSideEntity>of(BuddyLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApolloLayOnSideEntity>> APOLLO_LAY_ON_SIDE = register("apollo_lay_on_side",
			EntityType.Builder.<ApolloLayOnSideEntity>of(ApolloLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AtlasLayOnSideEntity>> ATLAS_LAY_ON_SIDE = register("atlas_lay_on_side",
			EntityType.Builder.<AtlasLayOnSideEntity>of(AtlasLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CBELayOnSideEntity>> CBE_LAY_ON_SIDE = register("cbe_lay_on_side",
			EntityType.Builder.<CBELayOnSideEntity>of(CBELayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PBELayOnSideEntity>> PBE_LAY_ON_SIDE = register("pbe_lay_on_side",
			EntityType.Builder.<PBELayOnSideEntity>of(PBELayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bothan2netLayOnSideEntity>> BOTHAN_2NET_LAY_ON_SIDE = register("bothan_2net_lay_on_side",
			EntityType.Builder.<Bothan2netLayOnSideEntity>of(Bothan2netLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<FinneganLayOnSideEntity>> FINNEGAN_LAY_ON_SIDE = register("finnegan_lay_on_side",
			EntityType.Builder.<FinneganLayOnSideEntity>of(FinneganLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChampLayOnSideEntity>> CHAMP_LAY_ON_SIDE = register("champ_lay_on_side",
			EntityType.Builder.<ChampLayOnSideEntity>of(ChampLayOnSideEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DistortedEntity>> DISTORTED = register("distorted",
			EntityType.Builder.<DistortedEntity>of(DistortedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(500).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheRealEngieGamesEntity>> THE_REAL_ENGIE_GAMES = register("the_real_engie_games",
			EntityType.Builder.<TheRealEngieGamesEntity>of(TheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlienEngieSharkoEntity>> ALIEN_ENGIE_SHARKO = register("alien_engie_sharko",
			EntityType.Builder.<AlienEngieSharkoEntity>of(AlienEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlienEngieSharkoTamedEntity>> ALIEN_ENGIE_SHARKO_TAMED = register("alien_engie_sharko_tamed",
			EntityType.Builder.<AlienEngieSharkoTamedEntity>of(AlienEngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockyEntity>> ROCKY = register("rocky",
			EntityType.Builder.<RockyEntity>of(RockyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockyLayEntity>> ROCKY_LAY = register("rocky_lay",
			EntityType.Builder.<RockyLayEntity>of(RockyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockySleepEntity>> ROCKY_SLEEP = register("rocky_sleep",
			EntityType.Builder.<RockySleepEntity>of(RockySleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlienEngieSharkoLayEntity>> ALIEN_ENGIE_SHARKO_LAY = register("alien_engie_sharko_lay",
			EntityType.Builder.<AlienEngieSharkoLayEntity>of(AlienEngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScorchedEntity>> SCORCHED = register("scorched",
			EntityType.Builder.<ScorchedEntity>of(ScorchedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackMadEngieEntity>> THROWBACK_MAD_ENGIE = register("throwback_mad_engie",
			EntityType.Builder.<ThrowbackMadEngieEntity>of(ThrowbackMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackAngryEngieEntity>> THROWBACK_ANGRY_ENGIE = register("throwback_angry_engie",
			EntityType.Builder.<ThrowbackAngryEngieEntity>of(ThrowbackAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackEnragedEngieEntity>> THROWBACK_ENRAGED_ENGIE = register("throwback_enraged_engie",
			EntityType.Builder.<ThrowbackEnragedEngieEntity>of(ThrowbackEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackAngryCreatorEntity>> THROWBACK_ANGRY_CREATOR = register("throwback_angry_creator",
			EntityType.Builder.<ThrowbackAngryCreatorEntity>of(ThrowbackAngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MadEngieColdSeasonEntity>> MAD_ENGIE_COLD_SEASON = register("mad_engie_cold_season",
			EntityType.Builder.<MadEngieColdSeasonEntity>of(MadEngieColdSeasonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieColdSeasonEntity>> ANGRY_ENGIE_COLD_SEASON = register("angry_engie_cold_season",
			EntityType.Builder.<AngryEngieColdSeasonEntity>of(AngryEngieColdSeasonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieColdSeasonEntity>> ENRAGED_ENGIE_COLD_SEASON = register("enraged_engie_cold_season",
			EntityType.Builder.<EnragedEngieColdSeasonEntity>of(EnragedEngieColdSeasonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<OutragedEngieColdSeasonEntity>> OUTRAGED_ENGIE_COLD_SEASON = register("outraged_engie_cold_season",
			EntityType.Builder.<OutragedEngieColdSeasonEntity>of(OutragedEngieColdSeasonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonstrosityEngieColdSeasonEntity>> MONSTROSITY_ENGIE_COLD_SEASON = register("monstrosity_engie_cold_season",
			EntityType.Builder.<MonstrosityEngieColdSeasonEntity>of(MonstrosityEngieColdSeasonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackEngiEntity>> THROWBACK_ENGI = register("throwback_engi",
			EntityType.Builder.<ThrowbackEngiEntity>of(ThrowbackEngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackCreatorEntity>> THROWBACK_CREATOR = register("throwback_creator",
			EntityType.Builder.<ThrowbackCreatorEntity>of(ThrowbackCreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackProtogenEntity>> THROWBACK_PROTOGEN = register("throwback_protogen",
			EntityType.Builder.<ThrowbackProtogenEntity>of(ThrowbackProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackBloodyEngieEntity>> THROWBACK_BLOODY_ENGIE = register("throwback_bloody_engie",
			EntityType.Builder.<ThrowbackBloodyEngieEntity>of(ThrowbackBloodyEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackSharkoEntity>> THROWBACK_SHARKO = register("throwback_sharko",
			EntityType.Builder.<ThrowbackSharkoEntity>of(ThrowbackSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TonyEntity>> TONY = register("tony",
			EntityType.Builder.<TonyEntity>of(TonyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TonyLayEntity>> TONY_LAY = register("tony_lay",
			EntityType.Builder.<TonyLayEntity>of(TonyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TonySleepEntity>> TONY_SLEEP = register("tony_sleep",
			EntityType.Builder.<TonySleepEntity>of(TonySleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WormholeEngieEntity>> WORMHOLE_ENGIE = register("wormhole_engie",
			EntityType.Builder.<WormholeEngieEntity>of(WormholeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<BiblicallyAccurateEngieColdSeasonEntity>> BIBLICALLY_ACCURATE_ENGIE_COLD_SEASON = register("biblically_accurate_engie_cold_season",
			EntityType.Builder.<BiblicallyAccurateEngieColdSeasonEntity>of(BiblicallyAccurateEngieColdSeasonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<CosmicEngieGamesEntity>> COSMIC_ENGIE_GAMES = register("cosmic_engie_games",
			EntityType.Builder.<CosmicEngieGamesEntity>of(CosmicEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(AllaboutengieMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		EngiEntity.init(event);
		MadEngieEntity.init(event);
		AngryEngieEntity.init(event);
		EnragedEngieEntity.init(event);
		AngryCreatorEntity.init(event);
		EngiFREntity.init(event);
		CreatorEntity.init(event);
		SharkoEntity.init(event);
		AlbinoSharkoEntity.init(event);
		RareSharkoEntity.init(event);
		LegendarySharkoEntity.init(event);
		MythicSharkoEntity.init(event);
		ExoticSharkoEntity.init(event);
		EngieSharkoEntity.init(event);
		EngieSharkoRareEntity.init(event);
		EngieSharkoRare2Entity.init(event);
		SharkTamedEntity.init(event);
		AlbinoSharkoTamedEntity.init(event);
		RareSharkoTamedEntity.init(event);
		LegendarySharkoTamedEntity.init(event);
		MythicSharkoTamedEntity.init(event);
		ExoticSharkoTamedEntity.init(event);
		EngieSharkoTamedEntity.init(event);
		EngieSharkoRareTamedEntity.init(event);
		EngieSharkoRare2TamedEntity.init(event);
		SharkoLayEntity.init(event);
		AlbinoSharkoLayEntity.init(event);
		RareSharkoLayEntity.init(event);
		LegendarySharkoLayEntity.init(event);
		MythicSharkoLayEntity.init(event);
		ExoticSharkoLayEntity.init(event);
		EngieSharkoLayEntity.init(event);
		EngieSharkoRareLayEntity.init(event);
		EngieSharkoRare2LayEntity.init(event);
		ProtogenEntity.init(event);
		QuizzetEntity.init(event);
		TobyEntity.init(event);
		TobyLayEntity.init(event);
		EnragedNormalEntity.init(event);
		EnragedNormal2Entity.init(event);
		EnragedNormal3Entity.init(event);
		EnragedNormal4Entity.init(event);
		EnragedNormal5Entity.init(event);
		EnragedNormal6Entity.init(event);
		EnragedNormal7Entity.init(event);
		EnragedNormal8Entity.init(event);
		EnragedNormal9Entity.init(event);
		EnragedTNTEntity.init(event);
		EnragedTNT2Entity.init(event);
		EnragedTNT3Entity.init(event);
		EnragedTNT4Entity.init(event);
		EnragedTNT5Entity.init(event);
		EnragedTNT6Entity.init(event);
		EnragedTNT7Entity.init(event);
		EnragedTNT8Entity.init(event);
		EnragedTNT9Entity.init(event);
		EnragedSpeedEntity.init(event);
		EnragedSpeed2Entity.init(event);
		EnragedSpeed3Entity.init(event);
		EnragedSpeed4Entity.init(event);
		EnragedSpeed5Entity.init(event);
		EnragedSpeed6Entity.init(event);
		EnragedSpeed7Entity.init(event);
		EnragedSpeed8Entity.init(event);
		EnragedSpeed9Entity.init(event);
		CommonEngieEntity.init(event);
		UncommonEngieEntity.init(event);
		RareEngieEntity.init(event);
		EpicEngieEntity.init(event);
		LegendaryEngieEntity.init(event);
		MythicEngieEntity.init(event);
		ExoticEngieEntity.init(event);
		MarshalEntity.init(event);
		MarshalLayEntity.init(event);
		TigerEntity.init(event);
		TigerLayEntity.init(event);
		LouisEntity.init(event);
		LouisLayEntity.init(event);
		TobyZoomiesEntity.init(event);
		MarshalZoomiesEntity.init(event);
		TigerZoomiesEntity.init(event);
		LouisZoomiesEntity.init(event);
		SharkoTamedZoomiesEntity.init(event);
		AlbinoSharkoTamedZoomiesEntity.init(event);
		RareSharkoTamedZoomiesEntity.init(event);
		LegendarySharkoTamedZoomiesEntity.init(event);
		MythicSharkoTamedZoomiesEntity.init(event);
		ExoticSharkoTamedZoomiesEntity.init(event);
		EngieSharkoTamedZoomiesEntity.init(event);
		EngieSharkoRareTamedZoomiesEntity.init(event);
		EngieSharkoRare2TamedZoomiesEntity.init(event);
		EngieSharkoRare2ZoomiesTiredEntity.init(event);
		TobyZoomiesTiredEntity.init(event);
		MarshalZoomiesTiredEntity.init(event);
		TigerZoomiesTiredEntity.init(event);
		LouisZoomiesTiredEntity.init(event);
		SharkoTamedZoomiesTiredEntity.init(event);
		AlbinoSharkoTamedZoomiesTiredEntity.init(event);
		RareSharkoTamedZoomiesTiredEntity.init(event);
		LegendarySharkoTamedZoomiesTiredEntity.init(event);
		MythicSharkoTamedZoomiesTiredEntity.init(event);
		ExoticSharkoTamedZoomiesTiredEntity.init(event);
		EngieSharkoTamedZoomiesTiredEntity.init(event);
		EngieSharkoRareTamedZoomiesTiredEntity.init(event);
		EngieSharkoRare2TamedZoomiesTiredEntity.init(event);
		TobySleepEntity.init(event);
		MarshalSleepEntity.init(event);
		TigerSleepEntity.init(event);
		LouisSleepEntity.init(event);
		SharkoSleepEntity.init(event);
		AlbinoSharkoSleepEntity.init(event);
		RareSharkoSleepEntity.init(event);
		LegendarySharkoSleepEntity.init(event);
		MythicSharkoSleepEntity.init(event);
		ExoticSharkoSleepEntity.init(event);
		EngieSharkoSleepEntity.init(event);
		EngieSharkoRareSleepEntity.init(event);
		EngieSharkoRare2SleepEntity.init(event);
		BiblicallyAccurateEngieEntity.init(event);
		BuddyEntity.init(event);
		BuddyLayEntity.init(event);
		BuddyZoomiesEntity.init(event);
		BuddyZoomiesTiredEntity.init(event);
		BuddySleepEntity.init(event);
		ApolloEntity.init(event);
		ApolloLayEntity.init(event);
		ApolloZoomiesEntity.init(event);
		ApolloZoomiesTiredEntity.init(event);
		ApolloSleepEntity.init(event);
		AtlasEntity.init(event);
		AtlasLayEntity.init(event);
		AtlasZoomiesEntity.init(event);
		AtlasZoomiesTiredEntity.init(event);
		AtlasSleepEntity.init(event);
		CBEEntity.init(event);
		CBELayEntity.init(event);
		CBEZoomiesEntity.init(event);
		CBESleepEntity.init(event);
		CBEZoomiesTiredEntity.init(event);
		PBEEntity.init(event);
		PBELayEntity.init(event);
		PBEZoomiesEntity.init(event);
		PBESleepEntity.init(event);
		PBEZoomiesTiredEntity.init(event);
		Bothan2netEntity.init(event);
		Bothan2netLayEntity.init(event);
		Bothan2netZoomiesEntity.init(event);
		Bothan2netZoomiesTiredEntity.init(event);
		Bothan2netSleepEntity.init(event);
		MonstrosityEngieEntity.init(event);
		EpicSharkoEntity.init(event);
		EpicSharkoTamedEntity.init(event);
		EpicSharkoLayEntity.init(event);
		EpicSharkoTamedZoomiesEntity.init(event);
		EpicSharkoTamedZoomiesTiredEntity.init(event);
		EpicSharkoSleepEntity.init(event);
		AngryEngieSharkoEntity.init(event);
		EnragedEngieSharkoEntity.init(event);
		OutragedEngieSharkoEntity.init(event);
		MonstrosityEngieSharkoEntity.init(event);
		SharkoAprilFoolsEntity.init(event);
		AlbinoSharkoAprilFoolsEntity.init(event);
		RareSharkoAprilFoolsEntity.init(event);
		LegendarySharkoAprilFoolsEntity.init(event);
		MythicSharkoAprilFoolsEntity.init(event);
		ExoticSharkoAprilFoolsEntity.init(event);
		EngieSharkoAprilFoolsEntity.init(event);
		EngieSharkoRareAprilFoolsEntity.init(event);
		EngieSharkoRare2AprilFoolsEntity.init(event);
		SharkoTamedAprilFoolsEntity.init(event);
		AlbinoSharkoTamedAprilFoolsEntity.init(event);
		RareSharkoTamedAprilFoolsEntity.init(event);
		LegendarySharkoTamedAprilFoolsEntity.init(event);
		MythicSharkoTamedAprilFoolsEntity.init(event);
		ExoticSharkoTamedAprilFoolsEntity.init(event);
		EngieSharkoTamedAprilFoolsEntity.init(event);
		EngieSharkoRareTamedAprilFoolsEntity.init(event);
		EngieSharkoRare2TamedAprilFoolsEntity.init(event);
		SharkoLayAprilFoolsEntity.init(event);
		AlbinoSharkoLayAprilFoolsEntity.init(event);
		RareSharkoLayAprilFoolsEntity.init(event);
		LegendarySharkoLayAprilFoolsEntity.init(event);
		MythicSharkoLayAprilFoolsEntity.init(event);
		ExoticSharkoLayAprilFoolsEntity.init(event);
		EngieSharkoLayAprilFoolsEntity.init(event);
		EngieSharkoRareLayAprilFoolsEntity.init(event);
		EngieSharkoRare2LayAprilFoolsEntity.init(event);
		SharkoSleepAprilFoolsEntity.init(event);
		AlbinoSharkoSleepAprilFoolsEntity.init(event);
		RareSharkoSleepAprilFoolsEntity.init(event);
		LegendarySharkoSleepAprilFoolsEntity.init(event);
		MythicSharkoSleepAprilFoolsEntity.init(event);
		ExoticSharkoSleepAprilFoolsEntity.init(event);
		EngieSharkoSleepAprilFoolsEntity.init(event);
		EngieSharkoRareSleepAprilFoolsEntity.init(event);
		EngieSharkoRare2SleepAprilFoolsEntity.init(event);
		EpicSharkoAprilFoolsEntity.init(event);
		EpicSharkoTamedAprilFoolsEntity.init(event);
		EpicSharkoLayAprilFoolsEntity.init(event);
		EpicSharkoSleepAprilFoolsEntity.init(event);
		HeWhoGamesEntity.init(event);
		HeWhoGamesHostileEntity.init(event);
		InsanityEntity.init(event);
		BigSharkoEntity.init(event);
		BigAlbinoSharkoEntity.init(event);
		BigRareSharkoEntity.init(event);
		BigEpicSharkoEntity.init(event);
		BigLegendarySharkoEntity.init(event);
		BigMythicSharkoEntity.init(event);
		BigExoticSharkoEntity.init(event);
		BigEngieSharkoEntity.init(event);
		BigEngieSharkoRareEntity.init(event);
		BigEngieSharkoRare2Entity.init(event);
		BigSharkoTamedEntity.init(event);
		BigAlbinoSharkoTamedEntity.init(event);
		BigRareSharkoTamedEntity.init(event);
		BigLegendarySharkoTamedEntity.init(event);
		BigMythicSharkoTamedEntity.init(event);
		BigExoticSharkoTamedEntity.init(event);
		BigEngieSharkoTamedEntity.init(event);
		BigEngieSharkoRareTamedEntity.init(event);
		BigEngieSharkoRare2TamedEntity.init(event);
		BigSharkoLayEntity.init(event);
		BigAlbinoSharkoLayEntity.init(event);
		BigRareSharkoLayEntity.init(event);
		BigLegendarySharkoLayEntity.init(event);
		BigMythicSharkoLayEntity.init(event);
		BigExoticSharkoLayEntity.init(event);
		BigEngieSharkoLayEntity.init(event);
		BigEngieSharkoRareLayEntity.init(event);
		BigEngieSharkoRare2LayEntity.init(event);
		BigSharkoSleepEntity.init(event);
		BigAlbinoSharkoSleepEntity.init(event);
		BigRareSharkoSleepEntity.init(event);
		BigLegendarySharkoSleepEntity.init(event);
		BigMythicSharkoSleepEntity.init(event);
		BigExoticSharkoSleepEntity.init(event);
		BigEngieSharkoSleepEntity.init(event);
		BigEngieSharkoRareSleepEntity.init(event);
		BigEngieSharkoRare2SleepEntity.init(event);
		BigEpicSharkoTamedEntity.init(event);
		BigEpicSharkoLayEntity.init(event);
		BigEpicSharkoSleepEntity.init(event);
		CosmoEntity.init(event);
		CosmoSleepEntity.init(event);
		CosmoLayEntity.init(event);
		AngryEngieStyle2Entity.init(event);
		EnragedEngieStyle2Entity.init(event);
		EnragedEngieStyle3Entity.init(event);
		OutragedEngieStyle2Entity.init(event);
		YellowLightningEntity.init(event);
		BlueBurstEntity.init(event);
		NormalEntity.init(event);
		MOABEntity.init(event);
		PureInsanityEntity.init(event);
		DoomsDayEntity.init(event);
		SuperDoomsDayEntity.init(event);
		DoomsDayHostileEntity.init(event);
		SuperDoomsDayHostileEntity.init(event);
		TheEndEntity.init(event);
		TheEndHostileEntity.init(event);
		EngieGamesDetectiveEntity.init(event);
		EngieGamesEntity.init(event);
		DDayLightningSpawnerEntity.init(event);
		DDAYRiftEntity.init(event);
		EnragedEngieOldRiftedEntity.init(event);
		MadEngieOldRiftedEntity.init(event);
		AngryEngieOldRiftedEntity.init(event);
		AngryCreatorRiftedEntity.init(event);
		BloodyEngieRiftedEntity.init(event);
		MindscapeEngieEntity.init(event);
		FinneganEntity.init(event);
		FinneganLayEntity.init(event);
		FinneganSleepEntity.init(event);
		FinneganZoomiesEntity.init(event);
		FinneganZoomiesTiredEntity.init(event);
		ChampEntity.init(event);
		ChampLayEntity.init(event);
		ChampSleepEntity.init(event);
		ChampZoomiesEntity.init(event);
		ChampZoomiesTiredEntity.init(event);
		SharkoSitEntity.init(event);
		AlbinoSharkoSitEntity.init(event);
		RareSharkoSitEntity.init(event);
		LegendarySharkoSitEntity.init(event);
		MythicSharkoSitEntity.init(event);
		ExoticSharkoSitEntity.init(event);
		EngieSharkoSitEntity.init(event);
		EngieSharkoRareSitEntity.init(event);
		EngieSharkoRare2SitEntity.init(event);
		TobySitEntity.init(event);
		MarshalSitEntity.init(event);
		TigerSitEntity.init(event);
		LouisSitEntity.init(event);
		BuddySitEntity.init(event);
		ApolloSitEntity.init(event);
		AtlasSitEntity.init(event);
		CBESitEntity.init(event);
		PBESitEntity.init(event);
		Bothan2netSitEntity.init(event);
		EpicSharkoSitEntity.init(event);
		FinneganSitEntity.init(event);
		ChampSitEntity.init(event);
		SharkoLayOnSideEntity.init(event);
		AlbinoSharkoLayOnSideEntity.init(event);
		RareSharkoLayOnSideEntity.init(event);
		LegendarySharkoLayOnSideEntity.init(event);
		MythicSharkoLayOnSideEntity.init(event);
		ExoticSharkoLayOnSideEntity.init(event);
		EngieSharkoLayOnSideEntity.init(event);
		EngieSharkoRareLayOnSideEntity.init(event);
		EngieSharkoRare2LayOnSideEntity.init(event);
		EpicSharkoLayOnSideEntity.init(event);
		TobyLayOnSideEntity.init(event);
		MarshalLayOnSideEntity.init(event);
		TigerLayOnSideEntity.init(event);
		LouisLayOnSideEntity.init(event);
		BuddyLayOnSideEntity.init(event);
		ApolloLayOnSideEntity.init(event);
		AtlasLayOnSideEntity.init(event);
		CBELayOnSideEntity.init(event);
		PBELayOnSideEntity.init(event);
		Bothan2netLayOnSideEntity.init(event);
		FinneganLayOnSideEntity.init(event);
		ChampLayOnSideEntity.init(event);
		DistortedEntity.init(event);
		TheRealEngieGamesEntity.init(event);
		AlienEngieSharkoEntity.init(event);
		AlienEngieSharkoTamedEntity.init(event);
		RockyEntity.init(event);
		RockyLayEntity.init(event);
		RockySleepEntity.init(event);
		AlienEngieSharkoLayEntity.init(event);
		ScorchedEntity.init(event);
		ThrowbackMadEngieEntity.init(event);
		ThrowbackAngryEngieEntity.init(event);
		ThrowbackEnragedEngieEntity.init(event);
		ThrowbackAngryCreatorEntity.init(event);
		MadEngieColdSeasonEntity.init(event);
		AngryEngieColdSeasonEntity.init(event);
		EnragedEngieColdSeasonEntity.init(event);
		OutragedEngieColdSeasonEntity.init(event);
		MonstrosityEngieColdSeasonEntity.init(event);
		ThrowbackEngiEntity.init(event);
		ThrowbackCreatorEntity.init(event);
		ThrowbackProtogenEntity.init(event);
		ThrowbackBloodyEngieEntity.init(event);
		ThrowbackSharkoEntity.init(event);
		TonyEntity.init(event);
		TonyLayEntity.init(event);
		TonySleepEntity.init(event);
		WormholeEngieEntity.init(event);
		BiblicallyAccurateEngieColdSeasonEntity.init(event);
		CosmicEngieGamesEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENGIE.get(), EngiEntity.createAttributes().build());
		event.put(MAD_ENGIE.get(), MadEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE.get(), AngryEngieEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE.get(), EnragedEngieEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE.get(), AngryCreatorEntity.createAttributes().build());
		event.put(ENGI_FR.get(), EngiFREntity.createAttributes().build());
		event.put(CREATOR.get(), CreatorEntity.createAttributes().build());
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(ALBINO_SHARKO.get(), AlbinoSharkoEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE.get(), EngieSharkoRareEntity.createAttributes().build());
		event.put(TIGER_SHARKO.get(), EngieSharkoRare2Entity.createAttributes().build());
		event.put(SHARKO_TAMED.get(), SharkTamedEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED.get(), RareSharkoTamedEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRareTamedEntity.createAttributes().build());
		event.put(TIGER_SHARKO_TAMED.get(), EngieSharkoRare2TamedEntity.createAttributes().build());
		event.put(SHARKO_LAY.get(), SharkoLayEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY.get(), RareSharkoLayEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY.get(), MythicSharkoLayEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY.get(), EngieSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_LAY.get(), EngieSharkoRareLayEntity.createAttributes().build());
		event.put(TIGER_SHARKO_LAY.get(), EngieSharkoRare2LayEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(QUIZZET.get(), QuizzetEntity.createAttributes().build());
		event.put(TOBY.get(), TobyEntity.createAttributes().build());
		event.put(TOBY_LAY.get(), TobyLayEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL_2.get(), EnragedNormal2Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_3.get(), EnragedNormal3Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_4.get(), EnragedNormal4Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_5.get(), EnragedNormal5Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_6.get(), EnragedNormal6Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_7.get(), EnragedNormal7Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_8.get(), EnragedNormal8Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_9.get(), EnragedNormal9Entity.createAttributes().build());
		event.put(ENRAGED_TNT.get(), EnragedTNTEntity.createAttributes().build());
		event.put(ENRAGED_TNT_2.get(), EnragedTNT2Entity.createAttributes().build());
		event.put(ENRAGED_TNT_3.get(), EnragedTNT3Entity.createAttributes().build());
		event.put(ENRAGED_TNT_4.get(), EnragedTNT4Entity.createAttributes().build());
		event.put(ENRAGED_TNT_5.get(), EnragedTNT5Entity.createAttributes().build());
		event.put(ENRAGED_TNT_6.get(), EnragedTNT6Entity.createAttributes().build());
		event.put(ENRAGED_TNT_7.get(), EnragedTNT7Entity.createAttributes().build());
		event.put(ENRAGED_TNT_8.get(), EnragedTNT8Entity.createAttributes().build());
		event.put(ENRAGED_TNT_9.get(), EnragedTNT9Entity.createAttributes().build());
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(ENRAGED_SPEED_2.get(), EnragedSpeed2Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_3.get(), EnragedSpeed3Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_4.get(), EnragedSpeed4Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_5.get(), EnragedSpeed5Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_6.get(), EnragedSpeed6Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_7.get(), EnragedSpeed7Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_8.get(), EnragedSpeed8Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_9.get(), EnragedSpeed9Entity.createAttributes().build());
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
		event.put(MARSHAL.get(), MarshalEntity.createAttributes().build());
		event.put(MARSHAL_LAY.get(), MarshalLayEntity.createAttributes().build());
		event.put(TIGER.get(), TigerEntity.createAttributes().build());
		event.put(TIGER_LAY.get(), TigerLayEntity.createAttributes().build());
		event.put(LOUIS.get(), LouisEntity.createAttributes().build());
		event.put(LOUIS_LAY.get(), LouisLayEntity.createAttributes().build());
		event.put(TOBY_ZOOMIES.get(), TobyZoomiesEntity.createAttributes().build());
		event.put(MARSHAL_ZOOMIES.get(), MarshalZoomiesEntity.createAttributes().build());
		event.put(TIGER_ZOOMIES.get(), TigerZoomiesEntity.createAttributes().build());
		event.put(LOUIS_ZOOMIES.get(), LouisZoomiesEntity.createAttributes().build());
		event.put(SHARKO_TAMED_ZOOMIES.get(), SharkoTamedZoomiesEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED_ZOOMIES.get(), AlbinoSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED_ZOOMIES.get(), RareSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED_ZOOMIES.get(), LegendarySharkoTamedZoomiesEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED_ZOOMIES.get(), MythicSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED_ZOOMIES.get(), ExoticSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED_ZOOMIES.get(), EngieSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED_ZOOMIES.get(), EngieSharkoRareTamedZoomiesEntity.createAttributes().build());
		event.put(TIGER_SHARKO_TAMED_ZOOMIES.get(), EngieSharkoRare2TamedZoomiesEntity.createAttributes().build());
		event.put(TIGER_SHARKO_ZOOMIES_TIRED.get(), EngieSharkoRare2ZoomiesTiredEntity.createAttributes().build());
		event.put(TOBY_ZOOMIES_TIRED.get(), TobyZoomiesTiredEntity.createAttributes().build());
		event.put(MARSHAL_ZOOMIES_TIRED.get(), MarshalZoomiesTiredEntity.createAttributes().build());
		event.put(TIGER_ZOOMIES_TIRED.get(), TigerZoomiesTiredEntity.createAttributes().build());
		event.put(LOUIS_ZOOMIES_TIRED.get(), LouisZoomiesTiredEntity.createAttributes().build());
		event.put(SHARKO_TAMED_ZOOMIES_TIRED.get(), SharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED_ZOOMIES_TIRED.get(), AlbinoSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED_ZOOMIES_TIRED.get(), RareSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED_ZOOMIES_TIRED.get(), LegendarySharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), MythicSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), ExoticSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED_ZOOMIES_TIRED.get(), EngieSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED_ZOOMIES_TIRED.get(), EngieSharkoRareTamedZoomiesTiredEntity.createAttributes().build());
		event.put(TIGER_SHARKO_TAMED_ZOOMIES_TIRED.get(), EngieSharkoRare2TamedZoomiesTiredEntity.createAttributes().build());
		event.put(TOBY_SLEEP.get(), TobySleepEntity.createAttributes().build());
		event.put(MARSHAL_SLEEP.get(), MarshalSleepEntity.createAttributes().build());
		event.put(TIGER_SLEEP.get(), TigerSleepEntity.createAttributes().build());
		event.put(LOUIS_SLEEP.get(), LouisSleepEntity.createAttributes().build());
		event.put(SHARKO_SLEEP.get(), SharkoSleepEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_SLEEP.get(), AlbinoSharkoSleepEntity.createAttributes().build());
		event.put(RARE_SHARKO_SLEEP.get(), RareSharkoSleepEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_SLEEP.get(), LegendarySharkoSleepEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_SLEEP.get(), MythicSharkoSleepEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_SLEEP.get(), ExoticSharkoSleepEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_SLEEP.get(), EngieSharkoSleepEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_SLEEP.get(), EngieSharkoRareSleepEntity.createAttributes().build());
		event.put(TIGER_SHARKO_SLEEP.get(), EngieSharkoRare2SleepEntity.createAttributes().build());
		event.put(BIBLICALLY_ACCURATE_ENGIE.get(), BiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(BUDDY.get(), BuddyEntity.createAttributes().build());
		event.put(BUDDY_LAY.get(), BuddyLayEntity.createAttributes().build());
		event.put(BUDDY_ZOOMIES.get(), BuddyZoomiesEntity.createAttributes().build());
		event.put(BUDDY_ZOOMIES_TIRED.get(), BuddyZoomiesTiredEntity.createAttributes().build());
		event.put(BUDDY_SLEEP.get(), BuddySleepEntity.createAttributes().build());
		event.put(APOLLO.get(), ApolloEntity.createAttributes().build());
		event.put(APOLLO_LAY.get(), ApolloLayEntity.createAttributes().build());
		event.put(APOLLO_ZOOMIES.get(), ApolloZoomiesEntity.createAttributes().build());
		event.put(APOLLO_ZOOMIES_TIRED.get(), ApolloZoomiesTiredEntity.createAttributes().build());
		event.put(APOLLO_SLEEP.get(), ApolloSleepEntity.createAttributes().build());
		event.put(ATLAS.get(), AtlasEntity.createAttributes().build());
		event.put(ATLAS_LAY.get(), AtlasLayEntity.createAttributes().build());
		event.put(ATLAS_ZOOMIES.get(), AtlasZoomiesEntity.createAttributes().build());
		event.put(ATLAS_ZOOMIES_TIRED.get(), AtlasZoomiesTiredEntity.createAttributes().build());
		event.put(ATLAS_SLEEP.get(), AtlasSleepEntity.createAttributes().build());
		event.put(CBE.get(), CBEEntity.createAttributes().build());
		event.put(CBE_LAY.get(), CBELayEntity.createAttributes().build());
		event.put(CBE_ZOOMIES.get(), CBEZoomiesEntity.createAttributes().build());
		event.put(CBE_SLEEP.get(), CBESleepEntity.createAttributes().build());
		event.put(CBE_ZOOMIES_TIRED.get(), CBEZoomiesTiredEntity.createAttributes().build());
		event.put(PBE.get(), PBEEntity.createAttributes().build());
		event.put(PBE_LAY.get(), PBELayEntity.createAttributes().build());
		event.put(PBE_ZOOMIES.get(), PBEZoomiesEntity.createAttributes().build());
		event.put(PBE_SLEEP.get(), PBESleepEntity.createAttributes().build());
		event.put(PBE_ZOOMIES_TIRED.get(), PBEZoomiesTiredEntity.createAttributes().build());
		event.put(BOTHAN_2NET.get(), Bothan2netEntity.createAttributes().build());
		event.put(BOTHAN_2NET_LAY.get(), Bothan2netLayEntity.createAttributes().build());
		event.put(BOTHAN_2NET_ZOOMIES.get(), Bothan2netZoomiesEntity.createAttributes().build());
		event.put(BOTHAN_2NET_ZOOMIES_TIRED.get(), Bothan2netZoomiesTiredEntity.createAttributes().build());
		event.put(BOTHAN_2NET_SLEEP.get(), Bothan2netSleepEntity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE.get(), MonstrosityEngieEntity.createAttributes().build());
		event.put(EPIC_SHARKO.get(), EpicSharkoEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED.get(), EpicSharkoTamedEntity.createAttributes().build());
		event.put(EPIC_SHARKO_LAY.get(), EpicSharkoLayEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED_ZOOMIES.get(), EpicSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), EpicSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(EPIC_SHARKO_SLEEP.get(), EpicSharkoSleepEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_SHARKO.get(), AngryEngieSharkoEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_SHARKO.get(), EnragedEngieSharkoEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE_SHARKO.get(), OutragedEngieSharkoEntity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE_SHARKO.get(), MonstrosityEngieSharkoEntity.createAttributes().build());
		event.put(SHARKO_APRIL_FOOLS.get(), SharkoAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_APRIL_FOOLS.get(), AlbinoSharkoAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_APRIL_FOOLS.get(), RareSharkoAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_APRIL_FOOLS.get(), LegendarySharkoAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_APRIL_FOOLS.get(), MythicSharkoAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_APRIL_FOOLS.get(), ExoticSharkoAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_APRIL_FOOLS.get(), EngieSharkoAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_APRIL_FOOLS.get(), EngieSharkoRareAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_APRIL_FOOLS.get(), EngieSharkoRare2AprilFoolsEntity.createAttributes().build());
		event.put(SHARKO_TAMED_APRIL_FOOLS.get(), SharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED_APRIL_FOOLS.get(), AlbinoSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED_APRIL_FOOLS.get(), RareSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED_APRIL_FOOLS.get(), LegendarySharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED_APRIL_FOOLS.get(), MythicSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED_APRIL_FOOLS.get(), ExoticSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED_APRIL_FOOLS.get(), EngieSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED_APRIL_FOOLS.get(), EngieSharkoRareTamedAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED_APRIL_FOOLS.get(), EngieSharkoRare2TamedAprilFoolsEntity.createAttributes().build());
		event.put(SHARKO_LAY_APRIL_FOOLS.get(), SharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY_APRIL_FOOLS.get(), AlbinoSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY_APRIL_FOOLS.get(), RareSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY_APRIL_FOOLS.get(), LegendarySharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY_APRIL_FOOLS.get(), MythicSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY_APRIL_FOOLS.get(), ExoticSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY_APRIL_FOOLS.get(), EngieSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_LAY_APRIL_FOOLS.get(), EngieSharkoRareLayAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_LAY_APRIL_FOOLS.get(), EngieSharkoRare2LayAprilFoolsEntity.createAttributes().build());
		event.put(SHARKO_SLEEP_APRIL_FOOLS.get(), SharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_SLEEP_APRIL_FOOLS.get(), AlbinoSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_SLEEP_APRIL_FOOLS.get(), RareSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_SLEEP_APRIL_FOOLS.get(), LegendarySharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_SLEEP_APRIL_FOOLS.get(), MythicSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_SLEEP_APRIL_FOOLS.get(), ExoticSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_SLEEP_APRIL_FOOLS.get(), EngieSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_SLEEP_APRIL_FOOLS.get(), EngieSharkoRareSleepAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_SLEEP_APRIL_FOOLS.get(), EngieSharkoRare2SleepAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_APRIL_FOOLS.get(), EpicSharkoAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED_APRIL_FOOLS.get(), EpicSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_LAY_APRIL_FOOLS.get(), EpicSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_SLEEP_APRIL_FOOLS.get(), EpicSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(HE_WHO_GAMES.get(), HeWhoGamesEntity.createAttributes().build());
		event.put(HE_WHO_GAMES_HOSTILE.get(), HeWhoGamesHostileEntity.createAttributes().build());
		event.put(INSANITY.get(), InsanityEntity.createAttributes().build());
		event.put(BIG_SHARKO.get(), BigSharkoEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO.get(), BigAlbinoSharkoEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO.get(), BigRareSharkoEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO.get(), BigEpicSharkoEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO.get(), BigLegendarySharkoEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO.get(), BigMythicSharkoEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO.get(), BigExoticSharkoEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO.get(), BigEngieSharkoEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE.get(), BigEngieSharkoRareEntity.createAttributes().build());
		event.put(BIG_TIGER_SHARKO.get(), BigEngieSharkoRare2Entity.createAttributes().build());
		event.put(BIG_SHARKO_TAMED.get(), BigSharkoTamedEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO_TAMED.get(), BigAlbinoSharkoTamedEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO_TAMED.get(), BigRareSharkoTamedEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO_TAMED.get(), BigLegendarySharkoTamedEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO_TAMED.get(), BigMythicSharkoTamedEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO_TAMED.get(), BigExoticSharkoTamedEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_TAMED.get(), BigEngieSharkoTamedEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_TAMED.get(), BigEngieSharkoRareTamedEntity.createAttributes().build());
		event.put(BIG_TIGER_SHARKO_TAMED.get(), BigEngieSharkoRare2TamedEntity.createAttributes().build());
		event.put(BIG_SHARKO_LAY.get(), BigSharkoLayEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO_LAY.get(), BigAlbinoSharkoLayEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO_LAY.get(), BigRareSharkoLayEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO_LAY.get(), BigLegendarySharkoLayEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO_LAY.get(), BigMythicSharkoLayEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO_LAY.get(), BigExoticSharkoLayEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_LAY.get(), BigEngieSharkoLayEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_LAY.get(), BigEngieSharkoRareLayEntity.createAttributes().build());
		event.put(BIG_TIGER_SHARKO_LAY.get(), BigEngieSharkoRare2LayEntity.createAttributes().build());
		event.put(BIG_SHARKO_SLEEP.get(), BigSharkoSleepEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO_SLEEP.get(), BigAlbinoSharkoSleepEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO_SLEEP.get(), BigRareSharkoSleepEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO_SLEEP.get(), BigLegendarySharkoSleepEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO_SLEEP.get(), BigMythicSharkoSleepEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO_SLEEP.get(), BigExoticSharkoSleepEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_SLEEP.get(), BigEngieSharkoSleepEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_SLEEP.get(), BigEngieSharkoRareSleepEntity.createAttributes().build());
		event.put(BIG_TIGER_SHARKO_SLEEP.get(), BigEngieSharkoRare2SleepEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO_TAMED.get(), BigEpicSharkoTamedEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO_LAY.get(), BigEpicSharkoLayEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO_SLEEP.get(), BigEpicSharkoSleepEntity.createAttributes().build());
		event.put(COSMO.get(), CosmoEntity.createAttributes().build());
		event.put(COSMO_SLEEP.get(), CosmoSleepEntity.createAttributes().build());
		event.put(COSMO_LAY.get(), CosmoLayEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_STYLE_2.get(), AngryEngieStyle2Entity.createAttributes().build());
		event.put(ENRAGED_ENGIE_STYLE_2.get(), EnragedEngieStyle2Entity.createAttributes().build());
		event.put(ENRAGED_ENGIE_STYLE_3.get(), EnragedEngieStyle3Entity.createAttributes().build());
		event.put(OUTRAGED_ENGIE_STYLE_2.get(), OutragedEngieStyle2Entity.createAttributes().build());
		event.put(YELLOW_LIGHTNING.get(), YellowLightningEntity.createAttributes().build());
		event.put(BLUE_BURST.get(), BlueBurstEntity.createAttributes().build());
		event.put(NORMAL.get(), NormalEntity.createAttributes().build());
		event.put(MOAB.get(), MOABEntity.createAttributes().build());
		event.put(PURE_INSANITY.get(), PureInsanityEntity.createAttributes().build());
		event.put(DOOMS_DAY.get(), DoomsDayEntity.createAttributes().build());
		event.put(SUPER_DOOMS_DAY.get(), SuperDoomsDayEntity.createAttributes().build());
		event.put(DOOMS_DAY_HOSTILE.get(), DoomsDayHostileEntity.createAttributes().build());
		event.put(SUPER_DOOMS_DAY_HOSTILE.get(), SuperDoomsDayHostileEntity.createAttributes().build());
		event.put(THE_END.get(), TheEndEntity.createAttributes().build());
		event.put(THE_END_HOSTILE.get(), TheEndHostileEntity.createAttributes().build());
		event.put(ENGIE_GAMES_DETECTIVE.get(), EngieGamesDetectiveEntity.createAttributes().build());
		event.put(ENGIE_GAMES.get(), EngieGamesEntity.createAttributes().build());
		event.put(D_DAY_LIGHTNING_SPAWNER.get(), DDayLightningSpawnerEntity.createAttributes().build());
		event.put(DDAY_RIFT.get(), DDAYRiftEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_OLD_RIFTED.get(), EnragedEngieOldRiftedEntity.createAttributes().build());
		event.put(MAD_ENGIE_OLD_RIFTED.get(), MadEngieOldRiftedEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_OLD_RIFTED.get(), AngryEngieOldRiftedEntity.createAttributes().build());
		event.put(ANGRY_CREATOR_RIFTED.get(), AngryCreatorRiftedEntity.createAttributes().build());
		event.put(BLOODY_ENGIE_RIFTED.get(), BloodyEngieRiftedEntity.createAttributes().build());
		event.put(MINDSCAPE_ENGIE.get(), MindscapeEngieEntity.createAttributes().build());
		event.put(FINNEGAN.get(), FinneganEntity.createAttributes().build());
		event.put(FINNEGAN_LAY.get(), FinneganLayEntity.createAttributes().build());
		event.put(FINNEGAN_SLEEP.get(), FinneganSleepEntity.createAttributes().build());
		event.put(FINNEGAN_ZOOMIES.get(), FinneganZoomiesEntity.createAttributes().build());
		event.put(FINNEGAN_ZOOMIES_TIRED.get(), FinneganZoomiesTiredEntity.createAttributes().build());
		event.put(CHAMP.get(), ChampEntity.createAttributes().build());
		event.put(CHAMP_LAY.get(), ChampLayEntity.createAttributes().build());
		event.put(CHAMP_SLEEP.get(), ChampSleepEntity.createAttributes().build());
		event.put(CHAMP_ZOOMIES.get(), ChampZoomiesEntity.createAttributes().build());
		event.put(CHAMP_ZOOMIES_TIRED.get(), ChampZoomiesTiredEntity.createAttributes().build());
		event.put(SHARKO_SIT.get(), SharkoSitEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_SIT.get(), AlbinoSharkoSitEntity.createAttributes().build());
		event.put(RARE_SHARKO_SIT.get(), RareSharkoSitEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_SIT.get(), LegendarySharkoSitEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_SIT.get(), MythicSharkoSitEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_SIT.get(), ExoticSharkoSitEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_SIT.get(), EngieSharkoSitEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_SIT.get(), EngieSharkoRareSitEntity.createAttributes().build());
		event.put(TIGER_SHARKO_SIT.get(), EngieSharkoRare2SitEntity.createAttributes().build());
		event.put(TOBY_SIT.get(), TobySitEntity.createAttributes().build());
		event.put(MARSHAL_SIT.get(), MarshalSitEntity.createAttributes().build());
		event.put(TIGER_SIT.get(), TigerSitEntity.createAttributes().build());
		event.put(LOUIS_SIT.get(), LouisSitEntity.createAttributes().build());
		event.put(BUDDY_SIT.get(), BuddySitEntity.createAttributes().build());
		event.put(APOLLO_SIT.get(), ApolloSitEntity.createAttributes().build());
		event.put(ATLAS_SIT.get(), AtlasSitEntity.createAttributes().build());
		event.put(CBE_SIT.get(), CBESitEntity.createAttributes().build());
		event.put(PBE_SIT.get(), PBESitEntity.createAttributes().build());
		event.put(BOTHAN_2NET_SIT.get(), Bothan2netSitEntity.createAttributes().build());
		event.put(EPIC_SHARKO_SIT.get(), EpicSharkoSitEntity.createAttributes().build());
		event.put(FINNEGAN_SIT.get(), FinneganSitEntity.createAttributes().build());
		event.put(CHAMP_SIT.get(), ChampSitEntity.createAttributes().build());
		event.put(SHARKO_LAY_ON_SIDE.get(), SharkoLayOnSideEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY_ON_SIDE.get(), AlbinoSharkoLayOnSideEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY_ON_SIDE.get(), RareSharkoLayOnSideEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY_ON_SIDE.get(), LegendarySharkoLayOnSideEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY_ON_SIDE.get(), MythicSharkoLayOnSideEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY_ON_SIDE.get(), ExoticSharkoLayOnSideEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY_ON_SIDE.get(), EngieSharkoLayOnSideEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_LAY_ON_SIDE.get(), EngieSharkoRareLayOnSideEntity.createAttributes().build());
		event.put(TIGER_SHARKO_LAY_ON_SIDE.get(), EngieSharkoRare2LayOnSideEntity.createAttributes().build());
		event.put(EPIC_SHARKO_LAY_ON_SIDE.get(), EpicSharkoLayOnSideEntity.createAttributes().build());
		event.put(TOBY_LAY_ON_SIDE.get(), TobyLayOnSideEntity.createAttributes().build());
		event.put(MARSHAL_LAY_ON_SIDE.get(), MarshalLayOnSideEntity.createAttributes().build());
		event.put(TIGER_LAY_ON_SIDE.get(), TigerLayOnSideEntity.createAttributes().build());
		event.put(LOUIS_LAY_ON_SIDE.get(), LouisLayOnSideEntity.createAttributes().build());
		event.put(BUDDY_LAY_ON_SIDE.get(), BuddyLayOnSideEntity.createAttributes().build());
		event.put(APOLLO_LAY_ON_SIDE.get(), ApolloLayOnSideEntity.createAttributes().build());
		event.put(ATLAS_LAY_ON_SIDE.get(), AtlasLayOnSideEntity.createAttributes().build());
		event.put(CBE_LAY_ON_SIDE.get(), CBELayOnSideEntity.createAttributes().build());
		event.put(PBE_LAY_ON_SIDE.get(), PBELayOnSideEntity.createAttributes().build());
		event.put(BOTHAN_2NET_LAY_ON_SIDE.get(), Bothan2netLayOnSideEntity.createAttributes().build());
		event.put(FINNEGAN_LAY_ON_SIDE.get(), FinneganLayOnSideEntity.createAttributes().build());
		event.put(CHAMP_LAY_ON_SIDE.get(), ChampLayOnSideEntity.createAttributes().build());
		event.put(DISTORTED.get(), DistortedEntity.createAttributes().build());
		event.put(THE_REAL_ENGIE_GAMES.get(), TheRealEngieGamesEntity.createAttributes().build());
		event.put(ALIEN_ENGIE_SHARKO.get(), AlienEngieSharkoEntity.createAttributes().build());
		event.put(ALIEN_ENGIE_SHARKO_TAMED.get(), AlienEngieSharkoTamedEntity.createAttributes().build());
		event.put(ROCKY.get(), RockyEntity.createAttributes().build());
		event.put(ROCKY_LAY.get(), RockyLayEntity.createAttributes().build());
		event.put(ROCKY_SLEEP.get(), RockySleepEntity.createAttributes().build());
		event.put(ALIEN_ENGIE_SHARKO_LAY.get(), AlienEngieSharkoLayEntity.createAttributes().build());
		event.put(SCORCHED.get(), ScorchedEntity.createAttributes().build());
		event.put(THROWBACK_MAD_ENGIE.get(), ThrowbackMadEngieEntity.createAttributes().build());
		event.put(THROWBACK_ANGRY_ENGIE.get(), ThrowbackAngryEngieEntity.createAttributes().build());
		event.put(THROWBACK_ENRAGED_ENGIE.get(), ThrowbackEnragedEngieEntity.createAttributes().build());
		event.put(THROWBACK_ANGRY_CREATOR.get(), ThrowbackAngryCreatorEntity.createAttributes().build());
		event.put(MAD_ENGIE_COLD_SEASON.get(), MadEngieColdSeasonEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_COLD_SEASON.get(), AngryEngieColdSeasonEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_COLD_SEASON.get(), EnragedEngieColdSeasonEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE_COLD_SEASON.get(), OutragedEngieColdSeasonEntity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE_COLD_SEASON.get(), MonstrosityEngieColdSeasonEntity.createAttributes().build());
		event.put(THROWBACK_ENGI.get(), ThrowbackEngiEntity.createAttributes().build());
		event.put(THROWBACK_CREATOR.get(), ThrowbackCreatorEntity.createAttributes().build());
		event.put(THROWBACK_PROTOGEN.get(), ThrowbackProtogenEntity.createAttributes().build());
		event.put(THROWBACK_BLOODY_ENGIE.get(), ThrowbackBloodyEngieEntity.createAttributes().build());
		event.put(THROWBACK_SHARKO.get(), ThrowbackSharkoEntity.createAttributes().build());
		event.put(TONY.get(), TonyEntity.createAttributes().build());
		event.put(TONY_LAY.get(), TonyLayEntity.createAttributes().build());
		event.put(TONY_SLEEP.get(), TonySleepEntity.createAttributes().build());
		event.put(WORMHOLE_ENGIE.get(), WormholeEngieEntity.createAttributes().build());
		event.put(BIBLICALLY_ACCURATE_ENGIE_COLD_SEASON.get(), BiblicallyAccurateEngieColdSeasonEntity.createAttributes().build());
		event.put(COSMIC_ENGIE_GAMES.get(), CosmicEngieGamesEntity.createAttributes().build());
	}
}