package com.ashindigo.basicgems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsBasicGems extends CreativeTabs {
		
	public CreativeTabsBasicGems(String BasicGems) {
		super(BasicGems);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return BasicGems.rubysword;
	}
}