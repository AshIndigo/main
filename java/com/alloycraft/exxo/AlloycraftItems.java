package com.alloycraft.exxo;

import com.alloycraft.exxo.items.ItemBronzeAxe;
import com.alloycraft.exxo.items.ItemBronzeHoe;
import com.alloycraft.exxo.items.ItemBronzeIngot;
import com.alloycraft.exxo.items.ItemBronzePick;
import com.alloycraft.exxo.items.ItemBronzeSpade;
import com.alloycraft.exxo.items.ItemBronzeSword;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemCopperIngot;
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
import com.alloycraft.exxo.items.ItemHyperCoal;
import com.alloycraft.exxo.items.ItemLapisLavonium;
import com.alloycraft.exxo.items.ItemProjectX;
import com.alloycraft.exxo.items.ItemProjectXAmmo;
import com.alloycraft.exxo.items.ItemPureCrystal;
import com.alloycraft.exxo.items.ItemPureShard;
import com.alloycraft.exxo.items.ItemRainbowDye;
import com.alloycraft.exxo.items.ItemTinIngot;
import com.alloycraft.exxo.items.ItemUnpureCrystal;
import com.alloycraft.exxo.items.ItemWhatTheHellIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.MusicDisc;

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
    
	public static void registerItems() {
		
		//Ingots
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	copperingot = new ItemCopperIngot();
    	pureshard = new ItemPureShard();
    	unpurecrystal = new ItemUnpureCrystal();
    	fireitegem = new ItemFireiteGem();
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
		//Bronze Tools
       	bronzesword = new ItemBronzeSword("BronzeSword", Alloycraft.Bronze);
       	bronzepick = new ItemBronzePick("BronzePick", Alloycraft.Bronze);
       	bronzespade = new ItemBronzeSpade("BronzeSpade", Alloycraft.Bronze);
       	bronzehoe = new ItemBronzeHoe("BronzeHoe", Alloycraft.Bronze);
       	bronzeaxe = new ItemBronzeAxe("BronzeAxe", Alloycraft.Bronze);
    	
	}
}
