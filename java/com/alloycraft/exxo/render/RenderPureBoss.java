package com.alloycraft.exxo.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import com.alloycraft.exxo.entities.EntityPureBoss;
import com.alloycraft.exxo.lib.Refrences;

public class RenderPureBoss extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Refrences.MODID + ":textures/entity/Sapphire.png");
	private static final String __OBFID = "CL_00000984";
	public static EntityPureBoss PureBoss;
	
	public RenderPureBoss(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityPureBoss entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPureBoss)entity);
	}
	
	 @Override
	 protected void preRenderCallback(EntityLivingBase entity, float f)
	 {	 
		//preRenderCallbackPureBoss((EntityPureBoss) entity, f);
		BossStatus.setBossStatus((PureBoss), true);
		
	}

	//private void preRenderCallbackPureBoss(EntityPureBoss entity, float f) {
	 
	 
		
	}

//}