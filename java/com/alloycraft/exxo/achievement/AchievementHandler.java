package com.alloycraft.exxo.achievement;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftBlocks;

import net.minecraft.item.Item;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementHandler {
	
	@SubscribeEvent
	public void notifyPickup(PlayerEvent.ItemPickupEvent e) {
	}
	
	@SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent e) {
		
		if (e.crafting.getItem().equals(
				Item.getItemFromBlock(AlloycraftBlocks.alloysmelteridle))) {
				e.player.addStat(Alloycraft.alloyfurnaceachievement, 1);
				}
	}
	
	@SubscribeEvent
	public void onSmelting(PlayerEvent.ItemSmeltedEvent e) {
	}

}
