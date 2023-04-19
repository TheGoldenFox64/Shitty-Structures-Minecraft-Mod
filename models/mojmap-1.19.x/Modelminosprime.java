// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelminosprime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minosprime"), "main");
	private final ModelPart lleg;
	private final ModelPart rleg;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart larm;
	private final ModelPart rarm;

	public Modelminosprime(ModelPart root) {
		this.lleg = root.getChild("lleg");
		this.rleg = root.getChild("rleg");
		this.torso = root.getChild("torso");
		this.head = root.getChild("head");
		this.larm = root.getChild("larm");
		this.rarm = root.getChild("rarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition lleg = partdefinition.addOrReplaceChild("lleg",
				CubeListBuilder.create().texOffs(39, 17)
						.addBox(-2.5F, -7.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
						.addBox(-3.0F, -14.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 35)
						.addBox(-2.5F, -1.0F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rleg = partdefinition.addOrReplaceChild("rleg",
				CubeListBuilder.create().texOffs(32, 30)
						.addBox(1.5F, -7.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(1.5F, -1.0F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(1.0F, -14.0F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 7)
						.addBox(-4.0F, -19.0F, -2.0F, 9.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.0F, -25.0F, -2.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -27.0F, -2.5F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 12)
						.addBox(-3.0F, -28.0F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-3.5F, -22.0F, -1.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(39, 7)
						.addBox(-1.0F, -30.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(-2.0F, -36.5F, -2.0F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-2.0F, -31.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(-2.0F, -37.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 43)
						.addBox(-2.0F, -36.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 43)
						.addBox(2.0F, -36.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 47)
						.addBox(-2.5F, -40.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(2.5F, -38.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 40)
						.addBox(1.5F, -44.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 41)
						.addBox(0.5F, -43.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 40)
						.addBox(-0.5F, -41.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 15)
						.addBox(-1.0F, -43.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 34)
						.addBox(-1.5F, -40.0F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 40)
						.addBox(1.5F, -40.5F, -2.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-1.0F, -38.5F, -2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -37.0F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(2.5F, -37.5F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition larm = partdefinition.addOrReplaceChild("larm",
				CubeListBuilder.create().texOffs(10, 29)
						.addBox(-0.5F, -10.0F, -1.5F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 40)
						.addBox(-1.0F, -6.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 31)
						.addBox(1.0F, -5.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 45)
						.addBox(1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 44)
						.addBox(1.0F, -7.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, 8.5F, 0.0F));

		PartDefinition cube_r1 = larm
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(17, 40).addBox(0.0F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r2 = larm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(39, 31)
						.addBox(-0.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 4)
						.addBox(-0.5F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-1.0F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.317F, -3.9151F, -1.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r3 = larm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(19, 23)
						.addBox(-1.5F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 14)
						.addBox(-2.5F, -4.5F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 41)
						.addBox(-2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition rarm = partdefinition.addOrReplaceChild("rarm",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-1.1702F, -5.1518F, -1.5F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 44)
						.addBox(-1.6702F, -0.1518F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 2)
						.addBox(-1.6702F, -1.6518F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(0.3298F, -0.6518F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 29)
						.addBox(0.3298F, 0.8482F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 29)
						.addBox(0.3298F, -2.6518F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6702F, 3.6518F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = rarm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(29, 39).addBox(0.0F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6702F, 4.8482F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r5 = rarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(22, 7)
						.addBox(-0.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 5)
						.addBox(-0.5F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-1.0F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3532F, 0.9331F, -1.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r6 = rarm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(22, 9)
						.addBox(-1.5F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 18)
						.addBox(-2.5F, -4.5F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1702F, 3.3482F, 0.0F, 0.0F, 0.0F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		lleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.larm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}