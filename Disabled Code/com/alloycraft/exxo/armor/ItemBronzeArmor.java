package com.alloycraft.exxo.armor;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemBronzeArmor extends ItemArmor {
	public String textureName;

	public ItemBronzeArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Refrences.MODID + ":" + unlocalizedName);
	    setCreativeTab(Alloycraft.taballoycraftarmor);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Refrences.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
