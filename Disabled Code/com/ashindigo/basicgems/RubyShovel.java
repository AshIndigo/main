package com.ashindigo.basicgems;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class RubyShovel extends ItemSpade {

	public RubyShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(BasicGems.MODID + ":" + unlocalizedName);
		setCreativeTab(BasicGems.tabbasicgems);

	}
}
