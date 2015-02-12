package com.alloycraft.exxo.recipes;

import com.alloycraft.exxo.Alloycraft;

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
		if (item == Alloycraft.yttriumingot && item2 == Items.iron_ingot || item == Items.iron_ingot && item2 == Alloycraft.yttriumingot) {
			return new ItemStack(Alloycraft.cookieingot, 2);
		}
		if (item == Items.iron_ingot && item2 == Items.netherbrick || item == Items.netherbrick && item2 == Items.iron_ingot) {
			return new ItemStack(Alloycraft.hellishingot, 2);
		}
		if (item == Items.iron_ingot && item2 == Items.gold_ingot || item == Items.gold_ingot && item2 == Items.iron_ingot) {
			return new ItemStack(Alloycraft.goldironingot, 2);
		}
		return null;
	}
	
}
