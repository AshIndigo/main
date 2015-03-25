package com.alloycraft.exxo.lib;

import baubles.api.IBauble;

import com.alloycraft.exxo.addons.items.BaubleEpicRing;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.Optional.Method;
import cpw.mods.fml.common.registry.GameRegistry;

public class ApiRegistry {
	
	public static Item epicring;
	
	public static void registerBaubles(){
		
		epicring = new BaubleEpicRing();
		GameRegistry.registerItem(epicring, "BaubleEpicRing");
	}

}
