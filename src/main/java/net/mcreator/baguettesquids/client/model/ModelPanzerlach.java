package net.mcreator.baguettesquids.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelPanzerlach<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("baguettesquids", "model_panzerlach"),
			"main");
	public final ModelPart LFleg;
	public final ModelPart RFleg;
	public final ModelPart LHleg;
	public final ModelPart RHleg;
	public final ModelPart bb_main;

	public ModelPanzerlach(ModelPart root) {
		this.LFleg = root.getChild("LFleg");
		this.RFleg = root.getChild("RFleg");
		this.LHleg = root.getChild("LHleg");
		this.RHleg = root.getChild("RHleg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LFleg = partdefinition.addOrReplaceChild("LFleg",
				CubeListBuilder.create().texOffs(18, 34).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 18.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RFleg = partdefinition.addOrReplaceChild("RFleg",
				CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 18.0F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition LHleg = partdefinition.addOrReplaceChild("LHleg",
				CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-1.0F, 7.0F, -4.0F, 2.0F, 0.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 17.0F, 11.0F, -0.3491F, -0.4363F, 0.0F));
		PartDefinition RHleg = partdefinition.addOrReplaceChild("RHleg",
				CubeListBuilder.create().texOffs(32, 34).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 0).addBox(-1.0F, 7.0F, -4.0F, 2.0F, 0.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 17.0F, 11.0F, 0.3054F, 0.4363F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -11.0F, -5.0F, 5.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-2.0F, -11.0F, -11.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -10.0F, 15.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(0.5F, -12.0F, 13.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Lowerjaw_r1 = bb_main.addOrReplaceChild("Lowerjaw_r1",
				CubeListBuilder.create().texOffs(22, 26).addBox(-2.0F, 0.0F, -6.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -5.0F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		LFleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RFleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LHleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RHleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LHleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LFleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RHleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RFleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
