package com.alloycraft.exxo.items;

import java.sql.Date;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import cpw.mods.fml.common.FMLLog;

public class ItemOverridenIronIngot extends Item {
	
	public static World world;
	public static WorldServer worldserver;
	public static Launch launch;
	public static EntityPlayer entityplayer;
	public static WorldEvent.Load worldeventload;
	public static Minecraft minecraft = Minecraft.getMinecraft();
	Boolean hax = true;
	
	public ItemOverridenIronIngot()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "OverridenIronIngot");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + "OverridenIroningot");
		}
	///*/
		public static void waterDetection() {
		if(minecraft.isSingleplayer() == true) {
		 if(entityplayer.isInWater() == true) {
			//this.world.getWorldInfo().isRaining() == true
			//IntegratedServer.getServer().
			System.out.println("Hax3");
		}
		}
		
		}
		//*/
	}
//if(minecraft.isSingleplayer() == true) {


