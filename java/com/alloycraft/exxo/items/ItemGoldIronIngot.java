package com.alloycraft.exxo.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thaumcraft.api.IScribeTools;

import com.alloycraft.exxo.lib.Refrences;

public class ItemGoldIronIngot extends Item {
	
	public ItemGoldIronIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "GoldIronIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "goldironingot");
	}
}

