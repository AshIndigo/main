package com.ashindigo.basicgems;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class SapphireAxe extends ItemHoe {

	public SapphireAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(BasicGems.MODID + ":" + unlocalizedName);
        setCreativeTab(BasicGems.tabbasicgems);
		
	}

}
