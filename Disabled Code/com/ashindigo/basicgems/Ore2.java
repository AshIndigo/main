package com.ashindigo.basicgems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ore2 extends Block {

	protected Ore2(Material p_i45394_1_) {
		super(p_i45394_1_);
		setBlockName(BasicGems.MODID + "_" + "Ore2");
		setCreativeTab(BasicGems.tabbasicgems);
		setBlockTextureName(BasicGems.MODID + ":" + "Ore2");
	}

}
