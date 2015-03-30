package com.alloycraft.exxo;

import net.minecraft.creativetab.*;

import com.alloycraft.exxo.lib.*;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.Name;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION, name = Refrences.NAME)
public class Alloycraft
{
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static CreativeTabs taballoycrafttools = new CreativeTabsAlloycraftTools("AlloycraftTools");
    public static CreativeTabs taballoycraftarmor = new CreativeTabsAlloycraftArmor("AlloycraftArmor");
    
    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Much Much Nicer
    	AlloycraftBlocks.registerBlocks();
    	AlloycraftItems.registerItems();
    	Registry.registerItems();
    	Registry.registerBlocks();
       	Registry.registerHooks();
       	Registry.registerAchievements();
       	Recipes.registerRecipes();
    	Registry.registerOreDictionary();
    	ApiRegistry.registerMods();
    	proxy.registerItemRenderers();
    	System.out.println("Alloycraft Loaded");
    	
    }
    public void init(FMLInitializationEvent event){
    	
    }
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
    	
