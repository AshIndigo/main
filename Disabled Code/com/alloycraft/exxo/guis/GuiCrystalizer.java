package com.alloycraft.exxo.guis;

import org.lwjgl.opengl.GL11;

import com.alloycraft.exxo.containers.ContainerCrystalizer;
import com.alloycraft.exxo.lib.Refrences;
import com.alloycraft.exxo.tileenties.TileEntityCrystalizer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCrystalizer extends GuiContainer {
	
	public ResourceLocation texture = new ResourceLocation(Refrences.MODID + ":" + "textures/gui/GuiCrystalizer.png");
	public TileEntityCrystalizer Crystalizer;

	public GuiCrystalizer(InventoryPlayer invPlayer, TileEntityCrystalizer teCrystalizer) {
		super(new ContainerCrystalizer(invPlayer, teCrystalizer));
		Crystalizer = teCrystalizer;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		String name = this.Crystalizer.hasCustomInventoryName() ? this.Crystalizer.getInventoryName() : I18n.format(this.Crystalizer.getInventoryName());
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("Inventory"), 8, this.ySize - 96 + 5, 4210752);
	}

	@Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        if (Crystalizer.hasPower())
        {
            int i1 = Crystalizer.getPowerRemainingScaled(45);
            drawTexturedModalRect(guiLeft + 8, guiTop + 53 - i1, 176, 62 - i1, 16, i1);
        }

        int i1 = Crystalizer.getSmeltingProgressScaled(24);
        drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 0, i1 + 1, 16);
    }

}
