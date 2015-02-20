package com.alloycraft.thaumcraft.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.recipes.*;

public class Recipes {
	public static AlloyFurnaceRecipes AlloyFurnaceRecipes;
	public static ItemStack loadRecipes(Item item, Item item2) {
		AlloyFurnaceRecipes.getOutput(item, item2);{
			if (item == Items.gold_ingot && item2 == Items.gold_ingot || item == Items.gold_ingot && item2 == Items.gold_ingot) {
				return new ItemStack(Alloycraft.goldironingot, 2);
			}
			return null;
			
		}
		
	}
}
