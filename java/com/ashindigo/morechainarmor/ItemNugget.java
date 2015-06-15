package com.ashindigo.morechainarmor;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemNugget extends Item {
	
	public IIcon[] icons = new IIcon[6];
	
	public ItemNugget()
	{
		setUnlocalizedName(MoreChainArmor.MODID + "_" + "Nugget");
		setCreativeTab(MoreChainArmor.tabmorechainarmor);
		setTextureName(MoreChainArmor.MODID + ":" + "Nugget");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > 5)
	        meta = 0;

	    return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 6; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
}

