// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBaguettesquid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baguettesquid"), "main");
	private final ModelPart Squid;

	public ModelBaguettesquid(ModelPart root) {
		this.Squid = root.getChild("Squid");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Squid = partdefinition.addOrReplaceChild("Squid",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(1.0F, -5.0F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(0.0F, -4.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
						.addBox(-1.0F, -2.0F, -11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(5, 4)
						.addBox(-2.0F, -4.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -5.0F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -6.0F, -9.0F, 7.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-3.0F, -5.0F, 1.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 22)
						.addBox(-2.0F, -4.0F, 5.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Squid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}