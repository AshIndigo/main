package com.alloycraft.exxo;

import com.alloycraft.exxo.blocks.AlloySmelter;
import com.alloycraft.exxo.blocks.BlockCookie;
import com.alloycraft.exxo.blocks.BlockCopper;
import com.alloycraft.exxo.blocks.BlockCopperOre;
import com.alloycraft.exxo.blocks.BlockFireiteOre;
import com.alloycraft.exxo.blocks.BlockGoldIron;
import com.alloycraft.exxo.blocks.BlockHellish;
import com.alloycraft.exxo.blocks.BlockHyperTorch;
import com.alloycraft.exxo.blocks.BlockRainbowWool;
import com.alloycraft.exxo.blocks.BlockTin;
import com.alloycraft.exxo.blocks.BlockTinOre;
import com.alloycraft.exxo.blocks.BlockWhatTheHell;
import com.alloycraft.exxo.blocks.BlockYttriumOre;
import com.alloycraft.exxo.blocks.Crystalizer;
import net.minecraft.block.Block;
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
    //Ore
    public static Block yttriumore;
    public static Block copperore;
    public static Block tinore;
    public static Block fireiteore;
	
	public static void registerBlocks() {
		
		cookieblock = new BlockCookie().setHardness(3.0F);
    	whatthehellblock = new BlockWhatTheHell().setHardness(9000.1F);
    	tinblock = new BlockTin().setHardness(3.0F);
    	copperblock = new BlockCopper().setHardness(3.0F);
    	goldironblock = new BlockGoldIron().setHardness(3.0F);
    	hellishblock = new BlockHellish().setHardness(3.0F);
    	alloysmelteridle = new AlloySmelter(false).setBlockName("AlloyFurnaceIdle").setHardness(3.5F).setLightLevel(0.02F);
    	alloysmelteractive = new AlloySmelter(true).setBlockName("AlloyFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	crystalizeridle = new Crystalizer(false).setBlockName("CrystalizerIdle").setHardness(3.5F).setLightLevel(0.02F);
    	crystalizeractive = new Crystalizer(true).setBlockName("CrystalizerActive").setLightLevel(0.625F).setHardness(3.5F);
    	rainbowwool = new BlockRainbowWool().setHardness(1.0F);
    	hypertorch = new BlockHyperTorch().setLightLevel(2.0F).setHardness(0.0F);
    	//Ore
    	yttriumore = new BlockYttriumOre().setHardness(3.0F);
    	copperore = new BlockCopperOre().setHardness(3.0F);
    	tinore = new BlockTinOre().setHardness(3.0F);
    	fireiteore = new BlockFireiteOre().setHardness(3.0F);
	}
	
	//For use later
}
