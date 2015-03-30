package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {
	
	public ItemSteelIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "SteelIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "SteelIngot");
	}
}

