package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockGoldIron extends Block
{
	public BlockGoldIron()
	{
		super(Material.rock);
		setBlockName(Refrences.MODID + "_" + "BlockGoldIron");
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + "BlockGoldIron");
	}
}