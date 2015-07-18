package com.alloycraft.exxo.items;

import java.util.List;

import com.alloycraft.exxo.lib.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemCookieIngot extends ItemFood {
	
	public ItemCookieIngot(int heal, float saturation, boolean wolfMeat)
	{
		super(heal, saturation, wolfMeat);
		setUnlocalizedName(Refrences.MODID + "_" + "CookieIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "CookieIngot");
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("You can eat it!");

    }
}

