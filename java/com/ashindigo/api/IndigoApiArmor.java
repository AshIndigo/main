package com.ashindigo.api;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;


public class IndigoApiArmor extends ItemArmor {
	public String textureName;

	public IndigoApiArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type, CreativeTabs creativetab) {
		super(material, type, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Refrences.MODID + ":" + unlocalizedName);
	    setCreativeTab(creativetab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Refrences.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
