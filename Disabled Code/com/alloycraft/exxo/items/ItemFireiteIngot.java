package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFireiteIngot extends Item {
	
	public ItemFireiteIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "FireiteIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "Fireiteingot");
	}
}

