package com.alloycraft.exxo.addons.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.wands.ItemFocusBasic;

public class AlloyFocusTest extends ItemFocusBasic {
	
	
	@Override
	public ItemStack onFocusRightClick(ItemStack wandstack, World world,EntityPlayer player, MovingObjectPosition movingobjectposition) {
		
		return null;
	}
	
	@Override
	public void onUsingFocusTick(ItemStack wandstack, EntityPlayer player,int count) {

	}

}
