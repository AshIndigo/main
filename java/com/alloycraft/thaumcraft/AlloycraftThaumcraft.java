package com.alloycraft.thaumcraft;

import com.alloycraft.exxo.items.ItemProjectXAmmo;
import com.alloycraft.exxo.recipes.AlloyFurnaceRecipes;
import com.alloycraft.thaumcraft.items.ItemVoidedThaumium;
import com.alloycraft.thaumcraft.recipes.Recipes;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION)
public class AlloycraftThaumcraft {
	
	public static Item voidedthaumium;

	@EventHandler
    public void preinit(FMLPreInitializationEvent event){
		voidedthaumium = new ItemVoidedThaumium();
		GameRegistry.registerItem(voidedthaumium, "ItemVoidedThaumium");
		Recipes.loadRecipes();
			
		}
}
