package com.alloycraft.exxo.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.ObjModelLoader;

import org.lwjgl.opengl.GL11;

import com.alloycraft.exxo.lib.Refrences;

public class ProjectXRender extends TileEntitySpecialRenderer
{
    private IModelCustom casinoMachine;
    private  ResourceLocation casinoTexture;
    public static  ResourceLocation projectx;

    public ProjectXRender()
    {
        casinoMachine = AdvancedModelLoader.loadModel(projectx);
        casinoTexture = new ResourceLocation("modid", "textures/casinoTexture.png");
        projectx = new ResourceLocation (Refrences.MODID + ":" + "/models/projectx.obj");
    }

    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        //OpenGL stuff
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);

        //Bind the texture and render the model
        bindTexture(casinoTexture);
        casinoMachine.renderAll();

        //OpenGL stuff to put everything back
        GL11.glPopMatrix();
    }
}