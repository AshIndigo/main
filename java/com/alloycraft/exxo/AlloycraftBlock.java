package com.alloycraft.exxo;

import com.alloycraft.exxo.lib.Refrences;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AlloycraftBlock extends Block {

	public AlloycraftBlock(Material material, String unlocalizedname, String texturename) {
		super(material);
		setBlockName(Refrences.MODID + "_" + unlocalizedname);
		setCreativeTab(Alloycraft.taballoycraft);
		setBlockTextureName(Refrences.MODID + ":" + texturename);
	}
	/* For use later
	public class AlloycraftBlockOreStorage extends  Block {

		public AlloycraftBlockOreStorage(Material material, String unlocalizedname, String texturename, String baseitem) {
			super(material);
			setBlockName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(Alloycraft.taballoycraft);
			setBlockTextureName(Refrences.MODID + ":" + texturename);
		}
		
	}
	*/

}
