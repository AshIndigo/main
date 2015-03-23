package com.alloycraft.exxo;

import com.alloycraft.exxo.items.ItemBronzeIngot;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemCopperIngot;
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
import com.alloycraft.exxo.items.ItemHyperCoal;
import com.alloycraft.exxo.items.ItemLapisLavonium;
import com.alloycraft.exxo.items.ItemLunchBox;
import com.alloycraft.exxo.items.ItemProjectX;
import com.alloycraft.exxo.items.ItemProjectXAmmo;
import com.alloycraft.exxo.items.ItemPureCrystal;
import com.alloycraft.exxo.items.ItemRainbowDye;
import com.alloycraft.exxo.items.ItemTinIngot;
import com.alloycraft.exxo.items.ItemWhatTheHellIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.MusicDisc;

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
    public static Item tiningot;
    public static Item lunchbox;
    public static Item rainbowdye;
    public static Item hypercoal;
    public static Item awesomemusic;
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

	public static void registerItems() {
		
		//Items
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	copperingot = new ItemCopperIngot();
    	yttriumingot = new ItemYttriumIngot();
    	whatthehellingot = new ItemWhatTheHellIngot();
    	hellishingot = new ItemHellishIngot();
    	lapislavonium = new ItemLapisLavonium();
    	goldironingot = new ItemGoldIronIngot();
    	tiningot = new ItemTinIngot();
    	purecrystal = new ItemPureCrystal();
    	lunchbox = new ItemLunchBox();
    	projectxammo = new ItemProjectXAmmo();
    	projectx = new ItemProjectX();
    	rainbowdye = new ItemRainbowDye();
    	bronzeingot = new ItemBronzeIngot();
    	hypercoal = new ItemHyperCoal();
    	awesomemusic = new MusicDisc("Awesome").setUnlocalizedName("record_Awesome").setCreativeTab(Alloycraft.taballoycraft);
    	//Gold-Iron Tools
    	goldironsword = new ItemGoldIronSword("GoldIronSword", Alloycraft.GoldIron);
    	goldironpick = new ItemGoldIronPick("GoldIronPick", Alloycraft.GoldIron);
    	goldironspade = new ItemGoldIronSpade("GoldIronSpade", Alloycraft.GoldIron);
    	goldironhoe = new ItemGoldIronHoe("GoldIronHoe", Alloycraft.GoldIron);
    	goldironaxe = new ItemGoldIronAxe("GoldIronAxe", Alloycraft.GoldIron);
    	//Hellish Tools
    	hellishsword = new ItemHellishSword("HellishSword", Alloycraft.Hellish);
    	hellishpick = new ItemHellishPick("HellishPick", Alloycraft.Hellish);
    	hellishspade = new ItemHellishSpade("HellishSpade", Alloycraft.Hellish);
    	hellishhoe = new ItemHellishHoe("HellishHoe", Alloycraft.Hellish);
    	hellishaxe = new ItemHellishAxe("HellishAxe", Alloycraft.Hellish);
		
	}

	//For use later
}
