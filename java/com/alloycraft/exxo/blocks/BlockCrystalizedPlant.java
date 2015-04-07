package com.alloycraft.exxo.blocks;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.lib.BlockPlantBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCrystalizedPlant extends BlockPlantBase
{

    public BlockCrystalizedPlant()
    {
        // Basic block setup
        setBlockName("crystalizedplant");
        setBlockTextureName("alloycraft:crystalizedplant_stage_0");
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
     // DEBUG
     System.out.println("BlockBlueberry getItemDropped()");
        return (AlloycraftItems.plantgem);
    }
    
    @Override
    public void updateTick(World parWorld, int parX, int parY, int parZ, Random parRand)
    {
        super.updateTick(parWorld, parX, parY, parZ, parRand);
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 1;

        if (growStage > 7)
        {
            growStage = 7;
        }

        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_0");
          iIcon[1] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_0");
          iIcon[2] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_1");
          iIcon[3] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_1");
          iIcon[4] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_2");
          iIcon[5] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_2");
          iIcon[6] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_3");
          iIcon[7] = parIIconRegister.registerIcon("alloycraft:crystalizedplant_stage_3");
    }
}