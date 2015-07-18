package com.ashindigo.basicgems;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class SapphirePickaxe extends ItemPickaxe {

	public SapphirePickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(BasicGems.MODID + ":" + unlocalizedName);
        setCreativeTab(BasicGems.tabbasicgems);
	}

}
