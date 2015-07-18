package com.ashindigo.basicgems;

import com.alloycraft.exxo.AlloycraftBlocks;
import com.alloycraft.exxo.AlloycraftItems;
import com.ashindigo.morechainarmor.ArmorChainGold;
import com.ashindigo.morechainarmor.ItemChain;
import com.ashindigo.morechainarmor.ItemNugget;
import com.ashindigo.morechainarmor.MoreChainArmor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

//@Mod(modid = BasicGems.MODID, version = "1.0", name = "BasicGems")
public class BasicGems {
	
	public static final String MODID = "basicgems";
	//public static CreativeTabs tabbasicgems = new CreativeTabsBasicGems("BasicGems");
	public static Item Gem;
	//Amethyst Armor
	public static Item amethysthelmet;
	public static Item amethystchestplate;
	public static Item amethystleggings;
	public static Item amethystboots;
	//Ruby Armor
	public static Item rubyhelmet;
	public static Item rubychestplate;
	public static Item rubyleggings;
	public static Item rubyboots;
	//Sapphire Armor
	public static Item sapphirehelmet;
	public static Item sapphirechestplate;
	public static Item sapphireleggings;
	public static Item sapphireboots;
	//Amethyst Set
	public static Item amethystpickaxe;
	public static Item amethystaxe;
	public static Item amethystspade;
	public static Item amethystsword;
	public static Item amethysthoe;
	//Ruby Set
	public static Item rubypickaxe;
	public static Item rubyaxe;
	public static Item rubyspade;
	public static Item rubysword;
	public static Item rubyhoe;
	//Sapphire Set
	public static Item sapphirepickaxe;
	public static Item sapphireaxe;
	public static Item sapphirespade;
	public static Item sapphiresword;
	public static Item sapphirehoe;
	public static Block Ore1;
	public static Block Ore2;
	public static Block Ore3;
	public static ArmorMaterial ARMORAMETHYST = EnumHelper.addArmorMaterial("Amethyst", 16, new int[] {2, 3, 2, 1}, 15);
	public static ArmorMaterial ARMORRUBY = EnumHelper.addArmorMaterial("Ruby", 16, new int[] {2, 3, 2, 1}, 15);
	public static ArmorMaterial ARMORSAPPHIRE = EnumHelper.addArmorMaterial("Sapphire", 16, new int[] {2, 3, 2, 1}, 15);
	public static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 2, 400, 5.5F, 2.5F, 30);
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 2, 400, 5.5F, 2.5F, 30);
	public static ToolMaterial Sapphire = EnumHelper.addToolMaterial("Sapphire", 2, 400, 5.5F, 2.5F, 30);
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		
		GameRegistry.registerBlock(BasicGems.Ore1 = new Ore1(Material.rock), "ore1");
		GameRegistry.registerBlock(BasicGems.Ore2 = new Ore2(Material.rock), "ore2");
		GameRegistry.registerBlock(BasicGems.Ore3 = new Ore3(Material.rock), "ore3");
		GameRegistry.registerWorldGenerator(new EventManager(), 5);
		Registry.registerItems();
		Registry.registerRecipes();
	}

}
