package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPureCrystal extends Item {
	
	public ItemPureCrystal()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "PureCrystal");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "PureCrystal");
	}
}

