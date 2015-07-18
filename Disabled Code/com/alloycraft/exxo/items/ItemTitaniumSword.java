package com.alloycraft.exxo.items;

import net.minecraft.item.ItemSword;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

public class ItemTitaniumSword extends ItemSword {

	public ItemTitaniumSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Refrences.MODID + ":" + unlocalizedName);
        setCreativeTab(Alloycraft.taballoycrafttools);
	}

}
