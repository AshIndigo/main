package com.alloycraft.exxo.recipes;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloyFurnaceRecipes {

	public AlloyFurnaceRecipes() {
		
	}
	
	public static ItemStack getSmeltingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}
	
	public static ItemStack getOutput(Item item, Item item2) {
		//Yes?
		if (item == AlloycraftItems.yttriumingot && item2 == Items.iron_ingot || item == Items.iron_ingot && item2 == AlloycraftItems.yttriumingot) {
			return new ItemStack(AlloycraftItems.cookieingot, 2);
		}
		if (item == Items.iron_ingot && item2 == Items.netherbrick || item == Items.netherbrick && item2 == Items.iron_ingot) {
			return new ItemStack(AlloycraftItems.hellishingot, 2);
		}
		if (item == Items.iron_ingot && item2 == Items.gold_ingot || item == Items.gold_ingot && item2 == Items.iron_ingot) {
			return new ItemStack(AlloycraftItems.goldironingot, 2);
		}
		return null;
	}
	
}
