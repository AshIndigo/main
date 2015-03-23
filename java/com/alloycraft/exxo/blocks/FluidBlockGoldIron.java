package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class FluidBlockGoldIron extends Block
{
	public FluidBlockGoldIron()
	{
		super(Material.rock);
		setBlockName(Refrences.MODID + "_" + "FluidBlockGoldIron");
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + "FluidBlockGoldIron");
	}
}