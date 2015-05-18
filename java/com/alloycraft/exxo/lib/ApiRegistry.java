package com.alloycraft.exxo.lib;

import java.util.Arrays;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;
import thaumcraft.common.config.ConfigItems;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.addons.items.BaubleEpicRing;
import com.alloycraft.exxo.addons.items.test;
import com.ashindigo.api.IndigoApiItem;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ApiRegistry {
	
	public static Item epicring;
	public static WandCap testwandcap;
	public static WandRod testwandcore;
	public static Item itemtest1;
	public static Item itemtest2;
	
	public static void registerMods(){
		
		if (Alloycraft.baublesenabled = true){
		if (Loader.isModLoaded("Baubles")) {
    		System.out.println("Baubles Detected");
    		ApiRegistry.registerBaubles();
    		} else {
    		System.out.println("Baubles Not Detected");
    		}
		}
		if (Alloycraft.thaumcraftenabled = true){
			if (Loader.isModLoaded("Thaumcraft")) {
	    		System.out.println("Thaumcraft Detected");
	    		ApiRegistry.registerThaumcraft();
	    		} else {
	    		System.out.println("Thaumcraft Not Detected");
	    		}
			}
		}
	
	
	public static void registerThaumcraft() {
		
		itemtest1 = new IndigoApiItem("itemtest1", "test1".toLowerCase(), Alloycraft.taballoycraft);
		itemtest2 = new IndigoApiItem("itemtest2", "test2".toLowerCase(), Alloycraft.taballoycraft);
		GameRegistry.registerItem(itemtest1, "itemtest1");
		GameRegistry.registerItem(itemtest2, "itemtest2");
		testwandcap = new WandCap("iron", 1.1f, Arrays.asList(Aspect.ORDER),1, new ItemStack(itemtest1),1);
		testwandcore = new WandRod("wood",10,new ItemStack(itemtest1),8, new ResourceLocation("thaumicexploration:textures/models/rodAmber.png"));
		ResearchItem testresearch = new test("Alchemy", "HAX", new AspectList().add(Aspect.MAGIC, 5).add(Aspect.ENERGY, 5), 5, 5, 5, new ItemStack(itemtest1)).registerResearchItem();
		ResearchCategories.registerCategory("HAX", new ResourceLocation("thaumicexploration:textures/tabs/txTab.png"), new ResourceLocation ("thaumicexploration:textures/tabs/txTab.png"));
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

}
