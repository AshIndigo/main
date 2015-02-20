package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.inventories.InventoryLunchBox;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLunchBox extends Item
{
public ItemLunchBox()
{
	setCreativeTab(CreativeTabs.tabMisc);
setMaxStackSize(1);
}


@Override
public int getMaxItemUseDuration(ItemStack stack) {
return 1;
}

@Override
public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
if (!world.isRemote) {
if (!player.isSneaking()) {
player.openGui(Alloycraft.instance, Alloycraft.guiIDLunchBox, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
} else {
new InventoryLunchBox(player.getHeldItem()).setInventorySlotContents(0, new ItemStack(Items.diamond, 4));
}
}
return stack;
}
}