package com.alloycraft.exxo;

import com.alloycraft.exxo.items.*;
import com.alloycraft.exxo.lib.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class AlloycraftItems {
	
    //Items
    public static Item cookieingot;
    public static Item projectxammo;
    public static Item whatthehellingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static Item projectx;
    public static Item lapislavonium;
    public static Item purecrystal;
    public static Item copperingot;
    public static Item bronzeingot;
    public static Item steelingot;
    public static Item tiningot;
    public static Item rainbowdye;
    public static Item hypercoal;
    public static Item awesomemusic;
	public static Item fireiteingot;
	public static Item fireitegem;
	public static Item pureshard;
	public static Item unpurecrystal;
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
    
	public static void registerItems() {
		
		//Ingots
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	copperingot = new ItemCopperIngot();
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
    	rainbowdye = new ItemRainbowDye();
    	awesomemusic = new MusicDisc("Awesome").setUnlocalizedName("record_Awesome").setCreativeTab(Alloycraft.taballoycraft);
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
	}
}
