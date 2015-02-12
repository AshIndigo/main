package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGoldIronIngot extends Item {
	
	public ItemGoldIronIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "GoldIronIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "goldironingot");
	}
}

