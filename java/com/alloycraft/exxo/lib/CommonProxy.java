package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.containers.ContainerLunchBox;
import com.alloycraft.exxo.guis.GuiLunchBox;
import com.alloycraft.exxo.inventories.InventoryLunchBox;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {
	public void registerRenderers() {
	}

	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player,
			World world, int x, int y, int z) {
		if (guiId == Alloycraft.guiIDLunchBox) {
			return new ContainerLunchBox(player, player.inventory,
					new InventoryLunchBox(player.getHeldItem()));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player,
			World world, int x, int y, int z) {
		if (guiId == Alloycraft.guiIDLunchBox) {
			return new GuiLunchBox((ContainerLunchBox) new ContainerLunchBox(
					player, player.inventory, new InventoryLunchBox(
							player.getHeldItem())));
		}
		return null;
	}
}
