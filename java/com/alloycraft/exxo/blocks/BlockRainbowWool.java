package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockRainbowWool extends Block
{
	public BlockRainbowWool()
	{
		super(Material.cloth);
		setBlockName(Refrences.MODID + "_" + "BlockRainbowWool");
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + "BlockRainbowWool");
	}
}