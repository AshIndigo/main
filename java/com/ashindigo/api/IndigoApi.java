package com.ashindigo.api;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

//@Mod(modid = "indigoapi", version = "1.1", name = "IndigoApi")
public class IndigoApi {
	
	public static boolean init;
	
	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event){
		 
		 System.out.print("Indigo Api Loading");
	 }
	 
	 @EventHandler
	 public void init(FMLInitializationEvent event){
		 
	    	
	    }

}
