package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockFireiteOre extends Block
{
	public BlockFireiteOre()
	{
		super(Material.rock);
		setBlockName(Refrences.MODID + "_" + "BlockFireiteOre");
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + "BlockFireiteOre");
	}
}