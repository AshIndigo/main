package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMetalGem extends Item {
	
	public ItemMetalGem()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "MetalGem");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "MetalGem");
	}
}

