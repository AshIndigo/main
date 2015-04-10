package com.alloycraft.exxo;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

import com.alloycraft.exxo.lib.ApiRegistry;
import com.alloycraft.exxo.lib.CommonProxy;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraft;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraftArmor;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraftTools;
import com.alloycraft.exxo.lib.Recipes;
import com.alloycraft.exxo.lib.Refrences;
import com.alloycraft.exxo.lib.Registry;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION, name = Refrences.NAME)
public class Alloycraft
{
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static CreativeTabs taballoycrafttools = new CreativeTabsAlloycraftTools("AlloycraftTools");
    public static CreativeTabs taballoycraftarmor = new CreativeTabsAlloycraftArmor("AlloycraftArmor");
    public static boolean baublesenabled;
    public static boolean thaumcraftenabled;
    public static boolean projectx3dmodelenabled;
    public static boolean refrenceitemsenabled;
    
    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Much Much Nicer
    	//Steel or titanium slow you down when alloyed they dont slow you down
    	//Add Pure shard boss AI, Model, and fix bugs
    	//Earth Gem Component Crop
    	//Add Earth Gem and End Gem Items and Recipes.
    	//Crystalized Plant's Textures are just for testing.
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	thaumcraftenabled = config.getBoolean("Thaumraft Addon Enabled?", "Addons", true, "Is the Thaumcraft 4 Addon Enabled?");
    	baublesenabled = config.getBoolean("Baubles Enabled?", "Addons", true, "Are Baubles Enabled?");
    	projectx3dmodelenabled = config.getBoolean("Project X's 3d Model Enabled?", "Render", true, "Is Project X's 3d Model Enabled?");
    	refrenceitemsenabled = config.getBoolean("Are Easter Eggs Enabled", "Misc", true, "Are the Easter Egg Items Enabled?"); 
    	config.save();
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
    	FMLLog.info("Hax", "Hax2");
    	
    }
    public void init(FMLInitializationEvent event){
    	
    }
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
    	
