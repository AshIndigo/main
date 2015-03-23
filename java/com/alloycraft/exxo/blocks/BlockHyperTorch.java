package com.alloycraft.exxo.blocks;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;

public class BlockHyperTorch extends BlockTorch {
	public BlockHyperTorch() {
		super();
		setBlockName(Refrences.MODID + "_" + "BlockHyperTorch");
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + "BlockHyperTorch");
	}

}
