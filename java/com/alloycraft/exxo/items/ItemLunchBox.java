package com.alloycraft.exxo.items;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.inventories.InventoryLunchBox;
import com.alloycraft.exxo.tileenties.TileEntityAlloyFurnace;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLunchBox extends Item {
	public ItemLunchBox() {
		setCreativeTab(CreativeTabs.tabMisc);
		setMaxStackSize(1);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}

	 @Override
	    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
			//FMLNetworkHandler.openGui(entityPlayer, Alloycraft.instance, Alloycraft.guiIDCrystalizer, world, x, y, z);
		 
		 return itemStack;
	    }
}