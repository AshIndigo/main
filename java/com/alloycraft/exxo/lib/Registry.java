package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.Alloycraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;

public class Registry {

	public static void registerOreDictionary() {
		
		//Ingots
		OreDictionary.registerOre("ingotCopper", new ItemStack(Alloycraft.copperingot));
    	OreDictionary.registerOre("ingotTin", new ItemStack(Alloycraft.tiningot));
    	OreDictionary.registerOre("ingotYtrrium", new ItemStack(Alloycraft.yttriumingot));
    	//Ore
    	OreDictionary.registerOre("oreCopper", new ItemStack(Alloycraft.copperore));
    	OreDictionary.registerOre("oreTin", new ItemStack(Alloycraft.tinore));
    	OreDictionary.registerOre("oreYtrrium", new ItemStack(Alloycraft.yttriumore));
		
	}

	public static void registerHooks() {

		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Alloycraft.yttriumingot), 1, 5, 5));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Alloycraft.copperingot), 1, 5, 5));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Alloycraft.tiningot), 1, 5, 5));
		
	}
}
