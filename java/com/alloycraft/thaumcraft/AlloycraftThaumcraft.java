/*
Coding is evil

package com.alloycraft.thaumcraft;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.items.ItemProjectXAmmo;
import com.alloycraft.exxo.recipes.AlloyFurnaceRecipes;
import com.alloycraft.thaumcraft.items.ItemVoidedThaumium;
import com.alloycraft.thaumcraft.recipes.Recipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION)
public class AlloycraftThaumcraft {
	
	public static Item voidedthaumium;
	static AlloyFurnaceRecipes AlloyFurnaceRecipes;

	@EventHandler
    public void preinit(FMLPreInitializationEvent event){
		voidedthaumium = new ItemVoidedThaumium();
		GameRegistry.registerItem(voidedthaumium, "ItemVoidedThaumium");
	}
		public static ItemStack loadRecipes(Item item, Item item2) {
			AlloyFurnaceRecipes.getSmeltingResult(item, item2);{
				if (item == Items.gold_ingot && item2 == Items.gold_ingot || item == Items.gold_ingot && item2 == Items.gold_ingot) {
					return new ItemStack(Alloycraft.goldironingot, 2);
				}
			
		}
			return null;
		
}
	}
*/