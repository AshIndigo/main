package com.ashindigo.morechainarmor;

import com.alloycraft.exxo.AlloycraftBlocks;
import com.alloycraft.exxo.AlloycraftItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {
	
	public static void registerItems(){
		GameRegistry.registerItem(MoreChainArmor.chain = new ItemChain(), "chain");
		GameRegistry.registerItem(MoreChainArmor.nugget = new ItemNugget(), "nugget");
		//Iron Chain Armor
    	GameRegistry.registerItem(MoreChainArmor.chainironhelmet = new ArmorChainIron("ChainIronHelmet", MoreChainArmor.ARMORCHAINIRON, "ChainIron", 0), "ChainIronHelmet");
    	GameRegistry.registerItem(MoreChainArmor.chainironplate = new ArmorChainIron("ChainIronChestplate", MoreChainArmor.ARMORCHAINIRON, "ChainIron", 1), "ChainIronChestplate");
    	GameRegistry.registerItem(MoreChainArmor.chainironleggings = new ArmorChainIron("ChainIronLeggings", MoreChainArmor.ARMORCHAINIRON, "ChainIron", 2), "ChainIronLeggings"); 
    	GameRegistry.registerItem(MoreChainArmor.chainironboots = new ArmorChainIron("ChainIronBoots", MoreChainArmor.ARMORCHAINIRON, "ChainIron", 3), "ChainIronBoots");
    	//Gold Chain Armor
    	GameRegistry.registerItem(MoreChainArmor.chaingoldhelmet = new ArmorChainGold("ChainGoldHelmet", MoreChainArmor.ARMORCHAINGOLD, "ChainGold", 0), "ChainGoldHelmet");
    	GameRegistry.registerItem(MoreChainArmor.chaingoldplate = new ArmorChainGold("ChainGoldChestplate", MoreChainArmor.ARMORCHAINGOLD, "ChainGold", 1), "ChainGoldChestplate");
    	GameRegistry.registerItem(MoreChainArmor.chaingoldleggings = new ArmorChainGold("ChainGoldLeggings", MoreChainArmor.ARMORCHAINGOLD, "ChainGold", 2), "ChainGoldLeggings"); 
    	GameRegistry.registerItem(MoreChainArmor.chaingoldboots = new ArmorChainGold("ChainGoldBoots", MoreChainArmor.ARMORCHAINGOLD, "ChainGold", 3), "ChainGoldBoots");
    	//Diamond Chain Armor
    	GameRegistry.registerItem(MoreChainArmor.chaindiamondhelmet = new ArmorChainDiamond("ChainDiamondHelmet", MoreChainArmor.ARMORCHAINDIAMOND, "ChainDiamond", 0), "ChainDiamondHelmet");
    	GameRegistry.registerItem(MoreChainArmor.chaindiamondplate = new ArmorChainDiamond("ChainDiamondChestplate", MoreChainArmor.ARMORCHAINDIAMOND, "ChainDiamond", 1), "ChainDiamondChestplate");
    	GameRegistry.registerItem(MoreChainArmor.chaindiamondleggings = new ArmorChainDiamond("ChainDiamondLeggings", MoreChainArmor.ARMORCHAINDIAMOND, "ChainDiamond", 2), "ChainDiamondLeggings"); 
    	GameRegistry.registerItem(MoreChainArmor.chaindiamondboots = new ArmorChainDiamond("ChainDiamondBoots", MoreChainArmor.ARMORCHAINDIAMOND, "ChainDiamond", 3), "ChainDiamondBoots");
    	//Emerald Chain Armor
    	GameRegistry.registerItem(MoreChainArmor.chainemeraldhelmet = new ArmorChainEmerald("ChainEmeraldHelmet", MoreChainArmor.ARMORCHAINEMERALD, "ChainEmerald", 0), "ChainEmeraldHelmet");
    	GameRegistry.registerItem(MoreChainArmor.chainemeraldplate = new ArmorChainEmerald("ChainEmeraldChestplate", MoreChainArmor.ARMORCHAINEMERALD, "ChainEmerald", 1), "ChainEmeraldChestplate");
    	GameRegistry.registerItem(MoreChainArmor.chainemeraldleggings = new ArmorChainEmerald("ChainEmeraldLeggings", MoreChainArmor.ARMORCHAINEMERALD, "ChainEmerald", 2), "ChainEmeraldLeggings"); 
    	GameRegistry.registerItem(MoreChainArmor.chainemeraldboots = new ArmorChainEmerald("ChainEmeraldBoots", MoreChainArmor.ARMORCHAINEMERALD, "ChainEmerald", 3), "ChainEmeraldBoots");
    	//Quartz Chain Armor
    	GameRegistry.registerItem(MoreChainArmor.chainquartzhelmet = new ArmorChainQuartz("ChainQuartzHelmet", MoreChainArmor.ARMORCHAINQUARTZ, "ChainQuartz", 0), "ChainQuartzHelmet");
    	GameRegistry.registerItem(MoreChainArmor.chainquartzplate = new ArmorChainQuartz("ChainQuartzChestplate", MoreChainArmor.ARMORCHAINQUARTZ, "ChainQuartz", 1), "ChainQuartzChestplate");
    	GameRegistry.registerItem(MoreChainArmor.chainquartzleggings = new ArmorChainQuartz("ChainQuartzLeggings", MoreChainArmor.ARMORCHAINQUARTZ, "ChainQuartz", 2), "ChainQuartzLeggings"); 
    	GameRegistry.registerItem(MoreChainArmor.chainquartzboots = new ArmorChainQuartz("ChainQuartzBoots", MoreChainArmor.ARMORCHAINQUARTZ, "ChainQuartz", 3), "ChainQuartzBoots");
    	//Nether Star Chain Armor
    	GameRegistry.registerItem(MoreChainArmor.chainnetherstarhelmet = new ArmorChainNetherStar("ChainNetherstarHelmet", MoreChainArmor.ARMORCHAINNETHERSTAR, "ChainNetherstar", 0), "ChainNetherstarHelmet");
    	GameRegistry.registerItem(MoreChainArmor.chainnetherstarplate = new ArmorChainNetherStar("ChainNetherstarChestplate", MoreChainArmor.ARMORCHAINNETHERSTAR, "ChainNetherstar", 1), "ChainNetherstarChestplate");
    	GameRegistry.registerItem(MoreChainArmor.chainnetherstarleggings = new ArmorChainNetherStar("ChainNetherstarLeggings", MoreChainArmor.ARMORCHAINNETHERSTAR, "ChainNetherstar", 2), "ChainNetherstarLeggings"); 
    	GameRegistry.registerItem(MoreChainArmor.chainnetherstarboots = new ArmorChainNetherStar("ChainNetherstarBoots", MoreChainArmor.ARMORCHAINNETHERSTAR, "ChainNetherstar", 3), "ChainNetherstarBoots");
	}
	
	public static void registerRecipes(){
		
    	//Chain Iron Armor
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainironplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', MoreChainArmor.chain
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainironboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', MoreChainArmor.chain
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainironleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', MoreChainArmor.chain
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainironhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', MoreChainArmor.chain
    	});
    	//Chain Gold Armor
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaingoldplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(MoreChainArmor.chain,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaingoldboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaingoldleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaingoldhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(MoreChainArmor.chain,1,1)
    	});
    	//Chain Diamond Armor
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaindiamondplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(MoreChainArmor.chain,1,2)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaindiamondboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,2)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaindiamondleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,2)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chaindiamondhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(MoreChainArmor.chain,1,2)
    	});
    	//Chain Emerald Armor
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainemeraldplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(MoreChainArmor.chain,1,3)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainemeraldboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,3)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainemeraldleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,3)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainemeraldhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(MoreChainArmor.chain,1,3)
    	});
    	//Chain Quartz Armor
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainquartzplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(MoreChainArmor.chain,1,4)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainquartzboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,4)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainquartzleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,4)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainquartzhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(MoreChainArmor.chain,1,4)
    	});
    	//Chain Diamond Armor
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainnetherstarplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(MoreChainArmor.chain,1,5)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainnetherstarboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,5)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainnetherstarleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(MoreChainArmor.chain,1,5)
    	});
    	GameRegistry.addRecipe(new ItemStack(MoreChainArmor.chainnetherstarhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(MoreChainArmor.chain,1,5)
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.nugget,9), new Object[]{
    		new ItemStack(Items.iron_ingot, 1)
    				});    	
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.nugget,9,2), new Object[]{
    		new ItemStack(Items.diamond, 1)
    				});    	
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.nugget,9,3), new Object[]{
    		new ItemStack(Items.emerald, 1)
    				});    	
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.nugget,9,4), new Object[]{
    		new ItemStack(Items.quartz, 1)
    				});    	
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.nugget,9,5), new Object[]{
    		new ItemStack(Items.nether_star, 1)
    				});   
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.chain,1), new Object[]{
    		new ItemStack(MoreChainArmor.nugget,1)
    				});  
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.chain,1,1), new Object[]{
    		new ItemStack(MoreChainArmor.nugget,1,1)
    				});    	
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.chain,1,2), new Object[]{
    		new ItemStack(MoreChainArmor.nugget,1,2)
    				});    	
    	GameRegistry.addShapelessRecipe(new ItemStack(MoreChainArmor.chain,1,3), new Object[]{
    		new ItemStack(MoreChainArmor.nugget,1,3)
    				});    	
	}

	public static void registerDictionary() {
		
		//Wow!
	}

}
