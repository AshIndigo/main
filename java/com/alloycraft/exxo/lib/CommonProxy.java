package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.containers.ContainerLunchBox;
import com.alloycraft.exxo.guis.GuiLunchBox;
import com.alloycraft.exxo.inventories.InventoryLunchBox;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler
{
public void registerRenderers() {}

@Override
public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
{
//Hooray, no 'magic' numbers - we know exactly which Gui this refers to
if (guiId == InventoryLunchBox.guiIDLunchBox)
{
//Use the player's held item to create the inventory
return new ContainerLunchBox(player, player.inventory, new InventoryLunchBox(player.getHeldItem()));
}
return null;
}

@Override
public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
{
if (guiId == InventoryLunchBox.guiIDLunchBox)
{
//We have to cast the new container as our custom class
//and pass in currently held item for the inventory
return new GuiLunchBox((ContainerLunchBox) new ContainerLunchBox(player, player.inventory, new InventoryLunchBox(player.getHeldItem())));
}
return null;
}
	}

