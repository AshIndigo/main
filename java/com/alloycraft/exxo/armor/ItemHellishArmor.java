package com.alloycraft.exxo.armor;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;
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

public class ItemHellishArmor extends ItemArmor {
	public String textureName;

	public ItemHellishArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Refrences.MODID + ":" + unlocalizedName);
	    setCreativeTab(Alloycraft.taballoycrafttools);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Refrences.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(AlloycraftItems.hellishboots) 
				&& player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(AlloycraftItems.hellishleggings) 
				&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(AlloycraftItems.hellishchestplate) 
				&& player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(AlloycraftItems.hellishhelmet))
		{
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20*1));
		}
	}

}
