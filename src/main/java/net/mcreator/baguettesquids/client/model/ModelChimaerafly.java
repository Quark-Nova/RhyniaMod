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
public class ModelChimaerafly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("baguettesquids", "model_chimaerafly"),
			"main");
	public final ModelPart Legs;
	public final ModelPart Tail;
	public final ModelPart Wingpivot;
	public final ModelPart Wingpivot2;
	public final ModelPart bb_main;

	public ModelChimaerafly(ModelPart root) {
		this.Legs = root.getChild("Legs");
		this.Tail = root.getChild("Tail");
		this.Wingpivot = root.getChild("Wingpivot");
		this.Wingpivot2 = root.getChild("Wingpivot2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs",
				CubeListBuilder.create().texOffs(0, 7).addBox(1.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(1.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(1.0F, 0.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, 0.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 7)
						.addBox(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 7)
						.addBox(1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 7)
						.addBox(-2.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 7)
						.addBox(-2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Tail = partdefinition
				.addOrReplaceChild(
						"Tail", CubeListBuilder.create().texOffs(11, 8).addBox(-1.0F, 0.6F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(-0.5F, 0.6F, 3.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-0.5F, 21.4F, 3.0F));
		PartDefinition Wingpivot = partdefinition.addOrReplaceChild("Wingpivot", CubeListBuilder.create(), PartPose.offset(-1.4F, 22.0F, 0.4F));
		PartDefinition Wing_r1 = Wingpivot.addOrReplaceChild("Wing_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.3536F, 0.0F, -0.6804F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition Wingpivot2 = partdefinition.addOrReplaceChild("Wingpivot2", CubeListBuilder.create(), PartPose.offset(0.4F, 22.0F, 0.4F));
		PartDefinition Wing_r2 = Wingpivot2.addOrReplaceChild("Wing_r2",
				CubeListBuilder.create().texOffs(6, 0).addBox(-1.6464F, 0.0F, -0.6804F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main = partdefinition
				.addOrReplaceChild(
						"bb_main", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
								.texOffs(0, 4).addBox(-1.5F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wingpivot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wingpivot2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Wingpivot2.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Wingpivot.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
