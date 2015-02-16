package com.alloycraft.exxo.items;

import com.alloycraft.exxo.lib.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemProjectXAmmo extends Item {
	
	public ItemProjectXAmmo()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "ProjectXAmmo");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "ProjectXAmmo");
	}
}

