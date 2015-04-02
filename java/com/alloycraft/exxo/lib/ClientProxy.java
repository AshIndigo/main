package com.alloycraft.exxo.lib;

import net.minecraftforge.client.MinecraftForgeClient;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftItems;
import com.alloycraft.exxo.entities.EntityPureBoss;
import com.alloycraft.exxo.models.ModelPureBoss;
import com.alloycraft.exxo.render.ProjectXRender;
import com.alloycraft.exxo.render.RenderPureBoss;
import com.alloycraft.exxo.tileenties.*;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

	public void registerItemRenderers() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPureBoss.class, new RenderPureBoss(new ModelPureBoss(), 0.5F));
		
		if (Alloycraft.projectx3dmodelenabled = true){
			
			MinecraftForgeClient.registerItemRenderer(AlloycraftItems.projectx, new ProjectXRender());
		}
	}
}
