package com.alloycraft.exxo.blocks;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.guis.GUIS;
import com.alloycraft.exxo.lib.Refrences;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class AlloySmelter extends Block implements ITileEntityProvider {

    public static String name = "alloyfurnace";
    private String privateName = "alloyfurnace";
    public IIcon[] icons = new IIcon[6];

    public AlloySmelter() {
        super(Material.rock);
        setBlockName(Refrences.MODID + "_" + "alloyfurnace");
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Refrences.MODID + ":" + "alloyfurnace");
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(Alloycraft.instance, GUIS.AlloyFurnace.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }




    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityAlloyFurnace();
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
        }
        
    }
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
}