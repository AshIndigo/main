package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSteelSpade extends ItemSpade {

		public ItemSteelSpade(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(Refrences.MODID + ":" + unlocalizedName);
	        setCreativeTab(Alloycraft.taballoycrafttools);
	        

}
}
