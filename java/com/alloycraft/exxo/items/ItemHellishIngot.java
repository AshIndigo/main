package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHellishIngot extends Item {
	
	public ItemHellishIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "HellishIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "hellishingot");
	}
}

