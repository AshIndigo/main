package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockCookie extends Block
{
	public BlockCookie()
	{
		super(Material.rock);
		setBlockName(Refrences.MODID + "_" + "BlockCookie");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(Refrences.MODID + ":" + "BlockCookie");
	}
}