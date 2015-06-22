package com.ashindigo.morechainarmor;

import travellersgear.common.items.ItemTravellersGear;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "morechainarmor", version = "1.0", name = "MoreChainArmor")
public class MoreChainArmor {
	
	public static CreativeTabs tabmorechainarmor = new CreativeTabsMoreChainArmor("MoreChainArmor");
	public static Item chain;
	public static Item nugget;
	public static final String MODID = "morechainarmor";
	//Iron Chain Armor
	public static Item chainironhelmet;
	public static Item chainironplate;
	public static Item chainironleggings;
	public static Item chainironboots;
	//Gold Chain Armor
	public static Item chaingoldhelmet;
	public static Item chaingoldplate;
	public static Item chaingoldleggings;
	public static Item chaingoldboots;
	//Diamond Chain Armor
	public static Item chaindiamondhelmet;
	public static Item chaindiamondplate;
	public static Item chaindiamondleggings;
	public static Item chaindiamondboots;
	//Emerald Chain Armor
	public static Item chainemeraldhelmet;
	public static Item chainemeraldplate;
	public static Item chainemeraldleggings;
	public static Item chainemeraldboots;
	//Quartz Chain Armor
	public static Item chainquartzhelmet;
	public static Item chainquartzplate;
	public static Item chainquartzleggings;
	public static Item chainquartzboots;
	//Nether Star Chain Armor
	public static Item chainnetherstarhelmet;
	public static Item chainnetherstarplate;
	public static Item chainnetherstarleggings;
	public static Item chainnetherstarboots;
    public static ArmorMaterial ARMORCHAINIRON = EnumHelper.addArmorMaterial("IronChain", 8, new int[] {2, 4, 2, 2}, 30);
    public static ArmorMaterial ARMORCHAINGOLD = EnumHelper.addArmorMaterial("GoldChain", 16, new int[] {2, 3, 2, 1}, 15);
    public static ArmorMaterial ARMORCHAINDIAMOND = EnumHelper.addArmorMaterial("DiamondChain", 20, new int[] {2, 5, 3, 2}, 20);
    public static ArmorMaterial ARMORCHAINEMERALD = EnumHelper.addArmorMaterial("EmeraldChain", 16, new int[] {2, 4, 4, 1}, 15);
    public static ArmorMaterial ARMORCHAINQUARTZ = EnumHelper.addArmorMaterial("QuartzChain", 20, new int[] {2, 8, 4, 3}, 20);
    public static ArmorMaterial ARMORCHAINNETHERSTAR = EnumHelper.addArmorMaterial("NetherStarChain", 20, new int[] {2, 8, 4, 3}, 20);
	
	//@SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
	//public static CommonProxy proxy;
	    
	@Mod.Instance(MODID)
	public static MoreChainArmor instance;
	    
	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
    	Registry.registerItems();
    	Registry.registerRecipes();
    	Registry.registerDictionary();
	}

}
