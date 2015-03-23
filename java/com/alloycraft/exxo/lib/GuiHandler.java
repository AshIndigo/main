package com.alloycraft.exxo.lib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.containers.ContainerAlloyFurnace;
import com.alloycraft.exxo.containers.ContainerCrystalizer;
import com.alloycraft.exxo.guis.GuiAlloyFurnace;
import com.alloycraft.exxo.guis.GuiCrystalizer;
import com.alloycraft.exxo.guis.GuiLunchBox;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;
import com.alloycraft.exxo.tileenties.TileEntityCrystalizer;

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
			case Alloycraft.guiIDCrystalizer:
				if (entity instanceof TileEntityCrystalizer) {
					return new ContainerCrystalizer(player.inventory, (TileEntityCrystalizer) entity);
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
			case Alloycraft.guiIDCrystalizer:
				if (entity instanceof TileEntityCrystalizer) {
					return new GuiCrystalizer(player.inventory, (TileEntityCrystalizer) entity);
				}
				return null;
			}
		}
		
		return null;
	}
}
