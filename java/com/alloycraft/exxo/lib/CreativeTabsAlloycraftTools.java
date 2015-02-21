package com.alloycraft.exxo.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.alloycraft.exxo.Alloycraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsAlloycraftTools extends CreativeTabs {

public CreativeTabsAlloycraftTools(String Alloycraft)
{
super(Alloycraft);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(Alloycraft.goldironblock);
}

}