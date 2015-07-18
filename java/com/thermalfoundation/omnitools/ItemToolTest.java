package com.thermalfoundation.omnitools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.eventhandler.Event.Result;

public class ItemToolTest extends ItemPickaxe {
	
	public ItemToolTest(String unlocalizedName, ToolMaterial material) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(OmniTools.modID + ":" + unlocalizedName);
	    }
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade", "axe", "hoe");
	}
	
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
		    Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, 
		    Blocks.soul_sand, Blocks.mycelium,
			Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, 
			Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.iron_ore, 
			Blocks.diamond_ore, Blocks.coal_ore, Blocks.emerald_ore, Blocks.redstone_ore,
			Blocks.lapis_ore});
	
	@Override
	public float func_150893_a(ItemStack stack, Block block) {
	    if (block.getMaterial() == Material.wood || block.getMaterial() == Material.vine || block.getMaterial() == Material.plants)
	        return this.efficiencyOnProperMaterial;
	    return effectiveAgainst.contains(block) ? this. efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	}
	    
	    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
	        if (!player.canPlayerEdit(x, y, z, side, stack)) {
	            return false;
	        } else {
	            UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
	            if (MinecraftForge.EVENT_BUS.post(event)) {
	                return false;
	            }

	            if (event.getResult() == Result.ALLOW) {
	                stack.damageItem(1, player);
	                return true;
	            }

	            Block block = world.getBlock(x, y, z);

	            if (side != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
	                Block block1 = Blocks.farmland;
	                world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

	                if (world.isRemote) {
	                    return true;
	                } else {
	                    world.setBlock(x, y, z, block1);
	                    stack.damageItem(1, player);
	                    return true;
	                }
	            } else {
	                return false;
	            }
	        }
	    
	    }
}
