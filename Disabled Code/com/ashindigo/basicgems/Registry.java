package com.ashindigo.basicgems;

import com.alloycraft.exxo.AlloycraftItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {
	
	public static void registerRecipes(){
		
		//Amethyst Armor
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystchestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(BasicGems.Gem,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(BasicGems.Gem,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(BasicGems.Gem,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethysthelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(BasicGems.Gem,1)
    	});
    	//Ruby Armor
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubychestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(BasicGems.Gem,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(BasicGems.Gem,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(BasicGems.Gem,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(BasicGems.Gem,1,1)
    	});
    	//Sapphire Armor
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphirechestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', new ItemStack(BasicGems.Gem,1,2)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphireboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', new ItemStack(BasicGems.Gem,1,2)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphireleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', new ItemStack(BasicGems.Gem,1,2)
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphirehelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"   ",
        	'A', new ItemStack(BasicGems.Gem,1,2)
    	});
    	//Amethyst Set
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystsword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystpickaxe, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethysthoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethysthoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.amethystaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1), 'B', Items.stick
    	});
    	//Ruby Set
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubysword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubypickaxe, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyhoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyhoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.rubyaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,1), 'B', Items.stick
    	});
    	//Sapphire Set
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphiresword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphirepickaxe, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphirespade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphirehoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphirehoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphireaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(BasicGems.sapphireaxe, 1), new Object[]{
        	" AA",
        	" BA",
        	" B ",
        	'A', new ItemStack(BasicGems.Gem,1,2), 'B', Items.stick
    	});
    	GameRegistry.addSmelting(new ItemStack(BasicGems.Ore1, 1), new ItemStack(BasicGems.Gem,1, 0), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(BasicGems.Ore2, 1), new ItemStack(BasicGems.Gem,1, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(BasicGems.Ore3, 1), new ItemStack(BasicGems.Gem,1, 2), 0.1F);
	}

	public static void registerItems() {
	
		GameRegistry.registerItem(BasicGems.Gem = new Gem(), "gem");
		//Amethyst Armor
		GameRegistry.registerItem(BasicGems.amethysthelmet = new ArmorAmethyst("AmethystHelmet", BasicGems.ARMORAMETHYST, "Amethyst", 0), "AmethystHelmet");
    	GameRegistry.registerItem(BasicGems.amethystchestplate = new ArmorAmethyst("AmethystChestplate", BasicGems.ARMORAMETHYST, "Amethyst", 1), "AmethystChestplate");
    	GameRegistry.registerItem(BasicGems.amethystleggings = new ArmorAmethyst("AmethystLeggings", BasicGems.ARMORAMETHYST, "Amethyst", 2), "AmethystLeggings"); 
    	GameRegistry.registerItem(BasicGems.amethystboots = new ArmorAmethyst("AmethystBoots", BasicGems.ARMORAMETHYST, "Amethyst", 3), "AmethystBoots");
    	//Ruby Armor
    	GameRegistry.registerItem(BasicGems.rubyhelmet = new ArmorRuby("RubyHelmet", BasicGems.ARMORRUBY, "Ruby", 0), "RubyHelmet");
    	GameRegistry.registerItem(BasicGems.rubychestplate = new ArmorRuby("RubyChestplate", BasicGems.ARMORRUBY, "Ruby", 1), "RubyChestplate");
    	GameRegistry.registerItem(BasicGems.rubyleggings = new ArmorRuby("RubyLeggings", BasicGems.ARMORRUBY, "Ruby", 2), "RubyLeggings"); 
		GameRegistry.registerItem(BasicGems.rubyboots = new ArmorRuby("RubyBoots", BasicGems.ARMORRUBY, "Ruby", 3), "RubyBoots");
	   	//Sapphire Armor
	   	GameRegistry.registerItem(BasicGems.sapphirehelmet = new ArmorSapphire("SapphireHelmet", BasicGems.ARMORSAPPHIRE, "Sapphire", 0), "SapphireHelmet");
	   	GameRegistry.registerItem(BasicGems.sapphirechestplate = new ArmorSapphire("SapphireChestplate", BasicGems.ARMORSAPPHIRE, "Sapphire", 1), "SapphireChestplate");
	   	GameRegistry.registerItem(BasicGems.sapphireleggings = new ArmorSapphire("SapphireLeggings", BasicGems.ARMORSAPPHIRE, "Sapphire", 2), "SapphireLeggings"); 
	   	GameRegistry.registerItem(BasicGems.sapphireboots = new ArmorSapphire("SapphireBoots", BasicGems.ARMORSAPPHIRE, "Sapphire", 3), "SapphireBoots");
	   	//Amethyst Set
	   	GameRegistry.registerItem(BasicGems.amethystpickaxe = new AmethystPickaxe("AmethystPickaxe".toLowerCase(), BasicGems.Amethyst), "AmethystPickaxe");
	   	GameRegistry.registerItem(BasicGems.amethystaxe = new AmethystAxe("AmethystAxe".toLowerCase(), BasicGems.Amethyst), "AmethystAxe");
	   	GameRegistry.registerItem(BasicGems.amethystspade = new AmethystShovel("AmethystShovel".toLowerCase(), BasicGems.Amethyst), "AmethystShovel");
	   	GameRegistry.registerItem(BasicGems.amethysthoe = new AmethystHoe("AmethystHoe".toLowerCase(), BasicGems.Amethyst), "AmethystHoe");
	   	GameRegistry.registerItem(BasicGems.amethystsword = new AmethystSword("AmethystSword".toLowerCase(), BasicGems.Amethyst), "AmethystSword");
	   	//Ruby Set
	   	GameRegistry.registerItem(BasicGems.rubypickaxe = new RubyPickaxe("RubyPickaxe".toLowerCase(), BasicGems.Ruby), "RubyPickaxe");
	   	GameRegistry.registerItem(BasicGems.rubyaxe = new RubyAxe("RubyAxe".toLowerCase(), BasicGems.Ruby), "RubyAxe");
	   	GameRegistry.registerItem(BasicGems.rubyspade = new RubyShovel("RubyShovel".toLowerCase(), BasicGems.Ruby), "RubyShovel");
	   	GameRegistry.registerItem(BasicGems.rubyhoe = new RubyHoe("RubyHoe".toLowerCase(), BasicGems.Ruby), "RubyHoe");
	   	GameRegistry.registerItem(BasicGems.rubysword = new RubySword("RubySword".toLowerCase(), BasicGems.Ruby), "RubySword");
	  	//Sapphire Set
	   	GameRegistry.registerItem(BasicGems.sapphirepickaxe = new SapphirePickaxe("SapphirePickaxe".toLowerCase(), BasicGems.Sapphire), "SapphirePickaxe");
	   	GameRegistry.registerItem(BasicGems.sapphireaxe = new SapphireAxe("SapphireAxe".toLowerCase(), BasicGems.Sapphire), "SapphireAxe");
	   	GameRegistry.registerItem(BasicGems.sapphirespade = new SapphireShovel("SapphireShovel".toLowerCase(), BasicGems.Sapphire), "SapphireShovel");
	   	GameRegistry.registerItem(BasicGems.sapphirehoe = new SapphireHoe("SapphireHoe".toLowerCase(), BasicGems.Sapphire), "SapphireHoe");
	   	GameRegistry.registerItem(BasicGems.sapphiresword = new SapphireSword("SapphireSword".toLowerCase(), BasicGems.Sapphire), "SapphireSword");
	}

}
