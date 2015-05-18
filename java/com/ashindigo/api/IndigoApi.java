package com.ashindigo.api;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "indigoapi", version = "1.0", name = "IndigoApi")
public class IndigoApi {
	
	public static boolean init;
	
	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event){
		 
	 }
	 
	 public void init(FMLInitializationEvent event){
		 
		 init = true;
	    	
	    }

}
