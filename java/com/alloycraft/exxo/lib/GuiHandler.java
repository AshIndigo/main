package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.guis.*;
import com.alloycraft.exxo.guis.GuiAlloyFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == GUIS.AlloyFurnace.ordinal()) return new GuiAlloyFurnace(player, world, x, y, z);
        else return null;
        
    }
} 