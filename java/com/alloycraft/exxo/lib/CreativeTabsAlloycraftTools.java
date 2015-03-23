package com.alloycraft.exxo.lib;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import akka.japi.Function;

import com.alloycraft.exxo.Alloycraft;
import com.google.common.collect.Ordering;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsAlloycraftTools extends CreativeTabs {
	
	public CreativeTabsAlloycraftTools(String Alloycraft) {
		super(Alloycraft);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Alloycraft.goldironblock);
	}

}