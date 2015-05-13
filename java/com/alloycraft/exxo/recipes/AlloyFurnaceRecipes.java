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
		if (item == Items.netherbrick && item2 == AlloycraftItems.fireiteingot|| item == AlloycraftItems.fireiteingot && item2 == AlloycraftItems.hypercoal) {
			return new ItemStack(AlloycraftItems.hellishingot, 2);
		}
		if (item == Items.iron_ingot && item2 == Items.gold_ingot || item == Items.gold_ingot && item2 == Items.iron_ingot) {
			return new ItemStack(AlloycraftItems.goldironingot, 2);
		}
		if (item == AlloycraftItems.fireiteingot && item2 == Items.coal || item == Items.coal && item2 == AlloycraftItems.fireiteingot) {
			return new ItemStack(AlloycraftItems.hypercoal, 4);
		}
		if (item == Items.iron_ingot && item2 == Items.coal || item == Items.coal && item2 == Items.iron_ingot) {
			return new ItemStack(AlloycraftItems.steelingot, 2);
		}
		if (item == AlloycraftItems.patinaingot && item2 == AlloycraftItems.limoniteingot || item == AlloycraftItems.limoniteingot && item2 == AlloycraftItems.patinaingot) {
			return new ItemStack(AlloycraftItems.limonitaingot, 2);
		}
		return null;
	}
	
}
