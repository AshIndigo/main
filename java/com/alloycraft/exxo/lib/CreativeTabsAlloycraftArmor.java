package com.alloycraft.exxo.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftBlocks;
import com.alloycraft.exxo.AlloycraftItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsAlloycraftArmor extends CreativeTabs {

	public CreativeTabsAlloycraftArmor(String Alloycraft) {
		super(Alloycraft);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return AlloycraftItems.goldironchestplate;
	}

}