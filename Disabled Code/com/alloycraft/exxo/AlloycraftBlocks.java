package com.alloycraft.exxo;

import com.alloycraft.exxo.blocks.*;
import com.ashindigo.api.IndigoApiBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class AlloycraftBlocks {

	//Blocks
    public static Block cookieblock;
    public static Block hellishblock;
    public static Block goldironblock;
    public static Block copperblock;
    public static Block tinblock;
    public static Block whatthehellblock;
    public static Block alloysmelteridle;
    public static Block alloysmelteractive;
    public static Block rainbowwool;
    public static Block crystalizeridle;
    public static Block crystalizeractive;
    public static Block hypertorch;
	public static Block crystalizedplant;
    //Ore
    public static Block yttriumore;
    public static Block copperore;
    public static Block tinore;
    public static Block fireiteore;
    public static Block titaniumore;
    public static Block limoniteore;
	
	public static void registerBlocks() {
		
		cookieblock = new BlockCookie().setHardness(3.0F);
    	whatthehellblock = new BlockWhatTheHell().setHardness(9000.1F);
    	tinblock = new BlockTin().setHardness(3.0F);
    	copperblock = new IndigoApiBlock.IndigoApiBlockOreStorage(Material.rock, "copperblock", "copperblock", AlloycraftItems.copperingot, AlloycraftBlocks.copperblock, Alloycraft.taballoycraft).setHardness(3.0F);
    	//copperblock = new IndigoApiBlock(Material.rock, "copperblock", "copperblock", Alloycraft.taballoycraft).setHardness(3.0F);
    	goldironblock = new BlockGoldIron().setHardness(3.0F);
    	hellishblock = new BlockHellish().setHardness(3.0F);
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F).setLightLevel(0.02F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	crystalizeridle = new Crystalizer(false).setBlockName("CrystalizerIdle").setHardness(3.5F).setLightLevel(0.02F);
    	crystalizeractive = new Crystalizer(true).setBlockName("CrystalizerActive").setLightLevel(0.625F).setHardness(3.5F);
    	rainbowwool = new BlockRainbowWool().setHardness(1.0F);
    	hypertorch = new BlockHyperTorch().setLightLevel(2.0F).setHardness(0.0F);
    	crystalizedplant = new BlockCrystalizedPlant();
    	//Ore
    	yttriumore = new BlockYttriumOre().setHardness(3.0F);
    	//copperore = new IndigoApiBlock.AlloycraftBlockOre(Material.rock, "CopperOre", "CopperOre", AlloycraftItems.copperingot, AlloycraftBlocks.copperore, Alloycraft.taballoycraft).setHardness(3.0F);
    	copperore = new IndigoApiBlock(Material.rock, "CopperOre", "BlockCopperOre", Alloycraft.taballoycraft, AlloycraftBlocks.copperore).setHardness(3.0F);
    	tinore = new BlockTinOre().setHardness(3.0F);
    	titaniumore = new BlockTitaniumOre().setHardness(3.0F);
    	fireiteore = new BlockFireiteOre().setHardness(3.0F);
    	limoniteore = new IndigoApiBlock(Material.rock, "LimoniteOre", "LimoniteOre".toLowerCase(), Alloycraft.taballoycraft, AlloycraftBlocks.limoniteore);
	}
	
	//For use later
}
