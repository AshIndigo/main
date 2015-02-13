package com.alloycraft.exxo.entities;

import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityProjectXBolt extends EntityThrowable {
	private double explosionRadius = 1.5F;
	
	public EntityProjectXBolt(World par1World) {
		super(par1World);
	}
	
	public EntityProjectXBolt(World par1World, double arg1Double, double arg2Double, double arg3Double) {
		super(par1World, arg1Double, arg2Double, arg3Double);
	}
	
	public EntityProjectXBolt(World par1World, EntityLivingBase arg1EntityLivingBase) {
		super(par1World, arg1EntityLivingBase);
	}

	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
		this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		this.setDead();
	}
}