package com.alloycraft.exxo.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.entities.EntityTitaniumPearl;
import com.alloycraft.exxo.lib.Refrences;

public class ItemTitaniumPearl extends ItemEnderPearl {
	
	public ItemTitaniumPearl()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "TitaniumPearl");
		setCreativeTab(Alloycraft.taballoycrafttools);
		setTextureName(Refrences.MODID + ":" + "TitaniumPearl");
		setMaxStackSize(1);
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
				  world.playSoundAtEntity(entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				  if (!world.isRemote)
			      {
			          world.spawnEntityInWorld(new EntityTitaniumPearl(world, entityplayer));
			      }
		            
		      return itemstack;
		  }
}