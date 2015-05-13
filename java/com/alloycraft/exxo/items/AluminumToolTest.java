package com.alloycraft.exxo.items;

import com.alloycraft.exxo.AlloycraftItem;
import com.alloycraft.exxo.lib.Colors;

public class AluminumToolTest extends AlloycraftItem.AlloycraftSword {
	
	Enum color = Colors.WHITE;

	public AluminumToolTest(String unlocalizedname, String texturename, ToolMaterial toolmaterial) {
		super(toolmaterial, unlocalizedname, texturename);
		
	}
}