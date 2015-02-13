package com.alloycraft.exxo;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

import com.alloycraft.exxo.blocks.AlloySmelter;
import com.alloycraft.exxo.blocks.BlockCookie;
import com.alloycraft.exxo.blocks.BlockGoldIron;
import com.alloycraft.exxo.blocks.BlockHellish;
import com.alloycraft.exxo.blocks.BlockWhatTheHell;
import com.alloycraft.exxo.blocks.BlockYttriumOre;
import com.alloycraft.exxo.entities.EntityProjectXBolt;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemGoldIronAxe;
import com.alloycraft.exxo.items.ItemGoldIronHoe;
import com.alloycraft.exxo.items.ItemGoldIronIngot;
import com.alloycraft.exxo.items.ItemGoldIronPick;
import com.alloycraft.exxo.items.ItemGoldIronSpade;
import com.alloycraft.exxo.items.ItemGoldIronSword;
import com.alloycraft.exxo.items.ItemHellishIngot;
import com.alloycraft.exxo.items.ItemProjectX;
import com.alloycraft.exxo.items.ItemWhatTheHellIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.CommonProxy;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraft;
import com.alloycraft.exxo.lib.EventManager;
import com.alloycraft.exxo.lib.GuiHandler;
import com.alloycraft.exxo.lib.Refrences;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
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
    public static Item whatthehellingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static Item projectx;
    public static Item goldironsword;
    public static Item goldironpick;
    public static Item goldironspade;
    public static Item goldironhoe;
    public static Item goldironaxe;
    //public static Achievement CookieIngot;
    //public static Achievement YttriumIngot;
    public static final int guiIDAlloyFurnace = 5;
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    //public static AchievementPage AlloycraftPage;
    public static ToolMaterial GoldIron = EnumHelper.addToolMaterial("GoldIron", 3, 1000, 15.0F, 4.0F, 30);

    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Registry
    	cookieblock = new BlockCookie().setHardness(3.0F);
    	whatthehellblock = new BlockWhatTheHell();
    	goldironblock = new BlockGoldIron().setHardness(3.0F);
    	hellishblock = new BlockHellish().setHardness(3.0F);
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	yttriumore = new BlockYttriumOre().setHardness(3.0F);
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	yttriumingot = new ItemYttriumIngot();
    	whatthehellingot = new ItemWhatTheHellIngot();
    	hellishingot = new ItemHellishIngot();
    	goldironingot = new ItemGoldIronIngot();
    	goldironsword = new ItemGoldIronSword(null);
    	goldironpick = new ItemGoldIronPick("GoldIronPick", GoldIron), "GoldIronPick")
    	goldironspade = new ItemGoldIronSpade(null);
    	goldironhoe = new ItemGoldIronHoe(null);
    	goldironaxe = new ItemGoldIronAxe(null);
    	projectx = new ItemProjectX();
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
    	GameRegistry.registerItem(projectx, "ItemProjectX");
    	GameRegistry.registerItem(goldironsword, "ItemGoldIronSword");
    	GameRegistry.registerItem(goldironpick, "ItemGoldIronPick");
    	GameRegistry.registerItem(goldironaxe, "ItemGoldIronAxe");
    	GameRegistry.registerItem(goldironspade, "ItemGoldIronSpade");
    	GameRegistry.registerItem(goldironhoe, "ItemGoldIronHoe");
    	GameRegistry.registerItem(whatthehellingot, "ItemWhatTheHellIngot");
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	//CookieIngot = new Achievement("", "CookieIngot", 0, 0, Alloycraft.cookieingot, null);
    	//YttriumIngot = new Achievement("", "YttriumIngot", 2, 2, Alloycraft.yttriumingot, null);
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	//AlloycraftPage = new AchievementPage("Alloycraft Achievements", CookieIngot, YttriumIngot);
    	//AchievementPage.registerAchievementPage(AlloycraftPage);
    	//FMLCommonHandler.instance().bus().register(new EventListener());
    	
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
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.whatthehellblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.whatthehellingot
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.hellishingot, 9), new Object[]{
    	new ItemStack(Alloycraft.hellishblock, 1)
    			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.goldironingot, 9), new Object[]{
        	new ItemStack(Alloycraft.goldironblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.whatthehellingot, 9), new Object[]{
        	new ItemStack(Alloycraft.whatthehellblock, 1)
        			});
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.cookieblock, 1), new ItemStack(Alloycraft.cookieingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.yttriumore, 1), new ItemStack(Alloycraft.yttriumingot, 1), 0.1F);
    }
    public void init(FMLInitializationEvent event){
    	
        
}
}
