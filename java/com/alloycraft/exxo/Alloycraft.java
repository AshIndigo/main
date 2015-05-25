package com.alloycraft.exxo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.server.command.ForgeCommand;

import com.alloycraft.exxo.addons.items.test;
import com.alloycraft.exxo.items.ItemOverridenIronIngot;
import com.alloycraft.exxo.lib.ApiRegistry;
import com.alloycraft.exxo.lib.CommonProxy;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraft;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraftArmor;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraftTools;
import com.alloycraft.exxo.lib.Recipes;
import com.alloycraft.exxo.lib.Refrences;
import com.alloycraft.exxo.lib.Registry;
import com.ashindigo.api.IndigoApiBlock;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ServerTickEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION, name = Refrences.NAME, guiFactory = "com.alloycraft.exxo.lib.GuiFactory")
public class Alloycraft
{
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static CreativeTabs taballoycrafttools = new CreativeTabsAlloycraftTools("AlloycraftTools");
    public static CreativeTabs taballoycraftarmor = new CreativeTabsAlloycraftArmor("AlloycraftArmor");
    public static boolean baublesenabled;
    public static boolean thaumcraftenabled;
    public static boolean projectx3dmodelenabled;
    public static boolean refrenceitemsenabled;
    public static boolean ic2addonenabled;
    public static Configuration config;
    String months[] = {
    	      "Jan", "Feb", "Mar", "Apr",
    	      "May", "Jun", "Jul", "Aug",
    	      "Sep", "Oct", "Nov", "Dec"};
    
    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Much Much Nicer
    	//Add Pure shard boss AI, Model, and fix bugs
    	//Add End Gem and Recipe.
    	//Patina is extremly bad for tools if they get patina on them put it gived a durablility boost
    	//Limonite is an ore you can with wood and is as good as iron but is destroyed easily.
    	//Bug Fixes and finish crystal system.
    	//TC4 Addon: Add's new wand cores and wand caps that give certain abilties to the wand.
    	//Friday See Grace During Lunch
    	config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	thaumcraftenabled = config.getBoolean("Thaumraft Addon Enabled?", "general", true, "Is the Thaumcraft 4 Addon Enabled?");
    	baublesenabled = config.getBoolean("Baubles Enabled?", "general", true, "Are Baubles Enabled?");
    	projectx3dmodelenabled = config.getBoolean("Project X's 3d Model Enabled?", "general", true, "Is Project X's 3d Model Enabled?");
    	refrenceitemsenabled = config.getBoolean("Are Easter Eggs Enabled", "general", true, "Are the Easter Egg Items Enabled?"); 
    	ic2addonenabled = config.getBoolean("IC2 Addon Enabled?", "general", true, "Is the Industrial Craft 2 Addon Enabled?"); 
    	config.save();
    	AlloycraftItems.registerItems();
    	AlloycraftBlocks.registerBlocks();
    	Registry.registerItems();
     	Registry.registerBlocks();
       	Registry.registerHooks();
       	Registry.registerAchievements();
       	Recipes.registerRecipes();
    	Registry.registerOreDictionary();
    	ApiRegistry.registerMods();
    	Registry.RemoveRecipe(new ItemStack(Items.iron_ingot));
    	proxy.registerItemRenderers();
    	GregorianCalendar gcalendar = new GregorianCalendar();
    	if (months[gcalendar.get(Calendar.MONTH)] == "April") {
    		
    		System.out.println("April Fools!!!");
    		System.exit(0);
    		
    	}
    	
    	System.out.println("Alloycraft Loaded");
    	
    }
    public void init(FMLInitializationEvent event){
    
    }
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
    	
