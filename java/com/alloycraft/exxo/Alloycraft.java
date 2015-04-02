package com.alloycraft.exxo;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

import com.alloycraft.exxo.entities.EntityPureBoss;
import com.alloycraft.exxo.items.ItemPureBossSpawner;
import com.alloycraft.exxo.lib.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION, name = Refrences.NAME)
public class Alloycraft
{
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static CreativeTabs taballoycrafttools = new CreativeTabsAlloycraftTools("AlloycraftTools");
    public static CreativeTabs taballoycraftarmor = new CreativeTabsAlloycraftArmor("AlloycraftArmor");
    public static boolean baublesenabled;
    public static boolean thaumcraftenabled;
    public static boolean projectx3dmodelenabled;
    
    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Much Much Nicer
    	//Steel or titanium slow you down when alloyed they dont
    	//Titanium Pearl infinite use ender pearl
    	//Titanium is found in the end.
    	//Add Pure shard boss
    	//Need to add Earth Gem, End Gem, and pure shard.
    	Item purebossegg = new ItemPureBossSpawner("PureBoss", 0xE18519, 0x000000).setUnlocalizedName("spawn_egg_pureboss".toLowerCase()).setTextureName("alloycraft:pureboss");
    	GameRegistry.registerItem(purebossegg, "spawnEgg");
    	EntityRegistry.registerModEntity(EntityPureBoss.class, "PureBoss", 1, instance, 5, 5, false);
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	thaumcraftenabled = config.getBoolean("Thaumraft Addon Enabled?", "Addons", true, "Is the Thaumcraft 4 Addon Enabled?");
    	baublesenabled = config.getBoolean("Baubles Enabled?", "Addons", true, "Are Baubles Enabled?");
    	projectx3dmodelenabled = config.getBoolean("Project X's 3d Model Enabled?", "Render", true, "Is Project X's 3d Model Enabled?"); 
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
    	
    }
    public void init(FMLInitializationEvent event){
    	
    }
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
    	
