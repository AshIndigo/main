package com.alloycraft.exxo.lib;

//import ic2.api.recipe.RecipeInputItemStack;

import java.util.Arrays;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;
//import thaumcraft.common.config.ConfigItems;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.addons.items.AlloyFocusTest;
import com.alloycraft.exxo.addons.items.BaubleEpicRing;
import com.ashindigo.api.IndigoApiItem;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ApiRegistry {
	
	public static Item epicring;
	public static WandCap testwandcap;
	public static WandRod testwandcore;
	public static Item itemtest1;
	public static Item itemtest2;
	public static Item voidedthaumium;
	public static Item titaniumdust;
	static NBTTagCompound test;
	private static Item itemtest3;
	
	public static void registerMods(){
		
		if (Alloycraft.baublesenabled = true){
		if (Loader.isModLoaded("Baubles")) {
    		System.out.println("Baubles Detected");
    		//ApiRegistry.registerBaubles();
    		} else {
    		System.out.println("Baubles Not Detected");
    		}
		}
		if (Alloycraft.thaumcraftenabled = true){
			if (Loader.isModLoaded("Thaumcraft")) {
	    		System.out.println("Thaumcraft Detected");
	    		//ApiRegistry.registerThaumcraft();
	    		} else {
	    		System.out.println("Thaumcraft Not Detected");
	    		}
			}
		if (Alloycraft.ic2addonenabled = true){
			if (Loader.isModLoaded("IC2")) {
	    		System.out.println("IC2 Detected");
	    		//ApiRegistry.registerIC2();
	    		} else {
	    		System.out.println("IC2 Not Detected");
	    		}
			}
		}
	
	
	public static void registerThaumcraft() {
		
		//itemtest1 = new AlloyFocusTest("itemtest1", "test1".toLowerCase(), Alloycraft.taballoycraft);
		voidedthaumium = new IndigoApiItem("itemtest2", "test2".toLowerCase(), Alloycraft.taballoycraft);
		itemtest3 = new IndigoApiItem("itemtest3", "test3".toLowerCase(), Alloycraft.taballoycraft);
		voidedthaumium = new IndigoApiItem("itemtest2", "test2".toLowerCase(), Alloycraft.taballoycraft);
		//GameRegistry.registerItem(itemtest1, "itemtest1");
		GameRegistry.registerItem(itemtest3, "itemtest3");
		GameRegistry.registerItem(voidedthaumium, "itemtest2");
		testwandcap = new WandCap("FOCUSINFUSION", 1.1f, Arrays.asList(Aspect.ORDER),1, new ItemStack(itemtest1),1);
		testwandcore = new WandRod("FOCUSINFUSION",10,new ItemStack(itemtest2),8, new ResourceLocation("thaumicexploration:textures/models/rodAmber.png"));
		ResearchCategories.registerCategory("HAX", new ResourceLocation("alloycraft", "items/textures" + "beeInfusion.png"),new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));
       // InfusionRecipe infusionRecipe = ThaumcraftApi.addInfusionCraftingRecipe("FOCUSINFUSION", new ItemStack(Items.apple), 4, (new AspectList()).add(Aspect.EARTH, 25), new ItemStack(ConfigItems.itemFocusWarding), new ItemStack[]{new ItemStack(ConfigItems.itemResource, 1, 3)});
//        new ResearchItem("FOCUSINFUSION", "HAX", (new AspectList()).add(Aspect.EARTH, 6).add(Aspect.ARMOR, 3).add(Aspect.ORDER, 3).add(Aspect.MIND, 3), -2, 0, 2, new ItemStack(Items.apple)).setPages(new ResearchPage("tc.research_page.FOCUSINFUSION.1"), new ResearchPage("tc.research_page.FOCUSINFUSION.2"), new ResearchPage(infusionRecipe)).registerResearchItem();
	}

	public static void registerBaubles(){
		
		epicring = new BaubleEpicRing();
		GameRegistry.registerItem(epicring, "BaubleEpicRing");
		GameRegistry.addRecipe(new ItemStack(epicring, 1), new Object[]{
        	" A ",
        	"ABA",
        	" A ",
        	'A', AlloycraftItems.hellishingot, 'B', AlloycraftItems.fireitegem
    	});
		
	}
	
	public static void registerIC2() {
		
		//RecipeInputItemStack RecipeInputItemStac;
		//ic2.api.recipe.Recipes.macerator.addRecipe(Items.apple), test, test);
	}
	
}
