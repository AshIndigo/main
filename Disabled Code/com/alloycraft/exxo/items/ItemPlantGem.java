package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPlantGem extends Item {
	
	public ItemPlantGem()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "PlantGem");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "PlantGem");
	}
}

