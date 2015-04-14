package com.alloycraft.exxo;

import com.alloycraft.exxo.lib.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AlloycraftItem extends Item {
	
	public AlloycraftItem(String unlocalizedname, String texturename)
	{
		setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + texturename);
	}
}

