package com.alloycraft.exxo.containers;

import com.alloycraft.exxo.slots.SlotCrystalizer;
import com.alloycraft.exxo.tileenties.TileEntityCrystalizer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerCrystalizer extends Container {

	private TileEntityCrystalizer Crystalizer;
	private int dualCookTime;
	private int dualPower;
	private int lastItemBurnTime;
	
	public ContainerCrystalizer(InventoryPlayer invPlayer, TileEntityCrystalizer teCrystalizer) {
		dualCookTime = 0;
		dualPower = 0;
		lastItemBurnTime = 0;
		
		Crystalizer = teCrystalizer;
		
		this.addSlotToContainer(new Slot(teCrystalizer, 0, 45, 17));
		this.addSlotToContainer(new Slot(teCrystalizer, 1, 45, 49));
		this.addSlotToContainer(new Slot(teCrystalizer, 2, 8, 56));
		this.addSlotToContainer(new SlotCrystalizer(invPlayer.player, teCrystalizer, 3, 113, 33));
		
		//Inventory
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		//ActionBar
		for(int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
	}
	
	public void addCraftingToCrafters (ICrafting crafting) {
		super.addCraftingToCrafters(crafting);
		crafting.sendProgressBarUpdate(this, 0, this.Crystalizer.dualCookTime);
		crafting.sendProgressBarUpdate(this, 1, this.Crystalizer.dualPower);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }	

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return Crystalizer.isUseableByPlayer(player);
	}
}
