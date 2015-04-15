package com.alloycraft.exxo;

import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AlloycraftBlock extends Block {

	public AlloycraftBlock(Material material, String unlocalizedname, String texturename) {
		super(material);
		setBlockName(Refrences.MODID + "_" + unlocalizedname);
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + texturename);
	}

}
