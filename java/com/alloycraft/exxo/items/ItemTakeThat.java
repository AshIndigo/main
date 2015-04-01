package com.alloycraft.exxo.items;

import java.util.List;

import com.alloycraft.exxo.lib.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTakeThat extends Item {
		
	public ItemTakeThat()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "TakeThat");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "TakeThat");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
		
		world.playSoundAtEntity(player, "alloycraft:takethat", 1.0F, 1.0F);
	    return itemStack;
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("Take That!");

    }
}

