package com.alloycraft.exxo;

import java.util.logging.Level;

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
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;
import com.alloycraft.exxo.blocks.*;
import com.alloycraft.exxo.items.*;
import com.alloycraft.exxo.armor.*;
import com.alloycraft.exxo.containers.*;
import com.alloycraft.exxo.render.ProjectXRender;
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
	//Blocks
    public static Block cookieblock;
    public static Block hellishblock;
    public static Block goldironblock;
    public static Block copperblock;
    public static Block tinblock;
    public static Block whatthehellblock;
    public static Block alloysmelteridle;
    public static Block alloysmelteractive;
    //Ore
    public static Block yttriumore;
    public static Block copperore;
    public static Block tinore;
    //Items
    public static Item cookieingot;
    public static Item projectxammo;
    public static Item whatthehellingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static Item projectx;
    public static Item lapislavonium;
    public static Item purecrystal;
    public static Item copperingot;
    public static Item tiningot;
    public static Item lunchbox;
    //Gold-Iron Set
    public static Item goldironsword;
    public static Item goldironpick;
    public static Item goldironspade;
    public static Item goldironhoe;
    public static Item goldironaxe;
    //Hellish Set
    public static Item hellishsword;
    public static Item hellishpick;
    public static Item hellishspade;
    public static Item hellishhoe;
    public static Item hellishaxe;
    //Gold-Iron Armor
    public static Item goldironhelmet;
    public static Item goldironchestplate;
    public static Item goldironleggings;
    public static Item goldironboots;
    //Hellish Armor
    public static Item hellishhelmet;
    public static Item hellishchestplate;
    public static Item hellishleggings;
    public static Item hellishboots;
    public static final int guiIDAlloyFurnace = 5;
    public static final int guiIDLunchBox = 6;
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static CreativeTabs taballoycrafttools = new CreativeTabsAlloycraftTools("AlloycraftTools");
    public static AchievementPage AlloycraftPage;
    public static ToolMaterial GoldIron = EnumHelper.addToolMaterial("GoldIron", 2, 400, 5.5F, 2.5F, 30);
    public static ToolMaterial Hellish = EnumHelper.addToolMaterial("Hellish", 2, 400, 5.5F, 2.5F, 30);
    public static ArmorMaterial ARMORGOLDIRON = EnumHelper.addArmorMaterial("GoldIron", 14, new int[] {2, 6, 4, 2}, 20);
    public static ArmorMaterial ARMORHELLISH = EnumHelper.addArmorMaterial("Hellish", 16, new int[] {2, 7, 5, 3}, 15);

    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Blocks
    	cookieblock = new BlockCookie().setHardness(3.0F);
    	whatthehellblock = new BlockWhatTheHell();
    	tinblock = new BlockTin();
    	copperblock = new BlockCopper();
    	goldironblock = new BlockGoldIron().setHardness(3.0F);
    	hellishblock = new BlockHellish().setHardness(3.0F);
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F).setLightLevel(0.02F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	//Ore
    	yttriumore = new BlockYttriumOre().setHardness(3.0F);
    	copperore = new BlockCopperOre().setHardness(3.0F);
    	tinore = new BlockTinOre().setHardness(3.0F);
    	//Items
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	copperingot = new ItemCopperIngot();
    	yttriumingot = new ItemYttriumIngot();
    	whatthehellingot = new ItemWhatTheHellIngot();
    	hellishingot = new ItemHellishIngot();
    	lapislavonium = new ItemLapisLavonium();
    	goldironingot = new ItemGoldIronIngot();
    	tiningot = new ItemTinIngot();
    	purecrystal = new ItemPureCrystal();
    	lunchbox = new ItemLunchBox();
    	projectxammo = new ItemProjectXAmmo();
    	projectx = new ItemProjectX();
    	//Gold-Iron Tools
    	goldironsword = new ItemGoldIronSword("GoldIronSword", GoldIron);
    	goldironpick = new ItemGoldIronPick("GoldIronPick", GoldIron);
    	goldironspade = new ItemGoldIronSpade("GoldIronSpade", GoldIron);
    	goldironhoe = new ItemGoldIronHoe("GoldIronHoe", GoldIron);
    	goldironaxe = new ItemGoldIronAxe("GoldIronAxe", GoldIron);
    	//Hellish Tools
    	hellishsword = new ItemHellishSword("HellishSword", Hellish);
    	hellishpick = new ItemHellishPick("HellishPick", Hellish);
    	hellishspade = new ItemHellishSpade("HellishSpade", Hellish);
    	hellishhoe = new ItemHellishHoe("HellishHoe", Hellish);
    	hellishaxe = new ItemHellishAxe("HellishAxe", Hellish);
    	//Ore
    	GameRegistry.registerBlock(copperore, "CopperOre");
    	GameRegistry.registerBlock(tinore, "TinOre");
    	GameRegistry.registerBlock(yttriumore, "YttriumOre");
    	//Blocks
    	GameRegistry.registerBlock(cookieblock, "BlockCookie");
    	GameRegistry.registerBlock(copperblock, "BlockCopper");
    	GameRegistry.registerBlock(tinblock, "BlockTin");
    	GameRegistry.registerBlock(hellishblock, "BlockHellish");
    	GameRegistry.registerBlock(whatthehellblock, "BlockWHATTHEHELL");
    	GameRegistry.registerBlock(goldironblock, "BlockGoldIron");
    	GameRegistry.registerBlock(alloysmelteridle, "AlloyFurnaceIdle");
    	GameRegistry.registerBlock(alloysmelteractive, "AlloyFurnaceActive");
    	//Items
    	GameRegistry.registerItem(cookieingot, "ItemCookieIngot");
    	GameRegistry.registerItem(hellishingot, "ItemHellishIngot");
    	GameRegistry.registerItem(yttriumingot, "ItemYttriumIngot");
    	GameRegistry.registerItem(purecrystal, "ItemPureCrystal");
    	GameRegistry.registerItem(goldironingot, "ItemGoldIronIngot");
    	GameRegistry.registerItem(copperingot, "ItemCopperIngot");
    	GameRegistry.registerItem(projectx, "ItemProjectX");
    	//GameRegistry.registerItem(lunchbox, "ItemLunchBox");
    	GameRegistry.registerItem(lapislavonium, "ItemLapisLavonium");
    	GameRegistry.registerItem(tiningot, "ItemTinIngot");
    	//Gold-Iron Set
    	GameRegistry.registerItem(goldironsword, "ItemGoldIronSword");
    	GameRegistry.registerItem(goldironpick, "ItemGoldIronPick");
    	GameRegistry.registerItem(goldironaxe, "ItemGoldIronAxe");
    	GameRegistry.registerItem(goldironspade, "ItemGoldIronSpade");
    	GameRegistry.registerItem(goldironhoe, "ItemGoldIronHoe");
    	//Hellish Set
    	GameRegistry.registerItem(hellishsword, "ItemHellishSword");
    	GameRegistry.registerItem(hellishpick, "ItemHellishPick");
    	GameRegistry.registerItem(hellishaxe, "ItemHellishAxe");
    	GameRegistry.registerItem(hellishspade, "ItemHellishSpade");
    	GameRegistry.registerItem(hellishhoe, "ItemHellishHoe");
    	GameRegistry.registerItem(projectxammo, "ItemProjectXAmmo");
    	GameRegistry.registerItem(whatthehellingot, "ItemWhatTheHellIngot");
    	//Gold-Iron Armor
    	GameRegistry.registerItem(goldironhelmet = new ItemGoldIronArmor("GoldIronHelmet", ARMORGOLDIRON, "GoldIron", 0), "GoldIronHelmet"); //0 for helmet
    	GameRegistry.registerItem(goldironchestplate = new ItemGoldIronArmor("GoldIronChestplate", ARMORGOLDIRON, "GoldIron", 1), "GoldIronChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(goldironleggings = new ItemGoldIronArmor("GoldIronLeggings", ARMORGOLDIRON, "GoldIron", 2), "GoldIronLeggings"); // 2 for leggings
    	GameRegistry.registerItem(goldironboots = new ItemGoldIronArmor("GoldIronBoots", ARMORGOLDIRON, "GoldIron", 3), "GoldIronBoots"); // 3 for boots
    	//Hellish Armor
    	GameRegistry.registerItem(hellishhelmet = new ItemHellishArmor("HellishHelmet", ARMORHELLISH, "Hellish", 0), "HellishHelmet"); //0 for helmet
    	GameRegistry.registerItem(hellishchestplate = new ItemHellishArmor("HellishChestplate", ARMORHELLISH, "Hellish", 1), "HellishChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(hellishleggings = new ItemHellishArmor("HellishLeggings", ARMORHELLISH, "Hellish", 2), "HellishLeggings"); // 2 for leggings
    	GameRegistry.registerItem(hellishboots = new ItemHellishArmor("HellishBoots", ARMORHELLISH, "Hellish", 3), "HellishBoots"); // 3 for boots
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	Recipes.registerRecipes();
    	Registry.registerOreDictionary();
    	Registry.registerHooks();
    	ClientProxy.registerItemRenderers();
    	//IModelCustom model = AdvancedModelLoader.loadModel(ProjectXRender.projectx);
    }
    public void init(FMLInitializationEvent event){
    	
    
}
}
