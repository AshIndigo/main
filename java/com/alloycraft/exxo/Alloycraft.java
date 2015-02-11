package com.alloycraft.exxo;

import com.alloycraft.exxo.blocks.*;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.*;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION)
public class Alloycraft
{
	//Items and Blocks
    public static Block cookieblock;
    public static Block alloysmelter;
    public static Block yttriumore;
    public static Item cookieingot;
    public static Item yttriumingot;
    
    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Registry
    	cookieblock = new BlockCookie();
    	alloysmelter = new AlloySmelter();
    	yttriumore = new BlockYttriumOre();
    	cookieingot = new ItemCookieIngot();
    	yttriumingot = new ItemYttriumIngot();
    	GameRegistry.registerBlock(cookieblock, "BlockCookie");
    	GameRegistry.registerBlock(alloysmelter, "AlloyFurnace");
    	GameRegistry.registerBlock(yttriumore, "YttriumOre");
    	GameRegistry.registerItem(cookieingot, "ItemCookieIngot");
    	GameRegistry.registerItem(yttriumingot, "ItemYttriumIngot");
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	
    	//Recipes
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.cookieblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    });
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.cookieblock, 1), new ItemStack(Alloycraft.cookieingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.yttriumore, 1), new ItemStack(Alloycraft.yttriumingot, 1), 0.1F);
    }
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
        
}
}
