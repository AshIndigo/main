package com.ashindigo.basicgems;

import java.util.Random;

import com.alloycraft.exxo.AlloycraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {

	 @Override
	    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	        switch (world.provider.dimensionId) {
	            case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
	        }
	    }
	    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
	    {
	        WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.stone);
	        for(int i = 0; i < chancesToSpawn; i++)
	        {
	            int posX = blockXPos + random.nextInt(16);
	            int posY = minY + random.nextInt(maxY - minY);
	            int posZ = blockZPos + random.nextInt(16);
	            minable.generate(world, random, posX, posY, posZ);
	        }
	        }

	    private void GenerateOverworld(Random random, int x, int z, World world) {

	    	  this.addOreSpawn(BasicGems.Ore1, world, random, x, z, 10, 15, 8, 0, 128);
	    	  this.addOreSpawn(BasicGems.Ore2, world, random, x, z, 10, 15, 10, 0, 128);
	    	  this.addOreSpawn(BasicGems.Ore3, world, random, x, z, 10, 15, 10, 0, 128);
	    	
	    }
}
