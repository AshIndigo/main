package com.alloycraft.exxo.lib;

import java.util.List;

import com.alloycraft.exxo.Alloycraft;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiMessageDialog;
import cpw.mods.fml.client.config.IConfigElement;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.client.event.ConfigChangedEvent.PostConfigChangedEvent;

public class GuiConfigAlloycraft extends GuiConfig {

	public GuiConfigAlloycraft(GuiScreen parent) 
    {
        super(parent,
                new ConfigElement(Alloycraft.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Refrences.MODID, false, false, GuiConfig.getAbridgedConfigPath(Alloycraft.config.toString()));
    }
		@Override
	    public void drawScreen(int mouseX, int mouseY, float partialTicks)
	    {
	       

	super.drawScreen(mouseX, mouseY, partialTicks);
	    }
	    
	    @Override
	    protected void actionPerformed(GuiButton button)
	    {
	        if (button.id == 2000)
	        {
	            boolean flag = true;
	            try
	            {
	                if (  (      configID != null 
	                      || parentScreen == null 
	                      || !(parentScreen instanceof GuiConfig)
	                      ) 
	                      && (entryList.hasChangedEntry(true)))
	                {
	                 System.out.println("Saving config elements");
	                    boolean requiresMcRestart = entryList.saveConfigElements();

	                    if (Loader.isModLoaded(modID))
	                    {
	                        ConfigChangedEvent event = new ConfigChangedEvent(modID, 
	                              configID, isWorldRunning, requiresMcRestart);
	                        FMLCommonHandler.instance().bus().post(event);
	                        if (!event.getResult().equals(Result.DENY))
	                            FMLCommonHandler.instance().bus().post(new PostConfigChangedEvent(modID, 
	                                  configID, isWorldRunning, requiresMcRestart));
	                        
	                        if (requiresMcRestart)
	                        {
	                            flag = false;
	                            mc.displayGuiScreen(new GuiMessageDialog(parentScreen, 
	                                  "fml.configgui.gameRestartTitle", 
	                                  new ChatComponentText(I18n.format("fml.configgui.gameRestartRequired")), 
	                                        "fml.configgui.confirmRestartMessage"));
	                        }
	                        
	                        if (parentScreen instanceof GuiConfig)
	                            ((GuiConfig) parentScreen).needsRefresh = true;
	                    }
	                }
	            }
	            catch (Throwable e)
	            {
	                e.printStackTrace();
	            }
	            
	            if (flag)
	                mc.displayGuiScreen(parentScreen);
	        }
	    }    
	}


   