package com.alloycraft.exxo.recipes;

import com.alloycraft.exxo.Alloycraft;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.nealecraft.mod.Nealecraft;

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
		
		return null;
	}
	
}
