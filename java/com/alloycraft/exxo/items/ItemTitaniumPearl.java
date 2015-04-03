package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTitaniumPearl extends ItemEnderPearl {
	
	public ItemTitaniumPearl()
	{
		setUnlocalizedName(Refrences.MODID + "_" + "TitaniumPearl");
		setCreativeTab(Alloycraft.taballoycrafttools);
		setTextureName(Refrences.MODID + ":" + "TitaniumPearl");
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if (entityplayer.capabilities.isCreativeMode)
        {
            return itemstack;
        }
        else
        {
            --itemstack.stackSize;

            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityEnderPearl(world, entityplayer));
            }

            return itemstack;
        }
    }
}
