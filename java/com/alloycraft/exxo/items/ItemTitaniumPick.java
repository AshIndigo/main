package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemTitaniumPick extends ItemPickaxe {

	public ItemTitaniumPick(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Refrences.MODID + ":" + unlocalizedName);
        setCreativeTab(Alloycraft.taballoycrafttools);
		
	}

}
