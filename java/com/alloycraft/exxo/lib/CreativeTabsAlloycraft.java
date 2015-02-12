package com.alloycraft.exxo.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.alloycraft.exxo.Alloycraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsAlloycraft extends CreativeTabs {

public CreativeTabsAlloycraft(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(Alloycraft.cookieblock);
}

}