package com.alloycraft.exxo.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.ISpecialArmor;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

public class ItemOverridenIronIngot extends Item {
	
	public static World world;
	public static NBTTagCompound p_i2157_1_;
	//public boolean isRaining = p_i2157_1_.getBoolean("raining");

	public ItemOverridenIronIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "OverridenIronIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "OverridenIroningot");
	}
	
	}

