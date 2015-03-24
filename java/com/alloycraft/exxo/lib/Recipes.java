package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.AlloycraftBlocks;
import com.alloycraft.exxo.AlloycraftItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerRecipes(){
		
		//Recipes
    	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.cookieblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    	});
       	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.copperblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.copperingot
       	});
       	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.tinblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.tiningot
    });
    	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.goldironblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.hellishblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.whatthehellblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.whatthehellingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.alloysmelteridle, 1), new Object[]{
        	"AAA",
        	"ABA",
        	"AAA",
        	'A', AlloycraftItems.yttriumingot, 'B', Blocks.furnace
    	});
    	//Gold-Iron Tools
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironsword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironpick, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironhoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironhoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', AlloycraftItems.goldironingot, 'B', Items.stick
    	});
    	//Gold-Iron Armor
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironchestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', AlloycraftItems.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', AlloycraftItems.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.goldironhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', AlloycraftItems.goldironingot
    	});
    	//Hellish Tools
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishsword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishpick, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishhoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishhoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', AlloycraftItems.hellishingot, 'B', Items.stick
    	});
    	//Hellish Armor
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishchestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', AlloycraftItems.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', AlloycraftItems.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', AlloycraftItems.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.hellishhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', AlloycraftItems.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.projectxammo, 64), new Object[]{
        	"DCD",
        	"ABA",
        	"AAA",
        	'A', AlloycraftItems.goldironingot, 'C', Items.redstone, 'B', Items.gunpowder, 'D', Blocks.obsidian
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftItems.projectx, 1), new Object[]{
        	"AA ",
        	"BEA",
        	"CD ",
        	'A', AlloycraftItems.goldironingot, 'C', Items.leather, 'B', Blocks.tnt, 'D', Blocks.obsidian, 'E', AlloycraftBlocks.goldironblock
    	});
    	GameRegistry.addRecipe(new ItemStack(AlloycraftBlocks.rainbowwool, 8), new Object[]{
        	"AAA",
        	"ABA",
        	"AAA",
        	'A', Blocks.wool, 'B', AlloycraftItems.rainbowdye
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(AlloycraftItems.hellishingot, 9), new Object[]{
    		new ItemStack(AlloycraftBlocks.hellishblock, 1)
    				});
    	GameRegistry.addShapelessRecipe(new ItemStack(AlloycraftBlocks.rainbowwool, 1), new Object[]{
    		new ItemStack(Blocks.wool), AlloycraftItems.rainbowdye
    				});
    	GameRegistry.addShapelessRecipe(new ItemStack(AlloycraftItems.goldironingot, 9), new Object[]{
        	new ItemStack(AlloycraftBlocks.goldironblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(AlloycraftItems.whatthehellingot, 9), new Object[]{
        	new ItemStack(AlloycraftBlocks.whatthehellblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(AlloycraftItems.tiningot, 9), new Object[]{
        	new ItemStack(AlloycraftBlocks.tinblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(AlloycraftItems.copperingot, 9), new Object[]{
        	new ItemStack(AlloycraftBlocks.copperblock, 1)
        			});
    	GameRegistry.addSmelting(new ItemStack(AlloycraftBlocks.cookieblock, 1), new ItemStack(AlloycraftItems.cookieingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(AlloycraftBlocks.yttriumore, 1), new ItemStack(AlloycraftItems.yttriumingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(AlloycraftBlocks.copperore, 1), new ItemStack(AlloycraftItems.copperingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(AlloycraftBlocks.tinore, 1), new ItemStack(AlloycraftItems.tiningot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(AlloycraftBlocks.fireiteore, 1), new ItemStack(AlloycraftItems.fireiteingot, 1), 0.1F);
	}
	}
