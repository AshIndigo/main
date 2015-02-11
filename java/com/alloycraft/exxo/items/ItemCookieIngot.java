package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCookieIngot extends Item {
	
	public ItemCookieIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "CookieIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "CookieIngot");
	}
}

