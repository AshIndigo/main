package com.alloycraft.exxo.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.entities.EntityProjectXBolt;
import com.alloycraft.exxo.lib.Refrences;

public class ItemProjectX extends Item {

  public ItemProjectX() {
	  	setUnlocalizedName(Refrences.MODID + "_" + "ProjectX");
		setCreativeTab(Alloycraft.taballoycrafttools);
		setTextureName(Refrences.MODID + ":" + "ProjectX");
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
	  if(par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(AlloycraftItems.projectxammo)) {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		  if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityProjectXBolt(par2World, par3EntityPlayer));
	      }
	  }
            
      return par1ItemStack;
  }
}