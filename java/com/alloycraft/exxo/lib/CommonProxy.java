package com.alloycraft.exxo.lib;

import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerTileEntities(){
        GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, TileEntityAlloyFurnace.name);
    }
}