package com.ashindigo.api;


import com.alloycraft.exxo.lib.Refrences;

import cpw.mods.fml.common.LoaderState;
import cpw.mods.fml.common.LoaderState.ModState;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLStateEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeModContainer;

public class IndigoApiBlock extends Block {

	public IndigoApiBlock(Material material, String unlocalizedname, String texturename, CreativeTabs creativetab, Block thisblock) {
		super(material);
		setBlockName(Refrences.MODID + "_" + unlocalizedname);
		setCreativeTab(creativetab);
		setBlockTextureName(Refrences.MODID + ":" + texturename);
       	//GameRegistry.registerBlock(thisblock, unlocalizedname);
	}
	
	public static class IndigoApiBlockOreStorage extends  Block {

		public IndigoApiBlockOreStorage(Material material, String unlocalizedname, String texturename, Item baseitem, Block baseblock, CreativeTabs creativetab) {
			super(material);
			setBlockName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(creativetab);
			setBlockTextureName(Refrences.MODID + ":" + texturename);
			GameRegistry.addRecipe(new ItemStack(baseblock, 1), new Object[]{
		        "AAA",
		        "AAA",
		        "AAA",
		        'A', baseitem
		    });
			GameRegistry.addShapelessRecipe(new ItemStack(baseitem, 9), new Object[]{
		        new ItemStack(baseblock, 1)
		        		});
		    }
		}

		public static class IndigoApiBlockOre extends  Block {

			public IndigoApiBlockOre(Material material, String unlocalizedname, String texturename, Item baseitem, Block baseblock, CreativeTabs creativetab) {
				super(material);
				setBlockName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(creativetab);
				setBlockTextureName(Refrences.MODID + ":" + texturename);
				GameRegistry.addSmelting((new ItemStack(baseblock)), (new ItemStack(baseitem, 1)), 1);
				}
			}
	}
