package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftBlocks;
import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.armor.ItemBronzeArmor;
import com.alloycraft.exxo.armor.ItemGoldIronArmor;
import com.alloycraft.exxo.armor.ItemHellishArmor;
import com.alloycraft.exxo.armor.ItemSteelArmor;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;
import com.alloycraft.exxo.tileenties.TileEntityCrystalizer;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.stats.Achievement;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class Registry {
	
	public static final int guiIDAlloyFurnace = 5;
    public static final int guiIDCrystalizer = 6;
	public static Achievement alloyfurnaceachievement;
    public static Achievement yttriumachievement;
    public static Achievement cookieingotachievement;
    public static AchievementPage AlloycraftPage;
    public static ToolMaterial GoldIron = EnumHelper.addToolMaterial("GoldIron", 2, 400, 5.5F, 2.5F, 30);
    //Balance
    public static ToolMaterial Bronze = EnumHelper.addToolMaterial("Bronze", 2, 400, 5.5F, 2.5F, 30);
    public static ToolMaterial Hellish = EnumHelper.addToolMaterial("Hellish", 2, 400, 5.5F, 2.5F, 30);
    //Balance
    public static ToolMaterial Steel = EnumHelper.addToolMaterial("Steel", 2, 400, 5.5F, 2.5F, 30);
    public static ArmorMaterial ARMORGOLDIRON = EnumHelper.addArmorMaterial("GoldIron", 14, new int[] {2, 6, 4, 2}, 30);
    public static ArmorMaterial ARMORHELLISH = EnumHelper.addArmorMaterial("Hellish", 16, new int[] {2, 7, 5, 3}, 15);
    public static ArmorMaterial ARMORBRONZE = EnumHelper.addArmorMaterial("Bronze", 16, new int[] {2, 4, 4, 1}, 15);
    //Balance
    public static ArmorMaterial ARMORSTEEL = EnumHelper.addArmorMaterial("Steel", 16, new int[] {2, 4, 4, 1}, 15);

	public static void registerOreDictionary(){
		
		//Ingots
		OreDictionary.registerOre("ingotCopper", new ItemStack(AlloycraftItems.copperingot));
    	OreDictionary.registerOre("ingotTin", new ItemStack(AlloycraftItems.tiningot));
    	OreDictionary.registerOre("ingotYtrrium", new ItemStack(AlloycraftItems.yttriumingot));
    	OreDictionary.registerOre("ingotBronze", new ItemStack(AlloycraftItems.bronzeingot));
    	//Ore
    	OreDictionary.registerOre("oreCopper", new ItemStack(AlloycraftBlocks.copperore));
    	OreDictionary.registerOre("oreTin", new ItemStack(AlloycraftBlocks.tinore));
    	OreDictionary.registerOre("oreYtrrium", new ItemStack(AlloycraftBlocks.yttriumore));
		
	}
	
	public static void registerItems(){
		
		GameRegistry.registerItem(AlloycraftItems.cookieingot, "ItemCookieIngot");
    	GameRegistry.registerItem(AlloycraftItems.hellishingot, "ItemHellishIngot");
    	GameRegistry.registerItem(AlloycraftItems.yttriumingot, "ItemYttriumIngot");
    	GameRegistry.registerItem(AlloycraftItems.purecrystal, "ItemPureCrystal");
    	GameRegistry.registerItem(AlloycraftItems.goldironingot, "ItemGoldIronIngot");
    	GameRegistry.registerItem(AlloycraftItems.copperingot, "ItemCopperIngot");
    	GameRegistry.registerItem(AlloycraftItems.bronzeingot, "ItemBronzeIngot");
    	GameRegistry.registerItem(AlloycraftItems.projectx, "ItemProjectX");
    	GameRegistry.registerItem(AlloycraftItems.fireiteingot, "ItemFireiteIngot");
    	GameRegistry.registerItem(AlloycraftItems.awesomemusic, "ItemAwesomeRecord");
    	GameRegistry.registerItem(AlloycraftItems.lapislavonium, "ItemLapisLavonium");
    	GameRegistry.registerItem(AlloycraftItems.tiningot, "ItemTinIngot");
    	GameRegistry.registerItem(AlloycraftItems.rainbowdye, "ItemRainbowDye");
    	GameRegistry.registerItem(AlloycraftItems.hypercoal, "ItemHyperCoal");
    	GameRegistry.registerItem(AlloycraftItems.fireitegem, "ItemFireiteGem");
    	GameRegistry.registerItem(AlloycraftItems.projectxammo, "ItemProjectXAmmo");
    	GameRegistry.registerItem(AlloycraftItems.whatthehellingot, "ItemWhatTheHellIngot");
    	GameRegistry.registerItem(AlloycraftItems.pureshard, "ItemPureShard");
    	GameRegistry.registerItem(AlloycraftItems.unpurecrystal, "ItemUnpureCrystal");
    	GameRegistry.registerItem(AlloycraftItems.steelingot, "ItemSteelIngot");
    	//Gold-Iron Set
    	GameRegistry.registerItem(AlloycraftItems.goldironsword, "ItemGoldIronSword");
    	GameRegistry.registerItem(AlloycraftItems.goldironpick, "ItemGoldIronPick");
    	GameRegistry.registerItem(AlloycraftItems.goldironaxe, "ItemGoldIronAxe");
    	GameRegistry.registerItem(AlloycraftItems.goldironspade, "ItemGoldIronSpade");
    	GameRegistry.registerItem(AlloycraftItems.goldironhoe, "ItemGoldIronHoe");
    	//Bronze Set
    	GameRegistry.registerItem(AlloycraftItems.bronzesword, "ItemBronzeSword");
    	GameRegistry.registerItem(AlloycraftItems.bronzepick, "ItemBronzePick");
    	GameRegistry.registerItem(AlloycraftItems.bronzeaxe, "ItemBronzeAxe");
    	GameRegistry.registerItem(AlloycraftItems.bronzespade, "ItemBronzeSpade");
    	GameRegistry.registerItem(AlloycraftItems.bronzehoe, "ItemBronzeHoe");
    	//Hellish Set
    	GameRegistry.registerItem(AlloycraftItems.hellishsword, "ItemHellishSword");
    	GameRegistry.registerItem(AlloycraftItems.hellishpick, "ItemHellishPick");
    	GameRegistry.registerItem(AlloycraftItems.hellishaxe, "ItemHellishAxe");
    	GameRegistry.registerItem(AlloycraftItems.hellishspade, "ItemHellishSpade");
    	GameRegistry.registerItem(AlloycraftItems.hellishhoe, "ItemHellishHoe");
    	//Steel Set
    	GameRegistry.registerItem(AlloycraftItems.steelsword, "ItemSteelSword");
    	GameRegistry.registerItem(AlloycraftItems.steelpick, "ItemSteelPick");
    	GameRegistry.registerItem(AlloycraftItems.steelaxe, "ItemSteelAxe");
    	GameRegistry.registerItem(AlloycraftItems.steelspade, "ItemSteelSpade");
    	GameRegistry.registerItem(AlloycraftItems.steelhoe, "ItemSteelHoe");
    	//Gold-Iron Armor
    	GameRegistry.registerItem(AlloycraftItems.goldironhelmet = new ItemGoldIronArmor("GoldIronHelmet", ARMORGOLDIRON, "GoldIron", 0), "GoldIronHelmet"); //0 for helmet
    	GameRegistry.registerItem(AlloycraftItems.goldironchestplate = new ItemGoldIronArmor("GoldIronChestplate", ARMORGOLDIRON, "GoldIron", 1), "GoldIronChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(AlloycraftItems.goldironleggings = new ItemGoldIronArmor("GoldIronLeggings", ARMORGOLDIRON, "GoldIron", 2), "GoldIronLeggings"); // 2 for leggings
    	GameRegistry.registerItem(AlloycraftItems.goldironboots = new ItemGoldIronArmor("GoldIronBoots", ARMORGOLDIRON, "GoldIron", 3), "GoldIronBoots"); // 3 for boots
    	//Hellish Armor
    	GameRegistry.registerItem(AlloycraftItems.hellishhelmet = new ItemHellishArmor("HellishHelmet", ARMORHELLISH, "Hellish", 0), "HellishHelmet"); //0 for helmet
    	GameRegistry.registerItem(AlloycraftItems.hellishchestplate = new ItemHellishArmor("HellishChestplate", ARMORHELLISH, "Hellish", 1), "HellishChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(AlloycraftItems.hellishleggings = new ItemHellishArmor("HellishLeggings", ARMORHELLISH, "Hellish", 2), "HellishLeggings"); // 2 for leggings
    	GameRegistry.registerItem(AlloycraftItems.hellishboots = new ItemHellishArmor("HellishBoots", ARMORHELLISH, "Hellish", 3), "HellishBoots"); // 3 for boots
    	//Bronze Armor
    	GameRegistry.registerItem(AlloycraftItems.bronzehelmet = new ItemBronzeArmor("BronzeHelmet", ARMORBRONZE, "Bronze", 0), "BronzeHelmet"); //0 for helmet
    	GameRegistry.registerItem(AlloycraftItems.bronzechestplate = new ItemBronzeArmor("BronzeChestplate", ARMORBRONZE, "Bronze", 1), "BronzeChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(AlloycraftItems.bronzeleggings = new ItemBronzeArmor("BronzeLeggings", ARMORBRONZE, "Bronze", 2), "BronzeLeggings"); // 2 for leggings
    	GameRegistry.registerItem(AlloycraftItems.bronzeboots = new ItemBronzeArmor("BronzeBoots", ARMORBRONZE, "Bronze", 3), "BronzeBoots"); // 3 for boots
    	//Steel Armor
    	GameRegistry.registerItem(AlloycraftItems.steelhelmet = new ItemSteelArmor("SteelHelmet", ARMORSTEEL, "Steel", 0), "SteelHelmet"); //0 for helmet
    	GameRegistry.registerItem(AlloycraftItems.steelchestplate = new ItemSteelArmor("SteelChestplate", ARMORSTEEL, "Steel", 1), "SteelChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(AlloycraftItems.steelleggings = new ItemSteelArmor("SteelLeggings", ARMORSTEEL, "Steel", 2), "SteelLeggings"); // 2 for leggings
    	GameRegistry.registerItem(AlloycraftItems.steelboots = new ItemSteelArmor("SteelBoots", ARMORSTEEL, "Steel", 3), "SteelBoots"); // 3 for boots
	}
	
	public static void registerBlocks() {
		
    	//Ore
    	GameRegistry.registerBlock(AlloycraftBlocks.copperore, "CopperOre");
    	GameRegistry.registerBlock(AlloycraftBlocks.tinore, "TinOre");
    	GameRegistry.registerBlock(AlloycraftBlocks.yttriumore, "YttriumOre");
    	GameRegistry.registerBlock(AlloycraftBlocks.fireiteore, "FireiteOre");
    	//Blocks
    	GameRegistry.registerBlock(AlloycraftBlocks.cookieblock, "BlockCookie");
    	GameRegistry.registerBlock(AlloycraftBlocks.copperblock, "BlockCopper");
    	GameRegistry.registerBlock(AlloycraftBlocks.tinblock, "BlockTin");
    	GameRegistry.registerBlock(AlloycraftBlocks.hellishblock, "BlockHellish");
    	GameRegistry.registerBlock(AlloycraftBlocks.whatthehellblock, "BlockWHATTHEHELL");
    	GameRegistry.registerBlock(AlloycraftBlocks.goldironblock, "BlockGoldIron");
    	GameRegistry.registerBlock(AlloycraftBlocks.alloysmelteridle, "AlloyFurnaceIdle");
    	GameRegistry.registerBlock(AlloycraftBlocks.alloysmelteractive, "AlloyFurnaceActive");
       	GameRegistry.registerBlock(AlloycraftBlocks.rainbowwool, "RainbowWool");
       	GameRegistry.registerBlock(AlloycraftBlocks.crystalizeridle, "CrystalizerIdle");
       	GameRegistry.registerBlock(AlloycraftBlocks.crystalizeractive, "CrystalizerActive");
       	GameRegistry.registerBlock(AlloycraftBlocks.hypertorch, "HyperTorch");
	}

	public static void registerHooks() {

		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AlloycraftItems.yttriumingot), 1, 5, 5));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AlloycraftItems.copperingot), 1, 5, 5));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AlloycraftItems.tiningot), 1, 5, 5));
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	GameRegistry.registerTileEntity(TileEntityCrystalizer.class, "Crystalizer");
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(Alloycraft.instance, new GuiHandler());
	}
	public static void registerAchievements(){
		
    	yttriumachievement = new Achievement("achievement.yttrium", "Yttrium", 0, 2,AlloycraftItems.yttriumingot, (Achievement) null).registerStat();;
    	cookieingotachievement = new Achievement("achievement.cookie", "CookieIngot", 0, 2,AlloycraftItems.cookieingot, (Achievement) null).registerStat();;
       	alloyfurnaceachievement = new Achievement("achievement.alloyfurnaceachievement", "Alloyfurnace",0, 0, AlloycraftBlocks.alloysmelteridle, yttriumachievement).registerStat();
       	AlloycraftPage = new AchievementPage("\u00a7aAlloycraft Achivevements", yttriumachievement, alloyfurnaceachievement);
       	AchievementPage.registerAchievementPage(AlloycraftPage);
       	FMLCommonHandler.instance().bus().register(new AchievementHandler());
	}
}
