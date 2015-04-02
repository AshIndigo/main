package com.alloycraft.exxo.entities;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityPureBoss extends EntityCreature{

	public EntityPureBoss(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.4F);
		getNavigator().setAvoidsWater(true);
		   clearAITasks(); // clear any tasks assigned in super classes
		   tasks.addTask(0, new EntityAISwimming(this));
		   // the leap and the collide together form an actual attack
		   tasks.addTask(2, new EntityAILeapAtTarget(this, 0.4F));
		   tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		   tasks.addTask(10, new EntityAILookIdle(this));      
		}

		protected void clearAITasks()
		{
		   tasks.taskEntries.clear();
		   targetTasks.taskEntries.clear();
		}
		
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}
}