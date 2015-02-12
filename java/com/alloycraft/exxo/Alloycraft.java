package com.alloycraft.exxo;

import com.alloycraft.exxo.blocks.*;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemGoldIronIngot;
import com.alloycraft.exxo.items.ItemHellishIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.*;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
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
    public static Block hellishblock;
    public static Block goldironblock;
    public static Block whatthehellblock;
    public static Block alloysmelteridle;
    public static Block alloysmelteractive;
    public static Block yttriumore;
    public static Item cookieingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static final int guiIDAlloyFurnace = 5;
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    
    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Registry
    	cookieblock = new BlockCookie();
    	whatthehellblock = new BlockWhatTheHell();
    	goldironblock = new BlockGoldIron();
    	hellishblock = new BlockHellish();
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	yttriumore = new BlockYttriumOre();
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	yttriumingot = new ItemYttriumIngot();
    	hellishingot = new ItemHellishIngot();
    	goldironingot = new ItemGoldIronIngot();
    	GameRegistry.registerBlock(cookieblock, "BlockCookie");
    	GameRegistry.registerBlock(hellishblock, "BlockHellish");
    	GameRegistry.registerBlock(yttriumore, "YttriumOre");
    	GameRegistry.registerBlock(whatthehellblock, "BlockWHATTHEHELL");
    	GameRegistry.registerBlock(goldironblock, "BlockGoldIron");
    	GameRegistry.registerBlock(alloysmelteridle, "AlloyFurnaceIdle");
    	GameRegistry.registerBlock(alloysmelteractive, "AlloyFurnaceActive");
    	GameRegistry.registerItem(cookieingot, "ItemCookieIngot");
    	GameRegistry.registerItem(hellishingot, "ItemHellishIngot");
    	GameRegistry.registerItem(yttriumingot, "ItemYttriumIngot");
    	GameRegistry.registerItem(goldironingot, "ItemGoldIronIngot");
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");

    	
    	//Recipes
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.cookieblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    });
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.hellishingot, 9), new Object[]{
    	new ItemStack(Alloycraft.hellishblock, 1)
    			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.goldironingot, 9), new Object[]{
        	new ItemStack(Alloycraft.goldironblock, 1)
        			});
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.cookieblock, 1), new ItemStack(Alloycraft.cookieingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.yttriumore, 1), new ItemStack(Alloycraft.yttriumingot, 1), 0.1F);
    }
    public void init(FMLInitializationEvent event){
		
        
}
}
