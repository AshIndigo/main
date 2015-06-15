package com.alloycraft.exxo;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class Test implements IRecipe {

	//var6 = ItemStack;
	@Override
	public boolean matches(InventoryCrafting p_77569_1_, World p_77569_2_) {
		return false;

		//if (ItemStack.)
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting p_77572_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}

}
