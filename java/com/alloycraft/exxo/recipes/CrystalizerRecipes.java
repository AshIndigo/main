package com.alloycraft.exxo.recipes;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CrystalizerRecipes {

	public CrystalizerRecipes() {
		
	}
	
	public static ItemStack getSmeltingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}
	
	public static ItemStack getOutput(Item item, Item item2) {
		//*Poof!*
		if (item == AlloycraftItems.yttriumingot && item2 == Items.iron_ingot || item == Items.iron_ingot && item2 == AlloycraftItems.yttriumingot) {
			return new ItemStack(AlloycraftItems.cookieingot, 2);	
		}
		if (item == AlloycraftItems.fireiteingot && item2 == Items.diamond || item == Items.diamond && item2 == AlloycraftItems.fireiteingot) {
			return new ItemStack(AlloycraftItems.fireitegem, 1);	
		}
		if (item == AlloycraftItems.plantgem && item2 == AlloycraftItems.metalgem || item == AlloycraftItems.metalgem && item2 == AlloycraftItems.plantgem) {
			return new ItemStack(AlloycraftItems.earthgem, 1);	
		}
		if (item == AlloycraftItems.steelingot && item2 == Items.diamond || item == Items.diamond && item2 == AlloycraftItems.steelingot) {
			return new ItemStack(AlloycraftItems.metalgem, 1);	
		}
		return null;
	}
	
}
