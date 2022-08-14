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
public class ModelRammer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("baguettesquids", "model_rammer"), "main");
	public final ModelPart Leftleg;
	public final ModelPart Rightleg;
	public final ModelPart bb_main;

	public ModelRammer(ModelPart root) {
		this.Leftleg = root.getChild("Leftleg");
		this.Rightleg = root.getChild("Rightleg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg",
				CubeListBuilder.create().texOffs(39, 43).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 14.0F, 0.5F));
		PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg",
				CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 14.0F, 0.5F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -16.0F, -9.0F, 8.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
						.addBox(-3.0F, -16.0F, -19.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-4.0F, -16.0F, 6.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(0.0F, -17.0F, 17.0F, 0.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(46, 13)
						.addBox(-3.0F, -15.0F, -13.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -18.0F, -19.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -15.0F, 13.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -15.0F, 13.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, -15.0F, 13.0F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
