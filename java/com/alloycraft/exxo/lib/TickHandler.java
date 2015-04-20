package com.alloycraft.exxo.lib;

import java.util.EnumSet;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class TickHandler extends TickEvent {

	public TickHandler(Type type, Side side, Phase phase) {
		super(type, side, phase);
		// TODO Auto-generated constructor stub
	}
}
	