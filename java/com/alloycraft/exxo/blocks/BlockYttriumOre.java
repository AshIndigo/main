package com.alloycraft.exxo.blocks;
 
import com.alloycraft.exxo.*;
import com.alloycraft.exxo.lib.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class BlockYttriumOre extends Block
{
	public BlockYttriumOre()
	{
		super(Material.rock);
		setBlockName(Refrences.MODID + "_" + "BlockYttriumOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(Refrences.MODID + ":" + "BlockYttriumOre");
	}
}