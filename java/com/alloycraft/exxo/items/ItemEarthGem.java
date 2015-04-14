package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEarthGem extends Item {
	
	public ItemEarthGem()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "Earth");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "Earth");
	}
}

