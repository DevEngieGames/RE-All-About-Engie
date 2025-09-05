package net.mcreator.allaboutengie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelengiedaboyositnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("allaboutengie", "modelengiedaboyositnew"), "main");
	public final ModelPart Body;
	public final ModelPart tail;
	public final ModelPart base;
	public final ModelPart base2;
	public final ModelPart mid1;
	public final ModelPart mid1a;
	public final ModelPart mid2;
	public final ModelPart mid2a;
	public final ModelPart tip;
	public final ModelPart tip2;
	public final ModelPart Head;
	public final ModelPart RightFrontLeg;
	public final ModelPart RightFrontUpperLeg;
	public final ModelPart RightFrontMidLeg;
	public final ModelPart RightFrontLowerLeg;
	public final ModelPart RightFrontFoot;
	public final ModelPart RightBackLeg;
	public final ModelPart RightBackUpperLeg;
	public final ModelPart RightBackMidLeg;
	public final ModelPart RightBackLowerLeg;
	public final ModelPart RightBackFoot;
	public final ModelPart LeftFrontLeg;
	public final ModelPart LeftFrontUpperLeg;
	public final ModelPart LeftFrontMidLeg;
	public final ModelPart LeftFrontLowerLeg;
	public final ModelPart LeftFrontFoot;
	public final ModelPart LeftBackLeg;
	public final ModelPart RightBackUpperLeg2;
	public final ModelPart RightBackMidLeg2;
	public final ModelPart RightBackLowerLeg2;
	public final ModelPart RightBackFoot2;

	public Modelengiedaboyositnew(ModelPart root) {
		this.Body = root.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Head = root.getChild("Head");
		this.RightFrontLeg = root.getChild("RightFrontLeg");
		this.RightFrontUpperLeg = this.RightFrontLeg.getChild("RightFrontUpperLeg");
		this.RightFrontMidLeg = this.RightFrontUpperLeg.getChild("RightFrontMidLeg");
		this.RightFrontLowerLeg = this.RightFrontMidLeg.getChild("RightFrontLowerLeg");
		this.RightFrontFoot = this.RightFrontLowerLeg.getChild("RightFrontFoot");
		this.RightBackLeg = root.getChild("RightBackLeg");
		this.RightBackUpperLeg = this.RightBackLeg.getChild("RightBackUpperLeg");
		this.RightBackMidLeg = this.RightBackUpperLeg.getChild("RightBackMidLeg");
		this.RightBackLowerLeg = this.RightBackMidLeg.getChild("RightBackLowerLeg");
		this.RightBackFoot = this.RightBackLowerLeg.getChild("RightBackFoot");
		this.LeftFrontLeg = root.getChild("LeftFrontLeg");
		this.LeftFrontUpperLeg = this.LeftFrontLeg.getChild("LeftFrontUpperLeg");
		this.LeftFrontMidLeg = this.LeftFrontUpperLeg.getChild("LeftFrontMidLeg");
		this.LeftFrontLowerLeg = this.LeftFrontMidLeg.getChild("LeftFrontLowerLeg");
		this.LeftFrontFoot = this.LeftFrontLowerLeg.getChild("LeftFrontFoot");
		this.LeftBackLeg = root.getChild("LeftBackLeg");
		this.RightBackUpperLeg2 = this.LeftBackLeg.getChild("RightBackUpperLeg2");
		this.RightBackMidLeg2 = this.RightBackUpperLeg2.getChild("RightBackMidLeg2");
		this.RightBackLowerLeg2 = this.RightBackMidLeg2.getChild("RightBackLowerLeg2");
		this.RightBackFoot2 = this.RightBackLowerLeg2.getChild("RightBackFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(33, 72).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -7.25F, 1.1345F, 0.0F, 0.0F));
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1", CubeListBuilder.create().texOffs(107, 52).addBox(-1.0F, 0.9503F, 2.2318F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.525F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2", CubeListBuilder.create().texOffs(97, 50).addBox(-1.0F, -1.9316F, 3.7227F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.525F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 35.525F, -18.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.85F, -22.95F, -0.3491F, 0.0F, 0.0F));
		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.775F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(112, 81).addBox(-2.75F, -2.775F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));
		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1", CubeListBuilder.create().texOffs(92, 32).addBox(-1.0F, -2.525F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));
		PartDefinition mid1 = base2.addOrReplaceChild("mid1", CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.775F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));
		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a", CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.775F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));
		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1", CubeListBuilder.create().texOffs(93, 45).addBox(-1.5F, -0.525F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));
		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2", CubeListBuilder.create().texOffs(92, 40).addBox(-1.5F, -0.525F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));
		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2", CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.15F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));
		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a", CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.15F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0873F, 0.0F, 0.0F));
		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2", CubeListBuilder.create().texOffs(94, 16).addBox(-0.5F, -2.025F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tip = mid2a.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(118, 50).addBox(-0.875F, -0.9F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tip2 = tip.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(118, 56).addBox(-0.875F, -0.9F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0873F, 0.0F, 0.0F));
		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1", CubeListBuilder.create().texOffs(92, 24).addBox(-0.5F, -2.025F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1187F, 1.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2", CubeListBuilder.create().texOffs(79, 25).addBox(-0.5F, -3.525F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -1.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 55).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(56, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 55).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 68).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 0)
						.addBox(-7.0F, -5.6F, -11.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-6.0F, -6.1F, -10.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(-5.0F, -6.6F, -9.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 16).addBox(-4.0F, -7.1F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(68, 39)
						.addBox(-3.0F, -7.6F, -7.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(88, 0).addBox(-2.0F, -8.1F, -6.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-1.0F, -8.6F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -3.75F));
		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(88, 5).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(88, 10).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition RightFrontLeg = partdefinition.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create(), PartPose.offset(-3.0F, 17.0F, -6.225F));
		PartDefinition RightFrontUpperLeg = RightFrontLeg.addOrReplaceChild("RightFrontUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLegLayer2_r1 = RightFrontUpperLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r1", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
								.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightFrontMidLeg = RightFrontUpperLeg.addOrReplaceChild("RightFrontMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLegLayer_r1 = RightFrontMidLeg.addOrReplaceChild("MidLegLayer_r1",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition RightFrontLowerLeg = RightFrontMidLeg.addOrReplaceChild("RightFrontLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLegLayer_r1 = RightFrontLowerLeg.addOrReplaceChild("LowerLegLayer_r1",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightFrontFoot = RightFrontLowerLeg.addOrReplaceChild("RightFrontFoot",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r1 = RightFrontFoot.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightBackLeg = partdefinition.addOrReplaceChild("RightBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 22.0F, 5.775F, -1.3526F, 0.0F, 0.0F));
		PartDefinition RightBackUpperLeg = RightBackLeg.addOrReplaceChild("RightBackUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 1.392F, -0.2825F));
		PartDefinition UpperLegLayer2_r2 = RightBackUpperLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r2", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.25F, -2.175F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
								.addBox(-2.0F, -2.25F, -2.175F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.25F, -2.175F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, -0.25F, 0.175F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightBackMidLeg = RightBackUpperLeg.addOrReplaceChild("RightBackMidLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.233F, -0.5425F, -0.6981F, 0.0F, 0.0F));
		PartDefinition MidLegLayer_r2 = RightBackMidLeg.addOrReplaceChild("MidLegLayer_r2",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -1.5F, -2.95F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -1.5F, -2.95F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 1.142F, 2.0865F, 0.5672F, 0.0F, 0.0F));
		PartDefinition RightBackLowerLeg = RightBackMidLeg.addOrReplaceChild("RightBackLowerLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 2.975F, 1.0472F, 0.0F, 0.0F));
		PartDefinition LowerLegLayer_r2 = RightBackLowerLeg.addOrReplaceChild("LowerLegLayer_r2",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -0.6F, -3.25F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -0.6F, -3.25F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 0.4769F, 1.108F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightBackFoot = RightBackLowerLeg.addOrReplaceChild("RightBackFoot",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, -1.0196F, -4.0052F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F))
						.texOffs(124, 36).addBox(-1.0125F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(0.0F, 2.675F, -0.325F, -0.4363F, 0.0F, 0.0F));
		PartDefinition Toe_r2 = RightBackFoot.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, -0.1423F, -3.8089F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftFrontLeg = partdefinition.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create(), PartPose.offset(3.0F, 17.0F, -6.225F));
		PartDefinition LeftFrontUpperLeg = LeftFrontLeg.addOrReplaceChild("LeftFrontUpperLeg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.358F, 0.0175F));
		PartDefinition UpperLegLayer2_r3 = LeftFrontUpperLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r3", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
								.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, 2.5F, -0.3F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftFrontMidLeg = LeftFrontUpperLeg.addOrReplaceChild("LeftFrontMidLeg", CubeListBuilder.create(), PartPose.offset(0.01F, 3.3749F, -1.031F));
		PartDefinition MidLegLayer_r3 = LeftFrontMidLeg.addOrReplaceChild("MidLegLayer_r3",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 1.75F, 1.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftFrontLowerLeg = LeftFrontMidLeg.addOrReplaceChild("LeftFrontLowerLeg", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.535F, 2.3715F));
		PartDefinition LowerLegLayer_r3 = LeftFrontLowerLeg.addOrReplaceChild("LowerLegLayer_r3",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.0F, 1.35F, -0.675F, -0.5236F, 0.0F, 0.0F));
		PartDefinition LeftFrontFoot = LeftFrontLowerLeg.addOrReplaceChild("LeftFrontFoot",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-0.005F, 1.4481F, -1.108F));
		PartDefinition Toe_r3 = LeftFrontFoot.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 0.8772F, -2.8036F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 20.925F, 10.65F, -1.3526F, 0.0F, 0.0F));
		PartDefinition RightBackUpperLeg2 = LeftBackLeg.addOrReplaceChild("RightBackUpperLeg2", CubeListBuilder.create(), PartPose.offset(-6.0F, 6.392F, -0.2825F));
		PartDefinition UpperLegLayer2_r4 = RightBackUpperLeg2
				.addOrReplaceChild(
						"UpperLegLayer2_r4", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.25F, -2.175F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.086F)).texOffs(99, 59)
								.addBox(-2.0F, -2.25F, -2.175F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.25F, -2.175F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, -0.25F, 0.175F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightBackMidLeg2 = RightBackUpperLeg2.addOrReplaceChild("RightBackMidLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.233F, -0.5425F, -0.6981F, 0.0F, 0.0F));
		PartDefinition MidLegLayer_r4 = RightBackMidLeg2.addOrReplaceChild("MidLegLayer_r4",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -1.5F, -2.95F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -1.5F, -2.95F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 1.142F, 2.0865F, 0.5672F, 0.0F, 0.0F));
		PartDefinition RightBackLowerLeg2 = RightBackMidLeg2.addOrReplaceChild("RightBackLowerLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 2.975F, 1.0472F, 0.0F, 0.0F));
		PartDefinition LowerLegLayer_r4 = RightBackLowerLeg2.addOrReplaceChild("LowerLegLayer_r4",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -0.6F, -3.25F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -0.6F, -3.25F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 0.4769F, 1.108F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightBackFoot2 = RightBackLowerLeg2.addOrReplaceChild("RightBackFoot2",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, -1.0196F, -4.0052F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F))
						.texOffs(124, 36).addBox(-1.0125F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, -0.0196F, -4.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(0.0F, 2.675F, -0.325F, -0.4363F, 0.0F, 0.0F));
		PartDefinition Toe_r4 = RightBackFoot2.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, -0.1423F, -3.8089F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}