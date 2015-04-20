package com.alloycraft.exxo.items;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.event.world.WorldEvent;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

public class ItemOverridenIronIngot extends Item {
	
	public static World world;
	public static WorldServer worldserver;
	public static Launch launch;
	public static EntityPlayer entityplayer;

	public ItemOverridenIronIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "OverridenIronIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "OverridenIroningot");
		}
	{
	/*	
		if() {
		 if(this.world.getWorldInfo().isRaining() == true) {
			
			setTextureName(Refrences.MODID + ":" + "OverridenIroningot");
		}
		
		}
		*/
	}
	}



