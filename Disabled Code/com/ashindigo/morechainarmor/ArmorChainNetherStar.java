package com.ashindigo.morechainarmor;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorChainNetherStar extends ItemArmor {
	public String textureName;

	public ArmorChainNetherStar(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(MoreChainArmor.MODID + ":" + unlocalizedName);
	    setCreativeTab(MoreChainArmor.tabmorechainarmor);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return MoreChainArmor.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(MoreChainArmor.chainnetherstarhelmet) 
				&& player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(MoreChainArmor.chainnetherstarleggings) 
				&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(MoreChainArmor.chainnetherstarplate) 
				&& player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(MoreChainArmor.chainnetherstarboots))
		{
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20*1));
		}
	}
}
