package com.alloycraft.exxo;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.alloycraft.exxo.items.AluminumToolTest;
import com.alloycraft.exxo.items.ItemBronzeAxe;
import com.alloycraft.exxo.items.ItemBronzeHoe;
import com.alloycraft.exxo.items.ItemBronzeIngot;
import com.alloycraft.exxo.items.ItemBronzePick;
import com.alloycraft.exxo.items.ItemBronzeSpade;
import com.alloycraft.exxo.items.ItemBronzeSword;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemCopperIngot;
import com.alloycraft.exxo.items.ItemCrystalizedSeed;
import com.alloycraft.exxo.items.ItemEarthGem;
import com.alloycraft.exxo.items.ItemFireiteGem;
import com.alloycraft.exxo.items.ItemFireiteIngot;
import com.alloycraft.exxo.items.ItemGoldIronAxe;
import com.alloycraft.exxo.items.ItemGoldIronHoe;
import com.alloycraft.exxo.items.ItemGoldIronIngot;
import com.alloycraft.exxo.items.ItemGoldIronPick;
import com.alloycraft.exxo.items.ItemGoldIronSpade;
import com.alloycraft.exxo.items.ItemGoldIronSword;
import com.alloycraft.exxo.items.ItemHellishAxe;
import com.alloycraft.exxo.items.ItemHellishHoe;
import com.alloycraft.exxo.items.ItemHellishIngot;
import com.alloycraft.exxo.items.ItemHellishPick;
import com.alloycraft.exxo.items.ItemHellishSpade;
import com.alloycraft.exxo.items.ItemHellishSword;
import com.alloycraft.exxo.items.ItemHoldIt;
import com.alloycraft.exxo.items.ItemHyperCoal;
import com.alloycraft.exxo.items.ItemLapisLavonium;
import com.alloycraft.exxo.items.ItemMetalGem;
import com.alloycraft.exxo.items.ItemObjection;
import com.alloycraft.exxo.items.ItemOverridenIronIngot;
import com.alloycraft.exxo.items.ItemPatinaAxe;
import com.alloycraft.exxo.items.ItemPatinaHoe;
import com.alloycraft.exxo.items.ItemPatinaPick;
import com.alloycraft.exxo.items.ItemPatinaSpade;
import com.alloycraft.exxo.items.ItemPatinaSword;
import com.alloycraft.exxo.items.ItemPlantGem;
import com.alloycraft.exxo.items.ItemProjectX;
import com.alloycraft.exxo.items.ItemProjectXAmmo;
import com.alloycraft.exxo.items.ItemPureBossSpawner;
import com.alloycraft.exxo.items.ItemPureCrystal;
import com.alloycraft.exxo.items.ItemPureShard;
import com.alloycraft.exxo.items.ItemRainbowDye;
import com.alloycraft.exxo.items.ItemSteelAxe;
import com.alloycraft.exxo.items.ItemSteelHoe;
import com.alloycraft.exxo.items.ItemSteelIngot;
import com.alloycraft.exxo.items.ItemSteelPick;
import com.alloycraft.exxo.items.ItemSteelSpade;
import com.alloycraft.exxo.items.ItemSteelSword;
import com.alloycraft.exxo.items.ItemTakeThat;
import com.alloycraft.exxo.items.ItemTinIngot;
import com.alloycraft.exxo.items.ItemTitaniumAxe;
import com.alloycraft.exxo.items.ItemTitaniumHoe;
import com.alloycraft.exxo.items.ItemTitaniumIngot;
import com.alloycraft.exxo.items.ItemTitaniumPearl;
import com.alloycraft.exxo.items.ItemTitaniumPick;
import com.alloycraft.exxo.items.ItemTitaniumSpade;
import com.alloycraft.exxo.items.ItemTitaniumSword;
import com.alloycraft.exxo.items.ItemUnpureCrystal;
import com.alloycraft.exxo.items.ItemWhatTheHellIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.Registry;
import com.ashindigo.api.IndigoApiItem;
import com.ashindigo.api.MusicDisc;

public class AlloycraftItems {
	
    //Items
	public static Item overridenironingot;
	public static Item patinaingot;
    public static Item whatthehellingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static Item cookieingot;
    public static Item lapislavonium;
    public static Item purecrystal;
    public static Item copperingot;
    public static Item bronzeingot;
    public static Item steelingot;
    public static Item titaniumingot;
    public static Item tiningot;
    public static Item projectxammo;
    public static Item projectx;
    public static Item rainbowdye;
    public static Item hypercoal;
    public static Item awesomemusic;
	public static Item fireiteingot;
	public static Item fireitegem;
	public static Item pureshard;
	public static Item unpurecrystal;
	public static Item purebossegg;
	public static Item crystalizedseed;
	public static Item plantgem;
	public static Item earthgem;
	public static Item metalgem;
	public static Item limoniteingot;
	public static Item limonitaingot;
    //Gold-Iron Set
    public static Item goldironsword;
    public static Item goldironpick;
    public static Item goldironspade;
    public static Item goldironhoe;
    public static Item goldironaxe;
    //Hellish Set
    public static Item hellishsword;
    public static Item hellishpick;
    public static Item hellishspade;
    public static Item hellishhoe;
    public static Item hellishaxe;
    //Bronze Set
    public static Item bronzesword;
    public static Item bronzepick;
    public static Item bronzespade;
    public static Item bronzehoe;
    public static Item bronzeaxe;
    //Steel Set
    public static Item steelsword;
    public static Item steelpick;
    public static Item steelspade;
    public static Item steelhoe;
    public static Item steelaxe;
    //Gold-Iron Armor
    public static Item goldironhelmet;
    public static Item goldironchestplate;
    public static Item goldironleggings;
    public static Item goldironboots;
    //Hellish Armor
    public static Item hellishhelmet;
    public static Item hellishchestplate;
    public static Item hellishleggings;
    public static Item hellishboots;
    //Bronze Armor
    public static Item bronzehelmet;
    public static Item bronzechestplate;
    public static Item bronzeleggings;
    public static Item bronzeboots;
    //Steel Armor
    public static Item steelhelmet;
    public static Item steelchestplate;
    public static Item steelleggings;
    public static Item steelboots;
    //Objection!!!
    public static Item objection;
    public static Item holdit;
    public static Item takethat;
    //Titanium Set
    public static Item titaniumsword;
    public static Item titaniumpick;
    public static Item titaniumspade;
    public static Item titaniumhoe;
    public static Item titaniumaxe;
    public static Item titaniumpearl;
    //Titanium Armor
    public static Item titaniumhelmet;
    public static Item titaniumchestplate;
    public static Item titaniumleggings;
    public static Item titaniumboots;
    //Patina Tools
    public static Item patinasword;
    public static Item patinapick;
    public static Item patinaspade;
    public static Item patinahoe;
    public static Item patinaaxe;
    //Limonite Tools
    public static Item limonitesword;
    public static Item limonitepick;
    public static Item limonitespade;
    public static Item limonitehoe;
    public static Item limoniteaxe;
    //Limonita Tools
    public static Item limonitasword;
    public static Item limonitapick;
    public static Item limonitaspade;
    public static Item limonitahoe;
    public static Item limonitaaxe;
    //Aluminum Tools
    public static Item aluminumsword;
    public static Item aluminumpick;
    public static Item aluminumspade;
    public static Item aluminumhoe;
    public static Item aluminumaxe;
	public static Item aluminumtooltest;
    
	public static void registerItems() {

		//Ingots
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	copperingot = new ItemCopperIngot();
    	titaniumingot = new ItemTitaniumIngot();
    	pureshard = new ItemPureShard();
    	unpurecrystal = new ItemUnpureCrystal();
    	fireitegem = new ItemFireiteGem();
    	steelingot = new ItemSteelIngot();
    	yttriumingot = new ItemYttriumIngot();
    	whatthehellingot = new ItemWhatTheHellIngot();
    	hellishingot = new ItemHellishIngot();
    	lapislavonium = new ItemLapisLavonium();
    	goldironingot = new ItemGoldIronIngot();
    	tiningot = new ItemTinIngot();
    	purecrystal = new ItemPureCrystal();
    	bronzeingot = new ItemBronzeIngot();
    	hypercoal = new ItemHyperCoal();
    	fireiteingot = new ItemFireiteIngot();
    	projectxammo = new ItemProjectXAmmo();
    	projectx = new ItemProjectX();
    	purebossegg = new ItemPureBossSpawner("PureBoss", 0xE18519, 0x000000).setUnlocalizedName("spawn_egg_pureboss".toLowerCase()).setTextureName("alloycraft:pureboss");
    	rainbowdye = new ItemRainbowDye();
    	earthgem = new ItemEarthGem();
    	plantgem = new ItemPlantGem();
    	metalgem = new ItemMetalGem();
    	overridenironingot = new ItemOverridenIronIngot();
    	patinaingot = new IndigoApiItem("patinaingot", "patinaingot", Alloycraft.taballoycraft);
    	crystalizedseed = new ItemCrystalizedSeed(AlloycraftBlocks.crystalizedplant, Blocks.dirt);
    	awesomemusic = new MusicDisc("Awesome").setUnlocalizedName("record_Awesome").setCreativeTab(Alloycraft.taballoycraft);
    	limoniteingot = new IndigoApiItem("LimoniteIngot", "LimoniteIngot".toLowerCase(), Alloycraft.taballoycraft);
    	limonitaingot = new IndigoApiItem("LimonitaIngot", "LimonitaIngot".toLowerCase(), Alloycraft.taballoycraft);
    	//Objection!!!
    	objection = new ItemObjection();
    	holdit = new ItemHoldIt();
    	takethat = new ItemTakeThat();
    	//Gold-Iron Tools
    	goldironsword = new ItemGoldIronSword("GoldIronSword", Registry.GoldIron);
    	goldironpick = new ItemGoldIronPick("GoldIronPick", Registry.GoldIron);
    	goldironspade = new ItemGoldIronSpade("GoldIronSpade", Registry.GoldIron);
    	goldironhoe = new ItemGoldIronHoe("GoldIronHoe", Registry.GoldIron);
    	goldironaxe = new ItemGoldIronAxe("GoldIronAxe", Registry.GoldIron);
    	//Hellish Tools
    	hellishsword = new ItemHellishSword("HellishSword", Registry.Hellish);
    	hellishpick = new ItemHellishPick("HellishPick", Registry.Hellish);
    	hellishspade = new ItemHellishSpade("HellishSpade", Registry.Hellish);
    	hellishhoe = new ItemHellishHoe("HellishHoe", Registry.Hellish);
    	hellishaxe = new ItemHellishAxe("HellishAxe", Registry.Hellish);
		//Bronze Tools
       	bronzesword = new ItemBronzeSword("BronzeSword", Registry.Bronze);
       	bronzepick = new ItemBronzePick("BronzePick", Registry.Bronze);
       	bronzespade = new ItemBronzeSpade("BronzeSpade", Registry.Bronze);
       	bronzehoe = new ItemBronzeHoe("BronzeHoe", Registry.Bronze);
       	bronzeaxe = new ItemBronzeAxe("BronzeAxe", Registry.Bronze);
       	//Steel Tools
       	steelsword = new ItemSteelSword("SteelSword", Registry.Steel);
       	steelpick = new ItemSteelPick("SteelPick", Registry.Steel);
       	steelspade = new ItemSteelSpade("SteelSpade", Registry.Steel);
       	steelhoe = new ItemSteelHoe("SteelHoe", Registry.Steel);
       	steelaxe = new ItemSteelAxe("SteelAxe", Registry.Steel);
       	//Titanium Tools
       	titaniumsword = new ItemTitaniumSword("TitaniumSword", Registry.Titanium);
       	titaniumpick = new ItemTitaniumPick("TitaniumPick", Registry.Titanium);
       	titaniumspade = new ItemTitaniumSpade("TitaniumSpade", Registry.Titanium);
       	titaniumhoe = new ItemTitaniumHoe("TitaniumHoe", Registry.Titanium);
       	titaniumaxe = new ItemTitaniumAxe("TitaniumAxe", Registry.Titanium);
       	titaniumpearl = new ItemTitaniumPearl();
       	//Patina Covered Tools
       	patinasword = new ItemPatinaSword("PatinaSword", Registry.Patina);
       	patinapick = new ItemPatinaPick("PatinaPick", Registry.Patina);
       	patinaspade = new ItemPatinaSpade("PatinaSpade", Registry.Patina);
       	patinahoe = new ItemPatinaHoe("PatinaHoe", Registry.Patina);
       	patinaaxe = new ItemPatinaAxe("PatinaAxe", Registry.Patina);
       	//Limonite Tools
       	limonitesword = new IndigoApiItem.IndigoApiSword(Registry.Limonite, "LimoniteSword", "LimoniteSword".toLowerCase(), Alloycraft.taballoycraft);
       	limonitepick = new IndigoApiItem.IndigoApiPick(Registry.Limonite, "LimonitePickaxe", "LimonitePickaxe".toLowerCase(), Alloycraft.taballoycraft);
       	limonitespade = new IndigoApiItem.IndigoApiSpade(Registry.Limonite, "LimoniteSpade", "LimoniteSpade".toLowerCase(), Alloycraft.taballoycraft);
       	limonitehoe = new IndigoApiItem.IndigoApiHoe(Registry.Limonite, "LimoniteHoe", "LimoniteHoe".toLowerCase(), Alloycraft.taballoycraft);
       	limoniteaxe = new IndigoApiItem.IndigoApiAxe(Registry.Limonite, "LimoniteAxe", "LimoniteAxe".toLowerCase(), Alloycraft.taballoycraft);
       	//Limonita Tools
    	limonitasword = new IndigoApiItem.IndigoApiSword(Registry.Limonita, "LimonitaSword", "LimonitaSword".toLowerCase(), Alloycraft.taballoycraft);
       	limonitapick = new IndigoApiItem.IndigoApiPick(Registry.Limonita, "LimonitaPick", "LimonitaPick".toLowerCase(), Alloycraft.taballoycraft);
       	limonitaspade = new IndigoApiItem.IndigoApiSpade(Registry.Limonita, "LimonitaSpade", "LimonitaSpade".toLowerCase(), Alloycraft.taballoycraft);
       	limonitahoe = new IndigoApiItem.IndigoApiHoe(Registry.Limonita, "LimonitaHoe", "LimonitaHoe".toLowerCase(), Alloycraft.taballoycraft);
       	limonitaaxe = new IndigoApiItem.IndigoApiAxe(Registry.Limonita, "LimonitaAxe", "LimonitaAxe".toLowerCase(), Alloycraft.taballoycraft);
       	//Aluminum Tools
       	aluminumsword = new IndigoApiItem.IndigoApiSword(Registry.Aluminum, "AluminumSword", "AluminumSword".toLowerCase(), Alloycraft.taballoycraft);
       	aluminumpick = new IndigoApiItem.IndigoApiPick(Registry.Aluminum, "AluminumPick", "AluminumPick".toLowerCase(), Alloycraft.taballoycraft);
       	aluminumspade = new IndigoApiItem.IndigoApiSpade(Registry.Aluminum, "AluminumSpade", "AluminumSpade".toLowerCase(), Alloycraft.taballoycraft);
       	aluminumhoe = new IndigoApiItem.IndigoApiHoe(Registry.Aluminum, "AluminumHoe", "AluminumHoe".toLowerCase(), Alloycraft.taballoycraft);
       	aluminumaxe = new IndigoApiItem.IndigoApiAxe(Registry.Aluminum, "AluminumAxe", "AluminumAxe".toLowerCase(), Alloycraft.taballoycraft);

       	aluminumtooltest = new AluminumToolTest("Test", "Test".toLowerCase(), Registry.GoldIron, Alloycraft.taballoycraft);
       	ItemOverridenIronIngot.waterDetection();

       	
       	}
	}
