package com.ashindigo.morechainarmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsMoreChainArmor extends CreativeTabs {

	public CreativeTabsMoreChainArmor(String MoreChainArmor) {
		super(MoreChainArmor);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return MoreChainArmor.chain;
	}

}