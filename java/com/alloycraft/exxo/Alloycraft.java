package com.alloycraft.exxo;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;
import com.alloycraft.exxo.blocks.*;
import com.alloycraft.exxo.items.*;
import com.alloycraft.exxo.armor.*;
import com.alloycraft.exxo.containers.*;
import com.alloycraft.exxo.tileenties.*;

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
    public static Item projectxammo;
    public static Item whatthehellingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static Item projectx;
    public static Item lapislavonium;
    public static Item goldironsword;
    public static Item goldironpick;
    public static Item goldironspade;
    public static Item goldironhoe;
    public static Item goldironaxe;
    public static Item goldironhelmet;
    public static Item goldironchestplate;
    public static Item goldironleggings;
    public static Item goldironboots;
    public static Item lunchbox;
    public static final int guiIDAlloyFurnace = 5;
    public static final int guiIDLunchBox = 6;
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static AchievementPage AlloycraftPage;
    public static ToolMaterial GoldIron = EnumHelper.addToolMaterial("GoldIron", 2, 400, 5.5F, 2.5F, 30);
    public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("GoldIron", 14, new int[] {2, 6, 4, 2}, 20);

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
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F).setLightLevel(0.02F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	yttriumore = new BlockYttriumOre().setHardness(3.0F);
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	yttriumingot = new ItemYttriumIngot();
    	whatthehellingot = new ItemWhatTheHellIngot();
    	hellishingot = new ItemHellishIngot();
    	lapislavonium = new ItemLapisLavonium();
    	goldironingot = new ItemGoldIronIngot();
    	lunchbox = new ItemLunchBox();
    	projectxammo = new ItemProjectXAmmo();
    	goldironsword = new ItemGoldIronSword("GoldIronSword", GoldIron);
    	goldironpick = new ItemGoldIronPick("GoldIronPick", GoldIron);
    	goldironspade = new ItemGoldIronSpade("GoldIronSpade", GoldIron);
    	goldironhoe = new ItemGoldIronHoe("GoldIronHoe", GoldIron);
    	goldironaxe = new ItemGoldIronAxe("GoldIronAxe", GoldIron);
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
    	//GameRegistry.registerItem(lunchbox, "ItemLunchBox");
    	GameRegistry.registerItem(lapislavonium, "ItemLapisLavonium");
    	GameRegistry.registerItem(goldironsword, "ItemGoldIronSword");
    	GameRegistry.registerItem(goldironpick, "ItemGoldIronPick");
    	GameRegistry.registerItem(goldironaxe, "ItemGoldIronAxe");
    	GameRegistry.registerItem(goldironspade, "ItemGoldIronSpade");
    	GameRegistry.registerItem(goldironhoe, "ItemGoldIronHoe");
    	GameRegistry.registerItem(projectxammo, "ItemProjectXAmmo");
    	GameRegistry.registerItem(whatthehellingot, "ItemWhatTheHellIngot");
    	GameRegistry.registerItem(goldironhelmet = new ItemGoldIronArmor("GoldIronHelmet", ARMOR, "GoldIron", 0), "GoldIronHelmet"); //0 for helmet
    	GameRegistry.registerItem(goldironchestplate = new ItemGoldIronArmor("GoldIronChestplate", ARMOR, "GoldIron", 1), "GoldIronChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(goldironleggings = new ItemGoldIronArmor("GoldIronLeggings", ARMOR, "GoldIron", 2), "GoldIronLeggings"); // 2 for leggings
    	GameRegistry.registerItem(goldironboots = new ItemGoldIronArmor("GoldIronBoots", ARMOR, "GoldIron", 3), "GoldIronBoots"); // 3 for boots
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	Recipes.registerRecipes();
    }
    public void init(FMLInitializationEvent event){
    
}
}
