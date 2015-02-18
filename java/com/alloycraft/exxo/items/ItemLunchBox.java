package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.inventories.InventoryLunchBox;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLunchBox extends Item
{
public ItemLunchBox()
{
//ItemStacks that store an NBT Tag Compound are limited to stack size of 1
setMaxStackSize(1);
}

//Without this method, your inventory will NOT work!!!
@Override
public int getMaxItemUseDuration(ItemStack stack) {
return 1; // return any value greater than zero
}

@Override
public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
//only want to check on server - the client gui will be opened automatically by the gui handler
if (!world.isRemote) {
//you may or may not want to check if the player is sneaking - up to you
if (!player.isSneaking()) {
//open the inventory:
player.openGui(Alloycraft.instance, Alloycraft.guiIDLunchBox, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
} else {
//if you're sneaky, I'll throw some diamonds in your back for you, but only in the first slot!
new InventoryLunchBox(player.getHeldItem()).setInventorySlotContents(0, new ItemStack(Items.diamond, 4));
}
}
return stack;
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon("inventoryitemmod:" + getUnlocalizedName().substring(5));
}
}