package com.alloycraft.exxo.lib;

import baubles.api.IBauble;

import com.alloycraft.exxo.AlloycraftBlocks;
import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.addons.items.BaubleEpicRing;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.Optional.Method;
import cpw.mods.fml.common.registry.GameRegistry;

public class ApiRegistry {
	
	public static Item epicring;
	
	public static void registerMods(){
		
		if (Loader.isModLoaded("Baubles")) {
    		System.out.println("Baubles Detected");
    		ApiRegistry.registerBaubles();
    		} else {
    		System.out.println("Baubles Not Detected");
    		}
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
