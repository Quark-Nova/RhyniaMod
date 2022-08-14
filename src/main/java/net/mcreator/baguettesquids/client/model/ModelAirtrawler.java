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
public class ModelAirtrawler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("baguettesquids", "model_airtrawler"),
			"main");
	public final ModelPart bb_main;

	public ModelAirtrawler(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -8.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(0.0F, -1.005F, -7.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-5.0F, -1.005F, -7.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(0.0F, -1.005F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -1.005F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -1.0F, -8.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition GreatHindwing_r1 = bb_main.addOrReplaceChild("GreatHindwing_r1",
				CubeListBuilder.create().texOffs(15, 0).addBox(-9.0F, 0.99F, -1.0F, 9.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.0F, 0.1745F, 0.0F));
		PartDefinition GreatHindwing_r2 = bb_main.addOrReplaceChild("GreatHindwing_r2",
				CubeListBuilder.create().texOffs(15, 3).addBox(0.0F, 0.99F, -1.0F, 9.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition Post_Wing_r1 = bb_main.addOrReplaceChild("Post_Wing_r1",
				CubeListBuilder.create().texOffs(0, 17).addBox(-8.0F, 0.995F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition Post_Wing_r2 = bb_main.addOrReplaceChild("Post_Wing_r2",
				CubeListBuilder.create().texOffs(17, 10).addBox(0.0F, 0.995F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition GreatWing_r1 = bb_main.addOrReplaceChild("GreatWing_r1",
				CubeListBuilder.create().texOffs(16, 6).addBox(-9.0F, 0.99F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.0F, 0.1745F, 0.0F));
		PartDefinition GreatWing_r2 = bb_main.addOrReplaceChild("GreatWing_r2",
				CubeListBuilder.create().texOffs(16, 8).addBox(0.0F, 0.99F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition Tailrod_r1 = bb_main.addOrReplaceChild("Tailrod_r1",
				CubeListBuilder.create().texOffs(6, 5).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, 7.5F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Tailrod_r2 = bb_main.addOrReplaceChild("Tailrod_r2",
				CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, 7.5F, -0.3491F, 0.5236F, 0.0F));
		PartDefinition Tailrod_r3 = bb_main.addOrReplaceChild("Tailrod_r3",
				CubeListBuilder.create().texOffs(6, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, 7.5F, -0.3491F, -0.5236F, 0.0F));
		PartDefinition Head_r1 = bb_main.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(9, 2).addBox(0.0F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.5F, -8.0F, 0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
