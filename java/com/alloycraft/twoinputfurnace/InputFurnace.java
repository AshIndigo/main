/*
package com.alloycraft.twoinputfurnace;

import org.lwjgl.input.Keyboard;

import com.alloycraft.exxo.lib.GuiHandler;
import com.alloycraft.twoinputfurnace.dual.RenderInpBlock;
import com.alloycraft.twoinputfurnace.tif.TileEntityInputFurnace;
import com.alloycraft.twoinputfurnace.tif.BlockInputFurnace;
import com.alloycraft.twoinputfurnace.dual.CommonProxy;
import com.alloycraft.twoinputfurnace.dual.GuiInputHandler;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "InputFurnace", name = "InputFurnace", version = "0.1.0")

public class InputFurnace 
{
	@Instance("InputFurnace")
	public static InputFurnace instance;
	
	private GuiInputHandler guiInputHandler = new GuiInputHandler();
	
	public static Block inputFurnace;
	public static Block inputFurnaceActive;
	public static int inputFurnaceID;
	public static int inputFurnaceActiveID;
	
	public static int item1;
	public static int item2;
	
	@SidedProxy(clientSide = "bcblocks.twoinputfurnace.dual.ClientProxy", serverSide = "bcblocks.twoinputfurnace.dual.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//inputFurnaceID = config.getBlock("inputFurnace ID", 3016, (String)null).getInt();
		//inputFurnaceActiveID = config.getBlock("inputFurnace Active ID", 3017, (String)null).getInt();
		item1 = config.get("item", "item1", 286).getInt();
		item2 = config.get("item", "item2", 286).getInt();
		
		config.save();
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		inputFurnace = (new BlockInputFurnace(inputFurnaceID, false)).setHardness(1.0F).setResistance(0.0F).setStepSound(Block.soundTypeAnvil).setCreativeTab(CreativeTabs.tabBlock);
		inputFurnaceActive = (new BlockInputFurnace(inputFurnaceActiveID, true)).setHardness(1.0F).setResistance(0.0F).setStepSound(Block.soundTypeAnvil);
		
		GameRegistry.registerBlock(inputFurnace, "inputFurnace");
		GameRegistry.registerBlock(inputFurnaceActive, "inputFurnaceActive");
        LanguageRegistry.addName(inputFurnace, "inputFurnace");
        
        GameRegistry.registerTileEntity(TileEntityInputFurnace.class,"tileEntityInputFurnace");
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiInputHandler());
		RenderingRegistry.registerBlockHandler(2105, RenderInpBlock.INSTANCE);
		
		proxy.registerRenderThings();
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
*/