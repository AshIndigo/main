package bcblocks.twoinputfurnace.dual;

import bcblocks.twoinputfurnace.tif.ContainerInputFurnace;
import bcblocks.twoinputfurnace.tif.GuiInputFurnace;
import bcblocks.twoinputfurnace.tif.TileEntityInputFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiInputHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{	
		
		case 0: return new ContainerInputFurnace(player.inventory, (TileEntityInputFurnace) tile_entity);
		
		}
		return null;
	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{		
			
		case 0: return new GuiInputFurnace(player.inventory, (TileEntityInputFurnace) tile_entity);
		
		}
		return null;
	}	
}