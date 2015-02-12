package com.alloycraft.exxo.lib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.nealecraft.mod.Nealecraft;
import net.nealecraft.mod.container.ContainerAlabasterOven;
import net.nealecraft.mod.container.ContainerIngotMasher;
import net.nealecraft.mod.container.ContainerWorkSurface;
import net.nealecraft.mod.gui.GuiWorkSurface;
import net.nealecraft.mod.tileentity.TileEntityAlabasterOven;
import net.nealecraft.mod.tileentity.TileEntityIngotMasher;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.containers.ContainerAlloyFurnace;
import com.alloycraft.exxo.guis.*;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case Alloycraft.guiIDAlloyFurnace:
				if (entity instanceof TileEntityAlloyFurnace) {
					return new ContainerAlloyFurnace(player.inventory, (TileEntityAlloyFurnace) entity);
				}
				return null;
				
			}
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case Alloycraft.guiIDAlloyFurnace:
				if (entity instanceof TileEntityAlloyFurnace) {
					return new GuiAlloyFurnace(player.inventory, (TileEntityAlloyFurnace) entity);
				}
				return null;
			}
		}
		
		return null;
	}

}
