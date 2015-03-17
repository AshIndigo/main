package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.armor.ItemGoldIronArmor;
import com.alloycraft.exxo.armor.ItemHellishArmor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Registry {

	public static void registerOreDictionary() {
		
		//Ingots
		OreDictionary.registerOre("ingotCopper", new ItemStack(Alloycraft.copperingot));
    	OreDictionary.registerOre("ingotTin", new ItemStack(Alloycraft.tiningot));
    	OreDictionary.registerOre("ingotYtrrium", new ItemStack(Alloycraft.yttriumingot));
    	//Ore
    	OreDictionary.registerOre("oreCopper", new ItemStack(Alloycraft.copperore));
    	OreDictionary.registerOre("oreTin", new ItemStack(Alloycraft.tinore));
    	OreDictionary.registerOre("oreYtrrium", new ItemStack(Alloycraft.yttriumore));
		
	}
	
	public static void registerItems(){
		
		GameRegistry.registerItem(Alloycraft.cookieingot, "ItemCookieIngot");
    	GameRegistry.registerItem(Alloycraft.hellishingot, "ItemHellishIngot");
    	GameRegistry.registerItem(Alloycraft.yttriumingot, "ItemYttriumIngot");
    	GameRegistry.registerItem(Alloycraft.purecrystal, "ItemPureCrystal");
    	GameRegistry.registerItem(Alloycraft.goldironingot, "ItemGoldIronIngot");
    	GameRegistry.registerItem(Alloycraft.copperingot, "ItemCopperIngot");
    	GameRegistry.registerItem(Alloycraft.projectx, "ItemProjectX");
    	//GameRegistry.registerItem(lunchbox, "ItemLunchBox");
    	GameRegistry.registerItem(Alloycraft.lapislavonium, "ItemLapisLavonium");
    	GameRegistry.registerItem(Alloycraft.tiningot, "ItemTinIngot");
    	GameRegistry.registerItem(Alloycraft.rainbowdye, "ItemRainbowDye");
    	//Gold-Iron Set
    	GameRegistry.registerItem(Alloycraft.goldironsword, "ItemGoldIronSword");
    	GameRegistry.registerItem(Alloycraft.goldironpick, "ItemGoldIronPick");
    	GameRegistry.registerItem(Alloycraft.goldironaxe, "ItemGoldIronAxe");
    	GameRegistry.registerItem(Alloycraft.goldironspade, "ItemGoldIronSpade");
    	GameRegistry.registerItem(Alloycraft.goldironhoe, "ItemGoldIronHoe");
    	//Hellish Set
    	GameRegistry.registerItem(Alloycraft.hellishsword, "ItemHellishSword");
    	GameRegistry.registerItem(Alloycraft.hellishpick, "ItemHellishPick");
    	GameRegistry.registerItem(Alloycraft.hellishaxe, "ItemHellishAxe");
    	GameRegistry.registerItem(Alloycraft.hellishspade, "ItemHellishSpade");
    	GameRegistry.registerItem(Alloycraft.hellishhoe, "ItemHellishHoe");
    	GameRegistry.registerItem(Alloycraft.projectxammo, "ItemProjectXAmmo");
    	GameRegistry.registerItem(Alloycraft.whatthehellingot, "ItemWhatTheHellIngot");
    	//Gold-Iron Armor
    	GameRegistry.registerItem(Alloycraft.goldironhelmet = new ItemGoldIronArmor("GoldIronHelmet", Alloycraft.ARMORGOLDIRON, "GoldIron", 0), "GoldIronHelmet"); //0 for helmet
    	GameRegistry.registerItem(Alloycraft.goldironchestplate = new ItemGoldIronArmor("GoldIronChestplate", Alloycraft.ARMORGOLDIRON, "GoldIron", 1), "GoldIronChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(Alloycraft.goldironleggings = new ItemGoldIronArmor("GoldIronLeggings", Alloycraft.ARMORGOLDIRON, "GoldIron", 2), "GoldIronLeggings"); // 2 for leggings
    	GameRegistry.registerItem(Alloycraft.goldironboots = new ItemGoldIronArmor("GoldIronBoots", Alloycraft.ARMORGOLDIRON, "GoldIron", 3), "GoldIronBoots"); // 3 for boots
    	//Hellish Armor
    	GameRegistry.registerItem(Alloycraft.hellishhelmet = new ItemHellishArmor("HellishHelmet", Alloycraft.ARMORHELLISH, "Hellish", 0), "HellishHelmet"); //0 for helmet
    	GameRegistry.registerItem(Alloycraft.hellishchestplate = new ItemHellishArmor("HellishChestplate", Alloycraft.ARMORHELLISH, "Hellish", 1), "HellishChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(Alloycraft.hellishleggings = new ItemHellishArmor("HellishLeggings", Alloycraft.ARMORHELLISH, "Hellish", 2), "HellishLeggings"); // 2 for leggings
    	GameRegistry.registerItem(Alloycraft.hellishboots = new ItemHellishArmor("HellishBoots", Alloycraft.ARMORHELLISH, "Hellish", 3), "HellishBoots"); // 3 for boots
	}
	
	public static void registerBlocks() {
		
    	//Ore
    	GameRegistry.registerBlock(Alloycraft.copperore, "CopperOre");
    	GameRegistry.registerBlock(Alloycraft.tinore, "TinOre");
    	GameRegistry.registerBlock(Alloycraft.yttriumore, "YttriumOre");
    	//Blocks
    	GameRegistry.registerBlock(Alloycraft.cookieblock, "BlockCookie");
    	GameRegistry.registerBlock(Alloycraft.copperblock, "BlockCopper");
    	GameRegistry.registerBlock(Alloycraft.tinblock, "BlockTin");
    	GameRegistry.registerBlock(Alloycraft.hellishblock, "BlockHellish");
    	GameRegistry.registerBlock(Alloycraft.whatthehellblock, "BlockWHATTHEHELL");
    	GameRegistry.registerBlock(Alloycraft.goldironblock, "BlockGoldIron");
    	GameRegistry.registerBlock(Alloycraft.alloysmelteridle, "AlloyFurnaceIdle");
    	GameRegistry.registerBlock(Alloycraft.alloysmelteractive, "AlloyFurnaceActive");
       	GameRegistry.registerBlock(Alloycraft.rainbowwool, "RainbowWool");
       	GameRegistry.registerBlock(Alloycraft.crystalizeridle, "CrystalizerIdle");
       	GameRegistry.registerBlock(Alloycraft.crystalizeractive, "CrystalizerActive");
       	//Fluids
       	FluidRegistry.registerFluid(Alloycraft.goldironfluid);
	}

	public static void registerHooks() {

		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Alloycraft.yttriumingot), 1, 5, 5));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Alloycraft.copperingot), 1, 5, 5));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Alloycraft.tiningot), 1, 5, 5));
		
	}
}
