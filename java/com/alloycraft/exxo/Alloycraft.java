package com.alloycraft.exxo;

import java.util.logging.Level;

import cpw.mods.fml.common.Optional;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.main.Main;
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
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.oredict.OreDictionary;

import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;
import com.alloycraft.exxo.blocks.*;
import com.alloycraft.exxo.fluids.FluidGoldIron;
import com.alloycraft.exxo.items.*;
import com.alloycraft.exxo.armor.*;
import com.alloycraft.exxo.containers.*;
import com.alloycraft.exxo.render.ProjectXRender;
import com.alloycraft.exxo.tileenties.*;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION)
public class Alloycraft
{
    public static final int guiIDAlloyFurnace = 5;
    public static final int guiIDCrystalizer = 6;
    public static final int guiIDLunchBox = 7;
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static CreativeTabs taballoycrafttools = new CreativeTabsAlloycraftTools("AlloycraftTools");
    public static ToolMaterial GoldIron = EnumHelper.addToolMaterial("GoldIron", 2, 400, 5.5F, 2.5F, 30);
    public static ToolMaterial Bronze = EnumHelper.addToolMaterial("Bronze", 2, 400, 5.5F, 2.5F, 30);
    public static ToolMaterial Hellish = EnumHelper.addToolMaterial("Hellish", 2, 400, 5.5F, 2.5F, 30);
    public static ArmorMaterial ARMORGOLDIRON = EnumHelper.addArmorMaterial("GoldIron", 14, new int[] {2, 6, 4, 2}, 30);
    public static ArmorMaterial ARMORHELLISH = EnumHelper.addArmorMaterial("Hellish", 16, new int[] {2, 7, 5, 3}, 15);
    public static ArmorMaterial ARMORBRONZE = EnumHelper.addArmorMaterial("Bronze", 16, new int[] {2, 4, 4, 1}, 15);
    
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
    	
