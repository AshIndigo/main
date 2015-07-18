package com.ashindigo.basicgems;

import java.util.List;

import com.ashindigo.morechainarmor.MoreChainArmor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Gem extends Item {
	
	public IIcon[] icons = new IIcon[3];
	
	public Gem()
	{
		setUnlocalizedName(BasicGems.MODID + "_" + "Gem");
		//setCreativeTab(MoreChainArmor.tabmorechainarmor);
		setTextureName(BasicGems.MODID + ":" + "Gem");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > 3)
	        meta = 0;

	    return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 3; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
		for (int i = 0; i < 3; i ++) {
			this.icons[i] = reg.registerIcon(BasicGems.MODID + ":Gem_" + i);
		}
	}
}
