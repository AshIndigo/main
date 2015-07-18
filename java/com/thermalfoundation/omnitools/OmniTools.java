package com.thermalfoundation.omnitools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = OmniTools.modID, version = "1.1", name = "OmniTools")
public class OmniTools {
	
	public static CreativeTabs tabomnitools = new CreativeTabsOmniTools("OmniTools");
	public static Item omnitool1;
	public static Item omnitool2;
	public static Item omnitool3;
	public static Item omnitool4;
	public static final String modID = "omnitools";
	public static ToolMaterial Tier1 = EnumHelper.addToolMaterial("Tier1", 2, 250, 6.0F, 2.0F, 14);
	public static ToolMaterial Tier2 = EnumHelper.addToolMaterial("Tier2", 2, 400, 5.5F, 2.5F, 30);
	public static ToolMaterial Tier3 = EnumHelper.addToolMaterial("Tier3", 2, 400, 5.5F, 2.5F, 30);
	public static ToolMaterial Tier4 = EnumHelper.addToolMaterial("Tier4", 2, 400, 5.5F, 2.5F, 30);
	
	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event){
		 
		 GameRegistry.registerItem(omnitool1 = new ItemToolTest("Omnitool1", Tier1), "Omnitool1");
		 GameRegistry.registerItem(omnitool2 = new ItemToolTest("Omnitool2", Tier2), "Omnitool2");
		 GameRegistry.registerItem(omnitool3 = new ItemToolTest("Omnitool3", Tier3), "Omnitool3");
		 GameRegistry.registerItem(omnitool4 = new ItemToolTest("Omnitool4", Tier4), "Omnitool4");
	 }

}
