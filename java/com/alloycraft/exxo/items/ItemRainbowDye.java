package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRainbowDye extends Item {
	
	public ItemRainbowDye()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "RainbowDye");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "RainbowDye");
	}
}

