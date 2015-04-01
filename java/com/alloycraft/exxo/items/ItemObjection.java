package com.alloycraft.exxo.items;

import java.util.List;

import com.alloycraft.exxo.lib.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemObjection extends Item {
	
	public ItemObjection()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "Objection");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "Objection");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
		
		world.playSoundAtEntity(player, "alloycraft:objection", 1.0F, 1.0F);
	    return itemStack;
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("Objection!");

    }
}

