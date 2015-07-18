package com.ashindigo.basicgems;

import java.util.List;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Ore1 extends Block {

	protected Ore1(Material p_i45394_1_) {
		super(p_i45394_1_);
		setBlockName(BasicGems.MODID + "_" + "Ore1");
		setCreativeTab(BasicGems.tabbasicgems);
		setBlockTextureName(BasicGems.MODID + ":" + "Ore1");
	}
	
}
