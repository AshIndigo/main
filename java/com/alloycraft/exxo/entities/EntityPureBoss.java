package com.alloycraft.exxo.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.alloycraft.exxo.AlloycraftItems;

public class EntityPureBoss extends EntityMob{

	public EntityPureBoss(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.4F);
		getNavigator().setAvoidsWater(true);
		   clearAITasks(); // clear any tasks assigned in super classes
		   tasks.addTask(0, new EntityAISwimming(this));
		   // the leap and the collide together form an actual attack
		   tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 5.0F, true));
		   tasks.addTask(4, new EntityAILookIdle(this));
	       this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	       this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		}

		protected void clearAITasks()
		{
		   tasks.taskEntries.clear();
		   targetTasks.taskEntries.clear();
		}
		
	public boolean isAIEnabled(){
		return true;
	}
	
	 protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
	    {
	        int j = this.rand.nextInt(3 + p_70628_2_) + 1;

	        for (int k = 0; k < j; ++k)
	        {
	            this.entityDropItem(new ItemStack(AlloycraftItems.pureshard, 2, 0), 0.0F);
	        }
	    }
	 
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0F);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0F);
	}
}