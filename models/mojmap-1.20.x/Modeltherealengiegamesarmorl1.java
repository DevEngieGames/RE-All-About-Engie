// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltherealengiegamesarmorl1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "therealengiegamesarmorl1"), "main");
	private final ModelPart head;
	private final ModelPart ChainR;
	private final ModelPart ChainLink;
	private final ModelPart LinkMain;
	private final ModelPart LinkSecondary;
	private final ModelPart LinkThird;
	private final ModelPart LinkFourth;
	private final ModelPart LinkFifth;
	private final ModelPart LinkSixth;
	private final ModelPart ChainL;
	private final ModelPart ChainLink2;
	private final ModelPart LinkMain2;
	private final ModelPart LinkSecondary2;
	private final ModelPart LinkThird2;
	private final ModelPart LinkFourth2;
	private final ModelPart LinkFifth2;
	private final ModelPart LinkSixth2;
	private final ModelPart body;
	private final ModelPart ScarfBody;
	private final ModelPart ScarfMain;
	private final ModelPart ScarfHangR;
	private final ModelPart R1;
	private final ModelPart R2;
	private final ModelPart R3;
	private final ModelPart R4;
	private final ModelPart R5;
	private final ModelPart R6;
	private final ModelPart R7;
	private final ModelPart ScarfHangL;
	private final ModelPart L1;
	private final ModelPart L2;
	private final ModelPart L3;
	private final ModelPart L4;
	private final ModelPart L5;
	private final ModelPart L6;
	private final ModelPart L7;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart right_shoe;
	private final ModelPart left_shoe;

	public Modeltherealengiegamesarmorl1(ModelPart root) {
		this.head = root.getChild("head");
		this.ChainR = this.head.getChild("ChainR");
		this.ChainLink = this.ChainR.getChild("ChainLink");
		this.LinkMain = this.ChainLink.getChild("LinkMain");
		this.LinkSecondary = this.LinkMain.getChild("LinkSecondary");
		this.LinkThird = this.LinkSecondary.getChild("LinkThird");
		this.LinkFourth = this.LinkThird.getChild("LinkFourth");
		this.LinkFifth = this.LinkFourth.getChild("LinkFifth");
		this.LinkSixth = this.LinkFifth.getChild("LinkSixth");
		this.ChainL = this.head.getChild("ChainL");
		this.ChainLink2 = this.ChainL.getChild("ChainLink2");
		this.LinkMain2 = this.ChainLink2.getChild("LinkMain2");
		this.LinkSecondary2 = this.LinkMain2.getChild("LinkSecondary2");
		this.LinkThird2 = this.LinkSecondary2.getChild("LinkThird2");
		this.LinkFourth2 = this.LinkThird2.getChild("LinkFourth2");
		this.LinkFifth2 = this.LinkFourth2.getChild("LinkFifth2");
		this.LinkSixth2 = this.LinkFifth2.getChild("LinkSixth2");
		this.body = root.getChild("body");
		this.ScarfBody = this.body.getChild("ScarfBody");
		this.ScarfMain = this.ScarfBody.getChild("ScarfMain");
		this.ScarfHangR = this.ScarfMain.getChild("ScarfHangR");
		this.R1 = this.ScarfHangR.getChild("R1");
		this.R2 = this.R1.getChild("R2");
		this.R3 = this.R2.getChild("R3");
		this.R4 = this.R3.getChild("R4");
		this.R5 = this.R4.getChild("R5");
		this.R6 = this.R5.getChild("R6");
		this.R7 = this.R6.getChild("R7");
		this.ScarfHangL = this.ScarfMain.getChild("ScarfHangL");
		this.L1 = this.ScarfHangL.getChild("L1");
		this.L2 = this.L1.getChild("L2");
		this.L3 = this.L2.getChild("L3");
		this.L4 = this.L3.getChild("L4");
		this.L5 = this.L4.getChild("L5");
		this.L6 = this.L5.getChild("L6");
		this.L7 = this.L6.getChild("L7");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_shoe = root.getChild("right_shoe");
		this.left_shoe = root.getChild("left_shoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
				.addBox(-2.0F, -9.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
				.addBox(-3.0F, -9.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 28)
				.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
				.addBox(-6.0F, -7.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
				.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
				.addBox(4.05F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(4.2F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94)
				.addBox(3.9F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 88)
				.addBox(3.9F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
				.addBox(-5.5F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(-5.3F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94).mirror()
				.addBox(-4.7F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 88)
				.addBox(-4.7F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(-4.4F, -8.3F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(-4.8F, -8.7F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(-4.8F, -8.7F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(4.2F, -8.7F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(4.2F, -8.7F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(4.0F, -8.3F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
				.addBox(-4.0F, -8.4F, -2.0F, 8.0F, 0.4F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
				.addBox(-4.5F, -8.8F, -2.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 50)
				.addBox(-4.5F, -8.8F, 1.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 55)
				.addBox(-4.8F, -8.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 55)
				.addBox(3.6F, -8.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 69)
				.addBox(-4.1F, -5.95F, -5.0F, 8.2F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 125).mirror()
				.addBox(-1.5F, -8.075F, 4.0F, 3.0F, 2.4F, 0.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 126)
				.mirror().addBox(-4.1F, -5.675F, 4.0F, 8.2F, 1.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 118).addBox(-4.1F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(4.0F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 119).addBox(-1.5F, -8.075F, -3.975F, 3.0F, 0.1F, 7.975F, new CubeDeformation(0.0F))
				.texOffs(56, 64).addBox(-1.8F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(55, 65).addBox(1.5F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 71)
				.addBox(-4.4F, -1.9F, -4.4F, 8.8F, 2.3F, 8.8F, new CubeDeformation(0.025F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 125).addBox(-1.5F, -1.25F, -0.05F, 3.0F, 2.5F, 0.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8393F, -4.1868F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-6.5F, -6.5F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-6.5F, -6.5F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(1.975F, -4.95F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(1.975F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition ChainR = head.addOrReplaceChild("ChainR", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -3.0443F, -0.05F));

		PartDefinition ChainLink = ChainR.addOrReplaceChild("ChainLink", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.8557F, 0.0F));

		PartDefinition LinkMain = ChainLink.addOrReplaceChild("LinkMain", CubeListBuilder.create().texOffs(127, 124)
				.addBox(-0.375F, -0.35F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(127, 124)
				.addBox(0.225F, -0.35F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LinkMain.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 0.25F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = LinkMain.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, -0.35F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LinkSecondary = LinkMain.addOrReplaceChild("LinkSecondary", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.05F, 0.0F));

		PartDefinition cube_r8 = LinkSecondary.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.65F, 0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = LinkSecondary.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.05F, -0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = LinkSecondary.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.275F, 0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r11 = LinkSecondary.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.425F, -0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LinkThird = LinkSecondary.addOrReplaceChild("LinkThird",
				CubeListBuilder.create().texOffs(127, 124)
						.addBox(-0.375F, 0.2F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(0.225F, 0.2F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r12 = LinkThird.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 0.8F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r13 = LinkThird.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, 0.2F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LinkFourth = LinkThird.addOrReplaceChild("LinkFourth", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r14 = LinkFourth.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.95F, 0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r15 = LinkFourth.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.35F, -0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r16 = LinkFourth.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.575F, 0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r17 = LinkFourth.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.725F, -0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LinkFifth = LinkFourth.addOrReplaceChild("LinkFifth",
				CubeListBuilder.create().texOffs(127, 124)
						.addBox(-0.375F, 0.5F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(0.225F, 0.5F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r18 = LinkFifth.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 1.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r19 = LinkFifth.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LinkSixth = LinkFifth.addOrReplaceChild("LinkSixth",
				CubeListBuilder.create().texOffs(42, 0).mirror()
						.addBox(-1.0F, 1.0807F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r20 = LinkSixth.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, 0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r21 = LinkSixth.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.65F, -0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r22 = LinkSixth.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.875F, 0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r23 = LinkSixth.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.025F, -0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition ChainL = head.addOrReplaceChild("ChainL", CubeListBuilder.create(),
				PartPose.offset(7.0F, -3.0443F, -0.05F));

		PartDefinition ChainLink2 = ChainL.addOrReplaceChild("ChainLink2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.8557F, 0.0F));

		PartDefinition LinkMain2 = ChainLink2.addOrReplaceChild("LinkMain2", CubeListBuilder.create().texOffs(127, 124)
				.addBox(-0.375F, -0.35F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(127, 124)
				.addBox(0.225F, -0.35F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r24 = LinkMain2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 0.25F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r25 = LinkMain2.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, -0.35F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LinkSecondary2 = LinkMain2.addOrReplaceChild("LinkSecondary2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.05F, 0.0F));

		PartDefinition cube_r26 = LinkSecondary2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.65F, 0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r27 = LinkSecondary2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.05F, -0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r28 = LinkSecondary2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.275F, 0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r29 = LinkSecondary2.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.425F, -0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LinkThird2 = LinkSecondary2.addOrReplaceChild("LinkThird2",
				CubeListBuilder.create().texOffs(127, 124)
						.addBox(-0.375F, 0.2F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(0.225F, 0.2F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r30 = LinkThird2.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 0.8F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r31 = LinkThird2.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, 0.2F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LinkFourth2 = LinkThird2.addOrReplaceChild("LinkFourth2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r32 = LinkFourth2.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.95F, 0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r33 = LinkFourth2.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.35F, -0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r34 = LinkFourth2.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.575F, 0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r35 = LinkFourth2.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.725F, -0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LinkFifth2 = LinkFourth2.addOrReplaceChild("LinkFifth2",
				CubeListBuilder.create().texOffs(127, 124)
						.addBox(-0.375F, 0.5F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(0.225F, 0.5F, -0.075F, 0.15F, 0.6F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r36 = LinkFifth2.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 1.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r37 = LinkFifth2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LinkSixth2 = LinkFifth2.addOrReplaceChild("LinkSixth2", CubeListBuilder.create().texOffs(42, 0)
				.addBox(-1.0F, 1.0807F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition cube_r38 = LinkSixth2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, 0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r39 = LinkSixth2.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.65F, -0.075F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r40 = LinkSixth2.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.225F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.875F, 0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r41 = LinkSixth2.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(127, 124).addBox(-0.075F, -0.375F, -0.075F, 0.15F, 0.6F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.025F, -0.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(80, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(80, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ScarfBody = body.addOrReplaceChild("ScarfBody", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ScarfMain = ScarfBody.addOrReplaceChild("ScarfMain",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(0.5F, -2.5F, 4.0F, 3.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-3.5F, -2.5F, 4.0F, 3.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-4.5F, 1.5F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-4.5F, -1.5F, -3.5F, 9.0F, 3.0F, 7.0F, new CubeDeformation(-0.025F)).texOffs(0, 71)
						.addBox(-4.5F, -2.0F, -4.5F, 9.0F, 2.5F, 9.0F, new CubeDeformation(0.025F)).texOffs(0, 71)
						.addBox(-3.5F, -2.9F, -3.5F, 7.0F, 0.9F, 7.0F, new CubeDeformation(0.025F)).texOffs(0, 71)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r42 = ScarfMain.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(4, 71).addBox(-3.075F, -0.5F, -0.5F, 8.05F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(3.525F, -2.3F, -0.95F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition cube_r43 = ScarfMain.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(4, 71).addBox(-2.625F, -0.5F, -0.5F, 7.575F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-0.925F, -2.3F, -3.525F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r44 = ScarfMain.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(4, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 3.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r45 = ScarfMain.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(4, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, 2.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r46 = ScarfMain.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.7125F, -0.8F, 9.0F, 1.425F, 1.6F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -0.4833F, 3.5412F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r47 = ScarfMain.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.6F, 9.0F, 1.425F, 1.6F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -3.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r48 = ScarfMain.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(0, 71).addBox(-3.575F, -0.5F, -0.5F, 7.6F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.525F, -2.3F, 0.0F, 0.7854F, -1.5708F, 0.0F));

		PartDefinition cube_r49 = ScarfMain.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.025F, -0.5F, -0.5F, 8.05F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -2.3F, 3.525F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r50 = ScarfMain.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -3.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r51 = ScarfMain.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, -2.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition ScarfHangR = ScarfMain.addOrReplaceChild("ScarfHangR", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -2.0F, 4.5F));

		PartDefinition R1 = ScarfHangR.addOrReplaceChild("R1",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.2618F));

		PartDefinition R2 = R1.addOrReplaceChild("R2",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.6F, 0.0F, -0.25F, 3.2F, 3.1F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition R3 = R2
				.addOrReplaceChild("R3",
						CubeListBuilder.create().texOffs(0, 3).addBox(-1.7F, 0.0F, -0.25F, 3.4F, 3.2F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.1F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition R4 = R3
				.addOrReplaceChild("R4",
						CubeListBuilder.create().texOffs(0, 3).addBox(-1.8F, 0.0F, -0.25F, 3.6F, 3.3F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition R5 = R4
				.addOrReplaceChild("R5",
						CubeListBuilder.create().texOffs(0, 4).addBox(-1.9F, 0.0F, -0.25F, 3.8F, 3.4F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.3F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition R6 = R5
				.addOrReplaceChild("R6",
						CubeListBuilder.create().texOffs(0, 4).addBox(-2.0F, 0.0F, -0.25F, 4.0F, 3.5F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.4F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition R7 = R6
				.addOrReplaceChild("R7",
						CubeListBuilder.create().texOffs(0, 4).addBox(-2.1F, 0.0F, -0.25F, 4.2F, 3.6F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition ScarfHangL = ScarfMain.addOrReplaceChild("ScarfHangL", CubeListBuilder.create(),
				PartPose.offset(2.0F, -2.0F, 4.5F));

		PartDefinition L1 = ScarfHangL.addOrReplaceChild("L1",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, -0.2618F));

		PartDefinition L2 = L1.addOrReplaceChild("L2",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.6F, 0.0F, -0.25F, 3.2F, 3.1F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition L3 = L2
				.addOrReplaceChild("L3",
						CubeListBuilder.create().texOffs(0, 3).addBox(-1.7F, 0.0F, -0.25F, 3.4F, 3.2F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.1F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition L4 = L3
				.addOrReplaceChild("L4",
						CubeListBuilder.create().texOffs(0, 3).addBox(-1.8F, 0.0F, -0.25F, 3.6F, 3.3F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition L5 = L4
				.addOrReplaceChild("L5",
						CubeListBuilder.create().texOffs(0, 4).addBox(-1.9F, 0.0F, -0.25F, 3.8F, 3.4F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.3F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition L6 = L5
				.addOrReplaceChild("L6",
						CubeListBuilder.create().texOffs(0, 4).addBox(-2.0F, 0.0F, -0.25F, 4.0F, 3.5F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.4F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition L7 = L6
				.addOrReplaceChild("L7",
						CubeListBuilder.create().texOffs(0, 4).addBox(-2.1F, 0.0F, -0.25F, 4.2F, 3.6F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(104, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(104, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(96, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(112, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_shoe = partdefinition.addOrReplaceChild("right_shoe",
				CubeListBuilder.create().texOffs(64, 16)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(64, 32)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_shoe = partdefinition.addOrReplaceChild("left_shoe",
				CubeListBuilder.create().texOffs(80, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(64, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_shoe.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_shoe.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}