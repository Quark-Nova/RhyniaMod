// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart tail;
	private final ModelPart Leftleg;
	private final ModelPart Rightleg;
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.tail = root.getChild("tail");
		this.Leftleg = root.getChild("Leftleg");
		this.Rightleg = root.getChild("Rightleg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 12).addBox(
				-2.5F, -13.0F, 2.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 3.0F));

		PartDefinition base_r1 = tail
				.addOrReplaceChild("base_r1",
						CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -3.0F, 3.0F, 4.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, -3.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(12, 24)
				.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 19.5F, -0.5F));

		PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create().texOffs(0, 20)
				.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 19.5F, -0.5F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.0F, -7.0F, -4.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head_r1 = bb_main
				.addOrReplaceChild("Head_r1",
						CubeListBuilder.create().texOffs(19, 0).addBox(-2.0F, -7.0F, -6.0F, 4.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}