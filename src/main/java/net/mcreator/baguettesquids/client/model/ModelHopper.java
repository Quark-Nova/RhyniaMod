package net.mcreator.baguettesquids.client.model;

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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHopper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("baguettesquids", "model_hopper"), "main");
	public final ModelPart Leg;
	public final ModelPart Tentacles;
	public final ModelPart bb_main;

	public ModelHopper(ModelPart root) {
		this.Leg = root.getChild("Leg");
		this.Tentacles = root.getChild("Tentacles");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Leg = partdefinition.addOrReplaceChild("Leg",
				CubeListBuilder.create().texOffs(14, 11).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 6)
						.addBox(-2.0F, -0.01F, -2.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Tentacles = partdefinition.addOrReplaceChild("Tentacles",
				CubeListBuilder.create().texOffs(20, 4).addBox(-2.0F, -6.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 4)
						.addBox(-2.0F, -5.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-1.01F, -6.0F, -3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-1.0F, -7.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(15, 0)
						.addBox(-1.0F, -15.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-1.0F, -15.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 11)
						.addBox(-2.0F, -8.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-0.5F, -6.0F, -5.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 11)
						.addBox(-2.0F, -8.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tentacles.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
