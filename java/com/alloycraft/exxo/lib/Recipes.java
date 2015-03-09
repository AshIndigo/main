package com.alloycraft.exxo.lib;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.alloycraft.exxo.Alloycraft;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerRecipes(){
		
		//Recipes
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.cookieblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    	});
       	GameRegistry.addRecipe(new ItemStack(Alloycraft.copperblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.copperingot
       	});
       	GameRegistry.addRecipe(new ItemStack(Alloycraft.tinblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.tiningot
    });
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.whatthehellblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.whatthehellingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.alloysmelteridle, 1), new Object[]{
        	"AAA",
        	"ABA",
        	"AAA",
        	'A', Alloycraft.yttriumingot, 'B', Blocks.furnace
    	});
    	//Gold-Iron Set
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironsword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironpick, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironhoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironhoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironchestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', Alloycraft.goldironingot
    	});
    	//Hellish Set
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishsword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishpick, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishhoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishhoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', Alloycraft.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishchestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.projectxammo, 64), new Object[]{
        	"DCD",
        	"ABA",
        	"AAA",
        	'A', Alloycraft.goldironingot, 'C', Items.redstone, 'B', Items.gunpowder, 'D', Blocks.obsidian
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.projectx, 1), new Object[]{
        	"AA ",
        	"BEA",
        	"CD ",
        	'A', Alloycraft.goldironingot, 'C', Items.leather, 'B', Blocks.tnt, 'D', Blocks.obsidian, 'E', Alloycraft.goldironblock
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.hellishingot, 9), new Object[]{
    	new ItemStack(Alloycraft.hellishblock, 1)
    				});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.goldironingot, 9), new Object[]{
        	new ItemStack(Alloycraft.goldironblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.whatthehellingot, 9), new Object[]{
        	new ItemStack(Alloycraft.whatthehellblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.tiningot, 9), new Object[]{
        	new ItemStack(Alloycraft.tinblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.copperingot, 9), new Object[]{
        	new ItemStack(Alloycraft.copperblock, 1)
        			});
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.cookieblock, 1), new ItemStack(Alloycraft.cookieingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.yttriumore, 1), new ItemStack(Alloycraft.yttriumingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.copperore, 1), new ItemStack(Alloycraft.copperingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.tinore, 1), new ItemStack(Alloycraft.tiningot, 1), 0.1F);
	}
	}
