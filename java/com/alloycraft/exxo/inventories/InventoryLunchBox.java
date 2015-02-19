package com.alloycraft.exxo.inventories;

import com.alloycraft.exxo.items.ItemLunchBox;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

public class InventoryLunchBox implements IInventory
{
private String name = "LunchBox";
public static final int INV_SIZE = 8;
private ItemStack[] inventory = new ItemStack[INV_SIZE];
private final ItemStack invItem;

public InventoryLunchBox(ItemStack stack)
{
this.invItem = stack;
if (!stack.hasTagCompound())
{
stack.setTagCompound(new NBTTagCompound());
}
readFromNBT(stack.getTagCompound());
}

@Override
public int getSizeInventory()
{
return inventory.length;
}

@Override
public ItemStack getStackInSlot(int slot)
{
return inventory[slot];
}

@Override
public ItemStack decrStackSize(int slot, int amount)
{
ItemStack stack = getStackInSlot(slot);
if(stack != null)
{
if(stack.stackSize > amount)
{
stack = stack.splitStack(amount);
markDirty();
}
else
{
setInventorySlotContents(slot, null);
}
}
return stack;
}

@Override
public ItemStack getStackInSlotOnClosing(int slot)
{
ItemStack stack = getStackInSlot(slot);
if(stack != null)
{
setInventorySlotContents(slot, null);
}
return stack;
}

	@Override
public void setInventorySlotContents(int slot, ItemStack itemstack)
{
this.inventory[slot] = itemstack;

if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit())
{
itemstack.stackSize = this.getInventoryStackLimit();
}

// 1.7.2 change to markDirty()
markDirty();
}

// 1.7.2 change to getInventoryName
@Override
public String getInventoryName()
{
return name;
}

// 1.7.2 change to hasCustomInventoryName
@Override
public boolean  hasCustomInventoryName()
{
return name.length() > 0;
}

@Override
public int getInventoryStackLimit()
{
return 64;
}

@Override
public void markDirty()
{
for (int i = 0; i < getSizeInventory(); ++i)
{
if (getStackInSlot(i) != null && getStackInSlot(i).stackSize == 0)
inventory[i] = null;
}
writeToNBT(invItem.getTagCompound());
}

@Override
public boolean isUseableByPlayer(EntityPlayer player)
{

return player.getHeldItem() == invItem;
}

@Override
public void openInventory() {}

@Override
public void closeInventory() {}

@Override
public boolean isItemValidForSlot(int slot, ItemStack itemstack)
{
return !(itemstack.getItem() instanceof ItemLunchBox);
}

/**
* A custom method to read our inventory from an ItemStack's NBT compound
*/
public void readFromNBT(NBTTagCompound tagcompound)
{
// Gets the custom taglist we wrote to this compound, if any
// 1.7.2 change to compound.getTagList("ItemInventory", Constants.NBT.TAG_COMPOUND);
	NBTTagList items = tagcompound.getTagList("ItemLunchBox", Constants.NBT.TAG_COMPOUND);

for (int i = 0; i < items.tagCount(); ++i)
{

	NBTTagCompound item = items.getCompoundTagAt(i);
byte slot = item.getByte("Slot");

if (slot >= 0 && slot < getSizeInventory()) {
inventory[slot] = ItemStack.loadItemStackFromNBT(item);
}
}
}

/**
* A custom method to write our inventory to an ItemStack's NBT compound
*/
public void writeToNBT(NBTTagCompound tagcompound)
{

NBTTagList items = new NBTTagList();

for (int i = 0; i < getSizeInventory(); ++i)
{

if (getStackInSlot(i) != null)
{
NBTTagCompound item = new NBTTagCompound();
item.setInteger("Slot", i);
getStackInSlot(i).writeToNBT(item);

items.appendTag(item);
}
}
tagcompound.setTag("ItemInventory", items);
}
}