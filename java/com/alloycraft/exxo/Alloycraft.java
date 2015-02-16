package com.alloycraft.exxo;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

import com.alloycraft.exxo.armor.ItemGoldIronArmor;
import com.alloycraft.exxo.blocks.AlloySmelter;
import com.alloycraft.exxo.blocks.BlockCookie;
import com.alloycraft.exxo.blocks.BlockGoldIron;
import com.alloycraft.exxo.blocks.BlockHellish;
import com.alloycraft.exxo.blocks.BlockWhatTheHell;
import com.alloycraft.exxo.blocks.BlockYttriumOre;
import com.alloycraft.exxo.entities.EntityProjectXBolt;
import com.alloycraft.exxo.items.ItemCookieIngot;
import com.alloycraft.exxo.items.ItemGoldIronAxe;
import com.alloycraft.exxo.items.ItemGoldIronHoe;
import com.alloycraft.exxo.items.ItemGoldIronIngot;
import com.alloycraft.exxo.items.ItemGoldIronPick;
import com.alloycraft.exxo.items.ItemGoldIronSpade;
import com.alloycraft.exxo.items.ItemGoldIronSword;
import com.alloycraft.exxo.items.ItemHellishIngot;
import com.alloycraft.exxo.items.ItemLapisLavonium;
import com.alloycraft.exxo.items.ItemProjectX;
import com.alloycraft.exxo.items.ItemProjectXAmmo;
import com.alloycraft.exxo.items.ItemWhatTheHellIngot;
import com.alloycraft.exxo.items.ItemYttriumIngot;
import com.alloycraft.exxo.lib.CommonProxy;
import com.alloycraft.exxo.lib.CreativeTabsAlloycraft;
import com.alloycraft.exxo.lib.EventManager;
import com.alloycraft.exxo.lib.GuiHandler;
import com.alloycraft.exxo.lib.Refrences;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refrences.MODID, version = Refrences.VERSION)
public class Alloycraft
{
	//Items and Blocks
    public static Block cookieblock;
    public static Block hellishblock;
    public static Block goldironblock;
    public static Block whatthehellblock;
    public static Block alloysmelteridle;
    public static Block alloysmelteractive;
    public static Block yttriumore;
    public static Item cookieingot;
    public static Item projectxammo;
    public static Item whatthehellingot;
    public static Item hellishingot;
    public static Item goldironingot;
    public static Item yttriumingot;
    public static Item projectx;
    public static Item lapislavonium;
    public static Item goldironsword;
    public static Item goldironpick;
    public static Item goldironspade;
    public static Item goldironhoe;
    public static Item goldironaxe;
    public static Item goldironhelmet;
    public static Item goldironchestplate;
    public static Item goldironleggings;
    public static Item goldironboots;
    public static final int guiIDAlloyFurnace = 5;
    public static CreativeTabs taballoycraft = new CreativeTabsAlloycraft("Alloycraft");
    public static AchievementPage AlloycraftPage;
    public static ToolMaterial GoldIron = EnumHelper.addToolMaterial("GoldIron", 2, 400, 5.5F, 2.5F, 30);
    public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("GoldIron", 14, new int[] {2, 6, 4, 2}, 20);

    @SidedProxy(clientSide = Refrences.CLIENT_PROXY_CLASS, serverSide = Refrences.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.Instance(Refrences.MODID)
    public static Alloycraft instance;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Registry
    	cookieblock = new BlockCookie().setHardness(3.0F);
    	whatthehellblock = new BlockWhatTheHell();
    	goldironblock = new BlockGoldIron().setHardness(3.0F);
    	hellishblock = new BlockHellish().setHardness(3.0F);
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F).setLightLevel(0.02F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	yttriumore = new BlockYttriumOre().setHardness(3.0F);
    	cookieingot = new ItemCookieIngot(3, 0.3f, false);
    	yttriumingot = new ItemYttriumIngot();
    	whatthehellingot = new ItemWhatTheHellIngot();
    	hellishingot = new ItemHellishIngot();
    	lapislavonium = new ItemLapisLavonium();
    	goldironingot = new ItemGoldIronIngot();
    	projectxammo = new ItemProjectXAmmo();
    	goldironsword = new ItemGoldIronSword("GoldIronSword", GoldIron);
    	goldironpick = new ItemGoldIronPick("GoldIronPick", GoldIron);
    	goldironspade = new ItemGoldIronSpade("GoldIronSpade", GoldIron);
    	goldironhoe = new ItemGoldIronHoe("GoldIronHoe", GoldIron);
    	goldironaxe = new ItemGoldIronAxe("GoldIronAxe", GoldIron);
    	projectx = new ItemProjectX();
    	GameRegistry.registerBlock(cookieblock, "BlockCookie");
    	GameRegistry.registerBlock(hellishblock, "BlockHellish");
    	GameRegistry.registerBlock(yttriumore, "YttriumOre");
    	GameRegistry.registerBlock(whatthehellblock, "BlockWHATTHEHELL");
    	GameRegistry.registerBlock(goldironblock, "BlockGoldIron");
    	GameRegistry.registerBlock(alloysmelteridle, "AlloyFurnaceIdle");
    	GameRegistry.registerBlock(alloysmelteractive, "AlloyFurnaceActive");
    	GameRegistry.registerItem(cookieingot, "ItemCookieIngot");
    	GameRegistry.registerItem(hellishingot, "ItemHellishIngot");
    	GameRegistry.registerItem(yttriumingot, "ItemYttriumIngot");
    	GameRegistry.registerItem(goldironingot, "ItemGoldIronIngot");
    	GameRegistry.registerItem(projectx, "ItemProjectX");
    	GameRegistry.registerItem(lapislavonium, "ItemLapisLavonium");
    	GameRegistry.registerItem(goldironsword, "ItemGoldIronSword");
    	GameRegistry.registerItem(goldironpick, "ItemGoldIronPick");
    	GameRegistry.registerItem(goldironaxe, "ItemGoldIronAxe");
    	GameRegistry.registerItem(goldironspade, "ItemGoldIronSpade");
    	GameRegistry.registerItem(goldironhoe, "ItemGoldIronHoe");
    	GameRegistry.registerItem(projectxammo, "ItemProjectXAmmo");
    	GameRegistry.registerItem(whatthehellingot, "ItemWhatTheHellIngot");
    	GameRegistry.registerItem(goldironhelmet = new ItemGoldIronArmor("GoldIronHelmet", ARMOR, "GoldIron", 0), "GoldIronHelmet"); //0 for helmet
    	GameRegistry.registerItem(goldironchestplate = new ItemGoldIronArmor("GoldIronChestplate", ARMOR, "GoldIron", 1), "GoldIronChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(goldironleggings = new ItemGoldIronArmor("GoldIronLeggings", ARMOR, "GoldIron", 2), "GoldIronLeggings"); // 2 for leggings
    	GameRegistry.registerItem(goldironboots = new ItemGoldIronArmor("GoldIronBoots", ARMOR, "GoldIron", 3), "GoldIronBoots"); // 3 for boots
    	GameRegistry.registerWorldGenerator(new EventManager(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	
    	//Recipes
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.cookieblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Items.cookie
    });
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.hellishblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.hellishingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.whatthehellblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.whatthehellingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.whatthehellblock, 1), new Object[]{
        	"AAA",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.whatthehellingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.alloysmelteridle, 1), new Object[]{
        	"AAA",
        	"ABA",
        	"AAA",
        	'A', Alloycraft.yttriumingot, 'B', Blocks.furnace
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironsword, 1), new Object[]{
        	" A ",
        	" A ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironpick, 1), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironspade, 1), new Object[]{
        	" A ",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironhoe, 1), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironhoe, 1), new Object[]{
        	" AA",
        	" B ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironaxe, 1), new Object[]{
        	"AA ",
        	"AB ",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironaxe, 1), new Object[]{
        	" AA ",
        	" BA",
        	" B ",
        	'A', Alloycraft.goldironingot, 'B', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironchestplate, 1), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironboots, 1), new Object[]{
        	"   ",
        	"A A",
        	"A A",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironleggings, 1), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.goldironhelmet, 1), new Object[]{
        	"AAA",
        	"A A",
        	"  ",
        	'A', Alloycraft.goldironingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.projectxammo, 64), new Object[]{
        	"DCD",
        	"ABA",
        	"AAA",
        	'A', Alloycraft.goldironingot, 'C', Items.redstone, 'B', Items.gunpowder, 'D', Blocks.obsidian
    	});
    	GameRegistry.addRecipe(new ItemStack(Alloycraft.projectx, 1), new Object[]{
        	"AA ",
        	"BEA",
        	"CD ",
        	'A', Alloycraft.goldironingot, 'C', Items.leather, 'B', Blocks.tnt, 'D', Blocks.obsidian, 'E', Alloycraft.goldironblock
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.hellishingot, 9), new Object[]{
    	new ItemStack(Alloycraft.hellishblock, 1)
    			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.goldironingot, 9), new Object[]{
        	new ItemStack(Alloycraft.goldironblock, 1)
        			});
    	GameRegistry.addShapelessRecipe(new ItemStack(Alloycraft.whatthehellingot, 9), new Object[]{
        	new ItemStack(Alloycraft.whatthehellblock, 1)
        			});
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.cookieblock, 1), new ItemStack(Alloycraft.cookieingot, 1), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Alloycraft.yttriumore, 1), new ItemStack(Alloycraft.yttriumingot, 1), 0.1F);
    }
    public void init(FMLInitializationEvent event){
    
}
}
