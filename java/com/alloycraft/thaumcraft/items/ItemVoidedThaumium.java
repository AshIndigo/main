package com.alloycraft.thaumcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.alloycraft.thaumcraft.Refrences;


public class ItemVoidedThaumium extends Item {
	
	public ItemVoidedThaumium()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "VoidedThaumium");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "VoidedThaumium");
	}
}

