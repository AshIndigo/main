package com.ashindigo.requestmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "requestmod", version = "1.0", name = "Tomek9g's Request Mod")
public class RequestModMain {

	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event){
		 
		 GameRegistry.addRecipe(new ItemStack(Items.diamond, 2), new Object[]{
	        	"AAA",
	        	"ABA",
	        	"AAA",
	        	'A', Blocks.coal_block, 'B', Items.diamond
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[]{
	        	"AAA",
	        	"C C",
	        	"B B",
	        	'A', Items.leather, 'B', Items.string, 'C', Items.gold_ingot
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.nether_star, 2), new Object[]{
	        	"AAA",
	        	"ABA",
	        	"AAA",
	        	'A', Items.emerald, 'B', Items.nether_star
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[]{
	        	"AAA",
	        	"C B",
	        	"B C",
	        	'A', Items.leather, 'B', Items.string, 'C', Items.gold_ingot
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1), new Object[]{
	        	"   ",
	        	"A A",
	        	"A A",
	        	'A', Items.bucket
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1), new Object[]{
	        	"A A",
	        	"AAA",
	        	"AAA",
	        	'A', Items.bucket
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1), new Object[]{
	        	"AAA",
	        	"A A",
	        	"   ",
	        	'A', Items.bucket
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1), new Object[]{
	        	"AAA",
	        	"A A",
	        	"A A",
	        	'A', Items.bucket
	    	});
		 GameRegistry.addRecipe(new ItemStack(Blocks.iron_block, 1), new Object[]{
	        	"AAA",
	        	"AAA",
	        	"AAA",
	        	'A', Items.bucket
	    	});
		 GameRegistry.addRecipe(new ItemStack(Items.bucket, 1), new Object[]{
	        	"   ",
	        	"BAB",
	        	" B ",
	        	'A', Items.iron_ingot, 'B', Items.bowl
	    	});
		 GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_helmet, 1), new Object[]{
	        	new ItemStack(Items.bucket, 1)
	        			});
		 GameRegistry.addRecipe(new ItemStack(Items.gunpowder, 64), new Object[]{
	        	"   ",
	        	"ADC",
	        	" B ",
	        	'A', Items.milk_bucket, 'B', Items.water_bucket, 'C', Items.lava_bucket, 'D', Blocks.tnt
	    	});
	 }
}
