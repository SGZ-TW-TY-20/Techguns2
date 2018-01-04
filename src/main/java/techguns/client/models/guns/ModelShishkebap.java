package techguns.client.models.guns;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelShishkebap extends ModelMultipart {
    public ModelRenderer igniter;
    public ModelRenderer valve;
    public ModelRenderer Grip1;
    public ModelRenderer Grip2;
    public ModelRenderer Grip3;
    public ModelRenderer Handle;
    public ModelRenderer guard;
    public ModelRenderer blade0;
    public ModelRenderer blade2;
    public ModelRenderer blade1;
    public ModelRenderer bladetop0;
    public ModelRenderer bladetop2;
    public ModelRenderer bladetop1;
    public ModelRenderer bladetop3;
    public ModelRenderer tank0;
    public ModelRenderer tank1;
    public ModelRenderer tube0;
    public ModelRenderer tube1;
    public ModelRenderer tube2;
    public ModelRenderer tube3;
    public ModelRenderer tube4;
    public ModelRenderer tube;

    public ModelShishkebap() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Grip3 = new ModelRenderer(this, 18, 34);
        this.Grip3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Grip3.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 5, 0.0F);
        this.igniter = new ModelRenderer(this, 15, 7);
        this.igniter.setRotationPoint(0.0F, -5.3F, -2.0F);
        this.igniter.addBox(-0.5F, -5.3F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotation(igniter, 0.17453292519943295F, 0.7853981633974483F, 0.12217304763960307F);
        this.Grip2 = new ModelRenderer(this, 0, 14);
        this.Grip2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Grip2.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotation(Grip2, 0.0F, 0.7853981633974483F, 0.0F);
        this.bladetop1 = new ModelRenderer(this, 52, 15);
        this.bladetop1.setRotationPoint(0.0F, -45.5F, 0.6F);
        this.bladetop1.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotation(bladetop1, -0.3141592653589793F, 0.0F, 0.0F);
        this.valve = new ModelRenderer(this, 2, 27);
        this.valve.setRotationPoint(4.0F, -9.0F, 4.0F);
        this.valve.addBox(-1.5F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotation(valve, 0.7853981633974483F, 0.0F, 0.0F);
        this.bladetop2 = new ModelRenderer(this, 39, 22);
        this.bladetop2.setRotationPoint(0.0F, -39.7F, -1.4F);
        this.bladetop2.addBox(-0.5F, -7.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotation(bladetop2, -0.6632251157578453F, 0.7853981633974483F, -0.5061454830783556F);
        this.tank1 = new ModelRenderer(this, 39, 15);
        this.tank1.setRotationPoint(0.0F, -13.0F, 4.0F);
        this.tank1.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotation(tank1, 0.0F, 0.7853981633974483F, 0.0F);
        this.guard = new ModelRenderer(this, 0, 35);
        this.guard.setRotationPoint(0.0F, -4.0F, 1.0F);
        this.guard.addBox(-2.5F, 0.0F, -5.0F, 5, 1, 7, 0.0F);
        this.tank0 = new ModelRenderer(this, 39, 0);
        this.tank0.setRotationPoint(0.0F, -10.0F, 4.0F);
        this.tank0.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotation(tank0, 0.0F, 0.7853981633974483F, 0.0F);
        this.tube = new ModelRenderer(this, 20, 0);
        this.tube.setRotationPoint(0.0F, -39.7F, 4.0F);
        this.tube.addBox(-0.5F, 0.0F, -0.5F, 1, 27, 1, 0.0F);
        this.setRotation(tube, 0.0F, 0.7853981633974483F, 0.0F);
        this.tube1 = new ModelRenderer(this, 11, 27);
        this.tube1.setRotationPoint(0.0F, -21.0F, -0.3F);
        this.tube1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube1, 0.0F, 0.0F, 0.7853981633974483F);
        this.bladetop0 = new ModelRenderer(this, 44, 22);
        this.bladetop0.setRotationPoint(0.0F, -46.0F, 0.6F);
        this.bladetop0.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.bladetop3 = new ModelRenderer(this, 49, 23);
        this.bladetop3.setRotationPoint(0.0F, -42.5F, -0.4F);
        this.bladetop3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.tube0 = new ModelRenderer(this, 11, 27);
        this.tube0.setRotationPoint(0.0F, -15.0F, -0.3F);
        this.tube0.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube0, 0.0F, 0.0F, 0.7853981633974483F);
        this.Grip1 = new ModelRenderer(this, 0, 0);
        this.Grip1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Grip1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotation(Grip1, 0.0F, 0.7853981633974483F, 0.0F);
        this.tube3 = new ModelRenderer(this, 11, 27);
        this.tube3.setRotationPoint(0.0F, -33.0F, -0.3F);
        this.tube3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube3, 0.0F, 0.0F, 0.7853981633974483F);
        this.blade2 = new ModelRenderer(this, 34, 0);
        this.blade2.setRotationPoint(0.0F, -40.0F, -1.4F);
        this.blade2.addBox(-0.5F, 0.0F, -0.5F, 1, 30, 1, 0.0F);
        this.setRotation(blade2, 0.0F, 0.7853981633974483F, 0.0F);
        this.Handle = new ModelRenderer(this, 0, 21);
        this.Handle.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.Handle.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotation(Handle, -0.2181661564992912F, 0.0F, 0.0F);
        this.blade1 = new ModelRenderer(this, 25, 0);
        this.blade1.setRotationPoint(0.0F, -40.0F, -1.4F);
        this.blade1.addBox(-0.5F, 0.0F, 0.0F, 1, 30, 3, 0.0F);
        this.blade0 = new ModelRenderer(this, 7, 16);
        this.blade0.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.blade0.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F);
        this.tube2 = new ModelRenderer(this, 11, 27);
        this.tube2.setRotationPoint(0.0F, -27.0F, -0.3F);
        this.tube2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube2, 0.0F, 0.0F, 0.7853981633974483F);
        this.tube4 = new ModelRenderer(this, 11, 27);
        this.tube4.setRotationPoint(0.0F, -39.0F, -0.3F);
        this.tube4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube4, 0.0F, 0.0F, 0.7853981633974483F);
    }

    @Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float f5, int ammoLeft, float reloadProgress, TransformType transformType, int part,
			float fireProgress, float chargeProgress) {
        this.Grip3.render(f5);
        this.igniter.render(f5);
        this.Grip2.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bladetop1.offsetX, this.bladetop1.offsetY, this.bladetop1.offsetZ);
        GlStateManager.translate(this.bladetop1.rotationPointX * f5, this.bladetop1.rotationPointY * f5, this.bladetop1.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 1.0D, 1.0D);
        GlStateManager.translate(-this.bladetop1.offsetX, -this.bladetop1.offsetY, -this.bladetop1.offsetZ);
        GlStateManager.translate(-this.bladetop1.rotationPointX * f5, -this.bladetop1.rotationPointY * f5, -this.bladetop1.rotationPointZ * f5);
        this.bladetop1.render(f5);
        GlStateManager.popMatrix();
        this.valve.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bladetop2.offsetX, this.bladetop2.offsetY, this.bladetop2.offsetZ);
        GlStateManager.translate(this.bladetop2.rotationPointX * f5, this.bladetop2.rotationPointY * f5, this.bladetop2.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 0.7D);
        GlStateManager.translate(-this.bladetop2.offsetX, -this.bladetop2.offsetY, -this.bladetop2.offsetZ);
        GlStateManager.translate(-this.bladetop2.rotationPointX * f5, -this.bladetop2.rotationPointY * f5, -this.bladetop2.rotationPointZ * f5);
        this.bladetop2.render(f5);
        GlStateManager.popMatrix();
        this.tank1.render(f5);
        this.guard.render(f5);
        this.tank0.render(f5);
        this.tube.render(f5);
        this.tube1.render(f5);
        this.bladetop0.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bladetop3.offsetX, this.bladetop3.offsetY, this.bladetop3.offsetZ);
        GlStateManager.translate(this.bladetop3.rotationPointX * f5, this.bladetop3.rotationPointY * f5, this.bladetop3.rotationPointZ * f5);
        GlStateManager.scale(0.95D, 1.0D, 1.0D);
        GlStateManager.translate(-this.bladetop3.offsetX, -this.bladetop3.offsetY, -this.bladetop3.offsetZ);
        GlStateManager.translate(-this.bladetop3.rotationPointX * f5, -this.bladetop3.rotationPointY * f5, -this.bladetop3.rotationPointZ * f5);
        this.bladetop3.render(f5);
        GlStateManager.popMatrix();
        this.tube0.render(f5);
        this.Grip1.render(f5);
        this.tube3.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.blade2.offsetX, this.blade2.offsetY, this.blade2.offsetZ);
        GlStateManager.translate(this.blade2.rotationPointX * f5, this.blade2.rotationPointY * f5, this.blade2.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 0.7D);
        GlStateManager.translate(-this.blade2.offsetX, -this.blade2.offsetY, -this.blade2.offsetZ);
        GlStateManager.translate(-this.blade2.rotationPointX * f5, -this.blade2.rotationPointY * f5, -this.blade2.rotationPointZ * f5);
        this.blade2.render(f5);
        GlStateManager.popMatrix();
        this.Handle.render(f5);
        this.blade1.render(f5);
        this.blade0.render(f5);
        this.tube2.render(f5);
        this.tube4.render(f5);
    }
}