package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {
	
	public ItemCopperIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "CopperIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "copperingot");
	}
}

