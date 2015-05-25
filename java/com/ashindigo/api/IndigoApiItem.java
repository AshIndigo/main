package com.ashindigo.api;

import com.alloycraft.exxo.lib.Refrences;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class IndigoApiItem extends Item {

	public IndigoApiItem(String unlocalizedname, String texturename, CreativeTabs creativetab)
	{
		setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
		setCreativeTab(creativetab);
		setTextureName(Refrences.MODID + ":" + texturename);
	}
	
	public static class IndigoApiSword extends ItemSword {

		public IndigoApiSword(ToolMaterial toolmaterial, String unlocalizedname, String texturename, CreativeTabs creativetab) {
			super(toolmaterial);
			setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(creativetab);
			setTextureName(Refrences.MODID + ":" + texturename);
		}
	}
	
	public static class IndigoApiFood extends ItemFood {

		public IndigoApiFood(int heal, float saturation, boolean wolfMeat, String unlocalizedname, String texturename, CreativeTabs creativetab) {
			super(heal, saturation, wolfMeat);
			setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(creativetab);
			setTextureName(Refrences.MODID + ":" + texturename);
		}
	}
	
	public static class IndigoApiSpade extends ItemSpade {

		public IndigoApiSpade(ToolMaterial toolmaterial, String unlocalizedname, String texturename, CreativeTabs creativetab) {
			super(toolmaterial);
			setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
			setCreativeTab(creativetab);
			setTextureName(Refrences.MODID + ":" + texturename);
		}
	}
		
	public static class IndigoApiPick extends ItemPickaxe {

		public IndigoApiPick(ToolMaterial toolmaterial, String unlocalizedname, String texturename, CreativeTabs creativetab) {
				super(toolmaterial);
				setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(creativetab);
				setTextureName(Refrences.MODID + ":" + texturename);
			}
	}
			
	public static class IndigoApiHoe extends ItemHoe {

		public IndigoApiHoe(ToolMaterial toolmaterial, String unlocalizedname, String texturename, CreativeTabs creativetab) {
				super(toolmaterial);
				setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(creativetab);
				setTextureName(Refrences.MODID + ":" + texturename);
			}
	}
			
		public static class IndigoApiAxe extends ItemAxe {

			public IndigoApiAxe(ToolMaterial toolmaterial, String unlocalizedname, String texturename, CreativeTabs creativetab) {
				super(toolmaterial);
				setUnlocalizedName(Refrences.MODID + "_" + unlocalizedname);
				setCreativeTab(creativetab);
				setTextureName(Refrences.MODID + ":" + texturename);
			}
		}
	}

