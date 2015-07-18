package com.alloycraft.exxo.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

import com.ashindigo.api.Colors;
import com.ashindigo.api.IndigoApiItem;

public class AluminumToolTest extends IndigoApiItem.IndigoApiSword {
	
	Enum color = Colors.WHITE;

	public AluminumToolTest(String unlocalizedname, String texturename, ToolMaterial toolmaterial, CreativeTabs creativetab) {
		super(toolmaterial, unlocalizedname, texturename, creativetab);
		
	}
}