
package com.alloycraft.exxo.lib;

import net.minecraft.init.Items;
import com.alloycraft.exxo.Alloycraft;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class EventListener {

	public void smelting(ItemSmeltedEvent event)
	{
		if(event.smelting.getItem() == Items.gold_ingot)
		{
			event.player.addStat(Alloycraft.CookieIngot, 1);
		}
	}
}
