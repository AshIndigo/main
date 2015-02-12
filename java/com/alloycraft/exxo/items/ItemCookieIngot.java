package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCookieIngot extends ItemFood {
	
	public ItemCookieIngot(int heal, float saturation, boolean wolfMeat)
	{
		super(heal, saturation, wolfMeat);
		setUnlocalizedName(Refrences.MODID + "_" + "CookieIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "CookieIngot");
	}
}

