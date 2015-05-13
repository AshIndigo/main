package com.alloycraft.exxo;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

import com.alloycraft.exxo.lib.Refrences;

public class AlloycraftItem extends Item {

	public AlloycraftItem(String unlocalizedname, String texturename)
	{
		setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Refrences.MODID + ":" + texturename);
	}
	
	public static class AlloycraftSword extends ItemSword {

		public AlloycraftSword(ToolMaterial toolmaterial, String unlocalizedname, String texturename) {
			super(toolmaterial);
			setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(Alloycraft.taballoycrafttools);
			setTextureName(Refrences.MODID + ":" + texturename);
		}
	}
	
	public static class AlloycraftSpade extends ItemSpade {

		public AlloycraftSpade(ToolMaterial toolmaterial, String unlocalizedname, String texturename) {
			super(toolmaterial);
			setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(Alloycraft.taballoycrafttools);
			setTextureName(Refrences.MODID + ":" + texturename);
		}
	}
		
	public static class AlloycraftPick extends ItemPickaxe {

		public AlloycraftPick(ToolMaterial toolmaterial, String unlocalizedname, String texturename) {
				super(toolmaterial);
				setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(Alloycraft.taballoycrafttools);
				setTextureName(Refrences.MODID + ":" + texturename);
			}
	}
			
	public static class AlloycraftHoe extends ItemHoe {

		public AlloycraftHoe(ToolMaterial toolmaterial, String unlocalizedname, String texturename) {
				super(toolmaterial);
				setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(Alloycraft.taballoycrafttools);
				setTextureName(Refrences.MODID + ":" + texturename);
			}
	}
			
		public static class AlloycraftAxe extends ItemAxe {

			public AlloycraftAxe(ToolMaterial toolmaterial, String unlocalizedname, String texturename) {
				super(toolmaterial);
				setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(Alloycraft.taballoycrafttools);
				setTextureName(Refrences.MODID + ":" + texturename);
			}
		}
	}

