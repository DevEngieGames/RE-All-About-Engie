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
public class Modelchampdaboyotired<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("allaboutengie", "modelchampdaboyotired"), "main");
	public final ModelPart root;
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
	public final ModelPart LeftFrontLeg;
	public final ModelPart RightBackLeg;
	public final ModelPart LeftBackLeg;

	public Modelchampdaboyotired(ModelPart root) {
		this.root = root.getChild("root");
		this.Body = this.root.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Head = this.root.getChild("Head");
		this.RightFrontLeg = this.root.getChild("RightFrontLeg");
		this.LeftFrontLeg = this.root.getChild("LeftFrontLeg");
		this.RightBackLeg = this.root.getChild("RightBackLeg");
		this.LeftBackLeg = this.root.getChild("LeftBackLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 19.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Body = root.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(33, 72).addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, 2.475F, 1.5708F, 0.0F, 0.0F));
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1", CubeListBuilder.create().texOffs(107, 52).addBox(-1.0F, 0.9753F, 2.2318F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2", CubeListBuilder.create().texOffs(97, 50).addBox(-1.0F, -1.9066F, 3.7227F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 25.0F, -20.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.85F, -22.95F, -0.3142F, -0.3491F, -1.5708F));
		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(112, 81).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));
		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1", CubeListBuilder.create().texOffs(92, 32).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));
		PartDefinition mid1 = base2.addOrReplaceChild("mid1", CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0903F, -0.2608F, -0.0233F));
		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a", CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0903F, -0.2608F, -0.0233F));
		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1", CubeListBuilder.create().texOffs(93, 45).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));
		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2", CubeListBuilder.create().texOffs(92, 40).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));
		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2", CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0903F, -0.2608F, -0.0233F));
		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a", CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0903F, -0.2608F, 0.0233F));
		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2", CubeListBuilder.create().texOffs(94, 16).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tip = mid2a.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(118, 50).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0903F, -0.2608F, 0.0233F));
		PartDefinition tip2 = tip.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(114, 55).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.1571F, 0.0F, 0.0F));
		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1", CubeListBuilder.create().texOffs(90, 22).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1188F, 2.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2", CubeListBuilder.create().texOffs(79, 25).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Head = root.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 55).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(56, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 55).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 68).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(30, 0)
						.addBox(-5.125F, -6.25F, -8.2625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0).addBox(3.125F, -6.25F, -8.2625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(-1.5F, -10.0F, -4.3125F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 7).addBox(-2.0F, -9.5F, -5.075F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 6)
						.addBox(-2.5F, -9.0F, -5.85F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(8, 5).addBox(-3.0F, -8.5F, -6.6375F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-3.5F, -8.0F, -7.375F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 3).addBox(-4.0F, -7.5F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(-4.5F, -7.0F, -8.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -6.0F, -9.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-1, 17)
						.addBox(-2.0F, -1.3F, -9.25F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-1, 12).addBox(-2.0F, -1.5F, -9.425F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -5.525F, 0.0436F, -0.0524F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 12).addBox(-0.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4535F, -1.0F, -8.4535F, 0.0F, -0.9599F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(11, 12).addBox(-2.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4715F, -1.0F, -8.4535F, 0.0F, 0.9599F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 13).mirror().addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0465F, -0.8F, -7.4535F, 0.0F, 0.9599F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 13).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0286F, -0.8F, -7.4535F, 0.0F, -0.9599F, 0.0F));
		PartDefinition tooth_r1 = Head.addOrReplaceChild("tooth_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -1.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r2 = Head.addOrReplaceChild("tooth_r2",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -2.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r3 = Head.addOrReplaceChild("tooth_r3",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -3.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r4 = Head.addOrReplaceChild("tooth_r4",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -4.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r5 = Head.addOrReplaceChild("tooth_r5",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -5.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r6 = Head.addOrReplaceChild("tooth_r6",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -6.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r7 = Head.addOrReplaceChild("tooth_r7",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(8.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -3.9964F, -7.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r8 = Head.addOrReplaceChild("tooth_r8",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-9.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -3.9964F, -0.491F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r9 = Head.addOrReplaceChild("tooth_r9", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r10 = Head.addOrReplaceChild("tooth_r10", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r11 = Head.addOrReplaceChild("tooth_r11", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r12 = Head.addOrReplaceChild("tooth_r12", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r13 = Head.addOrReplaceChild("tooth_r13", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r14 = Head.addOrReplaceChild("tooth_r14", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r15 = Head.addOrReplaceChild("tooth_r15", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r16 = Head.addOrReplaceChild("tooth_r16", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -3.9964F, -8.491F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r17 = Head.addOrReplaceChild("tooth_r17", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r18 = Head.addOrReplaceChild("tooth_r18", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r19 = Head.addOrReplaceChild("tooth_r19", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r20 = Head.addOrReplaceChild("tooth_r20", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r21 = Head.addOrReplaceChild("tooth_r21", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r22 = Head.addOrReplaceChild("tooth_r22", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r23 = Head.addOrReplaceChild("tooth_r23", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r24 = Head.addOrReplaceChild("tooth_r24", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -3.9964F, 0.009F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(88, 5).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(88, 10).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition RightFrontLeg = root.addOrReplaceChild("RightFrontLeg",
				CubeListBuilder.create().texOffs(99, 22).addBox(-2.0F, 4.0F, -4.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 39).addBox(-2.0375F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(-1.0125F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39).addBox(0.0125F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(1.0375F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(-2.5F, -6.0F, -4.5F, 0.3442F, 0.0594F, -0.3387F));
		PartDefinition Toe_r1 = RightFrontLeg.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.0536F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegLayer_r1 = RightFrontLeg.addOrReplaceChild("LowerLegLayer_r1",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -0.817F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegLayer_r1 = RightFrontLeg.addOrReplaceChild("MidLegLayer_r1",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.5135F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayer2_r1 = RightFrontLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r1", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(99, 59)
								.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, 0.142F, -1.7825F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftFrontLeg = root.addOrReplaceChild("LeftFrontLeg",
				CubeListBuilder.create().texOffs(99, 22).addBox(-2.0F, 4.0F, -4.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 39).addBox(-2.0375F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(-1.0125F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39).addBox(0.0125F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 39)
						.addBox(1.0375F, 5.0F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(3.5F, -6.0F, -4.5F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Toe_r2 = LeftFrontLeg.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.0536F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegLayer_r2 = LeftFrontLeg.addOrReplaceChild("LowerLegLayer_r2",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -0.817F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegLayer_r2 = LeftFrontLeg.addOrReplaceChild("MidLegLayer_r2",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.5135F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayer2_r2 = LeftFrontLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r2", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(99, 59)
								.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, 0.142F, -1.7825F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightBackLeg = root.addOrReplaceChild("RightBackLeg",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 4.0F, -4.475F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(-2.5F, -6.0F, 7.5F, -0.1298F, -0.017F, -0.4352F));
		PartDefinition Toe_r3 = RightBackLeg.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.2786F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegLayer_r3 = RightBackLeg.addOrReplaceChild("LowerLegLayer_r3",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -1.042F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegLayer_r3 = RightBackLeg.addOrReplaceChild("MidLegLayer_r3",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.7385F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayer2_r3 = RightBackLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r3", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(99, 59)
								.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, 0.142F, -2.0075F, -0.2182F, 0.0F, 0.0F));
		PartDefinition LeftBackLeg = root.addOrReplaceChild("LeftBackLeg",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 4.0F, -4.475F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(124, 36).addBox(-2.0375F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.0125F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36).addBox(0.0125F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(1.0375F, 5.0F, -4.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(3.5F, -6.0F, 7.5F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Toe_r4 = LeftBackLeg.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(124, 33).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.2786F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegLayer_r4 = LeftBackLeg.addOrReplaceChild("LowerLegLayer_r4",
				CubeListBuilder.create().texOffs(114, 74).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0591F)).texOffs(114, 19).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -1.042F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegLayer_r4 = LeftBackLeg.addOrReplaceChild("MidLegLayer_r4",
				CubeListBuilder.create().texOffs(112, 65).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(112, 10).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.7385F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayer2_r4 = LeftBackLeg
				.addOrReplaceChild(
						"UpperLegLayer2_r4", CubeListBuilder.create().texOffs(69, 76).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.111F)).texOffs(99, 59)
								.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.061F)).texOffs(112, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
						PartPose.offsetAndRotation(0.0F, 0.142F, -2.0075F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}