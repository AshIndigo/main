package com.alloycraft.exxo.render;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.alloycraft.exxo.models.ModelProjectX;

public class ProjectXRender extends BaseRender {

	ModelProjectX projectxModel;

	public ProjectXRender() {
		projectxModel = new ModelProjectX();
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
		case EQUIPPED:
			GL11.glPushMatrix();
			scale = 0.9F;
			GL11.glScalef(scale, scale, scale);
			if (((Entity) data[1]).worldObj.isDaytime()) {
				mc.renderEngine.bindTexture(new ResourceLocation(
						"rpginventorymod:weapons/projectx.png"));
			} else {
				mc.renderEngine.bindTexture(new ResourceLocation(
						"rpginventorymod:weapons/projectxNight.png"));
			}
			GL11.glRotatef(-150F, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(-100F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(160F, 0.0f, 0.0f, 1.0f);
			GL11.glTranslatef(0.2F, -0.2F, -0.45F);
			projectxModel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
					0.0625F);
			GL11.glPopMatrix();
			break;

		case EQUIPPED_FIRST_PERSON:
			GL11.glPushMatrix();
			float scale = 0.6F;
			GL11.glScalef(scale, scale, scale);
			if (((Entity) data[1] != null)
					&& ((Entity) data[1]).worldObj.isDaytime()) {
				mc.renderEngine.bindTexture(new ResourceLocation(
						"rpginventorymod:weapons/projectx.png"));
			} else {
				mc.renderEngine.bindTexture(new ResourceLocation(
						"rpginventorymod:weapons/projectxNight.png"));
			}
			GL11.glRotatef(180F, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(0F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(-70F, 0.0f, 0.0f, 1.0f);
			GL11.glTranslatef(0.6F, 0.8F, 0.2F);
			projectxModel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
					0.0625F);
			GL11.glPopMatrix();
			break;

		case ENTITY:
			GL11.glPushMatrix();
			scale = 1F;
			GL11.glScalef(scale, scale, scale);
			if (((Entity) data[1]).worldObj.isDaytime()) {
				mc.renderEngine.bindTexture(new ResourceLocation(
						"rpginventorymod:weapons/projectx.png"));
			} else {
				mc.renderEngine.bindTexture(new ResourceLocation(
						"rpginventorymod:weapons/projectxNight.png"));
			}

			GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(0F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(0F, 0.0f, 0.0f, 1.0f);
			GL11.glTranslatef(0F, 0F, 0F);
			projectxModel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
					0.0625F);
			GL11.glPopMatrix();
			break;

		case INVENTORY:
			GL11.glPushMatrix();
			mc.renderEngine.bindTexture(new ResourceLocation(
					"rpginventorymod:weapons/projectx.png"));
			scale = 0.8F;
			GL11.glScalef(scale, scale, scale);
			GL11.glRotatef(160F, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(90F, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(0F, 0.0f, 1.0f, 1.0f);

			GL11.glTranslatef(-0.5F, 0.4F, -0.1F);
			projectxModel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			break;

		default:
			break;
		}
	}

}