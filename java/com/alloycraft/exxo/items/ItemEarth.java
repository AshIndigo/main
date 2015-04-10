package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEarth extends Item {
	
	public ItemEarth()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "Earth");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "Earth");
	}
}

