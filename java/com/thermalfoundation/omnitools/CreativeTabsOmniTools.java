package com.thermalfoundation.omnitools;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsOmniTools extends CreativeTabs {
		
	public CreativeTabsOmniTools(String BasicGems) {
		super(BasicGems);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return OmniTools.omnitool3;
	}
}