package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBronzeIngot extends Item {
	
	public ItemBronzeIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "BronzeIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "Bronzeingot");
	}
}

