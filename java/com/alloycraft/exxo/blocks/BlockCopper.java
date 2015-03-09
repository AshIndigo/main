package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockCopper extends Block
{
	public BlockCopper()
	{
		super(Material.rock);
		setBlockName(Refrences.MODID + "_" + "BlockCopper");
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + "BlockCopper");
	}
}