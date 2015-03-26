package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPureShard extends Item {
	
	public ItemPureShard()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "PureShard");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "PureShard");
	}
}

