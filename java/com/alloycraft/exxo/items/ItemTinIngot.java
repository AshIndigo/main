package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item {
	
	public ItemTinIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "Tiningot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "Tiningot");
	}
}

