package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemCrystalizedSeed extends Item implements IPlantable
{
    private final Block theBlockPlant;
    /**
     * Block ID of the soil this seed food should be planted on.
     */
    private final Block soilId;

    public ItemCrystalizedSeed(Block parBlockPlant, Block parSoilBlock)
    {
        theBlockPlant = parBlockPlant;
        soilId = parSoilBlock;
        setUnlocalizedName(Refrences.MODID + "_" + "CrystalizedSeed");
		setCreativeTab(Alloycraft.taballoycraft);
		setTextureName(Refrences.MODID + ":" + "CrystalizedSeed");
    }

    @Override
    public boolean onItemUse(ItemStack parItemStack, EntityPlayer parPlayer, 
          World parWorld, int parX, int parY, int parZ, int par7, float par8, 
          float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (parPlayer.canPlayerEdit(parX, parY+1, parZ, par7, parItemStack))
        {
            if (parWorld.getBlock(parX, parY, parZ).canSustainPlant(parWorld, 
                  parX, parY, parZ, ForgeDirection.UP, this) && parWorld
                  .isAirBlock(parX, parY+1, parZ))
            {
                parWorld.setBlock(parX, parY+1, parZ, theBlockPlant);
                --parItemStack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
    {
        return EnumPlantType.Crop;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
    {
        return theBlockPlant;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
    {
        return 0;
    }

    public Block getSoilId() 
    {
        return soilId;
    }
}


