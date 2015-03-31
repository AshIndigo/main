package com.alloycraft.exxo.items;

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
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		
		par2World.playSoundEffect(20, 70, 20, "alloycraft:takethat", 1, 1);
		return par1ItemStack;
	}
}

