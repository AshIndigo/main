package com.alloycraft.exxo.libs;

import net.minecraft.init.Items;

import com.alloycraft.exxo.Alloycraft;

import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class EventListener {

	 public void crafting(ItemSmeltedEvent event)
	 {
	 if(event.smelting.getItem() == Alloycraft.cookieingot)
	 {
	 event.player.addStat(Alloycraft.CookieIngot, 1);
	 }
	 {
	 if(event.smelting.getItem() == Alloycraft.yttriumingot)
	 {
	 event.player.addStat(Alloycraft.YttriumIngot, 1);
	 }
}
}
}