package com.ashindigo.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class IndigoApiSlot extends Slot {

	public IndigoApiSlot(IInventory iiventory, int i, int j,int k) {
		super(iiventory, i, j, k);
		// TODO Auto-generated constructor stub
	}
	
	public IndigoApiSlot(EntityPlayer player, IInventory iiventory, int i, int j, int k) {
		super(iiventory, i, j, k);
		// TODO Auto-generated constructor stub
	}

}
